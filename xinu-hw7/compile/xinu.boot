ELF                �4   |   P4    ( ? <         �  �dh  \}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     �<��$ �<��$ �<��4          �< �4 �<��4$      `�@ h�@0         ,     ! @ |           ��  Ǭ �$ �$*� ��      �          �� �$*� ��      �         x@ �        �@�M  )1@ 
$P*L  )1 +% j`  �L  )1 $h- �p   ��@ �@ �<!H  �!@��	     �<!H  �!@��	     �<!H  �!@��	    �@BK  )1@ 
$P*�I  )1 +% j`  �J  )1 $h- �p   �<!H  �!@��	     �<!H  �!@��	     �<!H  �!@��	     �                    !��  $  $�2r�<\��$!�$��1&�  � !� !� #($�          �<dx�$�<\��$"(� �         �<<�%  ��<8�%  �:                      �<�z' @         h@| $$�[	 @ �< {'!�z  z�     @     @    T��' �� h@ p@� �� `@� ��� ��  ��$ ��( ��, ��0 ��4 ��8 ��< ��@ ��D ��H ��L ��P ��T ��X ��\ ��` ��d ��h ��l ��p ��t ��x ��| ��� ��� ��� ��� ��� ��� ��@  H  � ��� ��� ��!(�t
     � ��� ��    � ��� ��� ��| ��x ��t ��p ��l ��h ��d ��` ��\ ��X ��T ��P ��L ��H ��D ��@ ��< ��8 ��4 ��0 ��, ��( ��$ ��  ��� �� �� p�@� �'          B        ���'8 ��4 ��0 ��, ��( ��$ ��  �� �� �� �� ��< ��  ��  ��4 ��0 ��, ��( ��$ ��  �� �� �� �� ��@ ��D ��H ��L ��8 ��< ��@ �' @              H@!D  X�@ �                 `@     $%�  `�@ �         `@��$$(D  `�@ �         `@    %�  `�@ �         `@ �  $0� %�  `�@ �         `@    ��$$�  `�@ �               �� 5 H      ����@    !   �               Int, Interrupt  Mod, TLB modification exception TLBL, TLB exception (load or instruction fetch) TLBS, TLB exception (store) AdEL, Address error exception (load or instruction fetch)   AdES, Address error exception (store)   IBE, Bus error exception (instruction fetch)    DBE, Bus error exception (data reference: load or store)    Sys, Syscall exception  Bp, Breakpoint exception    RI, Reserved instruction exception  CpU, Coprocessor Unusable exception Ov, Arithmetic Overflow exception   Tr, Trap Exception  Reserved    FPE, Floating point exception   C2E, Reserved for precise Coprocessor 2 exceptions  MDMX, MDMX Unusuable in MIPS64  WATCH, Reference to WatchHi/WatchLo address MCheck, Machine Check   CacheErr, Cache error / Debug Mode  Software interrupt request 0    Software interrupt request 1    Hardware interrupt request 0, eth1  Hardware interrupt request 1, UART  Hardware interrupt request 2, eth0  Hardware interrupt request 3    Hardware interrupt request 4    Hardware interrupt request 5, Timer XINU Exception 0x%04X, %s
 XINU Trap %d, %s
  Faulting address: 0x%08X
  [0x%08X] sta:0x%08X
   [0x%08X]  lo:0x%08X   hi:0x%08X  epc:0x%08X  cau:0x%08X
   [0x%08X]  gp:0x%08X   sp:0x%08X   fp:0x%08X   ra:0x%08X
   [0x%08X]  t8:0x%08X   t9:0x%08X   k0:0x%08X   k1:0x%08X
   [0x%08X]  s4:0x%08X   s5:0x%08X   s6:0x%08X   s7:0x%08X
   [0x%08X]  s0:0x%08X   s1:0x%08X   s2:0x%08X   s3:0x%08X
   [0x%08X]  t4:0x%08X   t5:0x%08X   t6:0x%08X   t7:0x%08X
   [0x%08X]  t0:0x%08X   t1:0x%08X   t2:0x%08X   t3:0x%08X
   [0x%08X]  a0:0x%08X   a1:0x%08X   a2:0x%08X   a3:0x%08X
   [0x%08X] zer:0x%08X   at:0x%08X   v0:0x%08X   v1:0x%08X
   report error condition
    producer %d produced %d
   consumer %d consumed %d
   TARDIS
    SECOND
    This string is printed after mutexAcquire()          ------------------------------------------- mutex!
   FIRST
 This string is printed without use of mutexAcquire() ------------------------------------------- no mutex!
    Removing as lowerprio...
  Removed %d as lowerprio
   Inserted %d
   Removed %d as higherprio
  0) Test 1 producer, 1 consumer, same priority
 1) Test 1 producer, 1 consumer, consumer priority higher than producer
    2) Test 1 producer, 1 consumer, consumer priority higher than producer
    3) Test 1 producer, 0 consumer, one priority
  4) Test 0 producer, 1 consumer, one priority
  5) Test 2 producers, 2 consumers, same priority
   6) Test 2 producers, 1 consumer, same priority
    7) Test 2 producers, 1 consumer, same priority, one buffer
    8) Test 1 producer, 2 consumers, same priority, one buffer
    9) Test 5 producers, 1 consumer, same priority, one buffer
    A) Test 5 producers, 30 consumers, same priority, one buffer
  B) Test 30 producers, 5 consumers, same priority, one buffer
  C) Test 5 producers, 1 consumer, consumer highest priority, one buffer
    D) Test 5 producers, 30 consumers, consumer highest priority, one buffer
  E) Test 5 producers, 1 consumer, producers have highest priority, one buffer
  M) Test mutexAcquire/Release versus no mutexAcquire/Release
   N) Test mutexAcquire/Release print order
  O) Test if lower priority process using mutexAcquire gets a turn before a higher priority process gets a second turn
  Z) Test bad semaphore, also deadlocks
 ===TEST BEGIN===
  PRODUCER    CONSUMER    PRODUCER2   CONSUMER2   PRODUCER3   PRODUCER4   PRODUCER5   TESTMUTEX   INTERRUPTPRINT  TESTNOMUTEX TESTMUTEXORDER  So the idea is that lowerprio will attempt a remove_item on an empty buffer and so it will wait and control will be handed to higherprio, then higherprio will insert_item and then resched(). What must happen then is lowerprio will succesfully come back from waiting and succesfully complete remove_item and eventually hand control back to higherprio which will attempt remove_item and get stuck waiting.
   LOWERPRIO   HIGHERPRIO  PRODCUER    
