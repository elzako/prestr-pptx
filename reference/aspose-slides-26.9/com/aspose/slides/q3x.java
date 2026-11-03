package com.aspose.slides;

class q3x {
   public static void n5(IChart var0, com.aspose.slides.internal.k4y.d0e var1, t5w var2) {
      if (var1 != null) {
         IRotation3D var3 = var0.getRotation3D();
         if (var1.h0() != null) {
            var3.setRotationX(var1.h0().n5());
         } else {
            var3.setRotationX((byte)15);
         }

         if (var1.t2() != null) {
            var3.setRotationY(var1.t2().n5());
         } else {
            var3.setRotationY(20);
         }

         if (var1.c8() != null) {
            var3.setHeightPercents(var1.c8().n5());
         }

         if (var1.s7() == null) {
            var3.setDepthPercents(100);
         } else {
            var3.setDepthPercents(var1.s7().n5());
         }

         if (var1.x8() != null) {
            var3.setRightAngleAxes(var1.x8().n5());
         }

         if (var1.n3() != null) {
            var3.setPerspective(var1.n3().n5());
         } else {
            var3.setPerspective((byte)30);
         }

         n5(var3, var1);
      }
   }

   private static void n5(IRotation3D var0, com.aspose.slides.internal.k4y.d0e var1) {
      a5a var2 = ((Rotation3D)var0).n5();
      var2.n5(var1.y4());
   }

   public static void n5(IRotation3D var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d0e> var1) {
      if (n5((Rotation3D)var0)) {
         com.aspose.slides.internal.k4y.d0e var2 = (com.aspose.slides.internal.k4y.d0e)var1.invoke();
         var2.n5().n5(var0.getRotationX());
         var2.k5().n5(var0.getRotationY());
         var2.a6().n5(var0.getRightAngleAxes());
         if ((var0.getHeightPercents() & 65535) != 100) {
            var2.l6().n5(var0.getHeightPercents());
         }

         if ((var0.getDepthPercents() & 65535) != 100) {
            var2.u3().n5(var0.getDepthPercents());
         }

         if ((var0.getPerspective() & 255) != 30) {
            var2.u9().n5(var0.getPerspective());
         }

         l6(var0, var2);
      }
   }

   private static void l6(IRotation3D var0, com.aspose.slides.internal.k4y.d0e var1) {
      a5a var2 = ((Rotation3D)var0).n5();
      var1.n5(var2.n5());
   }

   private static boolean n5(Rotation3D var0) {
      return var0.getRotationX() != 0
         || (var0.getRotationY() & 65535) != 0
         || var0.getRightAngleAxes()
         || (var0.getHeightPercents() & 65535) != 100
         || (var0.getDepthPercents() & 65535) != 100
         || (var0.getPerspective() & 255) != 30
         || var0.n5().n5() != null;
   }
}
