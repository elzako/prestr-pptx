package com.aspose.slides;

import com.aspose.slides.internal.k4y.g7$n5;

class n9g {
   public static void n5(IPropertyEffect var0, com.aspose.slides.internal.k4y.a4w var1) {
      var0.setFrom(var1.k5());
      var0.setTo(var1.u3());
      var0.setBy(var1.l6());
      var0.setValueType(var1.u9());
      var0.setCalcMode(var1.a6());
      f1g.n5(var0.getPoints(), var1.c8());
   }

   public static void n5(IPropertyEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.a4w var3 = (com.aspose.slides.internal.k4y.a4w)var1.n5("anim").l6();
      var2[0] = var3.h0();
      var3.l6(var0.getFrom());
      var3.k5(var0.getTo());
      var3.n5(var0.getBy());
      var3.l6((byte)var0.getValueType());
      var3.n5((byte)var0.getCalcMode());
      if (var0.getPoints().getCount() != 0) {
         com.aspose.slides.internal.k4y.f3w var4 = var3.n5();
         f1g.l6(var0.getPoints(), var4);
      }
   }
}