===TEST END===
  �: ��; ��< �l= � > ��> �T@ ��A ��B �,D ��O ��O ��O ��O ��O ��O ��O �PF ��G ��H ��I ��J ��O ��O ��O ��O ��O ��O ��O �L �M ��M ��O ��O ��O ��O ��O ��O ��O ��O ��O ��O ��N �Hello XINU World.
 Time base %dHz, Clock interrupt at %dHz
   (Mips XINU) #34 (cohare@morbius.mscs.mu.edu) Thu Mar 19 21:21:33 CDT 2015   

    Processor identification: 0x%08X
  Detected platform as: %s

    %10d bytes physical memory.
              [0x%08X to 0x%08X]
 %10d bytes reserved system area.
  %10d bytes XINU code.
 %10d bytes stack space.
   %10d bytes heap space.
               [0x%08X to 0x%08X]

   MAIN    

All user processes have completed.

  prnull  Linksys WRT54G  Linksys WRT54GL Linksys WRT350N Unknown Platform    ���' ��  ��!� $ �� �< B4 �� �� B�� B0 �� �� B�� B0 �� ��@ B0��@    $ ��
 $ b     �<�D$ �<t)B$	�@      ��$ ��  C�$ �� ��  �' �    ���' �< B4  �� �<dxB� @     $3
       �� B�� B0 B0 @    !  3
      $ �' �    ���' �� �< B4 �� �<dxB� @     �<dxB���C$ �<dxC� �<dxC� �<hxB$!b   B� �� ��Y
          �<x(B$	�@     ��@     ��  B� �� �� ��  �' �    ���' ��$ ��( ��, ��  ��$ �' �� ��  ��!(@  �<�'F$!8   �<�pB$	�@      $ ��  �' �    ���', ��0 ��4 ��  �� ����$ ��0 ���  B0  ��0 �� � B0 ��  �� @     �<  ��� �wB$!b   B� �<�d$0 ��!0@  �<t)B$	�@     �
     �
      �� B$ �� ��C  �� ����@     ���  �<�B4!b   B�$ ��$ �� @    $ ��	�@     �      �< ��� @xB$!b   B� �<�d$ ��!0@  �<t)B$	�@     4 ��� B$  B� �<�d$!(@  �<t)B$	�@     4 ��� C$4 ��� B$  B� �<��$!(` !0@  �<t)B$	�@     4 ��� E$4 ��� B$  C�4 ��� B$  B�4 ��� �$  ��4 ��� �$  �� �� �� �< �$!0` !8@  �<t)B$	�@     4 ��p E$4 ��� B$  C�4 ��� B$  B�4 ��� �$  ��4 ��� �$  �� �� �� �<<�$!0` !8@  �<t)B$	�@     4 ��` E$4 ��x B$  C�4 ��| B$  B�4 ��� �$  ��4 ��� �$  �� �� �� �<x�$!0` !8@  �<t)B$	�@     4 ��P E$4 ��h B$  C�4 ��l B$  B�4 ��p �$  ��4 ��t �$  �� �� �� �<��$!0` !8@  �<t)B$	�@     4 ��@ E$4 ��X B$  C�4 ��\ B$  B�4 ��` �$  ��4 ��d �$  �� �� �� �<��$!0` !8@  �<t)B$	�@     4 ��0 E$4 ��H B$  C�4 ��L B$  B�4 ��P �$  ��4 ��T �$  �� �� �� �<,�$!0` !8@  �<t)B$	�@     4 ��  E$4 ��8 B$  C�4 ��< B$  B�4 ��@ �$  ��4 ��D �$  �� �� �� �<h�$!0` !8@  �<t)B$	�@     4 �� E$4 ��( B$  C�4 ��, B$  B�4 ��0 �$  ��4 ��4 �$  �� �� �� �<��$!0` !8@  �<t)B$	�@     4 �� B$  C�4 �� B$  B�4 ��  �$  ��4 ��$ �$  �� �� �� �<��$4 ��!0` !8@  �<t)B$	�@     �     , ��0 �' �    ���' <fB4  ��n<<_�B4 �� �<txC�  ��bp ��!b  �<txC� �<txB� �' �    ���' ��  �� ��  ���      ���      �� B$ �� ���B(��@      �� B$  ��  �� ��*b ��@    !   �' �    ���' ��  ��$ ��  �� B�! @  �<`dB$	�@      ��  ��$ B�! @  �<`dB$	�@      �� ����$ b     ����$ b    ��$*       �� B�  ��� !b $ ��  C�  �� B� D$ff<gfB4 �     C � #b !` � !C #�   �� C�  ��$ B�! @  �<�eB$	�@       ��  B�! @  �<�eB$	�@     !   ��  �' �    ���' ��  ��$ ��  ��  B�! @  �<`dB$	�@      ��  ��$ B�! @  �<`dB$	�@      �� ����$ b     ����$ b    ��$u       �� B�  ��� !b   C�$ ��  C�  �� B� D$ff<gfB4 �     C � #b !` � !C #�   �� C�  ��$ B�! @  �<�eB$	�@       �� B�! @  �<�eB$	�@     !   ��  �' �    ���' ��  �� �<�B$	�@      �<�.B$	�@     !@ �Q<�B4 b   B � �  !D �  !D #b ! @  �</B$	�@      �<�.B$	�@      ��  �� �� �<�/B$	�@      @     �<(gB$	�@      �<D$ �<t)B$	�@      �<�gB$	�@     �      �<(gB$	�@     �<4�B� �<8d$!(@  �� �<t)B$	�@      �<�gB$	�@     �     ���' ��  �� �<�B$	�@      �<�.B$	�@     !@ �Q<�B4 b   B � �  !D �  !D #b ! @  �</B$	�@       �� �'!(@  �<�0B$	�@      @     �<(gB$	�@      �<D$ �<t)B$	�@      �<�gB$	�@     �      �<(gB$	�@     �<4�C� �� �<T�$!(` !0@  �<t)B$	�@      �<�gB$	�@     �     ���' �� �<�B$	�@      �<pD$ �<t)B$	�@      �� �' �    ���' �� �<�B$	�@      �<(gB$	�@      �<pD$ �<t)B$	�@      �<�gB$	�@      �� �' �    ���' �� �<�B$	�@      �<(gB$	�@      �<|D$ �<t)B$	�@      �<�gB$	�@      �� �' �    ���' �� �<�B$	�@      �<(gB$	�@      �<�YB$	�@      �<�D$ �<t)B$	�@      �<�gB$	�@      �� �' �    ���' �� �<�B$	�@      �<(gB$	�@      �<�YB$	�@      �<�D$ �<t)B$	�@      �<�gB$	�@      �� �' �    ���' �� �<�B$	�@      �<�D$ �<t)B$	�@      �� �' �    ���' ��  �� �<�B$	�@      �<(gB$	�@      �<lD$ �<t)B$	�@       �� �'!(@  �<�0B$	�@      �� �<�d$!(@  �<t)B$	�@      �<�gB$	�@      ��  �' �    ���' ��  �� �<�B$	�@      �<�YB$	�@       �� $ �<�/B$	�@      �<(gB$	�@      �<�D$ $ �<t)B$	�@      �<�gB$	�@      �<�YB$	�@       �� �'!(@  �<�0B$	�@      �<(gB$	�@      �� �<�d$!(@  �<t)B$	�@      �<�gB$	�@      ��  �' �    ���'< ��@ �� $ �<�bB$	�@     4 �� $ �<�bB$	�@     , ��!    �<�bB$	�@     0 ��$ ��( ��@ ��! @  �'( $!(` !0@  �<wB$	�@     @ ��< ��@ �' �    `��'� �� �<�D$ �<t)B$	�@      �< D$ �<t)B$	�@      �<LD$ �<t)B$	�@      �<�D$ �<t)B$	�@      �<�D$ �<t)B$	�@      �<�D$ �<t)B$	�@      �<,D$ �<t)B$	�@      �<`D$ �<t)B$	�@      �<�D$ �<t)B$	�@      �<�D$ �<t)B$	�@      �<  D$ �<t)B$	�@      �<` D$ �<t)B$	�@      �<� D$ �<t)B$	�@      �<� D$ �<t)B$	�@      �<8!D$ �<t)B$	�@      �<�!D$ �<t)B$	�@      �<�!D$ �<t)B$	�@      �<�!D$ �<t)B$	�@      �<l"D$ �<t)B$	�@      �<�"D$ �<t)B$	�@      �<�(B$	�@      �� ����B$+ C,<`    �  �<%B$!b   B� @     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@     p �'! @  �<�7B$	�@     H �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��H �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��H �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@     p �'! @  �<�7B$	�@     H �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��H �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      ���      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@     ���      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@    �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      ��
      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@     ��(      $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@    �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      ��W      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@     $ ��  �' �� �<3D$ <
 $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      ���      $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@     ���      $ ��  �' �� �<3D$ <
 $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@    �     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      ���      $ ��  �' �� �<�1D$ <
 $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� B$ �� �� B(��@     $ ��  �' �� �<3D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �      �� �<@5D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� �<@4D$ < $ �<#G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� �< 6D$ < $ �<#G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� �<�4D$ < $ �<#G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �      �� �<�5D$ < $ �<$#G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �� �<�4D$ < $ �<#G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �      �<4#D$ �<t)B$	�@     p �'! @  �<�7B$	�@       �'p �'( $!(` !0@  �<wB$	�@      $ ��  �' �� �<`6D$ < $ �<�$G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �< 7D$ < $ �<�$G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �     �$D �� $ �<�bB$	�@     < ��!    �<�bB$	�@     @ ��4 ��8 �� $ ��  �' �� �<�1D$ < $ �<�"G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      $ ��  �' �� �<3D$ < $ �<�$G$ �<pTB$	�@     ! @ !(   �<�XB$	�@     �         �      �<�YB$	�@     �<0�B� B(��@     �<�$D$ �<t)B$	�@         � ��� �' �    ���' �� �� �� �<�%D$ �<t)B$	�@      �<�B$	�@      �<�8B$	�@     !   �� �' �    ���'!�  �� �� ��  ����B0��B$ b     ����B0� B, @     �� @     ��2 B( @     ���<� �  !D \�c$!C   B� @    ��$c      ����B0  �� ��  ��    �<�  xxB$!�   C� �� �<  ��� xxB$!b  C� �<�  xxB$!�  C� �<  ��� xxB$!b  B�!@  �<� xxB$!b  ��  C� �<  ��� xxB$!b  �� C� �� �' �    !�   ��  �� @      ��2 B( @      ���<� �  !D \�c$!C   B� @    ��$�       �� �<� xxB$!b  B�! @   �� �<� xxB$!b   C� �<�  xxB$!�   C�  �� �<� xxB$!b   B�! @   �� �<� xxB$!b  C� �<�  xxB$!�  C�  �� �    ���' ��  ��  ��  ��  ��   ����B0��B$ b      ����B0� B, @    ��$�      �< ��� xxB$!b   B� �� ��2 B(  @     ��   ! @  �<�QB$	�@      ��    �< ���  xxB$!�  C� ��    �< ���  xxB$!�   C� ��   �     ��$ ��  �' �    ���' �<`xB� D$ �<`xd�  �� �<`xB� D$ �<`xd� �� ��    �<  ���  xxB$!�   C� �<  ��� xxB$!b ��$ C� �< ��� xxB$!b ��$  C�  ��    �< ���  xxB$!�  C�  ��   ����B0%b  �' �    ���'4 ��8 ��< ��@ ��D ��< �� B, @     $< ��< �� C$��$$b < ��< �� �<�[B$	�@      �� �<�WB$	�@       �� ����$ b      ����$ b    ��$�     �<0�B� C$�<0�C�  ��� � !C �<\�c$!C $ ��$ �� $  C� ��< ��#b !@ $ �� C�< ��$ �� C�$ ��@ ��  C� ��e      �� B$ ��D �� ��!b   C�$ �� ��!�  C�$ �� ��!b  B���@     ��

<��c4  C� ����B$ �� ��  ��  C� ����B$ ��$ �� B�!@  ��  C� ����B$ ��$ �� B�!@  ��  C�H �� @     $ ���     H �� B0 @     ���     H �� B0 $#b  �� ���      ����B$ �� ��  @� �� B$ �� �� ��+b ��@    H �� ���      ����B$ �� ��  @� ����B$ �� ����@     �� �� ����B$ ��8 �� ��  C� ����B$ �� �<�XC$ ��  C� $ ���      ����B$ �� ��  @� ����B$ �� ����@    $ �� �� C�L �'( �� ���      �� C$ ��( �� d$( ��  c�  C� �� B$ �� ��H ��+b ��@      ��4 ��8 �' �    ���'  ��#     �<X�B� C$�Q<�B4 b    (  ! � #� @ �  !D �  !D #b �<X�b��<X�B��<� �  !D \�c$!C   B� @    �<X�B�(       �� B$  ��  ��2 B(��@    ��$ �' �    ���' ���<4�B�! @  �<�\B$	�@      �� �' �    ���' �� �� ��!�  �� �� @     ��2 B( @    �< ��� �  !D \�c$!C   B� @    ��$p      ��� � !C �<\�c$!�C  $  � ��   ! @ �<,�C�  �!(` !0@  �<^B$	�@      �� @     �<�YB$	�@      $ �� �� �' �    ���'$ �� �<�B$	�@      ���<4�B�� � !C �<\�c$!C  �� ��  C� $ b     �� $  C��<4�B�   ! @ �<,�C� ��  B�!(` !0@  �<^B$	�@     �<,�B�! @  �<�RB$	�@     !@ �<4�C��<4�B�� � !C �<\�c$!C  �� �� $  C��<,�B�  ���      �� �<� xxB$!b   B� �� �� @     �� �<xxD$� !�  B� D$ �<xxE$� !�  D� �� �<� xxB$!b   B�!@ �<,�B���B0��b    �<
 $l�C� �� C$ �� B$! ` !(@  �< B$	�@      �� �<B$	�@      $$ ��( �' �    ���' �� �� @    ��$      �� C$��$$b  ���<@�B$ B�!@  ��#b �<\�B$+b  @    ��$     �<@�B$ B���C$��$$b   ���<@�B$ B�!@  ��#b !@ �<@�B$ C�  �� �' �    ���' ��  �� �<�B$	�@      ��  �� @      ��2 B( @    �<  ��� �  !D \�c$!C   B� @      �� @      ��� � !C �<\�c$!C  �� ��  B�	 @     �� �<B$	�@     ��$~       ��� � !C �<\�c$!C  ���<0�B���C$�<0�C� ��  B� $ C     $	 C    v      ��  @� �<�YB$	�@       ��   ! @  �<�QB$	�@      ��  @� �� �<B$	�@      $ ��  �' �    ���' ��!� $ ��( ��  ��$ �� $ ����B0��B$ b    $ ����B0� B, @      �� @      ��2 B( @      ���<� �  !D \�c$!C   B� @    ��$�      ��$ ��  �� �< ��� xxB$!b   B�!@ $ ����B0 b      ��$ ����B0! ` $ ��( ��!8@  �<`B$	�@       ���      �< ��� xxB$!b   B� �� �< ��xxc$� !b  C�( ��+b  @      ��! @ $ ��( �� �� �<`B$	�@      $ �� �< ��� xxB$!b   B�!@ $ ����B0 b     ����@     �� @      ��$ ����B0! ` $ ��( ��!8@  �<`B$	�@       �� ��  �' �    !�  �� �� ��  �� �< ��� xxB$!b  B�!@  �<� xxB$!b   ��  C�  �� �< ��� xxB$!b  C� �<�  xxB$!�  C�  �� ��    �<�  xxB$!�   C� �< ��� xxB$!b   �� C�  �� �<xxc$� !b  �� C� �    ���' ���<
 $l�C��<�$d�C��<@�B$ B� @    �<@�B$�< �c4 C��<@�B$ C�b<�MB4 b   � �<`�C��<@�B$ C��<@�B$ D��<`�B� � �@       �<�%�$!(` !0@  �<t)B$	�@      �<�B4 �<�ac$  C� $ �<(B$	�@     �<`�B�! @  �<�B$	�@      �� �' �    ���' ���<`�B�! @  �<�B$	�@     �<d�B���C$�<d�C��<d�B�	 @    �<h�B� C$�<h�C��<�$d�C��<l�B���C$�<l�C��<l�B� @     �<�YD$ �<LB$	�@      �� �' �    ���' �� ��  �� �<�B$	�@      �� �<lcB$	�@     !�@ ��$       �� @    �<p�C$! � �  #� !b   �� C� �� �<B$	�@     ! �      �� �<B$	�@     ��$ �� ��  �' �    ���'  ��  ��     �< �B� C$�Q<�B4 b    (  C! � #� � �  !D �  !D #b �< �b��< �B��<� � #b p��$!b   C� $ b    �< �B��<� � #b p��$!b  $  C��< �B�       �� B$  ��  ��d B(��@    ��$ �' �    ���'$ ��  �� ��( ��!�  !�   �<�B$	�@      ��( ��d B, @    �<( ��� � #b p��$!b   C� $	 b     �� �<B$	�@     ��$j     �<4�B�� � !C �<\�c$!�C ( ��� � #b �<p�B$!�b  ���B$ � � A     $  "�( ��$ "��<4�B�   !@  �! ` !(@  �<HPB$	�@      �<�YB$	�@      �� �<B$	�@      $$ ��  �� ��( �' �    ���' �� ��  ��!�   �<�B$	�@      ��  ��d B, @    �<  ��� � #b p��$!b   C� $	 b     �� �<B$	�@     ��$�       ��� � #b �<p�B$!�b  � C$ � A     �! @  �<�RB$	�@     ! @  $ �<�XB$	�@      �� �<B$	�@      $ �� ��  �' �    ���'  ��  ���     �<$�C$  ��!b   @�  �� B$  ��  ��2 B(��@    �<X�@� �' �    ���' �� $ ���<4�C��<$�B$!b  $  C��     �<X�D$ �<pB$	�@      ���<4�C��<$�B$!b   B�    @     ����@    �<4�C��<$�B$!b   @� ��  �' �    ���'�<4�B� C$�Q<�B4 b    (  ! � #� @ �  !D �  !D #b   ��       �� C$�Q<�B4 b    (  ! � #� @ �  !D �  !D #b   ���<4�B�  ��
 b    �<$�C$  ��!b   B�   ��@    �<4�B�  �� b    �<X�@�7     �<$�C$  ��!b   @� �' �    ���'$ �� �<�%D$ �<t)B$	�@      �<<&D$ �<t)B$	�@      �<$nB$	�@     �<<�B� �<D&d$!(@  �<t)B$	�@      �<h&D$�<@�E$ �<t)B$	�@      �<\lB$	�@     �<@�B$ B�!@ �<��B4$b  �<�&d$!(@  �<t)B$	�@     �<@�B$ B���B$ �<�&d$ �<!0@  �<t)B$	�@      �< C$ �<!b  �<�&d$!(@  �<t)B$	�@      �< B$��B$ �<�&d$ �<!0@  �<t)B$	�@     �<\�C$ �< B$#b  �<�&d$!(@  �<t)B$	�@      �< C$�<\�B$��B$ �<�&�$!(` !0@  �<t)B$	�@     �<8�B�!@ �<\�B$#b  �<'d$!(@  �<t)B$	�@     �<\�C$�<8�B���B$ �<�&�$!(` !0@  �<t)B$	�@     �<@�B$ B�!@ �<8�B�#b  �< 'd$!(@  �<t)B$	�@     �<8�B�!@ �<@�B$ B���B$ �<<'�$!(` !0@  �<t)B$	�@      $ �� �� �� �<�OD$ < $ �<`'G$ �<pTB$	�@     ! @ !(   �<�XB$	�@      �<�B$	�@     �<,�B�  �<� xxB$!b   B�2 B( @     �<�YB$	�@     �<0�B� B(	 @     �<h'D$ �<t)B$	�@          �     ���'$ �� �� �� ���< $0�C� ��-     �< ��� �  !D \�c$!C   @� �� B$ �� ��2 B(��@    �<\�B$ �� �� $  C� �� B$! @  �<�'E$ $ �<DwB$	�@      ���<\�c$ C� �� @��<8�B�!@ �<\�B$#b !@  �� C� ��  @� ����$$ C��<4�@� ��q      ��� � #b �<p�B$!b  �� �� $  C� �� @� �<�SB$	�@     !@  �� C� �� B$ �� ��d B(��@     �<�fB$	�@      �<�SB$	�@     !@ �<,�C� �<�`B$	�@      $$ ��( �' �    ���' ���<<�B�� B0 $9 C    ) $ C     $ C    �     �<@�D$ �<�'E$ $ �<DwB$	�@     �<@�B$��< C��<@�B$'< c4 C��<@�B$ $ C��     �<@�D$ �<�'E$ $ �<DwB$	�@     �<@�B$ �< C��<@�B$�< �c4 C��<@�B$ $ C��     �<@�D$ �<�'E$ $ �<DwB$	�@     �<@�B$ �< C��<@�B$�<��c4 C��<@�B$) $ C��     �<@�D$ �<�'E$ $ �<DwB$	�@     �<@�B$��< C��<@�B$�< �c4 C���$�      $ �� �' �     �!�  �$������� �    ���' $
 $  �� $ � �` !8� B$@     0 %��F  �
 $0 $! �  �� �T $ ��B$
b ��B$!� c� �$��A���� � �'���'p ��d ��\ ��X ��| ��x ��t ��l ��h ��` ��!�� !�� !�� !�� % $ t&���� �P u���| ��	� !  1 !�� �V- �:!  % $	�  s&1 % $ �. s&�u  ��0 $ BH ��M  �&  $  ��* $ �
 $W !H    Ɏ �&a  �&  ����D$� �0
 �, �%q �&!Hb W ��)%  ��. $ �!0   ��* $ �
 $o  �&  Ǝ �&y  �&  ����D$� �0
 �, ��p �&!0b o ���$  �� � �&!  	� % $� | ��d $2 �e �( @s $b $� �c �( @X $� � �&  Î �� $� 	 $ �t �(	 @u $o $� � �&  Î �� $�  $& �x $� � �&  Î �� $ 	 $  5 ��4 �� �&!�  !0    $o 4 �'  ގ!�   �&o   $  Ď �& �!�  #  - $ �<P ��4 �'p�$	�@ L ��!��4 �'� P ��e�<  Ď �&!�   6c$ � �< �& � ! � � � p%4 �'	�` L ��4 ��!��!��4 ��!�  !0  4 �'o L �� g0 �'!0b0 �$ B$  Ǡ��E�  ��0 $3 B0 �� $ �'!(�   �� �T $� ��B$
b 4 �'!@` ��B$ �'!(�  �� c$��A��e�c !��  �< g0�wk%!8�  �'  �!0 B$  Ǡ��E  $0 $ �'!(�   �� �T $ ��B$
b 4 �'!@` ��B$ �'!(�  �� c$��A��e�c !��  �< g0�wk%!8�  �'  �!0 B$  Ǡ��E  $0 $ �'!(�   �� �T $, ��B$
b 4 �'!@` ��B$ �'!(�  �� c$��A��e�c !��   Î �& �� $1 
$0 $! $ g0!X XG!8` �'!0b B$  Ǡ��EC   $0 $ �'!(�   �� �T $R ��B$
b 4 �'!@` ��B$ �'!(�  �� c$��A��e�!�� !�  !0  o !� !  P ��	� L ��L ��P ��!�  4 �'!�  !�  B� @Q "-p  �&
H Q �,
0 %�  @- $ �P#�7*�
�� #�7- $ �
�	 � ���& �!�  0 $ BH ��!  	� - $H ��  !0  - $ �!0  �   $*� ��@!  !(@	� P ��P ���  �$ B!0  !  	� - $!0  *�  @!�  E�!  	� P ��P ���  �$H ���`!�  *�|�@!  	� !(@�  �&x ��t ��p ��l ��h ��d ��` ��\ ��X �� �� �'!  *f  @  �(!�   G�!�   G��  c$0  � �$!� !8� !  * f  �! �   �� �$ ����#8�  c$* f  �! � � �����  c$ �    0123456789ABCDEF    0123456789abcdef    � �� �� � �  �\ �� �� �� � �$ �H �l �� �� �� �� �� �� �� �� �� � �$ �P �� �� �� �� �� �h �� �� �� �� �� � �8 �X �x �2   �  �                    GCC: (GNU) 4.8.2 A   gnu     .symtab .strtab .shstrtab .text .text.kputc .text.kcheckc .text.kgetc .text.kprintf .text.xtrap .text.rand .text.sleep .text.insert_item .text.remove_item .text.producer .text.consumer .text.interruptprint .text.interruptprintmutex .text.interruptprintmutexorder .text.testmutex .text.testmutexorder .text.testnomutex .text.lowerprio .text.higherprio .text.createbuffer .text.testcases .text.main .text.enqueue .text.remove .text.dequeue .text.newqueue .text.create .text.newpid .text.userret .text.ready .text.resched .text.getstk .text.kill .text.prioritize .text.insert .text.clockinit .text.clockintr .text.semcreate .text.semalloc .text.wait .text.signal .text.mutexInit .text.mutexAcquire .text.mutexRelease .text.nulluser .text.sysinit .text.platforminit .text.bzero .text._prtl10 .text._doprnt .text.memcpy .text.strncpy .rodata.str1.4 .data .bss .reginfo .comment .gnu.attributes                                                     �   �                 !         �' ��'  �                  -         x( �x(  `                  ;         �( ��(  �                  G         t) �t)  \                  U         �) ��)  �                 a         �. ��.  P                  l         / �/  t                  x         �/ ��/  (                 �         �0 ��0  ,                 �         �1 ��1  4                 �         3 �3  (                 �         @4 �@4  @                  �         �4 ��4  `                  �         �4 ��4  `                          @5 �@5  p                          �5 ��5  p                  -         6 � 6  @                  ?        `6 �`6  �                  O         7 � 7  �                  `        �7 ��7  �                  s        �8 ��8  X                 �        �O ��O  \                  �        HP �HP  P                 �        �Q ��Q  �                  �        �R ��R                   �        �S ��S  �                  �        pT �pT  x                 �        �W ��W  �                  �        �X ��X  4                  �        �X ��X  �                  �        �Y ��Y  �                         �[ ��[  �                          �\ ��\  �                          ^ �^                    1        ` �`  �                  >        �` ��`                   N        �a ��a  �                  ^        �b ��b  �                  n        lc �lc  �                  }        `d �`d  `                 �        �e ��e                   �        �f ��f  X                  �        (g �(g  �                  �        �g ��g                   �        �h ��h  t                 �        \l �\l  �                 �        $n �$n  �                 �        �o ��o                            p �p  |                          �p ��p  �                 #        w �w  4                  0        Dw �Dw  T                  >     2   �w ��w  (                 M        �w ��w  �                  S        dx �dx  �                 X    p        dx                   a     0       |x                   j  ���o        �x                                  �x  z                               ��  �  >   j         	              ��  �                                       �          �' �          x( �          �( �          t) �          �) �          �. �          / �          �/ �     	     �0 �     
     �1 �          3 �          @4 �          �4 �          �4 �          @5 �          �5 �           6 �          `6 �           7 �          �7 �          �8 �          �O �          HP �          �Q �          �R �          �S �          pT �          �W �          �X �          �X �          �Y �           �[ �     !     �\ �     "     ^ �     #     ` �     $     �` �     %     �a �     &     �b �     '     lc �     (     `d �     )     �e �     *     �f �     +     (g �     ,     �g �     -     �h �     .     \l �     /     $n �     0     �o �     1     p �     2     �p �     3     w �     4     Dw �     5     �w �     6     �w �     7     dx �     8              9              :              ;             ��   h �          � �       +   � �       4            ��D   � �       N   � �       a            ��x   � �       �            ���   hx �
    8 �            ���            ���   tx �    8 �            ���            ���            ���   $n ��   0 �   \l ��   / �            ���   `x �    7 �            ��   �W ��       X� �    8            ��           ��&           ��/           ��6           ��C           ��O           ��[  lc ��    ( d   � �    8 q           ��x           ���           ���  $� �2    8 �  X� �    8 �           ���           ���  p �|    2 �           ���           ��             ���    �      8 �    �      8 �  �Y ��     �  �h �t   . �  @� �    8 �  �( ��     �  ,� �    8 �  �p ��   3 �  �' ��       (g ��    ,   <� �    8   �` �   % !  � �      1  L �      >  �) ��    D  0� �    8 L  � �      Y  8� �    8 a  � ��    l  w �4    4 s  4� �    8 {  � �     �  ( �      �  � �      �  �Q ��     �  �X �4     �  / �t     �  \� ��   8 �  3 �(    �  @x �     7 �  ^ �    # �   7 ��     �  �[ ��    ! �  �o �    1 �  � �      �  � �        �1 �4      `� �    8   �7 ��     )  �\ ��   " .  \� �     8 2  @4 �@     A  � �      I  `d �`   ) N  x( �`     V  p� ��   8 ]    �      d  �. �P     i  �e �   * p    ��     v  l� �    8 ~  �0 �,   
 �  Dw �T    5 �  pT �x    �  dx �     7 �  �S ��     �  �a ��    & �  �b ��    ' �  �8 �X    �  dx �    8 �  �O �\     �  `6 ��     �  p �(     �  �f �X    + �  �4 �`       �5 �p       �g �   - "  HP �P    *   6 �@     6  �/ �(   	 B  xx ��   8 K  �R �    S  t) �\     [  �w ��    7 f  h� �    8 p   �      x  �4 �`     �  \� �    8 �  ` ��    $ �  �X ��     �  d� �    8 �  @5 �p      ../loader/start.o copyhandler clearvector getcpuid ../system/irq.o savestate ret_from_exception ../system/testAndSet.o tasdone kprintf.c ungetArray xtrap.c testcases.c c.1143 main.c clockinit.c initialize.c platforminit sysinit queue.c nextqueue create.c newpid nextpid.1050 ready.c resched.c getstk.c kill.c prioritize.c clockintr.c semcreate.c semalloc nextsem.1015 wait.c signal.c mutex.c waiting lock bzero.c doprnt.c _prtl10 memcpy.c strncpy.c _bss _end resched nulluser platform kgetc readylist _doprnt kputc mutexAcquire cpuid clockinit endtranshandler restore_intr xtrap numproc clock_update minheap irqhandler memcpy currpid transferhandler enable_irq flushcache remove userret sleep proctab consumer irq_names prioritize higherprio getstk bzero enable _startup producer time_intr_freq createbuffer kill end interruptprint disable wait kcheckc semtab _start rand signal ctxsw preempt remove_item strncpy create bss newqueue clockintr semcreate testcases bufp main lowerprio testAndSet mutexInit interruptprintmutexorder testmutexorder mutexRelease enqueue testnomutex insert_item queuetab dequeue kprintf trap_names clocktime restore interruptprintmutex time_base_freq insert ready ctr_mS testmutex 