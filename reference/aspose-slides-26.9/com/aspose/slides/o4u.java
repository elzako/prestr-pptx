package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class o4u {
   public static void n5(IPatternFormatEffectiveData var0, i4v var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("patternFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("fillFormatContext");
      }

      var1.n5(2);
      boolean var3 = (((g3a)var0).k5().s7() & 255) < 255 || (((g3a)var0).l6().s7() & 255) < 255;
      PPImage var4 = (PPImage)((ImageCollection)var2.n5().getImages())
         .n5(g3a.n5(var3 ? 2498570 : 137224, var0.getPatternStyle(), ((g3a)var0).k5().o8(), ((g3a)var0).l6().o8()));
      var2.n5(var1, var4);
   }
}
