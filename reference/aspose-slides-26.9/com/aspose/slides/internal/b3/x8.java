package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class x8 extends s7 {
   @Override
   public int n5() {
      return -4;
   }

   @Override
   public com.aspose.slides.internal.f2.a6 l6() {
      return new x8$n5(null);
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      String var3 = var1[3].j_();
      com.aspose.slides.internal.t1.u3 var4 = var2.k5() != null ? var2.k5().e2().o0() : null;
      com.aspose.slides.internal.t1.l6 var5 = null;
      if (var4 == null) {
         if (!com.aspose.slides.internal.v3.k5.n5(var3)) {
            a5[] var6 = new a5[3];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0, 3);
            return new c4().n5(var6, var2);
         }
      } else {
         var5 = var4.a6(var3);
         if (var5 == null && !com.aspose.slides.internal.v3.k5.n5(var3)) {
            z8 var13 = new z8(d1.n5(new String[]{"The ", var3, " color profile was not declared"}));
            var13.n5(var2);
            throw var13;
         }
      }

      String var12 = var5 != null ? var5.e5() : d1.n5;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      var7 = com.aspose.slides.internal.v6g.k5.u3(var1[0].h0(), float.class);
      var8 = com.aspose.slides.internal.v6g.k5.u3(var1[1].h0(), float.class);
      var9 = com.aspose.slides.internal.v6g.k5.u3(var1[2].h0(), float.class);
      if (!(var7 < 0.0F) && !(var7 > 255.0F) && !(var8 < 0.0F) && !(var8 > 255.0F) && !(var9 < 0.0F) && !(var9 > 255.0F)) {
         com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5();
         var10.n5("fop-rgb-icc(");
         var10.n5(var7 / 255.0F);
         var10.n5(',').n5(var8 / 255.0F);
         var10.n5(',').n5(var9 / 255.0F);

         for (int var11 = 3; var11 < var1.length; var11++) {
            if (var11 == 3) {
               var10.n5(',').n5(var3);
               var10.n5(',').n5(var12);
            } else {
               var10.n5(',').n5(var1[var11]);
            }
         }

         var10.n5(")");
         return com.aspose.slides.internal.h2.u9.n5(var2.h0(), var10.toString());
      } else {
         throw new z8(d1.n5(new String[]{"Color values out of range. ", "Arguments to rgb-icc() must be [0..255] or [0%..100%]"}));
      }
   }
}
