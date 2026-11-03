package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class j2k {
   public static void n5(IFillFormatEffectiveData var0, i4v var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillParamSources");
      }

      if (var1 == null) {
         throw new ArgumentNullException("fillFormatContext");
      }

      l6(var0, var1, var2);
   }

   private static void l6(IFillFormatEffectiveData var0, i4v var1, OdpSerializationContext var2) {
      switch (var0.getFillType()) {
         case -1:
         case 0:
            var1.k5(1);
            break;
         case 1:
            var1.k5(2);
            var1.u9(t2f.n5(((f6a)var0).h0().o8()));
            if ((((f6a)var0).h0().s7() & 255) < 255) {
               var1.h0(t2f.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((((f6a)var0).h0().s7() & 255) * 100 / 255.0F), 14)));
            }
            break;
         case 2:
            var1.k5(4);
            z0x.n5(var0.getGradientFormat(), var1, var2);
            break;
         case 3:
            IPatternFormatEffectiveData var5 = var0.getPatternFormat();
            if (var5.getPatternStyle() > 0) {
               var1.k5(3);
               o4u.n5(var0.getPatternFormat(), var1, var2);
            } else {
               var1.k5(1);
            }
            break;
         case 4:
            var1.k5(3);
            FillFormat var3 = ((f6a)var0).W_();
            Shape var4 = var3 != null ? com.aspose.slides.internal.v6g.k5.n5(var3.getParent_IPresentationComponent(), Shape.class) : null;
            u1b.n5(var0.getPictureFillFormat(), var4, var1, var2);
      }
   }
}
