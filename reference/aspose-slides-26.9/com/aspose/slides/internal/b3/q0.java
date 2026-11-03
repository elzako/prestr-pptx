package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class q0 extends s7 {
   @Override
   public int n5() {
      return 5;
   }

   @Override
   public com.aspose.slides.internal.f2.a6 l6() {
      return new q0$n5(null);
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      String var3 = var1[3].j_();
      String var4 = var1[4].j_();
      com.aspose.slides.internal.t1.u3 var5 = var2.k5() != null ? var2.k5().e2().o0() : null;
      com.aspose.slides.internal.t1.l6 var6 = null;
      if (var5 != null) {
         var6 = var5.a6(var3);
      }

      if (var6 == null) {
         z8 var12 = new z8(d1.n5(new String[]{"The ", var3, " color profile was not declared"}));
         var12.n5(var2);
         throw var12;
      } else {
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = 0.0F;
         var7 = com.aspose.slides.internal.v6g.k5.u3(var1[0].h0(), float.class);
         var8 = com.aspose.slides.internal.v6g.k5.u3(var1[1].h0(), float.class);
         var9 = com.aspose.slides.internal.v6g.k5.u3(var1[2].h0(), float.class);
         if (!(var7 < 0.0F) && !(var7 > 255.0F) && !(var8 < 0.0F) && !(var8 > 255.0F) && !(var9 < 0.0F) && !(var9 > 255.0F)) {
            com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5();
            var10.n5("fop-rgb-named-color(");
            var10.n5(var7 / 255.0F);
            var10.n5(',').n5(var8 / 255.0F);
            var10.n5(',').n5(var9 / 255.0F);
            var10.n5(',').n5(var3);
            var10.n5(',').n5(var6.e5());
            var10.n5(", '").n5(var4).n5('\'');
            var10.n5(")");
            return com.aspose.slides.internal.h2.u9.n5(var2.h0(), var10.toString());
         } else {
            throw new z8(d1.n5(new String[]{"sRGB color values out of range. ", "Arguments to rgb-named-color() must be [0..255] or [0%..100%]"}));
         }
      }
   }
}
