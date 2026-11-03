package com.aspose.slides.internal.q2c;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.util.ArrayList;
import java.util.List;

abstract class l6$n5 {
   protected final boolean n5;
   protected final BufferedImage l6;
   private final BufferedImage s7;
   protected final int k5;
   private final int x8;
   private final int n3;
   private final int y4;
   List<Integer> u3;
   List<Integer> a6;
   List<Integer> u9;
   List<Integer> h0;
   List<Integer> c8;
   List<Integer> t2;

   protected l6$n5(BufferedImage var1, BufferedImage var2) {
      this.n5 = var1.getColorModel().hasAlpha();
      this.l6 = var1;
      this.s7 = var2;
      this.k5 = var1.getWidth();
      this.x8 = var1.getHeight();
      this.n3 = var2.getWidth();
      this.y4 = var2.getHeight();
      this.l6();
      this.k5();
   }

   protected abstract void n5(int var1);

   protected abstract void n5(int var1, int var2, float[] var3);

   protected final void l6(int var1, int var2, float[] var3) {
      this.n5(var1, var2, var3);
      if (this.n5 && var3[0] != 255.0F) {
         float var4 = var3[0] / 255.0F;
         var3[1] *= var4;
         var3[2] *= var4;
         var3[3] *= var4;
      }
   }

   public void n5() {
      int var1 = this.k5 * this.x8;
      float[] var2 = new float[this.n3];
      float[] var3 = new float[this.n3];
      float[] var4 = new float[this.n3];
      float[] var5 = new float[this.n3];
      DataBufferByte var6 = (DataBufferByte)this.s7.getRaster().getDataBuffer();
      byte[] var7 = var6.getData();
      int var8 = this.a6.size();
      int var9 = this.c8.size();
      float[] var10 = new float[4];

      for (int var11 = 0; var11 < var8; var11++) {
         int var12 = this.u3.get(var11);
         int var13 = this.a6.get(var11);
         int var14 = this.u9.get(var11);
         int var15 = var11 < var8 - 1 ? this.u9.get(var11 + 1) : 0;
         if (var11 < 1 || var13 != this.a6.get(var11 - 1)) {
            this.n5(var13);
         }

         for (int var16 = 0; var16 < var9; var16++) {
            int var17 = this.h0.get(var16);
            int var18 = this.c8.get(var16);
            int var19 = this.t2.get(var16);
            int var20 = var17 * var12;
            this.l6(var18, var13, var10);
            var5[var19] += var10[0] * var20;
            var2[var19] += var10[1] * var20;
            var3[var19] += var10[2] * var20;
            var4[var19] += var10[3] * var20;
         }

         if (var14 != var15) {
            int var23 = var14 * this.n3 * 4;

            for (int var27 = 0; var27 < this.n3; var27++) {
               float var29 = var1;
               int var30 = Math.round(var5[var27] / var29);
               if (this.n5) {
                  if (var30 <= 0) {
                     var30 = 0;
                  } else if (var30 >= 255) {
                     var30 = 255;
                  } else {
                     var29 = var5[var27] / 255.0F;
                  }
               }

               int var31 = Math.round(var2[var27] / var29);
               int var21 = Math.round(var3[var27] / var29);
               int var22 = Math.round(var4[var27] / var29);
               if (var31 < 0) {
                  var31 = 0;
               } else if (var31 > 255) {
                  var31 = 255;
               }

               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 255) {
                  var21 = 255;
               }

               if (var22 < 0) {
                  var22 = 0;
               } else if (var22 > 255) {
                  var22 = 255;
               }

               var7[var23++] = (byte)var30;
               var7[var23++] = (byte)var22;
               var7[var23++] = (byte)var21;
               var7[var23++] = (byte)var31;
            }

            for (int var28 = 0; var28 < this.n3; var28++) {
               var5[var28] = var2[var28] = var3[var28] = var4[var28] = 0.0F;
            }
         }
      }
   }

   private void l6() {
      this.u3 = new ArrayList<>();
      this.a6 = new ArrayList<>();
      this.u9 = new ArrayList<>();
      int var1 = this.x8;
      int var2 = this.y4;
      int var3 = 0;
      int var4 = 0;

      while (var3 < this.x8) {
         int var5;
         if (var2 < var1) {
            var5 = var2;
         } else {
            var5 = var1;
         }

         this.u3.add(var5);
         this.a6.add(var3);
         this.u9.add(var4);
         var2 -= var5;
         var1 -= var5;
         if (var2 == 0) {
            var2 = this.y4;
            var3++;
         }

         if (var1 == 0) {
            var4++;
            var1 = this.x8;
         }
      }
   }

   private void k5() {
      this.h0 = new ArrayList<>();
      this.c8 = new ArrayList<>();
      this.t2 = new ArrayList<>();
      int var1 = this.n3;
      int var2 = this.k5;
      int var3 = 0;
      int var4 = 0;

      while (var3 < this.k5) {
         int var5;
         if (var1 < var2) {
            var5 = var1;
         } else {
            var5 = var2;
         }

         this.h0.add(var5);
         this.c8.add(var3);
         this.t2.add(var4);
         var1 -= var5;
         var2 -= var5;
         if (var1 == 0) {
            var3++;
            var1 = this.n3;
         }

         if (var2 == 0) {
            var4++;
            var2 = this.k5;
         }
      }
   }
}
