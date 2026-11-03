package com.aspose.slides;

class l0y {
   public static x2i n5(GeometryShape var0) {
      x2i var1 = n5(var0.r4());
      if (var1 != null && com.aspose.slides.internal.v6g.k5.l6(var0, SmartArtShape.class) && var0.getThreeDFormat().getLightRig().getLightType() == -1) {
         SmartArtShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArtShape.class);
         SmartArt var3 = var2.y4().h0().z1().l6();
         com.aspose.slides.internal.k4y.h6l var4 = var3.u9().a6().k5();
         var1.k5(var4.k5().l6());
         var1.l6(var4.k5().k5());
         if (var4.k5().u3() != null) {
            var1.n5(new float[]{var4.k5().u3().n5(), var4.k5().u3().l6(), var4.k5().u3().k5()});
         }
      }

      return var1;
   }

   public static x2i n5(TextFrame var0) {
      return n5(var0.s7().getThreeDFormat());
   }

   public static x2i n5(IThreeDFormat var0) {
      if (((ThreeDFormat)var0).l6() != null) {
         x2i var6 = new x2i();
         var6.n5((float)var0.getExtrusionHeight());
         var6.l6((float)var0.getDepth());
         var6.n5(var0.getMaterial());
         var6.k5((float)var0.getContourWidth());
         if (var0.getExtrusionColor().getColorType() != -1) {
            var6.n5(new com.aspose.slides.ms.System.o5<>(((ColorFormat)var0.getExtrusionColor()).u3().o8()));
         }

         if (var0.getContourColor().getColorType() != -1) {
            var6.l6(new com.aspose.slides.ms.System.o5<>(((ColorFormat)var0.getContourColor()).u3().o8()));
         } else if (var6.u3() > 0.0F) {
            var6.l6(new com.aspose.slides.ms.System.o5<>(((h3g)var0.getEffective()).h0().o8()));
         }

         var6.n5(
            var0.getBevelTop() != null && var0.getBevelTop().getBevelType() != -1 && var0.getBevelTop().getHeight() > Double.MIN_VALUE
               ? var0.getBevelTop()
               : null
         );
         var6.l6(
            var0.getBevelBottom() != null && var0.getBevelBottom().getBevelType() != -1 && var0.getBevelBottom().getHeight() > Double.MIN_VALUE
               ? var0.getBevelBottom()
               : null
         );
         var6.l6(var0.getLightRig().getDirection());
         var6.k5(var0.getLightRig().getLightType());
         var6.n5(var0.getLightRig().getRotation());
         return var6;
      } else {
         IThreeDFormatEffectiveData var1 = var0.getEffective();
         if (var1.getCamera().getCameraType() == -1) {
            return null;
         }

         x2i var2 = new x2i();
         var2.n5((float)var1.getExtrusionHeight());
         var2.l6((float)var1.getDepth());
         var2.n5(var1.getMaterial());
         var2.n5(new com.aspose.slides.ms.System.o5<>(((h3g)var1).c8().o8()));
         var2.k5((float)var1.getContourWidth());
         var2.l6(new com.aspose.slides.ms.System.o5<>(((h3g)var1).h0().o8()));
         IShapeBevelEffectiveData var3 = var1.getBevelTop() != null
               && var1.getBevelTop().getBevelType() != -1
               && var1.getBevelTop().getHeight() > Double.MIN_VALUE
            ? var1.getBevelTop()
            : null;
         if (var3 != null) {
            ShapeBevel var4 = new ShapeBevel(true);
            var4.n5(var3);
            var2.n5(var4);
         }

         IShapeBevelEffectiveData var7 = var1.getBevelBottom() != null
               && var1.getBevelBottom().getBevelType() != -1
               && var1.getBevelBottom().getHeight() > Double.MIN_VALUE
            ? var1.getBevelBottom()
            : null;
         if (var7 != null) {
            ShapeBevel var5 = new ShapeBevel(false);
            var5.n5(var7);
            var2.l6(var5);
         }

         var2.l6(var1.getLightRig().getDirection());
         var2.k5(var1.getLightRig().getLightType());
         var2.n5(var1.getLightRig().getRotation());
         return var2;
      }
   }

   public static x2i n5(GeometryShape var0, boolean[] var1) {
      x2i var2 = n5(var0);
      var1[0] = true;
      if (var2 != null && l6(var0)) {
         if (var0.getWidth() < k4.l6.n5() && var0.getHeight() < k4.l6.l6()) {
            var2.n5((IShapeBevel)null);
            var2.l6((IShapeBevel)null);
         } else {
            if (var2.h0() != null && var2.h0().getWidth() < k4.n5.n5() && 0.0 < var2.h0().getHeight()) {
               var2.n5((IShapeBevel)null);
            }

            if (var2.c8() != null && (var2.c8().getWidth() < k4.n5.n5() || var2.c8().getHeight() < k4.n5.l6())) {
               var2.l6((IShapeBevel)null);
            }
         }

         var1[0] = var2.h0() == null;
      }

      return var2;
   }

   private static boolean l6(GeometryShape var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, SmartArtShape.class)) {
         SmartArtShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArtShape.class);
         SmartArt var2 = var1.y4().h0().z1().l6();
         if (var2.getLayout() == 113 && var1.getShapeType() == 5) {
            return false;
         }
      }

      boolean var3 = n7d.l6(var0.getShapeType());
      return !var3;
   }
}
