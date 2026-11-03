package com.aspose.slides.internal.a2p;

import com.aspose.slides.internal.b7s.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.d3l.h0;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class n5 extends e2 {
   private com.aspose.slides.internal.g7i.n5 k5;

   public n5(t9 var1, t4 var2, t4 var3) {
      this.n5 = var1;
      this.l6 = v4.l6();
      if (var2 != null && var3 != null) {
         this.k5 = new com.aspose.slides.internal.g7i.n5();

         try {
            this.k5.n5(var2);
         } catch (h0 var6) {
            this.k5.n5(k7.l6().n5());
         }

         try {
            this.k5.n5(var3);
         } catch (h0 var5) {
            this.k5.n5(k7.n5().n5());
         }
      }
   }

   @Override
   protected byte[] n5(int[] var1) {
      return this.k5 != null ? this.n5(var1, this.k5) : this.l6(var1);
   }

   private byte[] n5(int[] var1, com.aspose.slides.internal.g7i.n5 var2) {
      int var3 = 0;
      byte[] var4 = new byte[var1.length * 4];
      double[] var5 = new double[3];
      double[] var6 = new double[4];

      for (int var7 = 0; var7 < var1.length; var7++) {
         int var8 = var1[var7];
         var5[0] = ((byte)(var8 >> 16 & 0xFF) & 0xFF) / 255.0;
         var5[1] = ((byte)(var8 >> 8 & 0xFF) & 0xFF) / 255.0;
         var5[2] = ((byte)(var8 & 0xFF) & 0xFF) / 255.0;
         var2.n5(var5, var6);
         double var9 = var6[0];
         double var11 = var6[1];
         double var13 = var6[2];
         double var15 = var6[3];
         var4[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var9), 0.0, 255.0)), 14);
         var4[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var11), 0.0, 255.0)), 14);
         var4[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var13), 0.0, 255.0)), 14);
         var4[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var15), 0.0, 255.0)), 14);
      }

      return var4;
   }

   private byte[] l6(int[] var1) {
      int var2 = 0;
      byte[] var3 = new byte[var1.length * 4];

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         double var6 = ((byte)(var5 >> 16 & 0xFF) & 0xFF) / 255.0;
         double var8 = ((byte)(var5 >> 8 & 0xFF) & 0xFF) / 255.0;
         double var10 = ((byte)(var5 & 0xFF) & 0xFF) / 255.0;
         double var12 = 1.0 - q1.l6(var10, q1.l6(var6, var8));
         double var14;
         double var16;
         double var18;
         if (q1.n5(var12 - 1.0) < 0.001) {
            var14 = 0.0;
            var16 = 0.0;
            var18 = 0.0;
         } else {
            var18 = (1.0 - var6 - var12) / (1.0 - var12);
            var16 = (1.0 - var8 - var12) / (1.0 - var12);
            var14 = (1.0 - var10 - var12) / (1.0 - var12);
         }

         var3[var2++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var18), 0.0, 255.0)), 14);
         var3[var2++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var16), 0.0, 255.0)), 14);
         var3[var2++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var14), 0.0, 255.0)), 14);
         var3[var2++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var12), 0.0, 255.0)), 14);
      }

      return var3;
   }

   private static double n5(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }
}
