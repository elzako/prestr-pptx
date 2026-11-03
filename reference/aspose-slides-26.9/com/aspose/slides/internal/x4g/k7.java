package com.aspose.slides.internal.x4g;

import com.aspose.slides.ms.System.v4;
import java.awt.Shape;
import java.awt.geom.PathIterator;
import java.util.Arrays;
import java.util.HashSet;

public final class k7 implements v4 {
   private com.aspose.slides.internal.o9b.w1[] n5;
   private byte[] l6;

   public k7() {
   }

   public k7(Shape var1) {
      com.aspose.slides.internal.c9b.n5 var2;
      HashSet var3;
      if (var1 instanceof com.aspose.slides.internal.c9b.n5) {
         var2 = (com.aspose.slides.internal.c9b.n5)var1;
         var3 = var2.n3();
      } else {
         var2 = new com.aspose.slides.internal.c9b.n5(var1);
         var3 = new HashSet();
      }

      byte var4 = 20;
      short var5 = 500;
      byte[] var6 = new byte[20];
      float[] var7 = new float[6];
      com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[20];
      int var9 = 0;
      int var10 = 0;

      for (PathIterator var11 = var2.getPathIterator(null); !var11.isDone(); var11.next()) {
         byte var12 = (byte)var11.currentSegment(var7);
         if (var9 + 3 >= var6.length) {
            int var13 = var6.length;
            if (var13 > 500) {
               var13 = 500;
            }

            var6 = Arrays.copyOf(var6, var6.length + var13);
         }

         if (var10 + 6 >= var8.length) {
            int var22 = var8.length;
            if (var22 > 500) {
               var22 = 500;
            }

            var8 = Arrays.copyOf(var8, var8.length + var22);
         }

         switch (var12) {
            case 0:
               var6[var9++] = var12;
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[0], var7[1]);
               break;
            case 1:
               var6[var9++] = var12;
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[0], var7[1]);
               break;
            case 2:
               var6[var9++] = var12;
               var6[var9++] = var12;
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[0], var7[1]);
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[2], var7[3]);
               break;
            case 3:
               var6[var9++] = var12;
               var6[var9++] = var12;
               var6[var9++] = var12;
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[0], var7[1]);
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[2], var7[3]);
               var8[var10++] = new com.aspose.slides.internal.o9b.w1(var7[4], var7[5]);
               break;
            case 4:
               var6[var9 - 1] = (byte)(var6[var9 - 1] | 128);
         }
      }

      for (Object recoveredElement$var21$2705 : var3) {
         Integer var21 = (Integer)recoveredElement$var21$2705;
         int var36 = var21;
         var6[var36] = (byte)(var6[var36] | 32);
      }

      this.n5(Arrays.copyOf(var6, var9));
      this.n5(Arrays.copyOf(var8, var10));
   }

   public com.aspose.slides.internal.o9b.w1[] n5() {
      return this.n5;
   }

   public void n5(com.aspose.slides.internal.o9b.w1[] var1) {
      this.n5 = var1;
   }

   public byte[] l6() {
      return this.l6;
   }

   public void n5(byte[] var1) {
      this.l6 = var1;
   }

   @Override
   public Object deepClone() {
      k7 var1 = new k7();
      if (this.l6 != null && this.n5 != null) {
         if (this.l6.length != 0 && this.n5.length != 0) {
            byte[] var2 = new byte[this.l6.length];
            com.aspose.slides.ms.System.u3.n5(this.l6, 0, var2, 0, this.l6.length);
            com.aspose.slides.internal.o9b.w1[] var3 = new com.aspose.slides.internal.o9b.w1[this.n5.length];

            for (int var4 = 0; var4 < this.n5.length; var4++) {
               var3[var4] = new com.aspose.slides.internal.o9b.w1(this.n5[var4].l6(), this.n5[var4].k5());
            }

            var1.n5(var3);
            var1.n5(var2);
         } else {
            var1.n5(new com.aspose.slides.internal.o9b.w1[0]);
            var1.n5(new byte[0]);
         }

         return var1;
      } else {
         return var1;
      }
   }
}
