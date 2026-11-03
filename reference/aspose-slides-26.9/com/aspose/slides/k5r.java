package com.aspose.slides;

class k5r {
   public static void n5(IFormat var0, com.aspose.slides.internal.k4y.b9y var1, t5w var2) {
      if (var1 != null) {
         x9f.n5(var0.getFill(), var1.c8(), var2);
         i3z.n5(var0.getLine(), var1.t2());
         w5i.n5(var0.getEffect(), var1.s7(), var2);
         r6k.n5(var0.getEffect3D(), var1.x8(), var1.n3(), null);
         z4p var3 = ((Format)var0).u3();
         var3.n5(var1.y4());
      }
   }

   public static void n5(IFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.b9y> var1, g6c var2, Object var3, boolean var4) {
      if (var4 || n5(var0, var3)) {
         com.aspose.slides.internal.k4y.b9y var5 = (com.aspose.slides.internal.k4y.b9y)var1.invoke();
         x9f.n5(var0.getFill(), new k5r$1(var5), var2);
         i3z.n5(var0.getLine(), new k5r$2(var5));
         w5i.n5(var0.getEffect(), new k5r$3(var5), var2);
         r6k.n5(var0.getEffect3D(), new k5r$4(var5), new k5r$5(var5), null);
         z4p var6 = ((Format)var0).u3();
         var5.n5(var6.n5());
      }
   }

   static boolean n5(IFormat var0, Object var1) {
      boolean var2 = var0.getFill().getFillType() != -1
         || !var0.getLine().isFormatNotDefined()
         || !var0.getEffect().isNoEffects()
         || r6k.n5(var0.getEffect3D(), true);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, DataLabel.class)) {
         DataLabel var3 = com.aspose.slides.internal.v6g.k5.n5(var1, DataLabel.class);
         if (var3.h0() != null
            && var3.h0().getParagraphs().getCount() != 0
            && ((TextFrame)var3.h0()).n5.getRotationAngle() != 0.0F
            && !com.aspose.slides.ms.System.n1.k5(((TextFrame)var3.h0()).n5.getRotationAngle())) {
            return true;
         }
      }

      return var2;
   }
}
