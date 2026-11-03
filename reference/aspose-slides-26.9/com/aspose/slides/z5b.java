package com.aspose.slides;

class z5b {
   public static void n5(GroupShape var0, com.aspose.slides.internal.k4y.b8c var1) {
      o4f var2 = var0.R_();
      double var3 = 0.0;
      double var5 = 0.0;
      if (var1.c8() != null) {
         var3 = var1.c8().n5();
         var5 = var1.c8().l6();
      }

      double var7 = 0.0;
      double var9 = 0.0;
      if (var1.t2() != null) {
         var7 = var1.t2().n5();
         var9 = var1.t2().l6();
      }

      int var11 = var1.u9() ? 1 : 0;
      int var12 = var1.h0() ? 1 : 0;
      var2.n5(new e4c(var3, var5));
      var0.n5(var7, var9);
      var2.n5(var1.a6(), (byte)var11, (byte)var12);
   }

   public static void n5(com.aspose.slides.internal.k4y.e8b var0, e4c[] var1, e4c[] var2, x4t[] var3) {
      e4c.k5.l6(var1[0]);
      if (var0.u9() != null) {
         var1[0].n5 = var0.u9().n5();
         var1[0].l6 = var0.u9().l6();
      }

      e4c.k5.l6(var2[0]);
      if (var0.h0() != null) {
         var2[0].n5 = var0.h0().n5();
         var2[0].l6 = var0.h0().l6();
      }

      var3[0] = new x4t();
      var3[0].l6 = var0.k5();
      var3[0].u3 = var0.u3();
      var3[0].k5 = var0.a6();
   }

   private static boolean n5(Shape var0) {
      o4f var1 = var0.R_();
      e4c var2 = var0.z7().u9();
      return !com.aspose.slides.ms.System.d2.k5(var1.n5().n5)
         || !com.aspose.slides.ms.System.d2.k5(var1.n5().l6)
         || !com.aspose.slides.ms.System.d2.k5(var2.n5)
         || !com.aspose.slides.ms.System.d2.k5(var2.l6)
         || !com.aspose.slides.ms.System.d2.k5(var1.k5())
         || var1.u3() != -1
         || var1.a6() != -1;
   }

   public static void n5(Shape var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.e8b> var1, boolean var2) {
      if (var2 || n5(var0)) {
         n5(var0, (com.aspose.slides.internal.k4y.e8b)var1.invoke(), var2);
      }
   }

   public static void n5(Shape var0, com.aspose.slides.internal.k4y.e8b var1, boolean var2) {
      if (var2 || n5(var0)) {
         ShapeFrame var3 = var0.e5().e2();
         n5(var3, var1);
      }
   }

   public static void n5(IShapeFrame var0, com.aspose.slides.internal.k4y.e8b var1) {
      com.aspose.slides.internal.k4y.s2b var2 = var1.n5();
      var2.n5(com.aspose.slides.ms.System.q1.k5(169093.2005511811, com.aspose.slides.ms.System.d2.k5(var0.getX()) ? 0.0 : var0.getX()));
      var2.l6(com.aspose.slides.ms.System.q1.k5(169093.2005511811, com.aspose.slides.ms.System.d2.k5(var0.getY()) ? 0.0 : var0.getY()));
      com.aspose.slides.internal.k4y.q8g var3 = var1.l6();
      var3.n5(com.aspose.slides.ms.System.d2.k5(var0.getWidth()) ? 0.0 : var0.getWidth());
      var3.l6(com.aspose.slides.ms.System.d2.k5(var0.getHeight()) ? 0.0 : var0.getHeight());
      var1.n5(com.aspose.slides.ms.System.n1.k5(var0.getRotation()) ? 0.0F : var0.getRotation());
      var1.n5(var0.getFlipH() == 1);
      var1.l6(var0.getFlipV() == 1);
      n5(var1, var2, var3);
   }

   private static void n5(com.aspose.slides.internal.k4y.e8b var0, com.aspose.slides.internal.k4y.s2b var1, com.aspose.slides.internal.k4y.q8g var2) {
      if (var2.n5() < 0.0) {
         var1.n5(var1.n5() + var2.n5());
         var2.n5(com.aspose.slides.ms.System.q1.n5(var2.n5()));
         var0.n5(true);
      }
   }
}
