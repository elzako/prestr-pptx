package com.aspose.slides.internal.d3c;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.u2w.n5$y4;
import com.aspose.slides.ms.System.d1;

public abstract class a6 extends n5$y4 {
   protected double n5 = 0.299;
   protected double l6 = 0.587;
   protected double k5 = 0.114;
   protected int[] u3;

   protected a6(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.f2i.n5 var5) {
      super(var1, var2, var3, var4.n3());
      double[] var6 = null;
      c8[] var7 = var5.z1();
      if (var7 != null) {
         var6 = new double[var7.length];

         for (int var8 = 0; var8 < var7.length; var8++) {
            var6[var8] = var7[var8].u3();
         }
      }

      this.n5(var6);
   }

   private void n5(double[] var1) {
      if (var1 != null) {
         if (var1.length != 3) {
            throw new com.aspose.slides.internal.h6t.u3(
               d1.n5("Invalid length of yCbCrCoefficients={0}. The lenght must be equal to 3.", new Object[]{var1.length})
            );
         }

         this.n5 = var1[0];
         this.l6 = var1[1];
         this.k5 = var1[2];
      }

      this.a6();
   }

   private void a6() {
      double var1 = 2.0 - 2.0 * this.n5;
      double var3 = this.k5 * (2.0 - 2.0 * this.k5) / this.l6;
      double var5 = this.n5 * (2.0 - 2.0 * this.n5) / this.l6;
      double var7 = 2.0 - 2.0 * this.k5;
      this.u3 = new int[1792];

      for (int var9 = 0; var9 < 256; var9++) {
         this.u3[var9 + 0] = 65536 * var9;
         this.u3[var9 + 256] = 65536 * var9;
         this.u3[var9 + 512] = 65536 * var9;
         this.u3[var9 + 768] = n5(var1) * (var9 - 128);
         this.u3[var9 + 1024] = -n5(var3) * (var9 - 128);
         this.u3[var9 + 1280] = -n5(var5) * (var9 - 128);
         this.u3[var9 + 1536] = n5(var7) * (var9 - 128);
      }
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }
}
