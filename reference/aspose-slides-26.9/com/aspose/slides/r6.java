package com.aspose.slides;

class r6 {
   static void n5(m5n var0) {
      com.aspose.slides.internal.k0r.q5 var1 = var0.n3();
      if (var1 != null) {
         Background var2 = var0.n5();
         var2.setType((byte)1);
         m3e.n5((FillFormat)var2.getFillFormat(), var0);
         f7k.n5(var2.getEffectFormat(), var0);
         if (var2.getFillFormat().getFillType() == 2 && var2.getFillFormat().getGradientFormat().getGradientShape() == 3) {
            r7 var3 = var2.u3();
            var3.n5(true);
            if (var0.y4().y4().getShapes().size() > 0) {
               var3.n5(var0.y4().y4().getShapes().get_Item(0));
            }
         }

         if (var1.s7() != null) {
            u5b.n5(var2.a6().n5(), var1.s7().x8());
         }

         int var4 = 0;
         if (var2.getFillFormat().getFillType() == 1 && var2.getFillFormat().getSolidFillColor().getColorType() == 3) {
            var4 = var2.getFillFormat().getSolidFillColor().getSchemeColor();
         }
      }
   }

   private static boolean n5(Background var0) {
      return var0 == null || var0.getType() == -1;
   }

   static void n5(y2q var0) {
      BaseSlide var1 = null;
      Background var2 = null;
      Background var3 = null;
      if (var0.k5() == 2) {
         var1 = com.aspose.slides.internal.v6g.k5.n5(var0.w1(), LayoutSlide.class);
         if (var1 != null) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getBackground(), Background.class);
            if (n5(var2)) {
               var2 = null;
            }
         } else {
            MasterSlide var4 = var0.l6().e2();
            var3 = com.aspose.slides.internal.v6g.k5.n5(var4.getBackground(), Background.class);
            if (n5(var3)) {
               var3 = null;
            }
         }
      }

      if (var2 == null) {
         var1 = var0.l6();
         var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getBackground(), Background.class);
         if (n5(var2)) {
            if (var3 == null) {
               var0.n5(true);
               return;
            }

            var2 = var3;
         }
      }

      j9p var12 = new j9p(var2, var0.u9());
      com.aspose.slides.internal.k0r.q5 var5 = var12.z3();
      var5.u3().n5(var0.n5(true));
      com.aspose.slides.internal.k0r.r3 var6 = var5.a6();
      IFillFormatEffectiveData var7 = var2.getEffective().getFillFormat();
      FillFormat var8;
      if (var7 == null || var2.getType() == 1 && var2.getFillFormat().getFillType() != -1 && var2.getFillFormat().getFillType() != 2) {
         var8 = (FillFormat)var2.getFillFormat();
      } else {
         var8 = new FillFormat(var2);
         var8.n5(var7);
      }

      if (var7 != null && var7.getFillType() == 1) {
         if (var2.getType() == 0 && var2.getStyleColor().getSchemeColor() != -1) {
            var8.getSolidFillColor().setSchemeColor(var2.getStyleColor().getSchemeColor());
         }
      } else if (var7 != null && var7.getFillType() == 4) {
         PictureFillFormat var15 = (PictureFillFormat)var8.getPictureFillFormat();
         if (var2.getType() == 1) {
            ((Picture)var15.getPicture()).l6().n5(((Picture)var2.getFillFormat().getPictureFillFormat().getPicture()).l6().a6());
         } else if (var2.getType() == 0 && d2k.u3(var15.h0().u3(), d2k.u3)) {
            var15.getPicture().setImage(n5((f6a)var7, var2, var0.n5()));
            var15.getPicture().getImageTransform().clear();
         }
      } else if (var7 != null && var7.getFillType() == 2 && var7.getGradientFormat().getGradientShape() == 2) {
         IPPImage var9 = n5((f6a)var7, var2, var0.n5());
         var8.setFillType((byte)4);
         var8.getPictureFillFormat().setPictureFillMode(1);
         var8.getPictureFillFormat().getPicture().setImage(var9);
      }

      m3e.n5(var8, var12);
      if (!var2.getEffectFormat().isNoEffects() && var2.getType() == 1) {
         f7k.l6(var12);
      }

      com.aspose.slides.internal.k0r.a7 var14 = new com.aspose.slides.internal.k0r.a7();
      var6.l6().n5(var14);
      var14.x8(false);
      com.aspose.slides.internal.k0r.s9 var13 = new com.aspose.slides.internal.k0r.s9();
      var6.l6().n5(var13);
      var13.n5(true);
      var13.l6(true);
      com.aspose.slides.internal.k0r.z5 var16 = new com.aspose.slides.internal.k0r.z5(772, false, 9L);
      var6.l6().n5(var16);
   }

   private static IPPImage n5(f6a var0, Background var1, g6o var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)var2.n5().getSlideSize()).n5().a6();
      ShapeFrame var4 = new ShapeFrame(0.0F, 0.0F, var3.l6(), var3.k5(), (byte)0, (byte)0, 0.0F);
      j5m var5 = new j5m(var4, null, null, var1.getSlide(), null);
      a1v var6 = a1v.n5(var5, var0);
      if (var0.getFillType() == 4) {
         com.aspose.slides.internal.o9b.u3 var58 = d4.k5(var6);

         try {
            com.aspose.slides.internal.z0k.e2 var59 = new com.aspose.slides.internal.z0k.e2();

            try {
               ((com.aspose.slides.internal.o9b.u6)var58).h0().n5(var59, com.aspose.slides.internal.j9e.x8.s7());
               return new PPImage(var2.n5(), var59.toArray());
            } finally {
               if (var59 != null) {
                  var59.dispose();
               }
            }
         } finally {
            if (var58 != null) {
               var58.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13)
         );

         try {
            com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var7);

            try {
               var8.k5(7);
               var8.l6(2);
               var8.a6(2);
               com.aspose.slides.internal.o9b.u3 var9 = d4.k5(var6);

               try {
                  var8.n5(var9, 0, 0, var7.e2(), var7.h0());
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            com.aspose.slides.internal.z0k.e2 var60 = new com.aspose.slides.internal.z0k.e2();

            try {
               var7.n5(var60, com.aspose.slides.internal.j9e.x8.s7());
               return new PPImage(var2.n5(), var60.toArray());
            } finally {
               if (var60 != null) {
                  var60.dispose();
               }
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      }
   }
}
