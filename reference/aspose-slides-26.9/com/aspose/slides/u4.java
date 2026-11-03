package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;

class u4 {
   public static void n5(IAutoShape var0, com.aspose.slides.internal.k4y.q0 var1, i1x var2) {
      if (var1 != null) {
         if (var0 == null) {
            throw new ArgumentNullException("autoShape");
         }

         Shape var3 = com.aspose.slides.internal.v6g.k5.n5(var0, Shape.class);
         if (var3 == null) {
            throw new InvalidCastException("Cannot cast the parameter 'autoShape' to the type 'Shape'.");
         }

         s9 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.h0(), s9.class);
         if (var4 == null) {
            throw new InvalidCastException("Cannot cast asShape.PPTUnsupportedProps to the type 'AutoShapePPTXUnsupportedProps'.");
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.x1u.class)) {
            var0.setUseBackgroundFill(var1.c8());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.p5w.class)) {
            var1.n5().n5().n5(0L);
            var4.n5(var1.t2());
            var4.l6(var1.s7());
            var4.n5(var1.x8());
            var4.l6(var1.n3());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.f6w.class)) {
            var4.k5(var1.y4());
            var4.n5(var1.e2());
         }

         n5v.n5(var0, var1.l6(), var2.n5());
         com.aspose.slides.internal.k4y.z3 var5 = var1.n5();
         z6a.n5(var0, var5.k5(), var2);
         z6a.n5(var0, var5.n5(), var2);
         com.aspose.slides.internal.k4y.z1n var6 = var5.l6();
         c2.n5(var0.getAutoShapeLock(), var6.k5());
         h1o.n5(var0, var1.k5());
         var4.l6(var6.u3());
         com.aspose.slides.internal.k4y.j3z var7 = var1.a6();
         if (var7 != null) {
            TextFrame var8 = ((AutoShape)var0).x8();
            o4z.n5(var8, var7, var2.n5());
         } else {
            var0.addTextFrame("");
         }

         ((AutoShape)var0).n5(var6.l6());
         var4.n5(var1.h0());
         var3.c8();
      }
   }

   public static void n5(IAutoShape var0, com.aspose.slides.internal.k4y.q0 var1, n4i var2, j8m var3) {
      s9 var4 = ((AutoShape)var0).n5();
      g6c var5 = var2.n5();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.x1u.class)) {
         var1.n5(var0.getUseBackgroundFill());
         var1.n5(var4.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.p5w.class)) {
         var4.n5(var3.l6());
         var1.n5(var4.l6());
         var1.l6(var4.k5());
         var1.l6(var4.u3());
         var1.k5(var4.a6());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.f6w.class)) {
         var1.k5(var4.u9());
         var1.n5(var4.h0());
         var1.n5(var4.n5());
      }

      if (var2.l6() != null && var0.getTextFrame() != null && var0.getTextFrame().getTextFrameFormat().getAutofitType() == 1) {
         s3z.l6(((TextFrame)var0.getTextFrame()).u3);
      }

      com.aspose.slides.internal.k4y.z3 var6 = var1.n5();
      z6a.n5(var0, var6.k5(), var5);
      z6a.n5(var0, var6.n5(), var5);
      com.aspose.slides.internal.k4y.z1n var7 = var6.l6();
      c2.n5(var0.getAutoShapeLock(), new u4$1(var7));
      var7.n5(var4.x8());
      h1o.n5(var0.getShapeStyle(), new u4$2(var1));
      if (var0.getPlaceholder() == null || var0.getPlaceholder().getType() != 14) {
         o4z.n5(var0.getTextFrame(), new u4$3(var1), var5);
      }

      n5v.n5(var0, var1.l6(), var5);
      var7.n5(var0.isTextBox());
   }
}
