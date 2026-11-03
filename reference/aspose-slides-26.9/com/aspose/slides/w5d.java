package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class w5d {
   private static final Object n5 = new Object();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("uLnTx", "uLn", "uFillTx", "uFill");

   public static void n5(IPortionFormat var0, com.aspose.slides.internal.k4y.m0l var1, t5w var2) {
      if (var1 != null) {
         if (var1.c4() != null) {
            i3z.n5(var0.getLineFormat(), var1.c4());
         }

         x9f.n5(var0.getFillFormat(), var1.y2(), var2);
         w5i.n5(new w5d$1(var0), var1.y1(), var2);
         c4i.n5(var0.getHighlightColor(), var1.a0());
         if (var1.d2() != null) {
            switch (l6.n5(var1.d2().n5())) {
               case 0:
                  var0.setHardUnderlineLine((byte)0);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.r5w var3 = (com.aspose.slides.internal.k4y.r5w)var1.d2().l6();
                  i3z.n5(var0.getUnderlineLineFormat(), var3);
                  var0.setHardUnderlineLine((byte)1);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.d2().n5(), "\""}));
            }
         }

         if (var1.d5() != null) {
            switch (l6.n5(var1.d5().n5())) {
               case 2:
                  var0.setHardUnderlineFill((byte)0);
                  break;
               case 3:
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
         var0.setSmartTagClean(var1.j5());
         var0.setBookmarkId(var1.r4());
         ((PortionFormat)var0).n5(var1.z8());
         if ((var1.w1() & 4294967295L) != 4294967295L) {
            ((PortionFormat)var0).y4().n5(var1.w1());
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

         y1w.n5(var0, var1.e5(), var1.b3(), var2);
      }
   }

   public static void n5(IPortionFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.m0l> var1, g6c var2) {
      PortionFormat var3 = (PortionFormat)var0;
      synchronized (n5) {
         if (var0 == null || var3.y2()) {
            return;
         }
      }

      if (var2.c8()
         && com.aspose.slides.internal.v6g.k5.l6(var3.getParent_Immediate(), Portion.class)
         && var3.getPresentation() != null
         && var3.getParent_Immediate().getParent_Immediate() != null
         && var3.getParent_ISlideComponent() != null
         && var3.getParent_IPresentationComponent() != null) {
         c9g var7 = var3.r4();
         var3 = new PortionFormat();
         var3.l6((PortionFormat)var0);
         var3.l6(var7);
      }

      com.aspose.slides.internal.k4y.m0l var8 = (com.aspose.slides.internal.k4y.m0l)var1.invoke();
      i3z.n5(var3.getLineFormat(), new w5d$5(var8));
      x9f.n5(var3.getFillFormat(), new w5d$6(var8), var2);
      w5i.n5(var3.getEffectFormat(), new w5d$7(var8), var2);
      c4i.n5(var3.getHighlightColor(), new w5d$8(var8));
      switch (var3.isHardUnderlineLine()) {
         case -1:
            break;
         case 0:
            var8.u3("uLnTx");
            break;
         case 1:
            com.aspose.slides.internal.k4y.r5w var5 = (com.aspose.slides.internal.k4y.r5w)var8.u3("uLn").l6();
            i3z.l6(var3.getUnderlineLineFormat(), var5);
            break;
         default:
            throw new Exception();
      }

      switch (var3.isHardUnderlineFill()) {
         case -1:
            break;
         case 0:
            var8.k5("uFillTx");
            break;
         case 1:
            com.aspose.slides.internal.k4y.n5p var9 = (com.aspose.slides.internal.k4y.n5p)var8.k5("uFill").l6();
            x9f.n5(var3.getUnderlineFillFormat(), new w5d$9(var9), true, var2);
            break;
         default:
            throw new Exception();
      }

      var8.n5(var3.getKumimoji());
      var8.a6(var3.getLanguageId());
      var8.u9(var3.getAlternativeLanguageId());
      var8.n5(var3.getFontHeight());
      var8.l6(var3.getFontBold());
      var8.k5(var3.getFontItalic());
      var8.u3(var3.getFontUnderline());
      var8.a6(var3.getStrikethroughType());
      var8.l6(var3.getKerningMinimalSize());
      var8.u9(var3.getTextCapType());
      var8.k5(var3.getSpacing());
      var8.h0(var3.getNormaliseHeight());
      var8.u3(var3.getEscapement());
      var8.c8(var3.getProofDisabled());
      var8.k5(var3.getSmartTagClean());
      if ((var3.y4().n5() & 4294967295L) != 4294967295L) {
         var8.n5(var3.y4().n5());
      }

      var8.h0(var3.getBookmarkId());
      var8.l6(var3.x8());
      m9b.n5(var3.getLatinFont(), new w5d$10(var8));
      m9b.n5(var3.getEastAsianFont(), new w5d$11(var8));
      m9b.n5(var3.getComplexScriptFont(), new w5d$12(var8));
      m9b.n5(var3.getSymbolFont(), new w5d$2(var8));
      y1w.n5(var3, new w5d$3(var8), new w5d$4(var8), var2);
   }
}
