package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o8n {
   public static <T> String n5(IFillFormatEffectiveData var0, TemplateContext<T> var1) {
      String var2 = "";
      switch (var0.getFillType()) {
         case 1:
            if (com.aspose.slides.internal.v6g.k5.l6(var1.getObject(), AutoShape.class)
               && com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), AutoShape.class).getUseBackgroundFill()) {
               var2 = q8s.n5(
                  var1.subModel(
                     com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), AutoShape.class).getSlide(), Slide.class)
                  )
               );
            } else {
               var2 = com.aspose.slides.ms.System.d1.n5("background-color: {0};", new Object[]{e2o.n5(((f6a)var0).h0().o8())});
            }
            break;
         case 2:
            var2 = com.aspose.slides.ms.System.d1.n5("background: {0};", new Object[]{l6(var0.getGradientFormat())});
            break;
         case 3:
            var2 = com.aspose.slides.ms.System.d1.n5(
               "background: url('{0}') repeat;",
               new Object[]{
                  q5o.n5(var0.getPatternFormat().getPatternStyle(), ((g3a)var0.getPatternFormat()).l6().o8(), ((g3a)var0.getPatternFormat()).k5().o8())
               }
            );
            break;
         case 4:
            IPictureFillFormatEffectiveData var3 = var0.getPictureFillFormat();
            Shape var4 = com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), Shape.class);
            if (var4 != null && var3.getPictureFillMode() == 0) {
               String var35 = var1.getGlobal().get("imagesPath");
               String var36 = com.aspose.slides.internal.z0k.z1.l6(
                  var35, com.aspose.slides.ms.System.d1.n5("tileimage{0}.png", new Object[]{var4.getUniqueId()})
               );
               IImage var37 = m4w.n5(var4, var0);

               try {
                  var37.save(var36);
               } finally {
                  var37.dispose();
               }

               String var38 = var1.getGlobal().get("slidesPath");
               var2 = com.aspose.slides.ms.System.d1.n5("background-image: url('{0}');", new Object[]{o6c.n5(var36, var38)});
            } else {
               IPictureEffectiveData var5 = var0.getPictureFillFormat().getPicture();
               IPPImage var6 = var5.getImage();
               if (var5.getImageTransform().size() > 0) {
                  Slide var7 = com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), Slide.class);
                  if (var7 != null) {
                     Presentation var8 = new Presentation();

                     try {
                        var8.getSlideSize().setSize(var7.getPresentation().getSlideSize().getType(), 0);
                        var8.getSlides().removeAt(0);
                        Slide var9 = (Slide)var8.getSlides().addClone(var7.getPresentation().getSlides().get_Item(var7.getSlideNumber() - 1));
                        var9.getShapes().clear();
                        var9.getLayoutSlide().getMasterSlide().getShapes().clear();
                        com.aspose.slides.internal.z0k.e2 var10 = new com.aspose.slides.internal.z0k.e2();

                        try {
                           IImage var11 = var9.getImage(1.0F, 1.0F);

                           try {
                              ((u4i)var11).n5(var10, 6);
                           } finally {
                              var11.dispose();
                           }

                           var10.flush();
                           var2 = com.aspose.slides.ms.System.d1.n5(
                              "background-image: url('data:image/png;base64, {0}');", new Object[]{com.aspose.slides.ms.System.z3.n5(var10.toArray())}
                           );
                        } finally {
                           if (var10 != null) {
                              var10.dispose();
                           }
                        }
                     } finally {
                        if (var8 != null) {
                           var8.dispose();
                        }
                     }
                  } else {
                     var2 = com.aspose.slides.ms.System.d1.n5("background-image: url('{0}');", new Object[]{m4w.n5(var6, var1)});
                  }
               } else {
                  var2 = com.aspose.slides.ms.System.d1.n5("background-image: url('{0}');", new Object[]{m4w.n5(var6, var1)});
               }
            }
      }

      return var2;
   }

   private static String n5(IGradientFormatEffectiveData var0) {
      String var1 = "";
      List var2 = new List();
      IGenericEnumerator var3 = var0.getGradientStops().iterator();

      try {
         while (var3.hasNext()) {
            IGradientStopEffectiveData var4 = (IGradientStopEffectiveData)var3.next();
            var2.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.sort(new o8n$1());
      List$Enumerator var13 = var2.iterator();

      try {
         while (var13.hasNext()) {
            IGradientStopEffectiveData var5 = (IGradientStopEffectiveData)var13.next();
            var1 = com.aspose.slides.ms.System.d1.n5(
               var1, com.aspose.slides.ms.System.d1.n5(", {0}", new Object[]{e2o.n5(((GradientStopEffectiveData)var5).n5().o8())})
            );
            if (var5.getPosition() > 0.0F && var5.getPosition() < 1.0F) {
               var1 = com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.ms.System.d1.n5(" {0}%", new Object[]{var5.getPosition() * 100.0F}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      return var1;
   }

   private static String l6(IGradientFormatEffectiveData var0) {
      String var1 = "";
      String var2 = n5(var0);
      if (var0.getGradientShape() == 0) {
         var1 = com.aspose.slides.ms.System.d1.n5("linear-gradient({0}deg{1})",new Object[]{ var0.getLinearGradientAngle() + 90.0F, var2});
      } else if (var0.getGradientShape() == 2) {
         String var3 = "";
         switch (var0.getGradientDirection()) {
            case 0:
               var3 = "top left";
               break;
            case 1:
               var3 = "top right";
               break;
            case 2:
               var3 = "bottom left";
               break;
            case 3:
               var3 = "bottom right";
               break;
            default:
               var3 = "center";
         }

         var1 = com.aspose.slides.ms.System.d1.n5("radial-gradient(circle at {0}{1})",new Object[]{ var3, var2});
      }

      return var1;
   }
}
