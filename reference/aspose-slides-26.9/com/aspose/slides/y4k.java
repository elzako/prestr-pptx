package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class y4k {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "noAutofit", "normAutofit", "spAutoFit", "spcPct", "spcPts", "uLnTx", "uLn", "uFillTx", "uFill"
   );

   public static void n5(IChartTextFormat var0, com.aspose.slides.internal.k4y.j3z var1, t5w var2) {
      if (var1 != null) {
         n5(var0.getTextBlockFormat(), var1.k5());
         com.aspose.slides.internal.k4y.r1x var3 = var1.a6()[0];
         n5(var0.getParagraphFormat(), var3);
         if (var3.k5() != null) {
            n5(var0.getPortionFormat(), var3.k5().w1(), var2);
         }
      }
   }

   static void n5(IChartTextBlockFormat var0, com.aspose.slides.internal.k4y.f4l var1) {
      TextFrameFormat var2 = (TextFrameFormat)var0;
      var2.setTextVerticalType(var1.u9());
      var2.setAnchoringType(var1.z1());
      var2.setCenterText(var1.t4());
      var2.n5(new c0u(var1.c8(), var1.t2(), var1.s7(), var1.x8()));
      if (var1.h0() != 0) {
         var2.setWrapText((byte)(var1.h0() == 2 ? 1 : 0));
      }

      var2.setRotationAngle(var1.l6());
      var2.k5(var1.a6());
      var2.u3(var1.k5());
      var2.a6(var1.u3());
      var2.h0(var1.q0());
      var2.c8(var1.m1());
      if (var1.m3() != null) {
         switch (n5.n5(var1.m3().n5())) {
            case 0:
               var2.n5((byte)0);
               break;
            case 1:
               var2.n5((byte)1);
               break;
            case 2:
               var2.n5((byte)2);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.m3().n5(), "\""}));
         }
      }

      p6k var3 = var2.u9();
      var3.n5(var1.w1());
   }

   private static void n5(IChartParagraphFormat var0, com.aspose.slides.internal.k4y.r1x var1) {
      com.aspose.slides.internal.k4y.y4u var2 = var1.k5();
      if (var1 != null && var2 != null) {
         var0.setSpaceWithin(n5(var2.t4()));
         var0.setSpaceBefore(n5(var2.q0()));
         var0.setSpaceAfter(n5(var2.z3()));
         if (var2.j5() != null) {
            for (com.aspose.slides.internal.k4y.h6t var6 : var2.j5().l6()) {
               var0.getTabs().add(com.aspose.slides.ms.System.d2.k5(var6.n5()) ? 0.0 : var6.n5(), var6.l6());
            }
         }

         switch (var2.s7()) {
            case 0:
               var0.setAlignment(-1);
               break;
            case 1:
            default:
               var0.setAlignment(0);
               break;
            case 2:
               var0.setAlignment(1);
               break;
            case 3:
               var0.setAlignment(2);
               break;
            case 4:
               var0.setAlignment(3);
               break;
            case 5:
               var0.setAlignment(4);
               break;
            case 6:
               var0.setAlignment(5);
         }

         var0.setMarginLeft((float)var2.u9());
         var0.setMarginRight((float)var2.h0());
         var0.setIndent((float)var2.t2());
         var0.setDefaultTabSize((float)var2.x8());
         var0.setFontAlignment(var2.e2());
         var0.setRightToLeft(var2.n3());
         var0.setEastAsianLineBreak(var2.y4());
         var0.setLatinLineBreak(var2.t9());
         var0.setHangingPunctuation(var2.z1());
         ((ParagraphFormat)var0).t2().n5(var1.a6());
      }
   }

   private static float n5(com.aspose.slides.internal.k4y.g3j var0) {
      if (var0 != null && var0.n5() != null) {
         com.aspose.slides.internal.k4y.g7 var1 = var0.n5();
         switch (n5.n5(var1.n5())) {
            case 3:
               com.aspose.slides.internal.k4y.z3b var2 = (com.aspose.slides.internal.k4y.z3b)var1.l6();
               return com.aspose.slides.ms.System.n1.k5(var2.n5()) ? 100.0F : var2.n5();
            case 4:
               com.aspose.slides.internal.k4y.r1q var3 = (com.aspose.slides.internal.k4y.r1q)var1.l6();
               return com.aspose.slides.ms.System.n1.k5(var3.n5()) ? -12.0F : -var3.n5();
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      } else {
         return Float.NaN;
      }
   }

   static void n5(IChartPortionFormat var0, com.aspose.slides.internal.k4y.m0l var1, t5w var2) {
      if (var1 != null) {
         i3z.n5(var0.getLineFormat(), var1.c4());
         x9f.n5(var0.getFillFormat(), var1.y2(), var2);
         w5i.n5(var0.getEffectFormat(), var1.y1(), var2);
         c4i.n5(var0.getHighlightColor(), var1.a0());
         var0.setHardUnderlineLine((byte)-1);
         if (var1.d2() != null) {
            switch (n5.n5(var1.d2().n5())) {
               case 5:
                  var0.setHardUnderlineLine((byte)0);
                  break;
               case 6:
                  com.aspose.slides.internal.k4y.r5w var3 = (com.aspose.slides.internal.k4y.r5w)var1.d2().l6();
                  i3z.n5(var0.getUnderlineLineFormat(), var3);
                  var0.setHardUnderlineLine((byte)1);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.d2().n5(), "\""}));
            }
         }

         var0.setHardUnderlineFill((byte)-1);
         if (var1.d2() != null) {
            switch (n5.n5(var1.d5().n5())) {
               case 7:
                  var0.setHardUnderlineFill((byte)0);
                  break;
               case 8:
                  com.aspose.slides.internal.k4y.n5p var4 = (com.aspose.slides.internal.k4y.n5p)var1.d5().l6();
                  x9f.n5(var0.getUnderlineFillFormat(), var4.n5(), var2);
                  var0.setHardUnderlineFill((byte)1);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.d5().n5(), "\""}));
            }
         }

         var0.setKumimoji(var1.t2());
         var0.setLanguageId(var1.s7());
         var0.setAlternativeLanguageId(var1.x8());
         var0.setFontHeight(var1.n3());
         var0.setFontBold(var1.y4());
         var0.setFontItalic(var1.e2());
         var0.setFontUnderline(var1.t9());
         var0.setStrikethroughType(var1.z1());
         var0.setKerningMinimalSize(var1.t4());
         var0.setTextCapType(var1.q0());
         var0.setSpacing(var1.z3());
         var0.setNormaliseHeight(var1.m1());
         var0.setEscapement(var1.k7());
         var0.setProofDisabled(var1.m3());
         if ((var1.w1() & 4294967295L) != 0L) {
            ((ChartPortionFormat)var0).y4().n5(var1.w1());
         }

         if (var1.s3() != null) {
            var0.setLatinFont(m9b.n5(var1.s3()));
         }

         if (var1.p8() != null) {
            var0.setEastAsianFont(m9b.n5(var1.p8()));
         }

         if (var1.f2() != null) {
            var0.setComplexScriptFont(m9b.n5(var1.f2()));
         }

         if (var1.i1() != null) {
            var0.setSymbolFont(m9b.n5(var1.i1()));
         }
      }
   }

   public static void n5(IChartTextFormat var0, g7$n5 var1, String var2, g6c var3) {
      if (n5(var0)) {
         com.aspose.slides.internal.k4y.j3z var4 = (com.aspose.slides.internal.k4y.j3z)var1.n5(var2).l6();
         n5(var0, var4, var3);
      }
   }

   public static void n5(IChartTextFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.j3z> var1, g6c var2, IOverridableText var3) {
      if (var3 != null && (n5(var3) || n5(var3.getTextFormat()))) {
         com.aspose.slides.internal.k4y.j3z var4 = (com.aspose.slides.internal.k4y.j3z)var1.invoke();
         n5(var3.getTextFormat(), var4, var2);
      }
   }

   public static void n5(IChartTextFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.j3z> var1, g6c var2) {
      if (n5(var0)) {
         l6(var0, var1, var2);
      }
   }

   public static void l6(IChartTextFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.j3z> var1, g6c var2) {
      com.aspose.slides.internal.k4y.j3z var3 = (com.aspose.slides.internal.k4y.j3z)var1.invoke();
      n5(var0, var3, var2);
   }

   private static void n5(IChartTextFormat var0, com.aspose.slides.internal.k4y.j3z var1, g6c var2) {
      l6(var0.getTextBlockFormat(), var1.k5());
      l6(var0.getParagraphFormat(), var1.l6());
      n5(var0.getPortionFormat(), var1, var2);
   }

   private static void l6(IChartTextBlockFormat var0, com.aspose.slides.internal.k4y.f4l var1) {
      TextFrameFormat var2 = (TextFrameFormat)var0;
      var1.u3(var2.getTextVerticalType());
      var1.h0(var2.getAnchoringType());
      var1.c8(var2.getCenterText());
      var1.n5(var2.getRotationAngle());
      var1.k5(var2.x8());
      var1.n5(var2.e2());
      var1.l6(var2.t9());
      var1.t2(var2.t4());
      var1.s7(var2.j5());
      if (var2.getWrapText() != -1) {
         var1.n5(var2.getWrapText() == 1 ? 2 : 1);
      }

      switch (var2.getAutofitType()) {
         case -1:
         default:
            break;
         case 0:
            var1.n5("noAutofit");
            break;
         case 1:
            com.aspose.slides.internal.k4y.x5e var3 = (com.aspose.slides.internal.k4y.x5e)var1.n5("normAutofit").l6();
            break;
         case 2:
            var1.n5("spAutoFit");
      }

      var1.u3(var2.getTextVerticalType());
      c0u var5 = var2.u3().l6();
      var1.n5(var5.l6);
      var1.l6(var5.k5);
      var1.k5(var5.u3);
      var1.u3(var5.a6);
      p6k var4 = ((TextFrameFormat)var0).u9();
      var1.n5(var4.n5());
   }

   private static void l6(IChartParagraphFormat var0, com.aspose.slides.internal.k4y.r1x var1) {
      c6m var2 = ((ParagraphFormat)var0).t2();
      if (n5(var0) || var2.l6() != null) {
         var1.n5(var2.l6());
         if (n5(var0)) {
            com.aspose.slides.internal.k4y.y4u var3 = var1.n5();
            n5(var0.getSpaceWithin(), new y4k$1(var3));
            n5(var0.getSpaceBefore(), new y4k$5(var3));
            n5(var0.getSpaceAfter(), new y4k$6(var3));
            if (((ParagraphFormat)var0).x8() > 0) {
               com.aspose.slides.internal.k4y.d0c var4 = var3.u3();
               IGenericEnumerator var5 = var0.getTabs().iterator();

               try {
                  while (var5.hasNext()) {
                     ITab var6 = (ITab)var5.next();
                     com.aspose.slides.internal.k4y.h6t var7 = var4.n5();
                     var7.n5(var6.getAlignment());
                     var7.n5(var6.getPosition());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }

            switch (var0.getAlignment()) {
               case -1:
                  var3.l6(0);
                  break;
               case 0:
               default:
                  var3.l6(1);
                  break;
               case 1:
                  var3.l6(2);
                  break;
               case 2:
                  var3.l6(3);
                  break;
               case 3:
                  var3.l6(4);
                  break;
               case 4:
                  var3.l6(5);
                  break;
               case 5:
                  var3.l6(6);
            }

            var3.n5(var0.getMarginLeft());
            var3.l6(var0.getMarginRight());
            var3.k5(var0.getIndent());
            var3.u3(var0.getDefaultTabSize());
            var3.k5(var0.getFontAlignment());
            var3.n5(var0.getRightToLeft());
            var3.l6(var0.getEastAsianLineBreak());
            var3.k5(var0.getLatinLineBreak());
            var3.u3(var0.getHangingPunctuation());
         }
      }
   }

   private static void n5(float var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.g3j> var1) {
      if (!com.aspose.slides.ms.System.n1.k5(var0)) {
         com.aspose.slides.internal.k4y.g3j var2 = (com.aspose.slides.internal.k4y.g3j)var1.invoke();
         if (var0 < 0.0F) {
            com.aspose.slides.internal.k4y.r1q var3 = (com.aspose.slides.internal.k4y.r1q)var2.n5("spcPts").l6();
            var3.n5(-var0);
         } else {
            com.aspose.slides.internal.k4y.z3b var4 = (com.aspose.slides.internal.k4y.z3b)var2.n5("spcPct").l6();
            var4.n5(var0);
         }
      }
   }

   private static void n5(IChartPortionFormat var0, com.aspose.slides.internal.k4y.j3z var1, g6c var2) {
      q1z var3 = ((ChartPortionFormat)var0).y4();
      if (var1.a6().length == 0) {
         var1.l6();
      }

      if (var1.a6()[0].k5() == null) {
         var1.a6()[0].n5();
      }

      com.aspose.slides.internal.k4y.m0l var4 = var1.a6()[0].k5().a6();
      if (n5(var0)) {
         i3z.n5(var0.getLineFormat(), new y4k$7(var4));
         x9f.n5(var0.getFillFormat(), new y4k$8(var4), var2);
         w5i.n5(var0.getEffectFormat(), new y4k$9(var4), var2);
         c4i.n5(var0.getHighlightColor(), new y4k$10(var4));
         if (var0.isHardUnderlineLine() != -1) {
            if (var0.isHardUnderlineLine() == 1) {
               com.aspose.slides.internal.k4y.r5w var5 = (com.aspose.slides.internal.k4y.r5w)var4.u3("uLn").l6();
               i3z.l6(var0.getUnderlineLineFormat(), var5);
            } else {
               var4.u3("uLnTx");
            }
         }

         if (var0.isHardUnderlineFill() != -1) {
            if (var0.isHardUnderlineFill() == 1) {
               com.aspose.slides.internal.k4y.n5p var6 = (com.aspose.slides.internal.k4y.n5p)var4.k5("uFill").l6();
               x9f.n5(var0.getUnderlineFillFormat(), new y4k$11(var6), var2);
            } else {
               var4.k5("uFillTx");
            }
         }

         var4.n5(var0.getKumimoji());
         var4.a6(var0.getLanguageId());
         var4.u9(var0.getAlternativeLanguageId());
         var4.n5(var0.getFontHeight());
         var4.l6(var0.getFontBold());
         var4.k5(var0.getFontItalic());
         var4.u3(var0.getFontUnderline());
         var4.a6(var0.getStrikethroughType());
         var4.l6(var0.getKerningMinimalSize());
         var4.u9(var0.getTextCapType());
         var4.k5(var0.getSpacing());
         var4.h0(var0.getNormaliseHeight());
         var4.u3(var0.getEscapement());
         var4.c8(var0.getProofDisabled());
         var4.n5(var3.n5());
         m9b.n5(var0.getLatinFont(), new y4k$12(var4));
         m9b.n5(var0.getEastAsianFont(), new y4k$2(var4));
         m9b.n5(var0.getComplexScriptFont(), new y4k$3(var4));
         m9b.n5(var0.getSymbolFont(), new y4k$4(var4));
         if (var1.a6()[0].a6() == null) {
            var1.a6()[0].n5(var4);
         }
      }
   }

   static boolean n5(IOverridableText var0) {
      return var0 != null && var0.getTextFrameForOverriding() != null && var0.getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() != -1;
   }

   static boolean n5(IChartTextFormat var0) {
      return var0 == null
         ? false
         : n5(var0.getTextBlockFormat())
            || n5(var0.getParagraphFormat())
            || n5(var0.getPortionFormat())
            || ((ParagraphFormat)var0.getParagraphFormat()).t2().l6() != null;
   }

   static boolean n5(IChartTextBlockFormat var0) {
      return !((TextFrameFormat)var0).r4();
   }

   static boolean n5(IChartParagraphFormat var0) {
      return !((ParagraphFormat)var0).s7();
   }

   static boolean n5(IChartPortionFormat var0) {
      return !((ChartPortionFormat)var0).q0();
   }

   static boolean n5(IChartPortionFormat var0, IChartPortionFormat var1) {
      return com.aspose.slides.internal.n8e.v4.n5(var0.getAlternativeLanguageId(), var1.getAlternativeLanguageId())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getComplexScriptFont(), var1.getComplexScriptFont())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getEastAsianFont(), var1.getEastAsianFont())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getEffectFormat(), var1.getEffectFormat())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getEscapement(), var1.getEscapement())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getFillFormat(), var1.getFillFormat())
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.getFontUnderline()), (float)(var1.getFontUnderline()))
         && com.aspose.slides.internal.n8e.v4.n5(var0.getHighlightColor(), var1.getHighlightColor())
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.isHardUnderlineFill()), (float)(var1.isHardUnderlineFill()))
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.isHardUnderlineLine()), (float)(var1.isHardUnderlineLine()))
         && com.aspose.slides.internal.n8e.v4.n5(var0.getKerningMinimalSize(), var1.getKerningMinimalSize())
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.getKumimoji()), (float)(var1.getKumimoji()))
         && com.aspose.slides.internal.n8e.v4.n5(var0.getLanguageId(), var1.getLanguageId())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getLatinFont(), var1.getLatinFont())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getLineFormat(), var1.getLineFormat())
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.getNormaliseHeight()), (float)(var1.getNormaliseHeight()))
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.getProofDisabled()), (float)(var1.getProofDisabled()))
         && com.aspose.slides.internal.n8e.v4.n5(var0.getSpacing(), var1.getSpacing())
         && com.aspose.slides.internal.n8e.v4.n5((float)(var0.getStrikethroughType()), (float)(var1.getStrikethroughType()))
         && com.aspose.slides.internal.n8e.v4.n5(var0.getSymbolFont(), var1.getSymbolFont())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getUnderlineFillFormat(), var1.getUnderlineFillFormat())
         && com.aspose.slides.internal.n8e.v4.n5(var0.getUnderlineLineFormat(), var1.getUnderlineLineFormat());
   }
}
