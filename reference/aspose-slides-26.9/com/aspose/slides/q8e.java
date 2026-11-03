package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class q8e {
   public static void n5(ILineFormat var0, IFillFormat var1, com.aspose.slides.internal.k4y.y2i var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var2 == null) {
         throw new ArgumentNullException("style");
      }

      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var2.u3());
      if (var4 != null) {
         v0y.n5(var0, var1, var4, var3);
      }
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("style");
      }

      com.aspose.slides.internal.k4y.p3w var3 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var1.u3());
      if (var3 != null) {
         v0y.n5(var0, var3, var2);
      }
   }

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("style");
      }

      com.aspose.slides.internal.k4y.p3w var3 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var1.u3());
      if (var3 != null) {
         v0y.n5(var0, var3, var2);
      }

      com.aspose.slides.internal.k4y.r9l var4 = t2f.n5(com.aspose.slides.internal.k4y.r9l.class, "drawing-page-properties", var1.u3());
      if (var4 != null) {
         v0y.n5(var0, var4, var2);
         if (com.aspose.slides.internal.v6g.k5.l6(((FillFormat)var0).getParent_Immediate(), Background.class)
            && com.aspose.slides.internal.v6g.k5.l6(((FillFormat)var0).getParent_Immediate().getParent_Immediate(), LayoutSlide.class)) {
            ((LayoutSlide)((FillFormat)var0).getParent_Immediate().getParent_Immediate()).setShowMasterShapes(var4.e2() != 0);
         }
      }
   }

   public static void n5(IEffectFormat var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effectFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("style");
      }

      com.aspose.slides.internal.k4y.p3w var3 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var1.u3());
      if (var3 != null) {
         v0y.n5(var0, var3, var2);
      }
   }

   public static void n5(ParagraphFormat var0, TextFrameFormat var1, com.aspose.slides.internal.k4y.y2i var2, h6j var3) {
      com.aspose.slides.internal.k4y.v5n var4 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var2.u3());
      if (var4 != null) {
         if (var0 != null) {
            f1t.n5(var0, var4, var3);
         }

         if (var1 != null) {
            f1t.n5(var1, var4, var3);
         }
      }

      com.aspose.slides.internal.k4y.p3w var5 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var2.u3());
      if (var5 != null && var1 != null) {
         f1t.n5(var1, var5, var3);
      }

      com.aspose.slides.internal.k4y.j9d var6 = t2f.n5(com.aspose.slides.internal.k4y.j9d.class, "text-properties", var2.u3());
      if (var6 != null) {
         if (var1 != null) {
            n5((ParagraphFormat)var1.h0().getDefaultParagraphFormat(), var6, var3);
         }

         if (var0 != null) {
            n5(var0, var6, var3);
         }
      }
   }

   public static void n5(PortionFormat var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      v7w.n5(var0, var1, var2);
   }

   public static void n5(PictureFrame var0, com.aspose.slides.internal.k4y.s3o var1, com.aspose.slides.internal.k4y.y2i var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFrame");
      }

      if (var2 == null) {
         throw new ArgumentNullException("style");
      }

      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var2.u3());
      if (var4 != null) {
         if (t2f.k5(var4.y1())) {
            w9z var5 = new w9z(var4.y1());
            if (!var5.t2()) {
               PictureFillFormat var6 = (PictureFillFormat)var0.getPictureFormat();
               if (var6.getPicture().getImage() == null && !com.aspose.slides.ms.System.d1.n5(var6.getPicture().getLinkPathLong())) {
                  var6.getPicture()
                     .setImage(
                        ((ImageCollection)var6.getPicture().getPresentation().getImages()).n5(var0.getPictureFormat().getPicture().getLinkPathLong(), null)
                     );
               }

               PPImage var7 = com.aspose.slides.internal.v6g.k5.n5(var6.getPicture().getImage(), PPImage.class);
               if (var7 != null) {
                  com.aspose.slides.internal.o9b.y2 var8 = new com.aspose.slides.internal.o9b.y2(0, 0, var7.getWidth(), var7.getHeight());
                  com.aspose.slides.internal.o9b.y2 var9 = n5(var8.n3(), var5).n3();
                  com.aspose.slides.internal.o9b.f2 var10 = new com.aspose.slides.internal.o9b.f2(
                     var7.getWidth() / var7.t2().l6(), var7.getHeight() / var7.t2().k5()
                  );
                  if (var8.l6() >= var9.l6() && var8.t2() >= var9.t2() && var9.l6() > 0 && var9.t2() > 0) {
                     i2h var11 = i2h.n5(new i2h((float)var5.u3(), (float)var5.n5(), (float)var5.k5(), (float)var5.l6()), 100.0F).k5();
                     var11.l6 = var11.l6 / (var10.l6() * (var5.u9() ? 1.0F : 2.54F));
                     var11.k5 = var11.k5 / (var10.k5() * (var5.a6() ? 1.0F : 2.54F));
                     var11.u3 = var11.u3 / (var10.l6() * (var5.h0() ? 1.0F : 2.54F));
                     var11.a6 = var11.a6 / (var10.k5() * (var5.c8() ? 1.0F : 2.54F));
                     var6.n5(var11.k5());
                  }
               }
            }
         }

         if (t2f.k5(var4.e2())) {
            int var14 = t2f.u3(var4.e2());
            var0.u9.getPicture().getImageTransform().addAlphaModulateFixedEffect(var14);
         }

         if (t2f.k5(var4.y2())) {
            byte var15 = -1;
            byte var16 = -1;
            if (com.aspose.slides.ms.System.d1.a6("none", var4.y2())) {
               var15 = 0;
               var16 = 0;
            } else {
               byte var17 = -1;
               ISlide var19 = com.aspose.slides.internal.v6g.k5.n5(var0.getSlide(), ISlide.class);
               if (var19 != null) {
                  var17 = (byte)(var19.getSlideNumber() % 2 == 0 ? 1 : 0);
               }

               String[] var20 = com.aspose.slides.ms.System.d1.u9(var4.y2(), ' ', ',');

               for (String var13 : var20) {
                  if (com.aspose.slides.ms.System.d1.a6("horizontal", var13)) {
                     var15 = 1;
                     if (var16 == -1) {
                        var16 = 0;
                     }
                  } else if (com.aspose.slides.ms.System.d1.a6("vertical", var13)) {
                     var16 = 1;
                     if (var15 == -1) {
                        var15 = 0;
                     }
                  } else if (com.aspose.slides.ms.System.d1.a6("horizontal-on-odd", var13) && var17 == 0
                     || com.aspose.slides.ms.System.d1.a6("horizontal-on-even", var13) && var17 == 1) {
                     var15 = 1;
                  }
               }
            }

            IShapeFrame var18 = var0.getFrame();
            if (var15 != -1 && var18.getFlipH() != var15 || var16 != -1 && var18.getFlipV() != var16) {
               var0.setFrame(new ShapeFrame(var18.getX(), var18.getY(), var18.getWidth(), var18.getHeight(), var15, var16, var18.getRotation()));
            }
         }
      }
   }

   public static void n5(IParagraphFormat var0, com.aspose.slides.internal.k4y.j9d var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraphFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("textProperties");
      }

      if (t2f.k5(var1.l6())) {
         var0.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var0.getDefaultPortionFormat().getFillFormat().getSolidFillColor()).n5(t2f.x8(var1.l6()).o8());
      }

      if (t2f.k5(var1.u9())) {
         String var3 = com.aspose.slides.ms.System.d1.n5(var1.u9(), "'", "");
         var0.getDefaultPortionFormat().setLatinFont(new FontData(var3));
         Presentation var4 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().n5(), Presentation.class);
         e4z var5 = var4.t9().n5(var3, (byte)2, 0, 18.0F, 0, false);
         if (var5.u3()) {
            var0.getDefaultPortionFormat().setSymbolFont(new FontData(var3));
         } else {
            var0.getDefaultPortionFormat().setSymbolFont(v6v.n5);
         }
      }

      if (t2f.k5(var1.h0())) {
         var0.getDefaultPortionFormat().setEastAsianFont(new FontData(com.aspose.slides.ms.System.d1.n5(var1.h0(), "'", "")));
      }

      if (t2f.k5(var1.c8())) {
         var0.getDefaultPortionFormat().setComplexScriptFont(new FontData(com.aspose.slides.ms.System.d1.n5(var1.c8(), "'", "")));
      }

      if (t2f.k5(var1.u3())) {
         var0.getDefaultPortionFormat().setEscapement(t2f.t4(var1.u3()));
      }

      if (t2f.k5(var1.s7())) {
         var0.getDefaultPortionFormat().setFontHeight((float)t2f.n3(var1.s7()));
      }

      if (t2f.k5(var1.x8())) {
         if (com.aspose.slides.ms.System.d1.a6("normal", var1.x8())) {
            var0.getDefaultPortionFormat().setSpacing(0.0F);
         } else {
            var0.getDefaultPortionFormat().setSpacing((float)t2f.y4(var1.x8()));
         }
      }

      var0.getDefaultPortionFormat().setFontBold(q9k.n5.get_Item(var1.z1()));
   }

   private static com.aspose.slides.internal.o9b.y2 n5(com.aspose.slides.internal.o9b.y2 var0, w9z var1) {
      return new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.internal.v6g.k5.u3(var1.u3(), 14),
         com.aspose.slides.internal.v6g.k5.u3(var1.n5(), 14),
         com.aspose.slides.internal.v6g.k5.u3(var0.t2() - (var1.k5() + var1.u3()), 14),
         com.aspose.slides.internal.v6g.k5.u3(var0.l6() - (var1.n5() + var1.l6()), 14)
      );
   }
}
