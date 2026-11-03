package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public class b5 extends u8 {
   private byte y2;
   private com.aspose.slides.internal.r1x.o5 y1;
   private int a0;
   private int d2;

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = (this.t9 - var3 / this.y4 % this.t9 - 1) * this.u9;
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void n5() {
      super.n5();
      if (this.u9 <= 8 && this.t4 == null) {
         throw new ArgumentNullException("DestinationColorPalette");
      }

      this.y1 = new com.aspose.slides.internal.r1x.o5(this.t4);
      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.u9), 14);
      this.a0 = var1 - 1;
      this.d2 = 8 - this.u9;
   }

   protected final void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var2 + this.s7 * var10;
         int var12 = var10 * var8 + var7;
         int var13 = var9;
         int var14 = this.z8.n5();
         byte[] var15 = this.z8.l6();
         int var16 = var11;

         for (int var17 = 0; var17 < var4; var17++) {
            byte var18 = var1[var16++];
            byte var19 = var1[var16++];
            byte var20 = var1[var16++];
            int var21 = var15[var14 + (var18 & 255) + c4[var20 & 0xFF]] & 255;
            int var22 = var15[var14 + (var18 & 255) + com.aspose.slides.internal.n5p.h0.l6(w1[var19 & 0xFF] + r4[var20 & 0xFF], 16)] & 255;
            int var23 = var15[var14 + (var18 & 255) + j5[var19 & 0xFF]] & 255;
            int var24 = 0xFF000000 | var21 << 16 | var22 << 8 | var23;
            int var25 = this.y1.n5(var24);
            if (var25 > this.a0) {
               var25 = this.m1;
            }

            byte var26 = (byte)(var25 << var13);
            this.y2 = (byte)(this.y2 & 0xFF | var26 & 0xFF);
            var13 -= this.u9;
            if (var13 < 0 || var17 + 1 == var4) {
               var13 = this.d2;
               var6[var12++] = this.y2;
               this.y2 = 0;
            }
         }
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      int var11 = (this.t9 - var4 / this.y4 % this.t9 - 1) * this.u9;
      int var12 = var10 - var1.t2();
      int var13 = var3 + var1.u3();
      int var14 = this.z8.n5();
      byte[] var15 = this.z8.l6();
      byte[] var16 = var2[0];
      byte[] var17 = var2[1];
      byte[] var18 = var2[2];
      int var19 = 0;
      int var20 = this.a0;
      int var21 = this.m1;
      int var22 = this.u9;
      byte var23 = this.y2;
      int var24 = this.d2;

      for (int var25 = 0; var25 < var1.l6(); var25++) {
         int var26 = var11;

         for (int var27 = var1.u3(); var27 < var1.u9(); var27++) {
            byte var28 = var16[var13];
            byte var29 = var17[var13];
            byte var30 = var18[var13];
            int var31 = var14 + (var28 & 255);
            byte var32 = var15[var31 + c4[var30 & 0xFF]];
            byte var33 = var15[var31 + (w1[var29 & 0xFF] + r4[var30 & 0xFF] >> 16)];
            byte var34 = var15[var31 + j5[var29 & 0xFF]];
            int var35 = 0xFF000000 | (var32 & 255) << 16 | (var33 & 255) << 8 | var34 & 255;
            int var36 = this.y1.n5(var35);
            if (var36 > var20) {
               var36 = var21;
            }

            byte var37 = (byte)(var36 << var26);
            var23 = (byte)(var23 & 0xFF | var37 & 0xFF);
            var26 -= var22;
            if (var26 < 0 || var27 + 1 == var5) {
               var26 = var24;
               var7[var19++] = var23;
               var23 = 0;
            }

            var13++;
         }

         var13 += var12;
      }
   }
}
