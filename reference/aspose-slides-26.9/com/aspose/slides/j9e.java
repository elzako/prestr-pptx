package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class j9e {
   private final p6w n5;
   private final k9m l6;
   private final f1c k5;
   private final p6t u3;
   private final b0 a6;

   public j9e(n1g var1, float var2, boolean var3) {
      this.n5 = new p6w(var1, var2, var3);
      this.l6 = new k9m(this.n5);
      this.k5 = new f1c(this.n5);
      this.u3 = new p6t(this.n5);
      this.a6 = new b0(this.n5);
   }

   public static com.aspose.slides.internal.o9b.y1 n5(n1g var0, com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, float var3) {
      return x4g.n5(var0, var1.y4(), var2.y4(), var3);
   }

   public final boolean n5(com.aspose.slides.internal.o9b.y1 var1, AutoShape var2, float var3) {
      return this.l6.n5(var1.y4(), var2, var3);
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, l6v var3, com.aspose.slides.internal.x4g.s7 var4, float var5, float var6) {
      this.k5.n5(var1.y4(), var2, var3, var4, var5, var6);
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, l6v var3, com.aspose.slides.internal.x4g.s7 var4, float var5, float var6, n6u var7) {
      this.u3.n5(var1.y4(), var2, var3, var4, var5, var6, var7);
   }

   public final void n5(
      com.aspose.slides.internal.o9b.y1 var1, l6v var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4, float var5, float var6
   ) {
      this.k5.n5(var1.y4(), var2, var3.u3(), var4.u3(), var5, var6);
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, com.aspose.slides.internal.o9b.y1 var3, float var4, float var5) {
      this.k5.n5(var1.y4(), var2, var3.y4(), var4, var5);
   }

   public final void n5(k4l var1, com.aspose.slides.internal.o9b.y1 var2, a1v var3) {
      this.a6.n5(var1, var2.y4(), var3);
   }

   public final void n5() {
      this.n5.n5();
   }

   static void n5(e3m var0, h3d var1, n1g var2, float var3) {
      if (!com.aspose.slides.ms.System.d1.n5(var0.n5())) {
         com.aspose.slides.internal.o9b.y1 var4 = var0.l6().y4();
         var4.l6((float)com.aspose.slides.ms.System.q1.l6((double)var4.s7()));
         var4.n5((float)com.aspose.slides.ms.System.q1.l6((double)var4.k5()));
         AutoShape var5 = n5(var0.n5(), var0.a6(), var0.u9().o8(), var0.u3(), var0.k5(), var2);
         com.aspose.slides.internal.o9b.y1 var6 = n5(var4.y4(), var1.k5()).y4();
         var5.setX(var6.x8());
         var5.setY(var6.n3());
         var5.setWidth(var6.s7());
         var5.setHeight(var6.k5());
         var5.setRotation(-var1.k5());
         if (var1.n5() != null && var1.n5().getFillType() != -1) {
            ((FillFormat)var5.getFillFormat()).n5((IFillFormat)var1.n5());
         }

         if (var1.l6() != null && var1.l6().getStyle() != -1) {
            ((LineFormat)var5.getLineFormat()).n5((ILineFormat)var1.l6());
         }

         j9e var7 = var2.c8();
         com.aspose.slides.internal.o9b.y1 var8 = var2.o0().y4();
         var7.n5(var8.y4(), var5, var3);
      }
   }

   static void n5(
      com.aspose.slides.internal.o9b.y1 var0,
      String var1,
      int var2,
      com.aspose.slides.internal.o9b.n3 var3,
      com.aspose.slides.internal.o9b.c8 var4,
      int var5,
      int var6,
      n1g var7,
      float var8
   ) {
      if (var0.s7() < 1.0F) {
         var0.l6(1.0F);
      }

      if (var0.k5() < 1.0F) {
         var0.n5(1.0F);
      }

      AutoShape var9 = n5(var1, var3, var4.o8(), var5, var6, var7);
      com.aspose.slides.internal.o9b.y1 var10 = n5(var0.y4(), var2).y4();
      var9.setX(var10.x8());
      var9.setY(var10.n3());
      var9.setWidth(var10.s7());
      var9.setHeight(var10.k5());
      var9.setRotation(-var2);
      j9e var11 = var7.c8();
      com.aspose.slides.internal.o9b.y1 var12 = var7.o0().y4();
      var11.n5(var12.y4(), var9, var8);
   }

   private static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var0, int var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      switch (com.aspose.slides.ms.System.q1.n5(var1)) {
         case 0:
            var2 = var0.x8();
            var3 = var0.n3();
            var4 = var0.s7();
            var5 = var0.k5();
            break;
         case 15:
            double var7 = com.aspose.slides.ms.System.q1.n5(var1) / 180.0 * Math.PI;
            float var9 = (float)com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.h0(var7));
            float var10 = (float)com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.c8(var7));
            float var11 = var0.s7() * var10 + var0.k5() * var9;
            float var12 = var0.s7() * var9 + var0.k5() * var10;
            var2 = var0.x8();
            var3 = var0.n3();
            var4 = com.aspose.slides.ms.System.q1.n5(var0.s7(), var11);
            var5 = com.aspose.slides.ms.System.q1.n5(var12, var12);
            break;
         case 90:
            com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var0.x8() + var0.s7() / 2.0F, var0.n3() + var0.k5() / 2.0F);
            var0 = new com.aspose.slides.internal.o9b.y1(var6.l6() - var0.k5() / 2.0F, var6.k5() - var0.s7() / 2.0F, var0.k5(), var0.s7());
            var2 = var0.x8();
            var3 = var0.n3();
            var4 = com.aspose.slides.ms.System.q1.n5(var0.k5(), var0.s7());
            var5 = com.aspose.slides.ms.System.q1.n5(var0.k5(), var0.s7());
            break;
         default:
            var2 = var0.x8();
            var3 = var0.n3();
            var4 = var0.s7();
            var5 = var0.k5();
      }

      return new com.aspose.slides.internal.o9b.y1(var2, var3, var4, var5);
   }

   public static AutoShape n5(String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.c8 var2, int var3, int var4, n1g var5) {
      AutoShape var6 = new AutoShape(var5.n3());
      var6.setShapeType(5);
      var6.addTextFrame(var0);
      int var7 = var6.getTextFrame().getParagraphs().getCount();
      if (var7 > 1) {
         String var8 = com.aspose.slides.ms.System.d1.n5;

         for (int var9 = 1; var9 < var7; var9++) {
            IParagraph var10 = var6.getTextFrame().getParagraphs().get_Item(var9);
            var8 = com.aspose.slides.ms.System.d1.n5(var8, var10.getText());
         }

         var6.getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .setText(com.aspose.slides.ms.System.d1.n5(new String[]{var6.getTextFrame().getParagraphs().get_Item(0).getText(), var8}));

         while (var6.getTextFrame().getParagraphs().getCount() > 1) {
            var6.getTextFrame().getParagraphs().removeAt(var6.getTextFrame().getParagraphs().getCount() - 1);
         }
      }

      n5(var6, var1, var2.o8(), var3, var4);
      var6.getFillFormat().setFillType((byte)0);
      var6.getLineFormat().getFillFormat().setFillType((byte)0);
      return var6;
   }

   private static void n5(AutoShape var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.c8 var2, int var3, int var4) {
      FontData var5 = new FontData(var1.l6().a6());
      com.aspose.slides.internal.o9b.c8 var6 = var2.o8();
      IGenericEnumerator var7 = var0.getTextFrame().getParagraphs().iterator();

      try {
         while (var7.hasNext()) {
            IParagraph var8 = (IParagraph)var7.next();
            if (var8.getParagraphFormat().getBullet().getType() == -1) {
               var8.getParagraphFormat().getBullet().setType((byte)0);
            }

            IPortionFormat var9 = var8.getParagraphFormat().getDefaultPortionFormat();
            var9.getFillFormat().setFillType((byte)1);
            ((ColorFormat)var9.getFillFormat().getSolidFillColor()).n5(var6.o8());
            if (var9.getLatinFont() == null) {
               var9.setLatinFont(var5);
            }

            if (var9.getEastAsianFont() == null) {
               var9.setEastAsianFont(var5);
            }

            if (com.aspose.slides.ms.System.d2.k5(var9.getFontHeight())) {
               var9.setFontHeight(var1.c8());
            }

            if (var9.getFontBold() == -1) {
               var9.setFontBold((byte)(var1.n5() ? 1 : 0));
            }

            if (var9.getFontItalic() == -1) {
               var9.setFontItalic((byte)(var1.u9() ? 1 : 0));
            }

            if (var9.getFontUnderline() == -1) {
               var9.setFontUnderline((byte)(var1.n3() ? 2 : 0));
            }

            IParagraphFormat var10 = var8.getParagraphFormat();
            if (var10.getAlignment() == -1) {
               var10.setAlignment(var3);
            }

            if (var10.getFontAlignment() == -1) {
               var10.setFontAlignment(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      TextFrameFormat var14 = (TextFrameFormat)var0.l6().getTextFrameFormat();
      var14.setRotationAngle(Float.NaN);
      var14.n5(var14.u3().n5(c0u.n5.l6()).l6());
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      FillFormat var5,
      float var6,
      float var7
   ) {
      l6v var8 = w5k.l6(var0.o8(), var4, var2, (float)var4.getEffective().getWidth());
      var8.u9 = w5k.n5(var0.o8(), (LineFillFormat)var4.getFillFormat(), var2, var6, var3);
      a1v var9 = w5k.n5(var1.o8(), var5, var2, var6, var3);
      com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(var2.e5().l6(), var2.e5().k5() - var2.e5().a6(), var2.c4(), var2.y2());
      com.aspose.slides.internal.x4g.s7 var11 = (com.aspose.slides.internal.x4g.s7)var3.deepClone();

      try {
         j9e var12 = var2.c8();
         var12.n5(var10.y4(), var9, var8, var11, 0.0F, var7);
      } finally {
         if (var11 != null) {
            var11.dispose();
         }
      }
   }
}
