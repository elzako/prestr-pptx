package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class s7 {
   public com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2();
   public int l6;
   public int k5;
   public com.aspose.slides.internal.r1x.v4 u3;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int x8;
   public com.aspose.slides.internal.r1x.v4 n3;
   public int y4;
   public int e2;
   public int t9;
   public com.aspose.slides.internal.b8u.a6 z1;
   public com.aspose.slides.internal.b8u.a6 t4;
   public int q0;
   public com.aspose.slides.internal.b8u.t2 z3;
   public int m1;
   public com.aspose.slides.internal.b8u.u3 k7;
   private int z8;
   private boolean j5;
   protected Object m3;

   public final void n5(
      int var1,
      int var2,
      int var3,
      com.aspose.slides.internal.b8u.a6 var4,
      com.aspose.slides.internal.r1x.v4 var5,
      com.aspose.slides.internal.o9b.y2 var6,
      com.aspose.slides.internal.b8u.a6 var7,
      com.aspose.slides.internal.r1x.v4 var8,
      int var9,
      int var10,
      com.aspose.slides.internal.b8u.t2 var11,
      com.aspose.slides.internal.b8u.u3 var12,
      int var13,
      Object var14
   ) {
      this.e2 = var1;
      this.t2 = var2;
      this.s7 = var3;
      this.n3 = var5;
      var6.u3(this.n5);
      this.a6 = var9;
      this.u3 = var8;
      this.u9 = var8.q0();
      this.h0 = this.n5.u3() * this.u9;
      this.l6 = this.n5.u9() * this.u9 - 1;
      this.c8 = this.h0 / 8;
      this.k5 = this.l6 / 8;
      int var15 = this.k5 - this.c8 + 1;
      this.m3 = var14;
      if (var9 < var15) {
         throw new ArgumentOutOfRangeException(
            "destinationLineSize",
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Expected at least ", com.aspose.slides.ms.System.a3.l6(var15), " bytes for the line size, otherwise the destination data does not fit."
            })
         );
      }

      this.y4 = var5.q0();
      int var16 = (this.y4 * this.e2 + 7) / 8;
      if (var3 < var16) {
         throw new ArgumentOutOfRangeException(
            "lineSize",
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Expected at least ", com.aspose.slides.ms.System.a3.l6(var16), " bytes for the line size, otherwise the source data does not fit."
            })
         );
      }

      this.x8 = (var1 * this.u9 - 1) / 8;
      this.z8 = (this.n5.u9() * this.y4 - 1) / 8;
      this.t9 = 8 / this.u9;
      this.z1 = var4;
      this.t4 = var7;
      this.q0 = var10;
      this.z3 = var11;
      this.m1 = var13;
      this.k7 = var12;
      this.n5();
      this.j5 = true;
   }

   public final int n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, int var3, byte[] var4, int var5) {
      if (!this.j5) {
         throw new com.aspose.slides.internal.z3b.k5("The color converter is not initialized.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("data");
      }

      if (var2.length - var3 <= 0 || var2.length - var3 > var2.length) {
         throw new ArgumentOutOfRangeException("dataOffset", "Incorrect data offset.");
      }

      if (var4 == null) {
         throw new ArgumentNullException("outputData");
      }

      if (var4.length - var5 >= 0 && var4.length - var5 <= var4.length) {
         int var6 = 0;
         com.aspose.slides.internal.o9b.y2 var7 = com.aspose.slides.internal.o9b.y2.n5(this.n5.n3(), var1.n3()).n3();
         int var8 = var7.t2();
         int var9 = var7.l6();
         int var10 = var7.u3();
         int var11 = var1.u3();
         if (var8 > 0 && var9 > 0) {
            int var12 = var10 * this.y4;
            int var13 = (var7.c8() - var1.c8()) * this.s7;
            int var14 = var12 / 8 - var11 * this.y4 / 8;
            int var15 = var14 + var13 + var3;
            int var16 = this.n5(var12, var8, var9);
            var6 = var16 * var9;
            if (var4.length - var5 < var6) {
               String var17 = com.aspose.slides.ms.System.d1.n5(
                  "Not enough data to convert to, expected {0} bytes but got only {1} free bytes",new Object[]{ var6, var4.length - var5
               });
               throw new ArgumentOutOfRangeException("outputData", var17);
            }

            this.n5(var2, var15, var12, var8, var9, var4, var5, var16);
         }

         return var6;
      } else {
         throw new ArgumentOutOfRangeException("outputDataOffset", "Incorrect output data offset.");
      }
   }

   public final int n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, byte[] var4, int var5, int var6) {
      if (!this.j5) {
         throw new com.aspose.slides.internal.z3b.k5("The color converter is not initialized.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("data");
      }

      if (var2.length - var3 <= 0 || var2.length - var3 > var2.length) {
         throw new ArgumentOutOfRangeException("dataOffset", "Incorrect data offset.");
      }

      if (var4 == null) {
         throw new ArgumentNullException("outputData");
      }

      if (var4.length - var5 >= 0 && var4.length - var5 <= var4.length) {
         int var7 = 0;
         com.aspose.slides.internal.o9b.y2 var8 = com.aspose.slides.internal.o9b.y2.n5(this.n5.n3(), var1.n3()).n3();
         int var9 = var8.t2();
         int var10 = var8.l6();
         int var11 = var8.u3();
         int var12 = var1.u3();
         if (var9 > 0 && var10 > 0) {
            int var13 = var11 * this.y4;
            int var14 = (var8.c8() - var1.c8()) * this.s7;
            int var15 = var13 / 8 - var12 * this.y4 / 8;
            int var16 = var15 + var14 + var3;
            int var17 = this.n5(var13, var9, var10);
            var7 = var17 * var10;
            this.n5(var8.n3(), var2, var16, var13, var9, var10, var4, var5, var17, var6);
         }

         return var7;
      } else {
         throw new ArgumentOutOfRangeException("outputDataOffset", "Incorrect output data offset.");
      }
   }

   protected static com.aspose.slides.internal.b8u.a6 n5(com.aspose.slides.internal.b8u.a6 var0, int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var1), 14);
      com.aspose.slides.internal.b8u.a6 var3 = var0;
      if (var0.n5() < var2) {
         int[] var4 = var0.l6();
         int[] var5 = new int[var2];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         var3 = new com.aspose.slides.internal.r1x.s7(var5);
      }

      return var3;
   }

   protected final byte[] n5(
      com.aspose.slides.internal.b8u.t2 var1, com.aspose.slides.internal.r1x.v4 var2, com.aspose.slides.internal.r1x.v4 var3, int var4, int var5
   ) {
      byte[] var6 = new byte[var4];
      if (var1 == null) {
         throw new ArgumentNullException("indexedConverter");
      }

      var1.n5(var6, var2, var3);

      for (int var7 = 0; var7 < var4; var7++) {
         if ((var6[var7] & 255) >= var5) {
            throw new ArgumentOutOfRangeException(
               "indexedConverter",
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "The converted value at map index ", com.aspose.slides.ms.System.a3.l6(var7), " is not valid since it goes out of destination entries range."
               })
            );
         }
      }

      return var6;
   }

   protected abstract void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8);

   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      int var11 = this.n3.z3();
      byte[] var12 = new byte[this.s7 * var6];
      int var13 = var3 + var1.c8() * var10;
      int var14 = var3 * var11;

      for (int var15 = 0; var15 < var6; var15++) {
         int var16 = var14;

         for (int var17 = 0; var17 < var5; var17++) {
            for (int var18 = 0; var18 < var11; var18++) {
               var12[var16++] = var2[var18][var13 + var17];
            }
         }

         var13 += var10;
         var14 += this.s7;
      }

      this.n5(var12, var3, var4, var5, var6, var7, var8, var9);
   }

   protected void n5() {
   }

   protected final int n5(int var1, int var2, int var3) {
      int var4 = var1 / this.y4 * this.u9;
      int var5 = var4 / 8;
      int var6 = (var4 + var2 * this.u9 - 1) / 8;
      int var7 = var6 - var5 + 1;
      if (var5 == 0 && var6 == this.x8 && var3 > 1) {
         var7 = this.a6;
      } else {
         int var8 = this.y4 / this.u9;
         if (var8 > 1) {
            int var9 = var1 + var2 * this.y4 - 1;
            int var10 = var9 / 8;
            if (var10 % var8 < var8 - 1 && var10 != this.z8) {
               var7--;
            }
         }
      }

      return var7;
   }
}
