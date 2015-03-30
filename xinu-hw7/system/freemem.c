/**
 * @file freemem.c
 * @provides freemem                                                     
 *
 * Modified: Casey O'Hare & Sam Ostlund
 * COSC 3250 / COEN 4820 malloc project.
 */
/* Embedded XINU, Copyright (C) 2009.  All rights reserved. */

#include <xinu.h>

/**
 * Free a memory block, returning it to free list.
 * @param pmem pointer to memory block
 * @param nbytes size of memory block
 * @return OK on success, SYSERR on failure
 */
syscall	freemem(void *pmem, ulong nbytes)
{
	// TODO: Insert back into free list, and compact with adjacent blocks.
	// Simplly Adds to front for now & I think it is ordered by location
	/*memblk *temp = freelist.next;
	memblk *newMem = &((memblk *) pmem);
	newMem->next = temp->next;
	newMem->length = nbytes;
	freelist.next = &newMem;*/

	int found = FALSE;
	memblk *memBlock = freelist.next;
	memblk *memPrev = &freelist;

	// Check for 0 == nbytes; return SYSERR
	if(nbytes == 0)
		return SYSERR;
	// Maybe check to make sure it stays within bounds...

	while(!found && memBlock != NULL)
	{
		if((ulong) memBlock > (ulong) pmem)
			found = TRUE;
		else
		{
			memPrev = memBlock;
			memBlock = memBlock->next;
		}
	}
	
	memblk *pmemBlock = (memblk *) pmem;
	pmemBlock->next = memBlock;
	pmemBlock->length = (ulong) roundmb(nbytes);
	memPrev->next = pmemBlock;
	freelist.length += nbytes;

	// Compaction... Comment out to have output more detailed
//kprintf("memPrev:0x%08X\tmemPrev->length:%u\r\n", (ulong)memPrev, memPrev->length);
//kprintf("pmemBlock:%08X\tpmemBlock->length:%u\r\n", (ulong)pmemBlock, pmemBlock->length);
//kprintf("memBlcock:%08X\tmemBlock->length:%u\r\n", (ulong)memBlock, memBlock->length);
	if(((ulong)memPrev + memPrev->length) == (ulong)pmemBlock)
	{
		memPrev->next = memBlock;
		memPrev->length += pmemBlock->length;
	}
	if(((ulong)pmemBlock + pmemBlock->length) == (ulong)memBlock)
	{
		pmemBlock->next = memBlock->next;
		pmemBlock->length += memBlock->length;
	}

	return OK;
}
