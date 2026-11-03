package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class v7w {
   public static void n5(BasePortionFormat var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("portionFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("styleElement");
      }

      com.aspose.slides.internal.k4y.j9d var3 = t2f.n5(com.aspose.slides.internal.k4y.j9d.class, "text-properties", var1.u3());
      if (var3 != null) {
         n5(var0, var3, var2);
      }
   }

   public static void n5(BasePortionFormat var0, com.aspose.slides.internal.k4y.j9d var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("portionFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("textProperties");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.s7()) && !t2f.l6(var1.s7())) {
         var0.setFontHeight((float)t2f.n3(var1.s7()));
      }

      if (var1.n5() == 3) {
         var0.setTextCapType((byte)2);
      }

      if (var0.getFontBold() == -1) {
         var0.setFontBold(q9k.n5.get_Item(var1.z1()));
      }

      if (var0.getFontItalic() == -1) {
         var0.setFontItalic(q9k.l6.get_Item(var1.n3()));
      }

      if (var0.getFontUnderline() == -1) {
         var0.setFontUnderline(q9k.k5.get_Item(var1.t9()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
         var0.getFillFormat().setFillType((byte)1);
         ((ColorFormat)var0.getFillFormat().getSolidFillColor()).n5(t2f.x8(var1.l6()).o8());
      }

      if (t2f.k5(var1.t4())) {
         var0.h0().n5(t2f.x8(var1.t4()).o8());
      }

      if (t2f.k5(var1.y4())) {
         if (com.aspose.slides.ms.System.d1.a6("none", var1.y4())) {
            var0.getEffectFormat().disableOuterShadowEffect();
         } else {
            var0.getEffectFormat().enableOuterShadowEffect();
            IOuterShadow var3 = var0.getEffectFormat().getOuterShadowEffect();
            var3.setDistance(3.0);
            var3.setDirection(45.0F);
            var3.setRectangleAlign((byte)0);
            com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.m3().o8();
            if (var0.getFillFormat().getFillType() == 1) {
               ((ColorFormat)var0.getFillFormat().getSolidFillColor()).u3().n5(var4);
            } else if (var0.getParent_Immediate() != null) {
               PortionFormat var5 = com.aspose.slides.internal.v6g.k5.n5(var0, PortionFormat.class);
               if (var5 != null) {
                  ((f6a)var5.r4().getFillFormat()).h0().n5(var4);
               }
            }

            ((ColorFormat)var3.getShadowColor())
               .n5(
                  (com.aspose.slides.ms.System.q1.n5((double)(var4.c8()), 2) >= 0.5
                        ? com.aspose.slides.internal.o9b.c8.m3()
                        : com.aspose.slides.internal.o9b.c8.n5(196, 196, 196))
                     .o8()
               );
         }
      }

      String var6 = null;
      if (!com.aspose.slides.ms.System.d1.n5(var1.u9())) {
         var6 = var1.u9();
      } else if (!com.aspose.slides.ms.System.d1.n5(var1.a6())) {
         var6 = var1.a6();
      }

      if (var6 != null) {
         var6 = com.aspose.slides.ms.System.d1.n5(var6, "'", "");
         var0.setLatinFont(new FontData(var6));
         Presentation var8 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().n5(), Presentation.class);
         e4z var9 = var8.t9().n5(var6, (byte)2, 0, 18.0F, 0, false);
         var0.setSymbolFont(n5(var9, var6));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.h0())) {
         var0.setEastAsianFont(new FontData(com.aspose.slides.ms.System.d1.n5(var1.h0(), "'", "")));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.c8())) {
         var0.setComplexScriptFont(new FontData(com.aspose.slides.ms.System.d1.n5(var1.c8(), "'", "")));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.u3())) {
         var0.setEscapement(t2f.t4(var1.u3()));
      }

      if (var1.e2() == 2) {
         var0.setFontUnderline((byte)2);
      } else if (var1.e2() == 3) {
         var0.setFontUnderline((byte)3);
      }

      if (var1.k5() == 2) {
         var0.setStrikethroughType((byte)1);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.x8())) {
         if (com.aspose.slides.ms.System.d1.a6("normal", var1.x8())) {
            var0.setSpacing(0.0F);
         } else {
            var0.setSpacing((float)t2f.y4(var1.x8()));
         }
      }
   }

   private static FontData n5(e4z var0, String var1) {
      return var0.u3() ? new FontData(var1) : v6v.n5;
   }
}
