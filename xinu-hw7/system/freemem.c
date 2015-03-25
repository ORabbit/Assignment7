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
	// Simplly Adds to front for now
	/*memblk *temp = freelist.next;
	memblk *newMem = &((memblk *) pmem);
	newMem->next = temp->next;
	newMem->length = nbytes;
	freelist.next = &newMem;*/

	return OK;

	return SYSERR;
}
