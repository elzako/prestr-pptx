package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class k5 extends s7 {
   @Override
   public int n5() {
      return 6;
   }

   @Override
   public com.aspose.slides.internal.f2.a6 l6() {
      return new k5$n5(null);
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      float var3 = com.aspose.slides.internal.v6g.k5.u3(var1[0].h0(), float.class);
      float var4 = com.aspose.slides.internal.v6g.k5.u3(var1[1].h0(), float.class);
      float var5 = com.aspose.slides.internal.v6g.k5.u3(var1[2].h0(), float.class);
      if (!(var3 < 0.0F) && !(var3 > 255.0F) && !(var4 < 0.0F) && !(var4 > 255.0F) && !(var5 < 0.0F) && !(var5 > 255.0F)) {
         float var6 = com.aspose.slides.internal.v6g.k5.u3(var1[3].h0(), float.class);
         float var7 = com.aspose.slides.internal.v6g.k5.u3(var1[4].h0(), float.class);
         float var8 = com.aspose.slides.internal.v6g.k5.u3(var1[5].h0(), float.class);
         if (var6 < 0.0F || var6 > 100.0F) {
            throw new z8("L* value out of range. Valid range: [0..100]");
         } else if (!(var7 < -127.0F) && !(var7 > 127.0F) && !(var8 < -127.0F) && !(var8 > 127.0F)) {
            com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
            var9.n5(d1.n5(new String[]{"cie-lab-color(", n1.u9(var3), ",", n1.u9(var4), ",", n1.u9(var5), ",", n1.u9(var6), ",", n1.u9(var7), ",", n1.u9(var8), ")"}));
            com.aspose.slides.internal.y1.u3 var10 = var2 == null ? null : (var2.k5() == null ? null : var2.k5().q_());
            return com.aspose.slides.internal.h2.u9.n5(var10, var9.toString());
         } else {
            throw new z8("a* and b* values out of range. Valid range: [-127..+127]");
         }
      } else {
         throw new z8(d1.n5(new String[]{"sRGB color values out of range. ", "Arguments to cie-lab-color() must be [0..255] or [0%..100%]"}));
      }
   }
}
