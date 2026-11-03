package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class l9h {
   public static ColorFormat n5(q1v var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Paragraph.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Portion.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Field.class)) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, Cell.class)) {
            return n5((Cell)var1, var0);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, GeometryShape.class)) {
            return n5((IGeometryShape)var1, var0);
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(var1, Background.class) ? n5((Background)var1) : null;
         }
      } else {
         TextFrame var2;
         if (com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)) {
            var2 = (TextFrame)var1;
         } else {
            Paragraph var3;
            if (com.aspose.slides.internal.v6g.k5.l6(var1, Paragraph.class)) {
               var3 = (Paragraph)var1;
            } else {
               Portion var4 = null;
               if (com.aspose.slides.internal.v6g.k5.l6(var1, Portion.class)) {
                  var4 = (Portion)var1;
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Field.class)) {
                  var4 = ((Field)var1).k5();
               }

               if (var4 == null) {
                  throw new NullReferenceException("Portion couldn't be empty.");
               }

               var3 = var4.n3();
            }

            var2 = null;
            if (var3 != null) {
               ParagraphCollection var6 = var3.x8();
               if (var6 != null) {
                  var2 = var6.k5();
               }
            }
         }

         if (var2 == null) {
            return null;
         } else {
            r0g var5 = var2.getParent_Immediate();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, GeometryShape.class)) {
               return n5((GeometryShape)var5, var0);
            } else {
               return com.aspose.slides.internal.v6g.k5.l6(var5, Cell.class) ? n5((Cell)var5, var0) : null;
            }
         }
      }
   }

   private static ColorFormat n5(Cell var0, q1v var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, TextStyle.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, TextFrameFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, ParagraphFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, PortionFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, BulletFormat.class)) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, FillFormat.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var1, LineFormat.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var1, CellFormat.class)) {
            return null;
         } else {
            return var0.n3().n5() != null && var0.n3().n5().u3() == 2 ? (ColorFormat)var0.n3().n5().k5() : null;
         }
      } else {
         return var0.n3().l6() != null && var0.n3().l6().h0().getColorType() == 3 ? (ColorFormat)var0.n3().l6().h0() : null;
      }
   }

   private static ColorFormat n5(IGeometryShape var0, q1v var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, FillFormat.class)) {
         return var0.getShapeStyle() != null ? (ColorFormat)var0.getShapeStyle().getFillColor() : null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, LineFormat.class)) {
         return var0.getShapeStyle() != null ? (ColorFormat)var0.getShapeStyle().getLineColor() : null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, EffectFormat.class)) {
         return var0.getShapeStyle() != null ? (ColorFormat)var0.getShapeStyle().getEffectColor() : null;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, TextFrameFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, TextStyle.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, ParagraphFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, PortionFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, BulletFormat.class)) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, ThreeDFormat.class)) {
            return null;
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(var1, ImageTransformOperation.class) ? null : null;
         }
      } else {
         return var0.getShapeStyle() != null ? (ColorFormat)var0.getShapeStyle().getFontColor() : null;
      }
   }

   private static ColorFormat n5(Background var0) {
      return var0.getType() == 0 ? (ColorFormat)var0.getStyleColor() : null;
   }
}
