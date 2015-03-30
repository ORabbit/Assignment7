/**
 * @file testcases.c
 * @provides testcases
 *
 * $Id: testcases.c 175 2008-01-30 01:18:27Z brylow $
 *
 * Modified by: Casey O'Hare & Sam Ostlund
 *
 *
 */
/* Embedded XINU, Copyright (C) 2010, 2014.  All rights reserved. */

/*#include <mutex.h>
#include <kernel.h>
#include <device.h>
#include <stdio.h>
#include <uart.h>
#include <proc.h>
#include <semaphore.h>
*/
//#include "getmem.c"
#include <xinu.h>
//#include "getmem.c"
//#include "freemem.c"
	
ulong rand(void)
{
	ulong a = 1664525UL;
	ulong b = 1013904223UL;
	static ulong c = 0;

	c = a * c + b;
	return c;
}

syscall sleep(int time)
{
	/* Dumbest sleep ever. */
	int i = 0, j = 0;
	for (i = 0; i < time; i++)
		for (j = 0; j < 1000; j++)
			;
	return 0;
}

/* BEGIN Textbook code from Ch 5 Programming Project 3, Silberschatz p. 254 */
typedef int buffer_item;
#define BUFFER_SIZE 5

struct boundedbuffer {
	buffer_item buffer[BUFFER_SIZE];
	int bufferhead;
	int buffertail;

	semaphore empty;
	semaphore full;
	semaphore mutex;
};

int insert_item(struct boundedbuffer *bb, buffer_item item)
{
	// TODO:
	/* insert item into buffer
	 * return 0 if successful, otherwise
	 * return SYSERR indicating an error condition */
	int errorflag = wait(bb->empty);
	int errorflag2 = wait(bb->mutex); // COME BACk

	if(SYSERR == errorflag || SYSERR == errorflag2)
		return SYSERR;
	else
	{
		bb->buffer[bb->bufferhead] = item;
		bb->bufferhead = (bb->bufferhead + 1) % BUFFER_SIZE;

		signal(bb->mutex);
		signal(bb->full);
		return 0;
	}
}

int remove_item(struct boundedbuffer *bb, buffer_item *item)
{
	// TODO:
	/* remove an object from buffer
	 * placing it in item
	 * return 0 if successful, otherwise
	 * return SYSERR indicating an error condition */
	int errorflag3 = wait(bb->full);
	int errorflag4 = wait(bb->mutex);	

	if(SYSERR == errorflag3 || SYSERR == errorflag4)
		return SYSERR;

	*item = bb->buffer[bb->buffertail];
	bb->buffertail = (bb->buffertail + 1) % BUFFER_SIZE;

	signal(bb->mutex);
	signal(bb->empty);
	return 0;
}

void producer(struct boundedbuffer *bb)
{
	buffer_item item;
	enable();
	while (1)
	{
		/* sleep for a random period of time */
		sleep(rand() % 100);
		/* generate a random number */
		item = rand();
		if (insert_item(bb, item))
		{
			mutexAcquire();
			kprintf("report error condition\r\n");
			mutexRelease();
		}
		else
		{
			mutexAcquire();
			kprintf("producer %d produced %d\r\n", currpid, item);
			mutexRelease();
		}
	}
}

void consumer(struct boundedbuffer *bb)
{
	buffer_item item;
	enable();
	while (1)
	{
		/* sleep for a random period of time */
		sleep(rand() % 100);
		if (remove_item(bb, &item))
		{
			mutexAcquire();
			kprintf("report error condition\r\n");
			mutexRelease();
		}
		else
		{
			mutexAcquire();
			kprintf("consumer %d consumed %d\r\n", currpid, item);
			mutexRelease();
		}
	}
}

void interruptprint(void)
{
	enable();
	kprintf("TARDIS\r\n");
}

void interruptprintmutex(void)
{
	enable();
	mutexAcquire();
	kprintf("TARDIS\r\n");
	mutexRelease();
}

void interruptprintmutexorder(void)
{
	enable();
	mutexAcquire();
	kprintf("SECOND\r\n");
	mutexRelease();
}

void testmutex(void)
{
	enable();
	mutexAcquire();
	resched();
	kprintf("This string is printed after mutexAcquire()          ------------------------------------------- mutex!\r\n");
	mutexRelease();
}

void testmutexorder(void)
{
	enable();
	mutexAcquire();
	resched();
	kprintf("FIRST\r\n");
	mutexRelease();
}

void testnomutex(void)
{
	enable();
	kprintf("This string is printed without use of mutexAcquire() ------------------------------------------- no mutex!\r\n");
}

void lowerprio(struct boundedbuffer *bbuff)
{
	enable();
	int x;

	mutexAcquire();
	kprintf("Removing as lowerprio...\r\n");
	remove_item(bbuff, &x);
	kprintf("Removed %d as lowerprio\r\n", x);
	mutexRelease();
}

