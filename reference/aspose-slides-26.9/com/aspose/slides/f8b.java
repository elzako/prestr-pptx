package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class f8b {
   private static final SortedList<Integer, String> n5 = new SortedList<>();

   static void n5(com.aspose.slides.internal.k0r.n9q var0, com.aspose.slides.internal.k0r.d2n var1, ParagraphFormat var2, d5f var3) {
      if (var0 != null && var2 != null) {
         v6v var4 = var3.n5().z1().n5();
         BulletFormat var5 = var2.l6();
         byte var6 = var0.n5();
         if (var6 == -1) {
            var5.setType((byte)-1);
         } else {
            var5.setType((byte)(var6 == 1 ? 1 : 0));
         }

         var5.setBulletHardColor(var0.k5());
         var5.setBulletHardFont(var0.l6());
         if (var0.a6().l6()) {
            if (var0.a6().n5() == 0) {
               var5.h0().n5((short)32);
            } else {
               var5.h0().n5(var0.a6().n5());
            }
         }

         if (var0.u9().l6() && (var0.u9().n5() & 65535) != 65535) {
            var5.setFont((FontData)var4.l6(var0.u9().n5() & 65535).l6());
         }

         if (var0.u3() == 0) {
            var5.setHeight(100.0F);
         } else if (var0.h0().l6() && var0.h0().n5() > 24 && var0.h0().n5() < 401) {
            var5.setHeight(var0.h0().n5().shortValue());
         }

         if (var0.c8() != null) {
            u0b.n5(var5.getColor(), var0.c8());
         }

         if (var1 != null) {
            if (var1.l6() == 1) {
               var2.l6().setType((byte)2);
               var2.l6().setNumberedBulletStyle((byte)3);
               var2.l6().setNumberedBulletStartWith((short)1);
            }

            if (var1.k5() != null) {
               var2.l6().setNumberedBulletStyle((byte)var1.k5().n5());
               var2.l6().setNumberedBulletStartWith(var1.k5().l6());
               var2.l6().setType((byte)2);
            }

            if (var1.l6() == 0 && var1.n5().l6() && (var1.n5().n5() & '\uffff') != 65535) {
               var2.l6().setType((byte)3);
               var2.l6().getPicture().setImage(var3.s7().get_Item(var1.n5().n5().intValue()).k5());
            }
         }

         if (var0.t2().l6()) {
            var2.setAlignment(u9(var0.t2().n5()));
         } else {
            var2.setAlignment(-1);
         }

         if (var0.s7().l6()) {
            var2.setSpaceWithin(n5(var0.s7().n5()));
         }

         if (var0.x8().l6()) {
            var2.setSpaceBefore(n5(var0.x8().n5()));
         }

         if (var0.n3().l6()) {
            var2.setSpaceAfter(n5(var0.n3().n5()));
         }

         if (var0.e2().l6() || var0.y4().l6()) {
            f8b$n5 var7 = new f8b$n5();
            var0.y4().n5(var7.n5);
            var0.e2().n5(var7.l6);
            n5(var7);
            var2.setMarginLeft(var7.k5);
            var2.setIndent(var7.u3);
         }

         if (var0.t9().l6()) {
            var2.setDefaultTabSize(l6(var0.t9().n5()));
         }

         var2.getTabs().clear();
         if (var0.z1() != null) {
            IGenericEnumerator var15 = var0.z1().iterator();

            try {
               while (var15.hasNext()) {
                  com.aspose.slides.internal.k0r.m5l var8 = (com.aspose.slides.internal.k0r.m5l)var15.next();
                  double var9 = var8.n5() / 8.0;
                  int var11 = u3(var8.k5());
                  var2.getTabs().add(var9, var11);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                  var15.dispose();
               }
            }
         }

         if (var0.t4().l6()) {
            var2.setFontAlignment(l6(var0.t4().n5()));
         }

         if (var0.k7().l6()) {
            var2.setRightToLeft((byte)(var0.k7().n5() == 1 ? 1 : 0));
         }

         var2.setEastAsianLineBreak(var0.q0());
         var2.setHangingPunctuation(var0.m1());
         var2.c8().n5(var0.z3() != -1);
         var2.c8().l6(var0.z3() == 1);
      }
   }

   static void n5(IParagraphFormat var0, com.aspose.slides.internal.k0r.n9q var1, g6o var2) {
      n5(var0, var1, var2, null);
   }

   static void n5(IParagraphFormat var0, com.aspose.slides.internal.k0r.n9q var1, g6o var2, TextFrameFormat var3) {
      if (var0 != null) {
         IBulletFormat var4 = var0.getBullet();
         if (var4.getType() != -1) {
            var1.n5((byte)(var4.getType() != 0 ? 1 : 0));
         } else {
            var1.n5((byte)-1);
         }

         var1.l6(var0.getBullet().isBulletHardFont());
         var1.k5(var0.getBullet().isBulletHardColor());
         if (!com.aspose.slides.ms.System.n1.k5(var0.getBullet().getHeight())) {
            var1.u3((byte)1);
            var1.k5(new com.aspose.slides.ms.System.o5<>((short)var0.getBullet().getHeight()));
         } else {
            var1.u3((byte)-1);
            var1.k5(new com.aspose.slides.ms.System.o5<>());
         }

         if ((short)var0.getBullet().getChar() != -1) {
            var1.n5(new com.aspose.slides.ms.System.o5<>((short)var0.getBullet().getChar()));
         } else {
            var1.n5(new com.aspose.slides.ms.System.o5<>());
         }

         v6v var5 = var2.n5().z1().n5();
         if (var0.getBullet().getFont() != null) {
            IFontData var6 = var2.n5(var0.getBullet().getFont(), null);
            int var7 = var5.n5(0, var6);
            var1.l6(new com.aspose.slides.ms.System.o5<>(var5.k5(var7)));
         } else if (var0.getBullet().isBulletHardFont() == 0) {
            var1.l6(new com.aspose.slides.ms.System.o5<>(65535));
         }

         if (var0.getBullet().isBulletHardColor() == 1) {
            var1.n5(u0b.n5(var0.getBullet().getColor()));
         }

         if (var0.getAlignment() != -1) {
            var1.u3(new com.aspose.slides.ms.System.o5<>(h0(var0.getAlignment())));
         } else {
            var1.u3(new com.aspose.slides.ms.System.o5<>());
         }

         float var15 = var0.getSpaceWithin();
         if (!com.aspose.slides.ms.System.n1.k5(var15)) {
            if (var15 > 0.0F && var3 != null && var3.t2() == 1 && !com.aspose.slides.ms.System.n1.k5(var3.y4())) {
               var15 = com.aspose.slides.internal.n8e.v4.n5(var15 - var3.y4() * 100.0F, 0.0F, Float.POSITIVE_INFINITY);
            }

            var1.a6(new com.aspose.slides.ms.System.o5<>(n5(var15)));
         } else {
            var1.a6(new com.aspose.slides.ms.System.o5<>());
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getSpaceBefore())) {
            var1.u9(new com.aspose.slides.ms.System.o5<>(n5(var0.getSpaceBefore())));
         } else {
            var1.u9(new com.aspose.slides.ms.System.o5<>());
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getSpaceAfter())) {
            var1.h0(new com.aspose.slides.ms.System.o5<>(n5(var0.getSpaceAfter())));
         } else {
            var1.h0(new com.aspose.slides.ms.System.o5<>());
         }

         f8b$n5 var16 = new f8b$n5();
         var16.k5 = var0.getMarginLeft();
         var16.u3 = var0.getIndent();
         l6(var16);
         var1.c8(var16.n5.k5());
         var1.t2(var16.l6.k5());
         if (!com.aspose.slides.ms.System.d2.k5(var0.getDefaultTabSize())) {
            var1.s7(new com.aspose.slides.ms.System.o5<>(l6(var0.getDefaultTabSize())));
         } else {
            var1.s7(new com.aspose.slides.ms.System.o5<>());
         }

         if (((ParagraphFormat)var0).x8() > 0) {
            var1.n5(new com.aspose.slides.internal.k0r.k3h());
            IGenericEnumerator var8 = var0.getTabs().iterator();

            try {
               while (var8.hasNext()) {
                  ITab var9 = (ITab)var8.next();
                  short var10 = com.aspose.slides.internal.v6g.k5.l6(var9.getPosition() * 8.0, 14);
                  int var11 = a6(var9.getAlignment());
                  var1.z1().n5(new com.aspose.slides.internal.k0r.m5l(var10, var11));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         } else {
            var1.n5((com.aspose.slides.internal.k0r.k3h)null);
         }

         if (var0.getFontAlignment() != -1) {
            var1.x8(new com.aspose.slides.ms.System.o5<>(k5(var0.getFontAlignment())));
         } else {
            var1.x8(new com.aspose.slides.ms.System.o5<>());
         }

         if (var0.getRightToLeft() != -1) {
            var1.n3(new com.aspose.slides.ms.System.o5<>(var0.getRightToLeft() == 1 ? 1 : 0));
         } else {
            var1.n3(new com.aspose.slides.ms.System.o5<>());
         }

         var1.a6(var0.getEastAsianLineBreak());
         var1.h0(var0.getHangingPunctuation());
         if (((ParagraphFormat)var0).c8().n5()) {
            var1.u9((byte)(((ParagraphFormat)var0).c8().l6() ? 1 : 0));
         }
      }
   }

   static void n5(com.aspose.slides.internal.k0r.u7f var0, PortionFormat var1, v6v var2, p3f var3) {
      var1.setFontBold(var0.n5());
      var1.setFontItalic(var0.l6());
      if (var0.k5() != -1) {
         var1.setFontUnderline((byte)(var0.k5() == 1 ? 2 : 0));
      } else {
         var1.setFontUnderline((byte)-1);
      }

      var1.setKumimoji(var0.u9());
      if (var0.t2().l6() && com.aspose.slides.ms.System.o5.l6(var0.t2(), new com.aspose.slides.ms.System.o5<>(65535)) && var2.k5() > (var0.t2().n5() & 65535)) {
         var1.setLatinFont(var2.l6(var0.t2().n5() & 65535).l6());
      }

      if (var0.c8().l6()) {
         var1.t4().l6().u9().n5(var0.c8().k5());
      }

      if (var0.s7().l6() && com.aspose.slides.ms.System.o5.l6(var0.s7(), new com.aspose.slides.ms.System.o5<>(65535))) {
         var1.setEastAsianFont(var2.l6(var0.s7().n5() & 65535).l6());
      }

      if (var0.x8().l6() && com.aspose.slides.ms.System.o5.l6(var0.x8(), new com.aspose.slides.ms.System.o5<>(65535))) {
         var1.q0().n5(var2.l6(var0.x8().n5() & 65535).l6());
      }

      if (var0.n3().l6() && com.aspose.slides.ms.System.o5.l6(var0.n3(), new com.aspose.slides.ms.System.o5<>(65535))) {
         var1.setSymbolFont(var2.l6(var0.n3().n5() & 65535).l6());
      }

      if (var0.y4().l6() && var0.y4().n5() != 0) {
         var1.setFontHeight(var0.y4().n5().shortValue());
      }

      if (var0.e2() != null && var0.e2().l6() != 255L) {
         var1.getFillFormat().setFillType((byte)1);
         u0b.n5(var1.getFillFormat().getSolidFillColor(), var0.e2());
      }

      if (var0.t9().l6()) {
         var1.setEscapement(var0.t9().n5().shortValue());
      }

      boolean var4 = var0.h0() == 1;
      if (var0.u3() != 1 && !var4) {
         if (var0.u3() == 0) {
            ((EffectFormat)var1.getEffectFormat()).a6();
         }
      } else {
         if (var4) {
            var1.a6().getSolidFillColor().setSchemeColor(s1f.u3(0));
         }

         OuterShadow var5 = new OuterShadow(null);
         var5.setDistance(3.0);
         var5.setBlurRadius(3.0);
         var5.setDirection(45.0F);
         var5.setRectangleAlign((byte)0);
         ((ColorFormat)var5.getShadowColor()).setSchemeColor(s1f.u3(2));
         if (!var4 && var1.getFillFormat().getFillType() == 1 && (var3 == null || var3.l6() == null || var3.l6().m3() != 5)) {
            ((ColorFormat)var5.getShadowColor())
               .n5(
                  (com.aspose.slides.ms.System.q1.n5((double)(((ColorFormat)var1.getFillFormat().getSolidFillColor()).u3().c8()), 2) >= 0.5
                        ? com.aspose.slides.internal.o9b.c8.m3()
                        : com.aspose.slides.internal.o9b.c8.n5(110, 0, 0, 0))
                     .o8()
               );
         }

         var1.getEffectFormat().setOuterShadowEffect(var5);
      }
   }

   public static void n5(PortionFormat var0, p3f var1) {
      if (var1.t9() && var0.getEastAsianFont() != null) {
         var0.setComplexScriptFont(var0.getEastAsianFont());
         var0.setEastAsianFont(null);
      }

      if (var1.l6() != null
         && var1.l6().k7() >= 0
         && var0.getEffectFormat() != null
         && var0.getEffectFormat().getOuterShadowEffect() != null
         && var0.getFillFormat().getFillType() == 1
         && com.aspose.slides.ms.System.q1.n5((double)(((ColorFormat)var0.getFillFormat().getSolidFillColor()).u3().c8()), 2) <= 0.5) {
         ((ColorFormat)var0.getEffectFormat().getOuterShadowEffect().getShadowColor()).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      }
   }

   static void n5(IPortionFormat var0, com.aspose.slides.internal.k0r.u7f var1, g6o var2) {
      n5(var0, var1, var2, null);
   }

   static void n5(IPortionFormat var0, com.aspose.slides.internal.k0r.u7f var1, g6o var2, IColorFormat var3) {
      if (var0 != null) {
         var1.n5(var0.getFontBold());
         var1.l6(var0.getFontItalic());
         if (var0.getFontUnderline() != -1) {
            var1.k5((byte)(var0.getFontUnderline() != 0 ? 1 : 0));
         } else {
            var1.k5((byte)-1);
         }

         if (((EffectFormat)var0.getEffectFormat()).u3() && var0.getEffectFormat().isNoEffects()) {
            var1.u3((byte)0);
         } else {
            var1.u3(
               (byte)(var0.getEffectFormat().getInnerShadowEffect() == null
                     && var0.getEffectFormat().getOuterShadowEffect() == null
                     && var0.getEffectFormat().getPresetShadowEffect() == null
                  ? -1
                  : 1)
            );
            if (var0.getEffectFormat().getOuterShadowEffect() != null && var0.getEffectFormat().getOuterShadowEffect().getShadowColor().getColorType() == -1) {
               var1.u3((byte)0);
            }
         }

         var1.u9(var0.getKumimoji());
         v6v var4 = var2.n5().z1().n5();
         if (var0.getLatinFont() != null) {
            IFontData var5 = var2.n5(var0.getLatinFont(), null);
            int var6 = var4.n5(0, var5);
            var1.l6(new com.aspose.slides.ms.System.o5<>(var4.k5(var6)));
         }

         if (var0.getEastAsianFont() != null) {
            IFontData var7 = var2.n5(var0.getEastAsianFont(), var0.getLanguageId());
            int var11 = var4.n5(1, var7);
            var1.k5(new com.aspose.slides.ms.System.o5<>(var4.k5(var11)));
         }

         if (var0.getSymbolFont() != null) {
            IFontData var8 = var2.n5(var0.getSymbolFont(), null);
            int var12 = var4.n5(0, var8);
            var1.a6(new com.aspose.slides.ms.System.o5<>(var4.k5(var12)));
         }

         if (((PortionFormat)var0).q0().l6() != null) {
            IFontData var9 = var2.n5(((PortionFormat)var0).q0().l6(), null);
            int var13 = var4.n5(0, var9);
            var1.u3(new com.aspose.slides.ms.System.o5<>(var4.k5(var13)));
         } else if (var0.getLatinFont() != null) {
            IFontData var10 = var2.n5(var0.getLatinFont(), null);
            int var14 = var4.n5(0, var10);
            var1.u3(new com.aspose.slides.ms.System.o5<>(var4.k5(var14)));
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getFontHeight())) {
            var1.u9(new com.aspose.slides.ms.System.o5<>((short)var0.getFontHeight()));
         } else {
            var1.u9(new com.aspose.slides.ms.System.o5<>());
         }

         if (var0.getFillFormat().getFillType() == 1) {
            var1.n5(u0b.n5(var0.getFillFormat().getSolidFillColor()));
         } else if (var3 != null) {
            var1.n5(u0b.n5(var3));
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getEscapement())) {
            var1.h0(new com.aspose.slides.ms.System.o5<>((short)var0.getEscapement()));
         }
      }
   }

   public static void l6(IPortionFormat var0, com.aspose.slides.internal.k0r.u7f var1, g6o var2) {
      v6v var3 = var2.n5().z1().n5();
      if (var0.getComplexScriptFont() != null && com.aspose.slides.ms.System.o5.n5(var1.s7(), null)) {
         IFontData var4 = var2.n5(var0.getComplexScriptFont(), var0.getLanguageId());
         int var5 = var3.n5(2, var4);
         var1.k5(new com.aspose.slides.ms.System.o5<>(var3.k5(var5)));
      }
   }

   static void n5(com.aspose.slides.internal.k0r.x4a var0, ParagraphFormat var1, PortionFormat var2) {
      if (var2 != null) {
         if (var0.n5().l6()) {
            var2.setLanguageId(n5(var0.n5().n5()));
         }

         if (var0.l6().l6()) {
            var2.setAlternativeLanguageId(n5(var0.l6().n5()));
         }
      }
   }

   static void n5(com.aspose.slides.internal.k0r.x4a var0, IParagraphFormat var1, IPortionFormat var2) {
      if (!"".equals(var2.getLanguageId())) {
         var0.n5(n5(var2.getLanguageId()).k5());
      }

      if (!"".equals(var2.getAlternativeLanguageId())) {
         var0.l6(n5(var2.getAlternativeLanguageId()).k5());
      }
   }

   static String n5(int var0) {
      if ((var0 & 65535) != 0) {
         try {
            com.aspose.slides.internal.x7n.l6 var1 = new com.aspose.slides.internal.x7n.l6(var0 & 65535);
            return var1.s7();
         } catch (RuntimeException var2) {
            if (n5.containsKey(var0)) {
               return n5.get_Item(var0);
            }
         }
      }

      return "en-US";
   }

   static com.aspose.slides.ms.System.o5<Integer> n5(String var0) {
      if (var0 == null) {
         return new com.aspose.slides.ms.System.o5<>();
      }

      com.aspose.slides.internal.x7n.l6 var1;
      try {
         var1 = new com.aspose.slides.internal.x7n.l6(var0);
      } catch (RuntimeException var3) {
         if (n5.containsValue(var0)) {
            return new com.aspose.slides.ms.System.o5<>(n5.getKeys().get_Item(n5.indexOfValue(var0)));
         }

         return new com.aspose.slides.ms.System.o5<>();
      }

      return var1.t2() < 1024 ? new com.aspose.slides.ms.System.o5<>() : new com.aspose.slides.ms.System.o5<>(var1.t2());
   }

   static com.aspose.slides.internal.k0r.o6t n5(ITextStyle var0, g6o var1) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.o6t var2 = new com.aspose.slides.internal.k0r.o6t();
      if (((TextStyle)var0).a6().l6()) {
         var2.w1().n5((short)((TextStyle)var0).a6().n5().intValue());
      }

      for (int var3 = 0; var3 < 5; var3++) {
         IParagraphFormat var4 = var0.getLevel(var3);
         if (var4 == null) {
            break;
         }

         com.aspose.slides.internal.k0r.l1b var5 = new com.aspose.slides.internal.k0r.l1b(var3 & 65535);
         var2.u3().addItem(var5);
         n5(var4, var5.n5(), var1);
         n5(var4.getDefaultPortionFormat(), var5.l6(), var1);
      }

      return var2.u3().size() < 1 ? null : var2;
   }

   static void n5(com.aspose.slides.internal.k0r.o6t var0) {
      if (var0 != null) {
         ;
      }
   }

   static void n5(com.aspose.slides.internal.k0r.o6t var0, ITextStyle var1, g6o var2) {
      if (var0 != null) {
         if (var0.k5()) {
            com.aspose.slides.internal.k0r.o6t var3 = n5(var1, var2);
            if (var3 != null) {
               var0.u3().clear();
               var0.u3().addRange(var3.u3());
               var0.n5(false);
            }

            if (var0.u3().size() > 0 && var0.y2() < 5) {
               var0.u3().get_Item(0).l6().n5(true);
            }
         }
      }
   }

   static ParagraphFormat n5(
      TextStyle var0, com.aspose.slides.internal.k0r.n9q var1, com.aspose.slides.internal.k0r.d2n var2, com.aspose.slides.internal.k0r.u7f var3, d5f var4
   ) {
      ParagraphFormat var5 = new ParagraphFormat(var0);
      PortionFormat var6 = (PortionFormat)var5.getDefaultPortionFormat();
      n5(var1, var2, var5, var4);
      n5(var3, var6, var4.n5().z1().n5(), null);
      return var5;
   }

   static void n5(com.aspose.slides.internal.k0r.l1b var0, ParagraphFormat var1) {
      if (var0 != null) {
         if (var1 != null) {
            com.aspose.slides.internal.k0r.n9q var2 = var0.n5();
            PortionFormat var3 = var1.u3();
            if (var3 != null) {
               com.aspose.slides.internal.k0r.u7f var4 = var0.l6();
               if (var4.u3() == 0) {
                  var3.getEffectFormat().disableOuterShadowEffect();
               }
            }
         }
      }
   }

   static int l6(int var0) {
      switch (var0) {
         case 0:
            return 4;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         default:
            return 0;
      }
   }

   static int k5(int var0) {
      switch (var0) {
         case -1:
            return 0;
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 0;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   static int u3(int var0) {
      return (var0 & 4294967295L) > 3L ? 0 : var0;
   }

   static int a6(int var0) {
      return (var0 & 4294967295L) > 3L ? 0 : var0;
   }

   static float n5(short var0) {
      return var0 < 0 ? var0 / 8.0F : var0;
   }

   static short n5(float var0) {
      return com.aspose.slides.internal.v6g.k5.l6(var0 < 0.0F ? var0 * 8.0F : var0, 13);
   }

   static float l6(short var0) {
      return var0 / 8.0F;
   }

   static short l6(float var0) {
      return com.aspose.slides.internal.v6g.k5.l6(var0 * 8.0F, 13);
   }

   static void n5(f8b$n5 var0) {
      boolean var1 = var0.n5.l6();
      boolean var2 = var0.l6.l6();
      if (var1) {
         if (var2) {
            var0.k5 = l6(var0.n5.n5());
            var0.u3 = l6(var0.l6.n5()) - var0.k5;
         } else {
            var0.k5 = l6(var0.n5.n5());
            var0.u3 = -var0.k5;
         }
      } else if (var2) {
         var0.k5 = 0.0F;
         var0.u3 = -l6(var0.l6.n5());
      } else {
         var0.k5 = Float.NaN;
         var0.u3 = Float.NaN;
      }
   }

   static void l6(f8b$n5 var0) {
      boolean var1 = !com.aspose.slides.ms.System.n1.k5(var0.k5);
      boolean var2 = !com.aspose.slides.ms.System.n1.k5(var0.u3);
      if (var1) {
         if (var2) {
            var0.n5 = new com.aspose.slides.ms.System.o5<>(l6(var0.k5));
            var0.l6 = new com.aspose.slides.ms.System.o5<>((short)(var0.n5.n5() + l6(var0.u3)));
         } else {
            var0.n5 = new com.aspose.slides.ms.System.o5<>(l6(var0.k5));
            var0.n5.n5(var0.l6);
         }
      } else if (var2) {
         if (var0.u3 < 0.0F) {
            var0.l6 = new com.aspose.slides.ms.System.o5<>(l6(-var0.u3));
         }

         var0.l6 = new com.aspose.slides.ms.System.o5<>(l6(var0.u3));
         var0.n5 = new com.aspose.slides.ms.System.o5<>((short)0);
      } else {
         var0.n5 = new com.aspose.slides.ms.System.o5<>();
         var0.l6 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   private static int u9(int var0) {
      switch (var0) {
         case -1:
            return -1;
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 5;
         case 5:
            return 3;
         case 6:
            return 4;
         default:
            throw new ArgumentOutOfRangeException(
               com.aspose.slides.ms.System.d1.n5(
                  "alignment: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k0r.u4k.class, var0)}
               )
            );
      }
   }

   private static int h0(int var0) {
      switch (var0) {
         case -1:
            return -1;
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 6;
         case 5:
            return 4;
         default:
            throw new ArgumentOutOfRangeException(
               com.aspose.slides.ms.System.d1.n5("alignment: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(TextAlignment.class, var0)})
            );
      }
   }

   static {
      n5.addItem(30724, "zh");
   }
}
