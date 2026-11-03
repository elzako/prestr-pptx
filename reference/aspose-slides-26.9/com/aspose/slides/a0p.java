package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class a0p extends x0g {
   private final f3h l6;
   private String k5;
   private char[] u3 = new char[]{' ', '-', '\r', '\n'};
   private boolean a6;

   protected abstract String k5();

   public final String c8() {
      if (this.k5 == null) {
         String var1 = this.l6.k5().getText();
         if (!com.aspose.slides.ms.System.d1.n5(var1)) {
            this.k5 = var1;
         } else {
            this.k5 = this.k5();
         }
      }

      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   @Override
   public boolean T_() {
      return this.l6.y4();
   }

   public final float t2() {
      return this.h0().k5;
   }

   protected a0p(f3h var1) {
      this.l6 = var1;
   }

   protected final String l6(String var1) {
      DataLabel var2 = this.l6.l6();
      String var3 = var2.getDataLabelFormat().getSeparator();
      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         var3 = var2.c8().getLabels().getDefaultDataLabelFormat().getSeparator();
      }

      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         var3 = var1;
      }

      return var3;
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6.u9();
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      return this.l6.u3();
   }

   final com.aspose.slides.internal.o9b.n3 s7() {
      return this.u3();
   }

   @Override
   protected float u9() {
      return this.l6.h0();
   }

   protected final DataLabel x8() {
      return this.l6.l6();
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(this.l6.l6().getTextFormat());
      boolean var2 = !com.aspose.slides.ms.System.d1.n5(this.l6.k5().getText());
      if (!com.aspose.slides.ms.System.d1.n5(this.l6.k5().getText())) {
         if (!this.a6) {
            var1.l6().l6((ITextFrame)this.l6.k5());
         }

         var1.getTextFrame().getTextFrameFormat().setTextVerticalType((byte)-1);
      }

      DataLabelFormat var3 = (DataLabelFormat)this.l6.l6().c8().getLabels().getDefaultDataLabelFormat();
      if (this.n5(var2, var3)) {
         this.l6(var3.getTextFormat());
         this.k5(var3.getTextFormat());
      }

      i2h var4 = this.h0().k5();
      TextFrameFormat var5 = (TextFrameFormat)var1.l6().getTextFrameFormat();
      c0u var6 = var5.u3().n5(var4.n5().l6()).l6();
      if (!com.aspose.slides.ms.System.n1.k5(this.l6.l6().getWidth()) && !com.aspose.slides.ms.System.n1.k5(this.l6.l6().getHeight())) {
         var6.k5 = 0.0;
         var6.a6 = 0.0;
      }

      var5.n5(var6.l6());
      var5.setAnchoringType((byte)1);
      ((FillFormat)var1.getFillFormat()).n5((IFillFormat)this.l6.e2());
      ((LineFormat)var1.getLineFormat()).n5((ILineFormat)this.l6.t9());
      ((EffectFormat)var1.getEffectFormat()).n5(this.l6.z1());
      IGenericEnumerator var7 = this.n5.getTextFrame().getParagraphs().iterator();

      try {
         while (var7.hasNext()) {
            IParagraph var8 = (IParagraph)var7.next();
            IGenericEnumerator var9 = var8.getPortions().iterator();

            try {
               while (var9.hasNext()) {
                  IPortion var10 = (IPortion)var9.next();
                  if (!this.l6.l6().getTextFormat().getPortionFormat().getEffectFormat().isNoEffects()) {
                     ((EffectFormat)var10.getPortionFormat().getEffectFormat()).n5(this.l6.l6().getTextFormat().getPortionFormat().getEffectFormat());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (this.l6.l6().getDataLabelFormat().getShowLabelAsDataCallout()
         && var1.getFillFormat().getFillType() == -1
         && var1.getLineFormat().getFillFormat().getFillType() == -1) {
         var1.getFillFormat().setFillType((byte)1);
         ((ColorFormat)var1.getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
         var1.getLineFormat().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var1.getLineFormat().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.n5(255, 191, 191, 191).o8());
      }
   }

   @Override
   protected void u3(z5 var1) {
      if (com.aspose.slides.ms.System.d1.n5(this.c8())) {
         this.k5(0.0F);
         this.u3(0.0F);
      } else if (!com.aspose.slides.ms.System.n1.k5(this.l6.l6().getWidth()) && !com.aspose.slides.ms.System.n1.k5(this.l6.l6().getHeight())) {
         Chart var2 = this.y2().u3().n3();
         float var3 = var2.getWidth() * this.l6.l6().getWidth();
         float var4 = var2.getHeight() * this.l6.l6().getHeight();
         String var5 = this.c8();
         d2k var6 = (com.aspose.slides.ms.System.d1.n5(var5) ? d2k.k5 : this.n5(var5, var3, 1000.0F, true)).u3();
         if (var6.l6 > var4 && var5.length() > 1 && this.t9().length > 1) {
            var5 = this.n5(var6.u3(), var4, var5, var3);
         }

         this.n5(var5, var3, var4, false);
         this.n5(var5);
         this.n5(new d2k(var3, var4));
      } else {
         this.n5((com.aspose.slides.ms.System.d1.n5(this.c8()) ? d2k.k5 : this.n5(this.c8(), var1.n5(), var1.l6())).u3());
      }
   }

   private String n5(d2k var1, float var2, String var3, float var4) {
      while (var1.l6 > var2 && var3.length() > 1) {
         if (com.aspose.slides.ms.System.d1.u9(var3, this.u3).length > 1) {
            int var5 = var3.length() - 1;

            while (var5 > 0 && com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)), var3.charAt(var5)) < 0) {
               var5--;
            }

            var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, var5);
         } else {
            var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, var3.length() - 1);
         }

         this.a6 = true;
         this.n5(var3, var4, 1000.0F).n5(var1);
      }

      return var3;
   }

   private void k5(IChartTextFormat var1) {
      if (var1.getPortionFormat().getFillFormat().getFillType() == 2) {
         IGenericEnumerator var2 = this.n5.getTextFrame().getParagraphs().iterator();

         try {
            while (var2.hasNext()) {
               IParagraph var3 = (IParagraph)var2.next();
               IGenericEnumerator var4 = var3.getPortions().iterator();

               try {
                  while (var4.hasNext()) {
                     IPortion var5 = (IPortion)var4.next();
                     if (var5.getPortionFormat().getFillFormat().getFillType() == -1 || var5.getPortionFormat().getFillFormat().getFillType() == 0) {
                        ((FillFormat)var5.getPortionFormat().getFillFormat()).n5(var1.getPortionFormat().getFillFormat());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   private boolean n5(boolean var1, DataLabelFormat var2) {
      if (!var1) {
         return false;
      }

      if (var2.getTextFormat().getPortionFormat().getFillFormat().getFillType() != 2) {
         return false;
      }

      if (this.l6.l6().getTextFormat().getPortionFormat().getFillFormat().getFillType() == 2) {
         return false;
      }

      IGenericEnumerator var3 = this.n5.getTextFrame().getParagraphs().iterator();

      try {
         while (var3.hasNext()) {
            IParagraph var4 = (IParagraph)var3.next();
            if (var4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() != -1
               && var4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() != 0) {
               return false;
            }

            IGenericEnumerator var5 = var4.getPortions().iterator();

            try {
               while (var5.hasNext()) {
                  IPortion var6 = (IPortion)var5.next();
                  if (var6.getPortionFormat().getFillFormat().getFillType() != -1 && var6.getPortionFormat().getFillFormat().getFillType() != 0) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return true;
   }

   private i2h h0() {
      IChartTextBlockFormat var1 = this.l6.l6().getTextFormat().getTextBlockFormat();
      float var2 = 3.0F;
      float var3 = com.aspose.slides.ms.System.d2.k5(var1.getMarginLeft()) ? var2 : (float)var1.getMarginLeft();
      float var4 = com.aspose.slides.ms.System.d2.k5(var1.getMarginRight()) ? var2 : (float)var1.getMarginRight();
      float var5 = com.aspose.slides.ms.System.d2.k5(var1.getMarginTop()) ? var2 / 2.0F : (float)var1.getMarginTop();
      float var6 = com.aspose.slides.ms.System.d2.k5(var1.getMarginBottom()) ? var2 / 2.0F : (float)var1.getMarginBottom();
      return new i2h(var3, var5, var4, var6);
   }
}
