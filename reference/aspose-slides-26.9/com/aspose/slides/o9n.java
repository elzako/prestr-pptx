package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class o9n {
   static void n5(com.aspose.slides.internal.k0r.h3r var0, ICommonSlideViewProperties var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.r1x var2 = var0.u3();
         if (var2 != null) {
            var1.setVariableScale(var2.k5());
            var1.setScale(var2.l6().n5().n5());
         }

         com.aspose.slides.internal.k0r.n2[] var3 = var0.a6();
         if (var3 != null) {
            DrawingGuidesCollection var4 = (DrawingGuidesCollection)var1.getDrawingGuides();

            for (com.aspose.slides.internal.k0r.n2 var8 : var3) {
               var4.n5(new DrawingGuide((byte)((var8.l6() & 4294967295L) == 0L ? 0 : 1), com.aspose.slides.internal.n2d.t2.x8(var8.k5())));
            }
         }
      }
   }

   static void n5(ICommonSlideViewProperties var0, com.aspose.slides.internal.k0r.h3r var1, g6o var2) {
      com.aspose.slides.internal.k0r.r1x var3 = var1.u3();
      var3.l6().n5().n5(var0.getScale());
      var3.l6().l6().n5(var0.getScale());
      if (var3.l6().n5().n5() < 10) {
         var3.l6().n5().n5(10);
      }

      if (var3.l6().l6().n5() < 10) {
         var3.l6().l6().n5(10);
      }

      var3.l6().n5().l6(100);
      var3.l6().l6().l6(100);
      var3.n5(var0.getVariableScale());
      var1.e2().removeAll(new o9n$1());
      boolean var4 = false;
      int var5 = 0;
      int var6 = 0;
      IGenericEnumerator var7 = var0.getDrawingGuides().iterator();

      try {
         while (var7.hasNext()) {
            IDrawingGuide var8 = (IDrawingGuide)var7.next();
            float var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n3(var8.getPosition()), 13);
            if (!(var9 < -15840.0F) && !(var9 > 32255.0F)) {
               if (var8.getOrientation() == 0) {
                  if (++var6 > 8) {
                     var4 = true;
                     continue;
                  }
               } else if (++var5 > 8) {
                  var4 = true;
                  continue;
               }

               com.aspose.slides.internal.k0r.n2 var10 = new com.aspose.slides.internal.k0r.n2();
               var10.n5((var8.getOrientation() == 0 ? 0 : 1) & 4294967295L);
               var10.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n3(var8.getPosition()), 13));
               var1.e2().addItem(var10);
            } else {
               var4 = true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var4) {
         var2.n5("The PPT presentation can contain only eight vertical and eight horizontal drawing guides.", 4);
      }
   }
}
