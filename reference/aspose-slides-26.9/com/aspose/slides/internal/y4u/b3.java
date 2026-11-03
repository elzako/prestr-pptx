package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public class b3 extends s7 {
   protected byte[] z8;
   private int j5;
   private int w1;

   @Override
   protected void n5() {
      if (this.z1 == null) {
         throw new ArgumentNullException("SourcePalette");
      }

      if (this.t4 == null) {
         throw new ArgumentNullException("DestinationColorPalette");
      }

      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.y4), 14);
      int var2 = 8 / this.y4;
      int var3 = var1 - 1;
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.u9), 14);
      int var5 = var4 - 1;
      int var6 = 8 / this.u9;
      this.j5 = var2 / var6;
      int var7 = var6;
      if (this.j5 == 0) {
         this.j5 = 1;
         var7 = var2;
      }

      this.w1 = 8 / this.j5;
      int var8 = 256 * this.j5;
      this.z8 = new byte[var8];
      if (this.q0 == 1) {
         com.aspose.slides.internal.r1x.o5 var9 = new com.aspose.slides.internal.r1x.o5(this.t4);
         int[] var10 = n5(this.z1, this.y4).l6();

         for (int var11 = 0; var11 < 256; var11++) {
            int var12 = 8 - this.y4;
            int var13 = 0;

            for (int var14 = 0; var13 < var2; var14 += 256) {
               byte var15 = 0;
               int var16 = 8 - this.u9;

               for (int var17 = 0; var17 < var7; var17++) {
                  int var18 = var11 >> var12 & var3;
                  int var19 = var10[var18];
                  int var20 = var9.n5(var19);
                  if (var20 > var5) {
                     var20 = this.m1;
                  }

                  var15 = (byte)(var15 & 0xFF | (byte)(var20 << var16) & 0xFF);
                  var12 -= this.y4;
                  var16 -= this.u9;
               }

               this.z8[var11 + var14] = var15;
               var13 += var7;
            }
         }
      } else if (this.q0 == 0) {
         for (int var21 = 0; var21 < 256; var21++) {
            int var23 = 8 - this.y4;
            int var25 = 0;

            for (int var27 = 0; var25 < var2; var27 += 256) {
               byte var29 = 0;
               int var31 = 8 - this.u9;

               for (int var33 = 0; var33 < var7; var33++) {
                  int var35 = var21 >> var23 & var3;
                  int var37 = var35;
                  if (var35 > var5) {
                     var37 = this.m1;
                  }

                  var29 = (byte)(var29 & 0xFF | (byte)(var37 << var31) & 0xFF);
                  var23 -= this.y4;
                  var31 -= this.u9;
               }

               this.z8[var21 + var27] = var29;
               var25 += var7;
            }
         }
      } else {
         byte[] var22 = this.n5(this.z3, this.n3, this.u3, var1, var4);

         for (int var24 = 0; var24 < 256; var24++) {
            int var26 = 8 - this.y4;
            int var28 = 0;

            for (int var30 = 0; var28 < var2; var30 += 256) {
               byte var32 = 0;
               int var34 = 8 - this.u9;

               for (int var36 = 0; var36 < var7; var36++) {
                  int var38 = var24 >> var26 & var3;
                  int var39 = var22[var38] & 255;
                  var32 = (byte)(var32 & 0xFF | (byte)(var39 << var34) & 0xFF);
                  var26 -= this.y4;
                  var34 -= this.u9;
               }

               this.z8[var24 + var30] = var32;
               var28 += var7;
            }
         }
      }
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = var4 * this.y4;
      int var10 = (var3 + var9 - 1) / 8;
      int var11 = var3 / 8;
      int var12 = var10 - var11 + 1;
      int var13 = var3 * this.j5 / 8;
      int var14 = ((var9 + var3) * this.j5 - 1) / 8;
      int var15 = var14 - var13 + 1;
      int var16 = var3 / this.w1 % this.j5;

      for (int var17 = 0; var17 < var5; var17++) {
         int var18 = var2 + this.s7 * var17;
         int var19 = var17 * var8 + var7;
         int var20 = var16 * 256;
         int var21 = 0;
         int var22 = var16;

         for (int var23 = 0; var23 < var12; var23++) {
            byte var24 = var1[var18++];
            int var25 = com.aspose.slides.ms.System.q1.l6(this.j5, this.j5 - var22);
            var25 = com.aspose.slides.ms.System.q1.l6(var25, var15 - var21);

            for (int var26 = 0; var26 < var25; var26++) {
               byte var27 = this.z8[var20 + (var24 & 255)];
               var6[var19 + var21++] = var27;
               var20 += 256;
            }

            var20 = 0;
            var22 = 0;
         }
      }
   }
}
