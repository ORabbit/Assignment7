/**
 * @file mutex.h
 *
 */
/* Embedded Xinu, Copyright (C) 2010.  All rights reserved. */

#ifndef _MUTEX_H_
#define _MUTEX_H_

#include <kernel.h>
#include <proc.h>

/* Mutex function prototypes */
void mutexInit(void);
void mutexAcquire(void);
void mutexRelease(void);
bool testAndSet(volatile ulong *);

#endif                          /* _MUTEX_H */
