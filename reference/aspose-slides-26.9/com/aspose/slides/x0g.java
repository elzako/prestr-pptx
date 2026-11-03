package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class x0g extends v6g {
   protected AutoShape n5;
   private boolean l6 = true;

   protected abstract com.aspose.slides.internal.o9b.n3 u3();

   protected abstract com.aspose.slides.internal.o9b.c8 a6();

   protected abstract float u9();

   protected abstract void n5(AutoShape var1);

   protected final void n5(IChartTextFormat var1) {
      if (var1.getPortionFormat().isHardUnderlineFill() == 1) {
         this.n5.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setHardUnderlineFill((byte)1);
      }

      if (var1.getPortionFormat().getFontUnderline() != -1) {
         this.n5
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getParagraphFormat()
            .getDefaultPortionFormat()
            .setFontUnderline(var1.getPortionFormat().getFontUnderline());
      }

      if (var1.getPortionFormat().getUnderlineFillFormat().getFillType() != -1) {
         com.aspose.slides.internal.v6g.k5.n5(
               this.n5.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getUnderlineFillFormat(), FillFormat.class
            )
            .n5(var1.getPortionFormat().getUnderlineFillFormat());
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getPortionFormat().getEscapement())) {
         this.n5
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getParagraphFormat()
            .getDefaultPortionFormat()
            .setEscapement(var1.getPortionFormat().getEscapement());
      }

      if (var1.getTextBlockFormat().getWrapText() != -1) {
         this.n5.getTextFrame().getTextFrameFormat().setWrapText(var1.getTextBlockFormat().getWrapText());
      }
   }

   protected final void l6(IChartTextFormat var1) {
      if (var1.getPortionFormat().getFillFormat().getFillType() == 2) {
         ((FillFormat)this.n5.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getFillFormat())
            .n5(var1.getPortionFormat().getFillFormat());
      }
   }

   public final com.aspose.slides.internal.o9b.y1[] t9() {
      return s3z.n5(this.n5.l6().u3);
   }

   public final void k5(boolean var1) {
      this.l6 = var1;
   }

   public final d2k n5(String var1, float var2, float var3) {
      return this.n5(var1, var2, var3, true);
   }

   protected final d2k n5(String var1, float var2, float var3, boolean var4) {
      if (this.n5 == null) {
         this.n5 = new AutoShape(this.y2().u3().n3());
         this.n5.setShapeType(5);
      }

      float var5 = com.aspose.slides.ms.System.n1.k5(this.u9()) ? 0.0F : this.u9();
      this.n5.setWidth(com.aspose.slides.ms.System.q1.n5(var5) == 90.0F ? var3 : var2);
      this.n5.setHeight(com.aspose.slides.ms.System.q1.n5(var5) == 90.0F ? var2 : var3);
      this.n5.setRotation(-var5);
      this.n5.addTextFrame(com.aspose.slides.ms.System.d1.a6(var1, com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.p8.k5())));
      this.n5(this.n5);
      this.h0();
      s3z.l6(this.n5.l6().u3);
      com.aspose.slides.internal.o9b.y1 var6 = x5h.n5(this.t9()).y4();
      if (!var4) {
         return new d2k(var2, var3);
      }

      TextFrameFormat var7 = (TextFrameFormat)this.n5.l6().getTextFrameFormat();
      float var8 = (float)(var7.u3().l6 + var7.u3().u3);
      float var9 = (float)(var7.u3().k5 + var7.u3().a6);
      if (!com.aspose.slides.ms.System.n1.k5(var8)) {
         var6.l6(var6.s7() + var8);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var9)) {
         var6.n5(var6.k5() + var9);
      }

      z3y var10 = new z3y(var6.y4());
      boolean var11 = var7.getTextVerticalType() == 4 || var7.getTextVerticalType() == 3 || var7.getTextVerticalType() == 5 || var7.getTextVerticalType() == 6;
      if (var11) {
         this.n5.setWidth((float)com.aspose.slides.ms.System.q1.l6((double)var10.k5()));
         this.n5.setHeight((float)com.aspose.slides.ms.System.q1.l6((double)var10.l6()));
         s3z.l6(this.n5.l6().u3);
         var10.n5(var5);
         return new d2k(var10.k5(), var10.l6());
      } else {
         this.n5.setWidth((float)com.aspose.slides.ms.System.q1.l6((double)var10.l6()));
         this.n5.setHeight((float)com.aspose.slides.ms.System.q1.l6((double)var10.k5()));
         s3z.l6(this.n5.l6().u3);
         var10.n5(var5);
         return new d2k(var10.l6(), var10.k5());
      }
   }

   static String n5(Object var0, String var1) {
      return t7k.n5(var0, var1, false);
   }

   @Override
   protected void l6() {
      if (this.n5 != null && this.l6) {
         if (this.u9() != 0.0F) {
            this.n5.setX(this.i1().l6() - this.n5.getWidth() / 2.0F);
            this.n5.setY(this.i1().k5() - this.n5.getHeight() / 2.0F);
         } else {
            this.n5.setX(this.p8());
            this.n5.setY(this.f2());
         }

         n1g var1 = this.y2().u3();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            this.n5.e5().n5(var1.d2(), var1.d5(), InterruptionToken.getNone());
         } finally {
            var3.n5();
         }
      }
   }

   private void h0() {
      com.aspose.slides.internal.o9b.n3 var1 = this.u3();
      FontData var2 = new FontData(var1.l6().a6());
      com.aspose.slides.internal.o9b.c8 var3 = this.a6().o8();
      IGenericEnumerator var4 = this.n5.getTextFrame().getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            if (var5.getParagraphFormat().getBullet().getType() == -1) {
               var5.getParagraphFormat().getBullet().setType((byte)0);
            }

            IPortionFormat var6 = var5.getParagraphFormat().getDefaultPortionFormat();
            if (var6.getFillFormat().getFillType() == -1 || var6.getFillFormat().getFillType() == 0) {
               var6.getFillFormat().setFillType((byte)1);
               ((ColorFormat)var6.getFillFormat().getSolidFillColor()).n5(var3.o8());
            }

            if (var6.getLatinFont() == null) {
               var6.setLatinFont(var2);
            }

            if (var6.getEastAsianFont() == null) {
               var6.setEastAsianFont(var2);
            }

            if (com.aspose.slides.ms.System.d2.k5(var6.getFontHeight())) {
               var6.setFontHeight(var1.c8());
            }

            if (var6.getFontBold() == -1) {
               var6.setFontBold((byte)(var1.n5() ? 1 : 0));
            }

            if (var6.getFontItalic() == -1) {
               var6.setFontItalic((byte)(var1.u9() ? 1 : 0));
            }

            if (var6.getFontUnderline() == -1) {
               var6.setFontUnderline((byte)(var1.n3() ? 2 : 0));
            }

            IParagraphFormat var7 = var5.getParagraphFormat();
            if (var7.getAlignment() == -1) {
               var7.setAlignment(1);
            }

            if (var7.getFontAlignment() == -1) {
               var7.setFontAlignment(2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      TextFrameFormat var11 = (TextFrameFormat)this.n5.l6().getTextFrameFormat();
      var11.setRotationAngle(Float.NaN);
      var11.n5(var11.u3().n5(c0u.n5.l6()).l6());
   }

   public final AutoShape z1() {
      return this.n5;
   }
}
