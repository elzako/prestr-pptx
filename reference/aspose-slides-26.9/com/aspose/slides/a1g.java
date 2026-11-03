package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class a1g {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("masterClrMapping", "overrideClrMapping");

   public static void n5(Chart var0, com.aspose.slides.internal.k4y.d0 var1) {
      n5(var0.y4(), var1);
   }

   public static void n5(IThemeManager var0, com.aspose.slides.internal.k4y.d0 var1) {
      n5(((BaseThemeManager)var0).u3(), var1);
   }

   public static void n5(IThemeManager var0, com.aspose.slides.internal.k4y.c1 var1) {
      m0l var2 = ((BaseThemeManager)var0).u3();
      var2.n5(false);
      n5(var2, var1);
   }

   static void n5(m0l var0, com.aspose.slides.internal.k4y.c1 var1) {
      if (var1 != null) {
         if (var1.n5() != null) {
            switch (n5.n5(var1.n5().n5())) {
               case 0:
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.d0 var2 = (com.aspose.slides.internal.k4y.d0)var1.n5().l6();
                  n5(var0, var2);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5().n5(), "\""}));
            }
         }
      }
   }

   static void n5(m0l var0, com.aspose.slides.internal.k4y.d0 var1) {
      var0.n5(false);
      if (var1 != null) {
         var0.n5(true);
         var0.n5(var1.y4());
         var0.n5(0, var1.n5());
         var0.n5(1, var1.l6());
         var0.n5(2, var1.k5());
         var0.n5(3, var1.u3());
         var0.n5(4, var1.a6());
         var0.n5(5, var1.u9());
         var0.n5(6, var1.h0());
         var0.n5(7, var1.c8());
         var0.n5(8, var1.t2());
         var0.n5(9, var1.s7());
         var0.n5(10, var1.x8());
         var0.n5(11, var1.n3());
      }
   }

   public static void l6(IThemeManager var0, com.aspose.slides.internal.k4y.d0 var1) {
      l6(((BaseThemeManager)var0).u3(), var1);
   }

   static void l6(m0l var0, com.aspose.slides.internal.k4y.c1 var1) {
      if (var0 != null && var0.n5()) {
         com.aspose.slides.internal.k4y.d0 var2 = (com.aspose.slides.internal.k4y.d0)var1.n5("overrideClrMapping").l6();
         l6(var0, var2);
      } else {
         var1.n5("masterClrMapping");
      }
   }

   public static void n5(Chart var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d0> var1) {
      if (var0.y4().n5()) {
         com.aspose.slides.internal.k4y.d0 var2 = (com.aspose.slides.internal.k4y.d0)var1.invoke();
         l6(var0.y4(), var2);
      }
   }

   static void n5(m0l var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d0> var1) {
      if (var0.n5()) {
         com.aspose.slides.internal.k4y.d0 var2 = (com.aspose.slides.internal.k4y.d0)var1.invoke();
         l6(var0, var2);
      }
   }

   static void l6(m0l var0, com.aspose.slides.internal.k4y.d0 var1) {
      var1.n5(var0.l6());
      var1.n5(var0.n5(0));
      var1.l6(var0.n5(1));
      var1.k5(var0.n5(2));
      var1.u3(var0.n5(3));
      var1.a6(var0.n5(4));
      var1.u9(var0.n5(5));
      var1.h0(var0.n5(6));
      var1.c8(var0.n5(7));
      var1.t2(var0.n5(8));
      var1.s7(var0.n5(9));
      var1.x8(var0.n5(10));
      var1.n3(var0.n5(11));
   }
}
