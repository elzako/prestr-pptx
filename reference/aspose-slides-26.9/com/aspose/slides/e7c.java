package com.aspose.slides;

class e7c {
   static void n5(IPortionFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      TextFrame var3 = var1.z3().h0();
      if (var3.s7().getThreeDFormat() == null || !((ThreeDFormat)var3.s7().getThreeDFormat()).n5(true)) {
         r9a.n5(var0.getLineFormat(), (byte)-1, false, var1);
      }

      m3e.n5((FillFormat)var0.getFillFormat(), var1);
      f7k.n5(var0.getEffectFormat(), var1);
      com.aspose.slides.internal.k0r.w8 var4 = var2.a6().l6();
      com.aspose.slides.internal.k0r.c3 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(195), com.aspose.slides.internal.k0r.c3.class);
      if (var5 != null) {
         var0.setFontHeight(var5.l6().n5());
      } else {
         var0.setFontHeight(36.0F);
      }

      com.aspose.slides.internal.k0r.l4 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(196), com.aspose.slides.internal.k0r.l4.class);
      if (var6 != null) {
         if (var6.l6().n5() > 1.0F) {
            var0.setSpacing(var0.getFontHeight() * (var6.l6().n5() - 1.0F));
         } else if (var6.l6().n5() < 1.0F) {
            var0.setSpacing(-(var0.getFontHeight() / 2.0F * (1.0F - var6.l6().n5())));
         }
      }

      com.aspose.slides.internal.k0r.p6 var7 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(255), com.aspose.slides.internal.k0r.p6.class);
      if (var7 != null) {
         if (var7.l6() && var7.c8()) {
            var0.setKerningMinimalSize(0.1F);
         }

         if (var7.u3() && var7.s7()) {
            var0.setFontBold((byte)1);
         }

         if (var7.a6() && var7.x8()) {
            var0.setFontItalic((byte)1);
         }

         if (var7.u9() && var7.n3()) {
            var0.setFontUnderline((byte)2);
         }

         if (var7.k5() && var7.t2() && com.aspose.slides.internal.v6g.k5.l6(var0, PortionFormat.class) && var2.u3().t2() == 144) {
            ((PortionFormat)var0).l6(true);
         }
      }

      com.aspose.slides.internal.k0r.y8 var8 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(197), com.aspose.slides.internal.k0r.y8.class);
      if (var8 != null) {
         String var9 = w6n.n5(var8.l6());
         var0.setLatinFont(new FontData(var9));
      }
   }

   static void n5(IPortionFormat var0, ITextFrameFormat var1, k1z var2) {
      if (var1.getThreeDFormat() == null || !((ThreeDFormat)var1.getThreeDFormat()).n5(true)) {
         r9a.n5(var0.getLineFormat(), var2.z3(), (byte)-1, var2.a6().n5());
      }

      m3e.n5(var0.getFillFormat(), var2);
      f7k.l6(var2);
      com.aspose.slides.internal.k0r.r3 var3 = var2.z8();
      if (!com.aspose.slides.ms.System.n1.k5(var0.getFontHeight())) {
         com.aspose.slides.internal.k0r.c3 var4 = new com.aspose.slides.internal.k0r.c3(com.aspose.slides.internal.n8e.y2.n5(var0.getFontHeight()));
         var3.l6().l6(var4);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var0.getSpacing())) {
         float var6 = 1.0F;
         if (var0.getSpacing() > 0.0F) {
            var6 = var0.getSpacing() / var0.getFontHeight() + 1.0F;
         } else if (var0.getSpacing() < 0.0F) {
            var6 = 1.0F - -var0.getSpacing() / (var0.getFontHeight() / 2.0F);
         }

         if (var6 != 1.0F) {
            com.aspose.slides.internal.k0r.l4 var5 = new com.aspose.slides.internal.k0r.l4(com.aspose.slides.internal.n8e.y2.n5(var6));
            var3.l6().l6(var5);
         }
      }

      if (var0.getLatinFont() != null) {
         com.aspose.slides.internal.k0r.y8 var7 = new com.aspose.slides.internal.k0r.y8(197, var0.getLatinFont().getFontName());
         var3.l6().l6(var7);
      }

      com.aspose.slides.internal.k0r.p6 var8 = new com.aspose.slides.internal.k0r.p6();
      var8.n5(true);
      var8.c8(true);
      if (var0.getFontBold() == 1) {
         var8.u3(true);
         var8.x8(true);
      }

      if (var0.getFontItalic() == 1) {
         var8.a6(true);
         var8.n3(true);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var0.getKerningMinimalSize())) {
         var8.l6(true);
         var8.t2(true);
      }

      if (var0.getFontUnderline() == 2) {
         var8.u9(true);
         var8.y4(true);
      }

      if (var0.getStrikethroughType() == 1) {
         var8.h0(true);
         var8.e2(true);
      }

      if (((PortionFormat)var0).z1() || var1.getWrapText() == 0) {
         var8.k5(true);
         var8.s7(true);
      }

      var3.l6().l6(var8);
   }
}
