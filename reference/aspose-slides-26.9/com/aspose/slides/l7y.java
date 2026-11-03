package com.aspose.slides;

final class l7y extends i2k {
   private final r1f u9;

   public l7y(
      r1f var1,
      m4i var2,
      com.aspose.slides.internal.o9b.y1 var3,
      Hyperlink var4,
      TextParam var5,
      y6e var6,
      y6e var7,
      boolean var8,
      boolean var9,
      y6e var10,
      r4d var11,
      a1v var12,
      byte var13,
      f3v var14,
      ILineFormatEffectiveData var15,
      d2k var16,
      IFillFormatEffectiveData var17,
      byte var18,
      c9g var19,
      y6e var20,
      String var21,
      float var22,
      float var23,
      byte var24
   ) {
      super(
         var2,
         var3.y4(),
         var4,
         var5,
         new b4o(com.aspose.slides.ms.System.d1.n5),
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16.u3(),
         var17,
         var18,
         var19,
         var20,
         1,
         var2.n5.h0(),
         var21,
         var22,
         var23,
         var24,
         var3.s7(),
         com.aspose.slides.ms.System.d1.n5
      );
      this.u9 = var1;
   }

   @Override
   public final r1f n5() {
      return this.u9;
   }

   public static l7y n5(
      j5u var0,
      r1f var1,
      m4i var2,
      Hyperlink var3,
      y6e var4,
      y6e var5,
      y6e var6,
      r4d var7,
      a1v var8,
      d2k var9,
      y6e var10,
      float var11,
      float var12,
      e2n var13,
      float var14
   ) {
      byte var15 = 0;
      IFillFormatEffectiveData var16 = null;
      ILineFormatEffectiveData var17 = null;
      byte[] var18 = new byte[]{0};
      ILineFormatEffectiveData[] var19 = new ILineFormatEffectiveData[]{var17};
      IFillFormatEffectiveData[] var20 = new IFillFormatEffectiveData[]{var16};
      j5u.n5(var2.n5, var18, var19, var20);
      var15 = var18[0];
      var17 = var19[0];
      var16 = var20[0];
      MathPortion var21 = com.aspose.slides.internal.v6g.k5.n5(var2.k5, MathPortion.class);
      if ((var15 == 0 || var15 == -1) && var21 != null) {
         IPortionFormat var22 = var0.n5(var21.getMathParagraph());
         if (var22 != null) {
            c9g var23 = com.aspose.slides.internal.v6g.k5.n5(((PortionFormat)var22).getEffective(), c9g.class);
            if (var23 != null) {
               var18[0] = var15;
               var19[0] = var17;
               var20[0] = var16;
               j5u.n5(var23, var18, var19, var20);
               var15 = var18[0];
               var17 = var19[0];
               var16 = var20[0];
            }
         }
      }

      boolean var33 = var0.h0 != 0.0F || !com.aspose.slides.ms.System.n1.k5(var0.n5.getTextFrameFormat().getRotationAngle());
      boolean var34 = var0.n5.getTextFrameFormat().getTextVerticalType() == 1;
      boolean var24 = !var33 || !var34 && !var0.u3();
      b4o var25 = new b4o("");
      f3v var26 = new f3v(var0, var25.k5(), (byte)0, false, var24);
      TextParam var27 = var0.n5((byte)0, var2);
      var27.n5(true);
      n5(var2.n5, var8, var27);
      d2k var28 = var0.n5(var7, var1.l6(), (byte)0, var14, var9.u3(), var26).u3();
      com.aspose.slides.internal.o9b.y1 var29 = new com.aspose.slides.internal.o9b.y1(var28.n5, var28.l6 - var1.u3.l6().l6.n5, var1.l6(), var1.u3.l6().l6.n5());
      if (var1.u3() && !var0.n5(var13)) {
         switch (var1.u3.k5.getJustification()) {
            case 2:
               var29.k5(var0.l6 - var13.n5.getMarginRight() - var1.l6());
               break;
            case 3:
               var29.k5((var0.l6 - var13.n5.getMarginRight() - var1.l6()) / 2.0F);
               break;
            case 4:
               var29.k5((var0.l6 - var13.n5.getMarginRight() - var1.l6()) / 2.0F);
         }
      }

      if (!var1.u3() && var5.a6() == null && var5.u3() != 0) {
         var29.l6(var29.s7() + var5.n5().n5.getFontHeight() * 0.1F);
      }

      return new l7y(
         var1,
         var2,
         var29.y4(),
         var3,
         var27,
         var4,
         var5,
         false,
         false,
         var6,
         var7,
         var8,
         var15,
         var26,
         var17,
         var9.u3(),
         var16,
         var27.t9(),
         var2.n5,
         var10,
         null,
         var11,
         var12,
         (byte)0
      );
   }

   private static void n5(c9g var0, a1v var1, TextParam var2) {
      boolean var3 = var0.getHyperlinkClick() != null || var0.getHyperlinkMouseOver() != null;
      boolean var4 = var3
         && (
            var0.getHyperlinkClick() != null && var0.getHyperlinkClick().getColorSource() == 0
               || var0.getHyperlinkMouseOver() != null && var0.getHyperlinkMouseOver().getColorSource() == 0
         );
      if (var3 && var4) {
         var2.n5(var1);
      }
   }
}
