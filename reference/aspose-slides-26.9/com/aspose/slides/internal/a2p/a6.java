package com.aspose.slides.internal.a2p;

import com.aspose.slides.internal.b7s.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.d3l.h0;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.z0k.t4;

public class a6 extends e2 {
   private final com.aspose.slides.internal.g7i.n5 k5;

   public a6(t9 var1, t4 var2, t4 var3) {
      this.n5 = var1;
      this.l6 = v4.y4();
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

   @Override
   protected byte[] n5(int[] var1) {
      byte var2 = 0;
      byte[] var3 = new byte[var1.length * 4];
      double[] var4 = new double[4];

      for (int var5 = 0; var5 < var1.length; var5++) {
         int var6 = var1[var5];
         double[] var7 = new double[]{
            ((byte)(var6 >> 16 & 0xFF) & 0xFF) / 255.0, ((byte)(var6 >> 8 & 0xFF) & 0xFF) / 255.0, ((byte)(var6 & 0xFF) & 0xFF) / 255.0
         };
         this.k5.n5(var7, var4);
         double var8 = var4[0] * 255.0;
         double var10 = var4[1] * 255.0;
         double var12 = var4[2] * 255.0;
         double var14 = var4[3] * 255.0;
         double var16 = 255.0 - n5(var8, 0.0, 255.0);
         double var18 = 255.0 - n5(var10, 0.0, 255.0);
         double var20 = 255.0 - n5(var12, 0.0, 255.0);
         double var22 = var16 * 0.299 + var18 * 0.587 + var20 * 0.114;
         double var24 = 128.0 - 0.16874 * var16 - 0.33126 * var18 + 0.5 * var20;
         double var26 = 128.0 + 0.5 * var16 - 0.41869 * var18 - 0.08131 * var20;
         var3[var2 + 0] = com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 - n5(var22, 0.0, 255.0)), 14);
         var3[var2 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 - n5(var24, 0.0, 255.0)), 14);
         var3[var2 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 - n5(var26, 0.0, 255.0)), 14);
         var3[var2 + 3] = com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 - n5(var14, 0.0, 255.0)), 14);
         var2 += 4;
      }

      return var3;
   }

   private static double n5(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }
}