void higherprio(struct boundedbuffer *bbuff)
{
	enable();
	int i;
	resched();
		
	insert_item(bbuff, 1);
	mutexAcquire();
	kprintf("Inserted %d\r\n", 1);
	mutexRelease();
	
	resched();
	
	remove_item(bbuff, &i); // Should get stuck waiting here
	mutexAcquire();
	kprintf("Removed %d as higherprio\r\n", i);
	mutexRelease();
}

/* END Textbook code from Ch 5 Programming Project 3, Silberschatz p. 254 */

struct boundedbuffer createbuffer(void)
{
	struct boundedbuffer bbuff;

	bbuff.mutex = semcreate(1);
	bbuff.empty = semcreate(BUFFER_SIZE);
	bbuff.full = semcreate(0);
	bbuff.bufferhead = 0;
	bbuff.buffertail = 0;
	
	return bbuff;
}


void printfreelist(void)
{
	memblk *memBlock = &freelist;
	int count = 0;
	kprintf("-----------------------------------------\r\n");
	kprintf("|Count\t|Block\t\t|Length\t\t|\r\n");
	//kprintf("|%d\t|%u\t|%u\t|\r\n", count, memBlock, memBlock->length); // First item
	while(memBlock != NULL)
	{
		kprintf("|%d\t|0x%08X\t|%u\t|\r\n", count, memBlock, memBlock->length);
		memBlock = memBlock->next;
		count++;
	}
	kprintf("-----------------------------------------\r\n");
	
}

/*
 * testcases - called after initialization completes to test things.
 */
