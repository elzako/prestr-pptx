package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class i9 {
   private byte[] n5;
   private int l6;
   private long k5;
   private byte[] u3;
   private long[] a6 = new long[]{1779033703L, 3144134277L, 1013904242L, 2773480762L, 1359893119L, 2600822924L, 528734635L, 1541459225L};
   private static final long[] u9 = new long[]{
      1116352408L,
      1899447441L,
      3049323471L,
      3921009573L,
      961987163L,
      1508970993L,
      2453635748L,
      2870763221L,
      3624381080L,
      310598401L,
      607225278L,
      1426881987L,
      1925078388L,
      2162078206L,
      2614888103L,
      3248222580L,
      3835390401L,
      4022224774L,
      264347078L,
      604807628L,
      770255983L,
      1249150122L,
      1555081692L,
      1996064986L,
      2554220882L,
      2821834349L,
      2952996808L,
      3210313671L,
      3336571891L,
      3584528711L,
      113926993L,
      338241895L,
      666307205L,
      773529912L,
      1294757372L,
      1396182291L,
      1695183700L,
      1986661051L,
      2177026350L,
      2456956037L,
      2730485921L,
      2820302411L,
      3259730800L,
      3345764771L,
      3516065817L,
      3600352804L,
      4094571909L,
      275423344L,
      430227734L,
      506948616L,
      659060556L,
      883997877L,
      958139571L,
      1322822218L,
      1537002063L,
      1747873779L,
      1955562222L,
      2024104815L,
      2227730452L,
      2361852424L,
      2428436474L,
      2756734187L,
      3204031479L,
      3329325298L
   };

   public i9() {
      this.n5();
   }

   public final byte[] n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("message");
      }

      this.n5(var1, 0, var1.length);
      this.u3 = this.l6();
      byte[] var2 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).deepClone(), byte[].class);
      this.n5();
      return var2;
   }

   public final void n5() {
      this.a6 = new long[]{1779033703L, 3144134277L, 1013904242L, 2773480762L, 1359893119L, 2600822924L, 528734635L, 1541459225L};
      this.k5 = 0L;
      this.l6 = 0;
      this.n5 = new byte[64];
   }

   private void n5(byte[] var1, int var2, int var3) {
      if (this.l6 > 0) {
         if (var3 < 64 - this.l6) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, var3);
            this.l6 += var3;
            return;
         }

         int var4 = 64 - this.l6;
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, var4);
         this.n5(this.n5, 0);
         this.k5 += 64L;
         this.l6 = 0;
         var2 += var4;
         var3 -= var4;
      }

      for (int var6 = 0; var6 < var3 - var3 % 64; var6 += 64) {
         this.n5(var1, var2 + var6);
         this.k5 += 64L;
      }

      int var5 = var3 % 64;
      if (var5 != 0) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var3 - var5 + var2, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, var5);
         this.l6 = var5;
      }
   }

   private byte[] l6() {
      return this.l6(this.n5, 0, this.l6);
   }

   private void n5(byte[] var1, int var2) {
      long[] var3 = new long[64];
      long var4 = this.a6[0];
      long var6 = this.a6[1];
      long var8 = this.a6[2];
      long var10 = this.a6[3];
      long var12 = this.a6[4];
      long var14 = this.a6[5];
      long var16 = this.a6[6];
      long var18 = this.a6[7];
      long[] var20 = u3(var1, var2, 64);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var20)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var20.length);

      for (int var21 = 16; var21 < 64; var21++) {
         var3[var21] = (
                  (
                           (
                                    (
                                          ((var3[var21 - 2] & 4294967295L) >> 17 | (var3[var21 - 2] & 4294967295L) << 15)
                                             ^ ((var3[var21 - 2] & 4294967295L) >> 19 | (var3[var21 - 2] & 4294967295L) << 13)
                                             ^ (var3[var21 - 2] & 4294967295L) >> 10
                                       )
                                       & 4294967295L
                                 )
                                 + (var3[var21 - 7] & 4294967295L)
                              & 4294967295L
                        )
                        + (
                           (
                                 ((var3[var21 - 15] & 4294967295L) >> 7 | (var3[var21 - 15] & 4294967295L) << 25)
                                    ^ ((var3[var21 - 15] & 4294967295L) >> 18 | (var3[var21 - 15] & 4294967295L) << 14)
                                    ^ (var3[var21 - 15] & 4294967295L) >> 3
                              )
                              & 4294967295L
                        )
                     & 4294967295L
               )
               + (var3[var21 - 16] & 4294967295L)
            & 4294967295L;
      }

      for (int var26 = 0; var26 < 64; var26++) {
         long var22 = (
                  (
                           (
                                    (var18 & 4294967295L)
                                          + (
                                             (
                                                   ((var12 & 4294967295L) >> 6 | (var12 & 4294967295L) << 26)
                                                      ^ ((var12 & 4294967295L) >> 11 | (var12 & 4294967295L) << 21)
                                                      ^ ((var12 & 4294967295L) >> 25 | (var12 & 4294967295L) << 7)
                                                )
                                                & 4294967295L
                                          )
                                       & 4294967295L
                                 )
                                 + ((var12 & var14 ^ ~(var12 & 4294967295L) & 4294967295L & var16) & 4294967295L)
                              & 4294967295L
                        )
                        + (u9[var26] & 4294967295L)
                     & 4294967295L
               )
               + (var3[var26] & 4294967295L)
            & 4294967295L;
         long var24 = (
                  (
                        ((var4 & 4294967295L) >> 2 | (var4 & 4294967295L) << 30)
                           ^ ((var4 & 4294967295L) >> 13 | (var4 & 4294967295L) << 19)
                           ^ ((var4 & 4294967295L) >> 22 | (var4 & 4294967295L) << 10)
                     )
                     & 4294967295L
               )
               + ((var4 & var6 ^ var4 & var8 ^ var6 & var8) & 4294967295L)
            & 4294967295L;
         var18 = var16;
         var16 = var14;
         var14 = var12;
         var12 = (var10 & 4294967295L) + (var22 & 4294967295L) & 4294967295L;
         var10 = var8;
         var8 = var6;
         var6 = var4;
         var4 = (var22 & 4294967295L) + (var24 & 4294967295L) & 4294967295L;
      }

      this.a6[0] = (this.a6[0] & 4294967295L) + (var4 & 4294967295L) & 4294967295L;
      this.a6[1] = (this.a6[1] & 4294967295L) + (var6 & 4294967295L) & 4294967295L;
      this.a6[2] = (this.a6[2] & 4294967295L) + (var8 & 4294967295L) & 4294967295L;
      this.a6[3] = (this.a6[3] & 4294967295L) + (var10 & 4294967295L) & 4294967295L;
      this.a6[4] = (this.a6[4] & 4294967295L) + (var12 & 4294967295L) & 4294967295L;
      this.a6[5] = (this.a6[5] & 4294967295L) + (var14 & 4294967295L) & 4294967295L;
      this.a6[6] = (this.a6[6] & 4294967295L) + (var16 & 4294967295L) & 4294967295L;
      this.a6[7] = (this.a6[7] & 4294967295L) + (var18 & 4294967295L) & 4294967295L;
   }

   private byte[] l6(byte[] var1, int var2, int var3) {
      this.k5(var1, var2, var3);
      List var4 = new List();

      for (long var8 : this.a6) {
         byte[] var10 = l6(new long[]{var8}, 0, 1);
         var4.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var10))));
      }

      return v4.l6(var4);
   }

   private void k5(byte[] var1, int var2, int var3) {
      int var4 = (int)(
         (com.aspose.slides.internal.v6g.k5.h0(var3, 9) + com.aspose.slides.internal.v6g.k5.h0(this.k5, 11)) % com.aspose.slides.internal.v6g.k5.h0(64, 9)
      );
      var4 = 56 - var4;
      if (var4 < 1) {
         var4 += 64;
      }

      byte[] var5 = new byte[var3 + var4 + 8];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, var3);
      var5[var3] = -128;
      long var6 = (com.aspose.slides.internal.v6g.k5.h0(this.k5, 11) + com.aspose.slides.internal.v6g.k5.h0(var3, 9)) * 8L;
      byte[] var8 = n5(new long[]{var6}, 0, 1);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var8)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), var5.length - 8, 8);
      this.n5(var5, 0);
      if (var5.length == 128) {
         this.n5(var5, 64);
      }
   }

   private static long[] u3(byte[] var0, int var1, int var2) {
      if (var2 + var1 > var0.length) {
         throw new ArgumentException("OutOfBound");
      }

      if (var2 % 4 != 0) {
         throw new ArgumentException("length");
      }

      long[] var3 = new long[var2 / 4];
      int var4 = 0;

      for (int var5 = var1; var4 < var3.length; var5 += 4) {
         var3[var4] = (
               (var0[var5] & 0xFF & 0xFF & 4294967295L) << 24
                  | (var0[var5 + 1] & 0xFF & 0xFF & 4294967295L) << 16
                  | (var0[var5 + 2] & 0xFF & 0xFF & 4294967295L) << 8
                  | var0[var5 + 3] & 0xFF & 0xFF & 4294967295L
            )
            & 4294967295L;
         var4++;
      }

      return var3;
   }

   private static byte[] n5(long[] var0, int var1, int var2) {
      if (var2 + var1 > var0.length) {
         throw new ArgumentException("Length and offset values are out of bound");
      }

      if (var2 > 268435455) {
         throw new ArgumentOutOfRangeException("length");
      }

      byte[] var3 = new byte[var2 * 8];

      for (int var4 = var1; var4 < var1 + var2; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            var3[(var4 - var1) * 8 + (7 - var5)] = (byte)(var0[var4] >> var5 * 8);
         }
      }

      return var3;
   }

   private static byte[] l6(long[] var0, int var1, int var2) {
      if (var2 + var1 > var0.length) {
         throw new ArgumentException("OutOfBound");
      }

      if (var2 > 536870911) {
         throw new ArgumentOutOfRangeException("length");
      }

      byte[] var3 = new byte[var2 * 4];

      for (int var4 = var1; var4 < var1 + var2; var4++) {
         for (int var5 = 0; var5 < 4; var5++) {
            var3[(var4 - var1) * 4 + (3 - var5)] = (byte)((var0[var4] & 4294967295L) >> var5 * 8 & 4294967295L);
         }
      }

      return var3;
   }
}
