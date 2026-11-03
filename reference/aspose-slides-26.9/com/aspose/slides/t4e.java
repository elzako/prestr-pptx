package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class t4e {
   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      switch (var1.a0()) {
         case 0:
            if (t2f.k5(var1.d2()) && (var0.getFillType() == 1 || var0.getFillType() == -1)) {
               n5(var0, var1.d2(), var1.v4());
            }
            break;
         case 1:
            var0.setFillType((byte)0);
            break;
         case 2:
            n5(var0, var1.d2(), var1.v4());
            break;
         case 3:
            var0.setFillType((byte)4);
            var0.setRotateWithShape((byte)0);
            u1b.n5((PictureFillFormat)var0.getPictureFillFormat(), new r2c(var1), var2);
            break;
         case 4:
            if (t2f.k5(var1.d5())) {
               var0.setFillType((byte)2);
               var0.setRotateWithShape((byte)0);
               n8o.n5((GradientFormat)var0.getGradientFormat(), var1.d5(), var1.u6(), var2);
            }
            break;
         case 5:
            var0.setFillType((byte)3);
            e5r.n5((PatternFormat)var0.getPatternFormat(), var1, var2);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.r9l var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pagePropertiesContent");
      }

      switch (var1.n5()) {
         case 2:
            n5(var0, var1.l6(), var1.x8());
            break;
         case 3:
            if (t2f.k5(var1.u3())) {
               var0.setFillType((byte)4);
               u1b.n5((PictureFillFormat)var0.getPictureFillFormat(), new r2c(var1), var2);
            } else if (com.aspose.slides.ms.System.d1.a6(var1.u3(), com.aspose.slides.ms.System.d1.n5)) {
               var0.setFillType((byte)0);
            }
            break;
         case 4:
            var0.setFillType((byte)2);
            var0.setRotateWithShape((byte)0);
            n8o.n5((GradientFormat)var0.getGradientFormat(), var1.k5(), var1.n3(), var2);
      }
   }

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.b4u var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("tableCellPropertiesContent");
      }

      if (t2f.k5(var1.l6())) {
         n5(var0, var1.l6(), null);
      } else if (var1.n3() != null && t2f.k5(var1.n3().l6())) {
         var0.setFillType((byte)4);
         var0.setRotateWithShape((byte)0);
         u1b.n5((PictureFillFormat)var0.getPictureFillFormat(), var1.n3(), var2);
      }
   }

   private static void n5(IFillFormat var0, String var1, String var2) {
      var0.setFillType((byte)1);
      ((ColorFormat)var0.getSolidFillColor()).n5(t2f.x8(var1).o8());
      if (t2f.k5(var2)) {
         int var3 = t2f.u3(var2);
         if (var3 < 100 && var3 >= 0) {
            var0.getSolidFillColor().getColorTransform().add(5, var3 / 100.0F);
         }
      }
   }
}
