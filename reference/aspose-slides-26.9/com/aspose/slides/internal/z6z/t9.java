package com.aspose.slides.internal.z6z;

import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.l7h.a5;

public class t9 {
   public static boolean n5(z3 var0, u3 var1, r4 var2) {
      e2 var3 = new e2();
      String var4 = var3.k5(var2);
      if (com.aspose.slides.internal.n2d.t4.l6(var4) && !"F 1 ".equals(var4)) {
         var0.l6("Path");
         if (var2.l6() != null) {
            var0.n5("StrokeThickness", var2.l6().l6());
            var0.k5("StrokeLineJoin", a6.n5(var2.l6().a6()));
            if (var2.l6().a6() == 0 || var2.l6().a6() == 3) {
               var0.n5("StrokeMiterLimit", var2.l6().h0());
            }

            var0.k5("StrokeStartLineCap", a6.l6(var2.l6().k5()));
            var0.k5("StrokeEndLineCap", a6.l6(var2.l6().u3()));
            if (var2.l6().s7() != 0) {
               var0.n5("StrokeDashOffset", var2.l6().c8());
               var0.k5("StrokeDashCap", a6.k5(var2.l6().t2()));
               var0.k5("StrokeDashArray", n5(var2.l6().x8()));
            }
         }

         if (var2.u3() != null) {
            var0.n5("RenderTransform", var2.u3());
         }

         var0.k5("Data", var4);
         if (var2.a6() != null) {
            var0.k5("Clip", var3.k5(var2.a6()));
         }

         if (var2.k5() != null) {
            n5(var0, var1, var2.k5());
         }

         if (var2.l6() != null) {
            n5(var0, var1, var2.l6());
         }

         return true;
      } else {
         return false;
      }
   }

   public static void n5(com.aspose.slides.internal.b8.n5 var0) {
      var0.k5();
   }

   private static String n5(float[] var0) {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.n5(com.aspose.slides.internal.t6j.u3.n5(var0[var2]));
         if (var2 < var0.length - 1) {
            var1.n5(" ");
         }
      }

      return var1.toString();
   }

   public static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.s7 var2) {
      var0.l6("Path.Stroke");
      l6.n5(var0, var1, var2.u9());
      var0.k5();
   }

   public static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.l6 var2) {
      var0.l6("Path.Fill");
      l6.n5(var0, var1, var2);
      var0.k5();
   }
}