void testcases(void)
{
	kprintf("===TEST BEGIN===\r\n");
	
	/*	
	printfreelist();
	void *region =  getmem(4096);
	kprintf("0x%08X: region start\r\n", (ulong) region);
	//freemem((void *) 10000000, 10000);
	printfreelist();
	freemem(region, 4096);
	kprintf("Called freemem(region, 4096)\r\n");
	printfreelist();
	
	kprintf("Called malloc(4096)\r\n");
	void *temp = malloc(4096);
	printfreelist();

	kprintf("Called free(0x%08X)\r\n", (ulong)temp);
	int flag = free(temp);
	if(flag == SYSERR)
		kprintf("ERROR\r\n");
	printfreelist();

	ready(create((void *)printfreelist, INITSTK, 1, "STUFF", 0), 0);
	resched();
	ready(create((void *)printfreelist, INITSTK, 1, "STUFF", 0), 0);
	resched();
	kprintf("worked\r\n");
	*/

	//***** compactbelow ******
	void *getmem1 = getmem(4096);
	kprintf("getmem(4096) 0x%08X\r\n", (ulong) getmem1); 
	void *getmem2 = getmem(4096);
	kprintf("getmem(4096) 0x%08X\r\n", (ulong) getmem2);
	void *getmem3 = getmem(4096);
	kprintf("getmem(4096) 0x%08X\r\n", (ulong) getmem3);
	void *getmem4 = getmem(4096);
	kprintf("getmem(4096) 0x%08X\r\n", (ulong) getmem4);
	printfreelist();
	freemem(getmem2, 4096);
	kprintf("freemem(4096) - getmem2\r\n");
	freemem(getmem3, 4096);
	kprintf("freemem(4096) - getmem3\r\n");
	printfreelist();


	kprintf("===TEST END===\r\n");
}
/*	int c, i;
	struct boundedbuffer bbuff;
	struct boundedbuffer bbuff2;
	
	kprintf("0) Test 1 producer, 1 consumer, same priority\r\n");
	kprintf("1) Test 1 producer, 1 consumer, consumer priority higher than producer\r\n");
	kprintf("2) Test 1 producer, 1 consumer, consumer priority higher than producer\r\n");
	kprintf("3) Test 1 producer, 0 consumer, one priority\r\n");
	kprintf("4) Test 0 producer, 1 consumer, one priority\r\n");
	kprintf("5) Test 2 producers, 2 consumers, same priority\r\n");
	kprintf("6) Test 2 producers, 1 consumer, same priority\r\n");
	kprintf("7) Test 2 producers, 1 consumer, same priority, one buffer\r\n");
	kprintf("8) Test 1 producer, 2 consumers, same priority, one buffer\r\n");
	kprintf("9) Test 5 producers, 1 consumer, same priority, one buffer\r\n");
	kprintf("A) Test 5 producers, 30 consumers, same priority, one buffer\r\n");
	kprintf("B) Test 30 producers, 5 consumers, same priority, one buffer\r\n");
	kprintf("C) Test 5 producers, 1 consumer, consumer highest priority, one buffer\r\n");
	kprintf("D) Test 5 producers, 30 consumers, consumer highest priority, one buffer\r\n");
	kprintf("E) Test 5 producers, 1 consumer, producers have highest priority, one buffer\r\n");

	kprintf("M) Test mutexAcquire/Release versus no mutexAcquire/Release\r\n");
	kprintf("N) Test mutexAcquire/Release print order\r\n");
	kprintf("O) Test if lower priority process using mutexAcquire gets a turn before a higher priority process gets a second turn\r\n");
	kprintf("Z) Test bad semaphore, also deadlocks\r\n");

	kprintf("===TEST BEGIN===\r\n");

	// TODO: Test your operating system!

	c = kgetc();
	switch(c)
	{
	case '0':
		// TODO:
		// Initialize bbuff, and create producer and consumer processes
		bbuff = createbuffer();		

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);

		break;

	case '1':
		bbuff = createbuffer();		

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 2, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case '2':
		bbuff = createbuffer();		

		ready(create((void *)producer, INITSTK, 2, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case '3':
		bbuff = createbuffer();

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		
		break;

	case '4':
		bbuff = createbuffer();

		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case '5':
		bbuff = createbuffer();		
		bbuff2 = createbuffer();

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);

		ready(create((void *)producer, INITSTK, 1, "PRODUCER2", 1, &bbuff2), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER2", 1, &bbuff2), 0);

		break;

	case '6':
		bbuff = createbuffer();		
		bbuff2 = createbuffer();

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);

		ready(create((void *)producer, INITSTK, 1, "PRODUCER2", 1, &bbuff2), 0);

		break;

	case '7':
		bbuff = createbuffer();		

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		ready(create((void *)producer, INITSTK, 1, "PRODUCER2", 1, &bbuff), 0);

		break;

	case '8':
		bbuff = createbuffer();		

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER2", 1, &bbuff), 0);

		break;

	case '9':
		bbuff = createbuffer();

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)producer, INITSTK, 1, "PRODUCER2", 1, &bbuff), 0);
		ready(create((void *)producer, INITSTK, 1, "PRODUCER3", 1, &bbuff), 0);
		ready(create((void *)producer, INITSTK, 1, "PRODUCER4", 1, &bbuff), 0);
		ready(create((void *)producer, INITSTK, 1, "PRODUCER5", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);

		break;

	case 'A':
		bbuff = createbuffer();

		for(i = 0; i < 5; i++)
			ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		for(i = 0; i < 30; i++)
			ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case 'B':
		bbuff = createbuffer();

		for(i = 0; i < 30; i++)
			ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		for(i = 0; i < 5; i++)
			ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case 'C':
		bbuff = createbuffer();

		for(i = 0; i < 5; i++)
			ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 10, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case 'D':
		bbuff = createbuffer();

		for(i = 0; i < 5; i++)
			ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		for(i = 0; i < 30; i++)
			ready(create((void *)consumer, INITSTK, 10, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case 'E':
		bbuff = createbuffer();

		for(i = 0; i < 5; i++)
			ready(create((void *)producer, INITSTK, 10, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "CONSUMER", 1, &bbuff), 0);
		
		break;

	case 'M':

		ready(create((void *)testmutex, INITSTK, 2, "TESTMUTEX", 0), 0);
		ready(create((void *)interruptprint, INITSTK, 3, "INTERRUPTPRINT", 0), 0);
		ready(create((void *)testnomutex, INITSTK, 4, "TESTNOMUTEX", 0), 0);	
		ready(create((void *)interruptprintmutex, INITSTK, 1, "INTERRUPTPRINT", 0), 0);

		break;

	case 'N':
		ready(create((void *)testmutexorder, INITSTK, 1, "TESTMUTEXORDER", 0), 0);
		ready(create((void *)interruptprintmutexorder, INITSTK, 1, "INTERRUPTPRINT", 0), 0);

		break;

	case 'O':
		kprintf("So the idea is that lowerprio will attempt a remove_item on an empty buffer and so it will wait and control will be handed to higherprio, then higherprio will insert_item and then resched(). What must happen then is lowerprio will succesfully come back from waiting and succesfully complete remove_item and eventually hand control back to higherprio which will attempt remove_item and get stuck waiting.\r\n");
		bbuff = createbuffer();

		ready(create((void *)lowerprio, INITSTK, 1, "LOWERPRIO", 1, &bbuff), 0);
		ready(create((void *)higherprio, INITSTK, 2, "HIGHERPRIO", 1, &bbuff), 0);

		break;

	case 'Z':
		bbuff.mutex = 1000; // This is the bad semaphore
		bbuff.empty = semcreate(BUFFER_SIZE);
		bbuff.full = semcreate(0);
		bbuff.bufferhead = 0;
		bbuff.buffertail = 0;

		ready(create((void *)producer, INITSTK, 1, "PRODUCER", 1, &bbuff), 0);
		ready(create((void *)consumer, INITSTK, 1, "PRODCUER", 1, &bbuff), 0);
		
		break;

	default:
		break;
	}

	while (numproc > 2) { resched(); }
	kprintf("\r\n===TEST END===\r\n");
	return;
}*/

