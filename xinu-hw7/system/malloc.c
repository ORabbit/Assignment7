/**
 * @file malloc.c
 * @provides malloc                                                       
 *
 * Modified by: Casey O'Hare & Sam Ostlund
 * COSC 3250 / COEN 4820 malloc project.
 */
/* Embedded XINU, Copyright (C) 2009.  All rights reserved. */

#include <xinu.h>

/**
 * Allocate heap storage plus accounting block, returning pointer to
 * assigned memory region.
 * @param nbytes number of bytes requested
 * @return pointer to region on success, SYSERR on failure
 */
void *malloc(ulong nbytes)
{
	// TODO: Pad request size with room for accounting info.
	//       Call getmem() to allocate region.
	//       Store accounting block at head of region, including size
	//         of request.  Return pointer to space above accounting
	//         block.

	memblk *region;

	nbytes += sizeof(memblk); // Attempting to pad for accounting info (Stkbase, Stklength)
	region = (memblk *) getmem(nbytes);

	if((ulong *)region == (ulong *)SYSERR)
		return (void *)SYSERR;

	region->next = region;
	region->length = nbytes;

	return (void *) (region + 1);
}
