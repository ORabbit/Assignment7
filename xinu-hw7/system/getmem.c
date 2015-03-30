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

	// SYSERR for 0 bytes
	if(nbytes == 0)
		return (void *)SYSERR;

	// Search free list for first chunk large enough to fit.
	memblk *memBlock = freelist.next;
	memblk *memPrev = /*(memblk *)*/&freelist;
	memblk *extra;
	//memPrev->next = freelist.next;
	//memPrev->length = freelist.length;
//	kprintf("Start memBlock=%u\r\n", (ulong)memBlock);
//	kprintf("%d\r\n", nbytes);
	nbytes = (ulong) roundmb(nbytes);

	while(memBlock != NULL)
	{
//		kprintf("memBlock=%u & memBlock->length=%u\r\n", (ulong)memBlock, memBlock->length);
		if(memBlock->length == nbytes)
		{
			memPrev->next = memBlock->next;
			freelist.length -= nbytes;

			return (void *) memBlock; // Come back to change to --(memBlock->next) potentially
		}else if(memBlock->length > nbytes) // Need to split
		{
			extra = (memblk *) ((ulong) memBlock + nbytes);
			memPrev->next = extra;
			extra->next = memBlock->next;
			extra->length = memBlock->length - nbytes;
			freelist.length -= nbytes;

			return (void *) memBlock;//--extra;//memBlock;//--extra; this works
		}
		memPrev = memBlock;
		memBlock = memBlock->next;
	}

	// Break off region of requested size; return pointer to new mem region, and add any remianing chunk back into the free list.
	//kprintf("TEST\r\n");
//kprintf("freelist=%u & length=%u & freelist.next=%u & memBlock=%u\r\n", (ulong)&freelist, freelist.length, (ulong)freelist.next, (ulong) memBlock);
	//void *region = (void *) (ulong) memBlock;
	//kprintf("2\r\n");
	//memblk *region = (memblk *) (memBlock + (ulong) roundmb(nbytes));
	//memblk *block = (memblk *) region + 1;
	//memblk *region = memBlock;
	//kprintf("3 block=%u\r\n", (ulong)block);
	//block->next = memBlock->next;
	//kprintf("4\r\n");
	//block->length = memBlock->length - (ulong) roundmb(nbytes);
	//kprintf("5\r\n");
	//memPrev->next = block;

	//kprintf("%u\r\n", (ulong) region);
	//return (void *) (ulong) region; // Feel like not right because it would interrupt with the aboove thing.//return region;

	return (void *)SYSERR; // No space big enough
}
