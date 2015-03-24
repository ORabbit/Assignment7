/**
 * @file getmem.c
 * @provides getmem                                                       
 *
 * COSC 3250 / COEN 4820 malloc project.
 * Modified by: Casey O'Hare & Sam Ostlund
 */
/* Embedded XINU, Copyright (C) 2009.  All rights reserved. */

#include <xinu.h>

/**
 * Allocate heap storage, returning pointer to assigned memory region.
 * @param nbytes number of bytes requested
 * @return pointer to region on success, SYSERR on failure
 */
void *getmem(ulong nbytes)
{
	// TODO: Search free list for first chunk large enough to fit.
	//       Break off region of requested size; return pointer
	//       to new memory region, and add any remaining chunk
	//       back into the free list.

	// Search free list for first chunk large enough to fit.
	memblk memBlock = freelist.next;
	int foundBlock = FALSE;
	while(memBlock != NULL && !foundBlock)
	{
		if(memBlock >= nbytes)
			foundBlock = TRUE;
		else
			memBlock = memBlock.next;
	}

	// Break off region of requested size; return pointer to new mem region, and add any remianing chunk back into the free list.
	

	return (void *)SYSERR;
}
