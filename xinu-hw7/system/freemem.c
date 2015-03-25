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
	// Maybe check to make sure it stays within bounds...

	while(found && memBlock != NULL)
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
	if(pmemBlock - memPrev == 1)
	{
		memPrev->next = memBlock;
		memPrev->length += pmemBlock->length;
	}
	if(memBlock - pmemBlock == 1)
	{
		pmemBlock->next = memBlock->next;
		pmemBlock->length += memBlock->length;
	}

	return OK;

	return SYSERR;
}
