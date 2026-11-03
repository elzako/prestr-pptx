package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class e2p extends x0g {
   private final n1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("en", "ar", "ja", "fr", "de", "ru", "es", "zh");

   @Override
   public int O_() {
      return 10;
   }

   @Override
   public boolean T_() {
      return this.l6.n3().hasTitle();
   }

   public final boolean h0() {
      return this.s7().getOverlay();
   }

   public e2p(n1g var1) {
      this.l6 = var1;
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      return this.l6.x8().l6();
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6.x8().k5();
   }

   @Override
   protected float u9() {
      return this.l6.x8().u3();
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(this.s7().getTextFormat());
      ChartTitle var2 = this.s7();
      ITextFrame var3 = var2.getTextFrameForOverriding();
      if (var3 != null && var3.getText() != null) {
         var1.l6().l6(var3);
      }

      float var4 = ChartTypeCharacterizer.u3(var2.getChart().getType()) ? 0.0F : 0.72F;
      TextFrameFormat var5 = (TextFrameFormat)var1.l6().getTextFrameFormat();
      var5.setCenterText((byte)1);
      var5.n5(new c0u(var4 * 4.0F, var4, var4 * 4.0F, var4));
      var5.setAnchoringType((byte)1);
      this.x8();
      ((FillFormat)var1.getFillFormat()).n5((IFillFormat)((FillFormat)var2.getFormat().getFill()));
      ((LineFormat)var1.getLineFormat()).n5((ILineFormat)((LineFormat)var2.getFormat().getLine()));
   }

   @Override
   protected void u3(z5 var1) {
      d2k var2 = this.n5(this.c8(), var1.n5(), var1.l6()).u3();
      if (var2.n5 > var1.n5() || var2.l6 > var1.l6()) {
         String var3 = this.n5.l6().u3.n5(var1.n5(), var1.l6(), false);
         this.n5(var3, var1.n5(), var1.l6()).n5(var2);
      }

      this.n5(var2.u3());
   }

   @Override
   protected void l6() {
      w5k.n5(
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.l6,
         this.e5().y4(),
         (LineFormat)this.l6.n3().getChartTitle().getFormat().getLine(),
         (FillFormat)this.l6.n3().getChartTitle().getFormat().getFill(),
         this.l6.n3().getChartTitle().getFormat().getEffect()
      );
      super.l6();
   }

   @Override
   protected void V_() {
      if (this.T_()) {
         ChartTitle var1 = (ChartTitle)this.l6.n3().getChartTitle();
         var1.n5(this.p8() - this.l6.n3().getX());
         var1.l6(this.f2() - this.l6.n3().getY());
         var1.k5(this.d2());
         var1.u3(this.d5());
      }
   }

   private String c8() {
      boolean var1 = false;
      if (var1 || this.l6.y4().size() != 1) {
         return t2();
      } else {
         return ChartTypeCharacterizer.u3(this.l6.y4().get_Item(0).u9().getType()) ? t2() : this.l6.y4().get_Item(0).k5();
      }
   }

   private static String t2() {
      com.aspose.slides.internal.x7n.l6 var0 = com.aspose.slides.internal.r5t.t2.n5().h0();
      String var1 = var0.y4();
      switch (k5.n5(var1)) {
         case 0:
            return "Chart Title";
         case 1:
            return "عنوان المخطط";
         case 2:
            return "グラフ タイトル";
         case 3:
            return "Titre du graphique";
         case 4:
            return "Diagrammtitel";
         case 5:
            return "Название диаграммы";
         case 6:
            return "Título del gráfico";
         case 7:
            return "圖表標題";
         default:
            return "Chart Title";
      }
   }

   private ChartTitle s7() {
      return (ChartTitle)this.l6.n3().getChartTitle();
   }

   private void x8() {
      com.aspose.slides.internal.o9b.n3 var1 = this.l6.x8().a6();
      if (var1 == null) {
         var1 = this.u3();
      }

      com.aspose.slides.internal.o9b.n3 var2 = var1;
      int var3 = var2.l6().u9(var2.x8());
      int var4 = var2.l6().h0(var2.x8());
      float var5 = var2.c8() * var4 / var3;
      IGenericEnumerator var6 = this.n5.getTextFrame().getParagraphs().iterator();

      try {
         while (var6.hasNext()) {
            IParagraph var7 = (IParagraph)var6.next();
            var7.getParagraphFormat().setSpaceWithin(-((float)com.aspose.slides.ms.System.q1.n5((double)(var5), 0)));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }
}
