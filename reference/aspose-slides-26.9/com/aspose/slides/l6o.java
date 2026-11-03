package com.aspose.slides;

class l6o {
   private static boolean n5 = true;

   public static boolean n5() {
      return n5;
   }

   public static void n5(boolean var0) {
      n5 = var0;
   }

   public static boolean n5(e3 var0, s5u var1, GeometryShape var2, ShapeElement[] var3, ShapeFrame var4, IFillParamSource var5) {
      return n5(var0, var1, var2, var3, var4, var5, false);
   }

   public static boolean n5(e3 var0, s5u var1, GeometryShape var2, ShapeElement[] var3, ShapeFrame var4, IFillParamSource var5, boolean var6) {
      try {
         if (!n5()) {
            return false;
         }

         if (!var6 && !x0d.l6(var2)) {
            ShapeFrame var13 = var4;
            ShapeElement[] var8 = var3;
            boolean var9 = false;
            if (var2.isGrouped()) {
               IThreeDFormatEffectiveData var10 = var2.getParentGroup().getThreeDFormat().getEffective();
               if (com.aspose.slides.internal.v6g.k5.l6(var2, SmartArtShape.class) || var10.getCamera().getCameraType() != -1) {
                  var13 = (ShapeFrame)var2.getParentGroup().getFrame();
                  ShapeFrame var11 = var2.e5().n5(true);
                  var8 = var2.e2().n5(var2, var11.getX(), var11.getY(), var11.getWidth(), var11.getHeight());
                  var9 = true;
               }
            }

            n7d var14 = new n7d(n5(var1, var0));
            var14.n5(var9);
            return var14.n5(var0, var1, var2, var8, var13, var5);
         } else {
            x0d var7 = new x0d(n5(var1, var0));
            return var7.n5(var0, var1, var2, var3, var4, var5);
         }
      } catch (RuntimeException var12) {
         com.aspose.slides.internal.n8e.v4.n5(var12);
         return false;
      }
   }

   public static boolean n5(e3 var0, s5u var1, GeometryShape var2, TextFrame var3) {
      try {
         if (!n5() || u1v.k5(var3)) {
            return false;
         } else if (!x1i.n5(var3)) {
            float var7 = u1v.l6(var3) ? 2.0F : 1.0F;
            u1v var5 = new u1v(n5(var1, var0) * var7);
            var5.n5(var2.isGrouped());
            return var5.n5(var0, var1, var2, var3);
         } else {
            x1i var4 = new x1i(n5(var1, var0));
            var4.n5(var2.isGrouped() && !x0d.l6(var2));
            return var4.n5(var0, var1, var2, var3);
         }
      } catch (RuntimeException var6) {
         com.aspose.slides.internal.n8e.v4.n5(var6);
         return false;
      }
   }

   public static boolean n5(e3 var0, s5u var1, Cell var2, ShapeFrame var3, com.aspose.slides.internal.x4g.s7 var4, a1v var5) {
      try {
         d0 var6 = new d0(n5(var1, var0));
         return var6.n5(var0, var2, var3, var4, var5);
      } catch (RuntimeException var7) {
         com.aspose.slides.internal.n8e.v4.n5(var7);
         return false;
      }
   }

   public static boolean n5(e3 var0, s5u var1, GroupShape var2) {
      if (!n5()) {
         return false;
      }

      try {
         m2l var3 = new m2l(n5(var1, var0));
         return var3.n5(var0, var1, var2);
      } catch (RuntimeException var4) {
         return false;
      }
   }

   public static com.aspose.slides.internal.o9b.y1 n5(Shape var0) {
      if (n5() && com.aspose.slides.internal.v6g.k5.l6(var0, GeometryShape.class)) {
         n7d var1 = new n7d(1.0F);
         return var1.n5((GeometryShape)var0, (ShapeFrame)var0.getFrame());
      } else {
         return new com.aspose.slides.internal.o9b.y1(var0.getX(), var0.getY(), var0.getWidth(), var0.getHeight());
      }
   }

   static float n5(s5u var0, e3 var1) {
      float var2 = 1.0F;
      if (var0.t9() > 0 && com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
         var2 = var0.t9() / 96.0F;
      } else if (var0.y4() > 0.0F) {
         var2 = var0.y4() / 96.0F;
      }

      return 1.0F * var2;
   }
}
