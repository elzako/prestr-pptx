package com.aspose.slides.internal.z5;

import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public class h0 {
   private float n5 = 96.0F;
   private float l6;
   private float k5;

   public h0(l6 var1) {
      this.l6 = this.n5(var1.n5().n5()).l6();
      this.l6 = this.l6 - this.n5(var1.l6().u3()).l6();
      this.k5 = this.n5(var1.l6().u3()).l6();
   }

   public h0() {
   }

   public final a6 n5(a6 var1) {
      int var2 = n5(var1.l6(), a6.l6(var1.n5()), 72.0F / this.n5);
      return new a6(var2 / 1000.0F, 4);
   }

   private static int n5(double var0, String var2, float var3) {
      if (d1.a6("px", var2)) {
         var0 *= var3 * 1000.0F;
      } else if (d1.a6("in", var2)) {
         var0 *= 72000.0;
      } else if (d1.a6("cm", var2)) {
         var0 *= 28346.4567;
      } else if (d1.a6("mm", var2)) {
         var0 *= 2834.64567;
      } else if (d1.a6("pt", var2)) {
         var0 *= 1000.0;
      } else if (d1.a6("pc", var2)) {
         var0 *= 12000.0;
      } else if (!d1.a6("mpt", var2)) {
         var0 = 0.0;
      }

      return com.aspose.slides.internal.v6g.k5.u3(var0, 14);
   }

   public final w1[] n5(w1[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         w1 var3 = var1[var2];
         w1 var4 = new w1(var3.n5().a6(), var3.u9());
         com.aspose.slides.internal.e1.t2 var5 = new com.aspose.slides.internal.e1.t2();
         var5.n5(r4.n5(new y1(this.k5 - 1.0F, 0.0F, this.l6 + 2.0F, var3.k5())));

         for (int var6 = 0; var6 < var3.t2(); var6++) {
            var5.n5(var3.n5(var6));
         }

         var4.n5(var5);
         var1[var2] = var4;
      }

      return var1;
   }
}
