package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class n4c extends x0g {
   private final String l6;
   private com.aspose.slides.internal.o9b.n3 k5;
   private com.aspose.slides.internal.o9b.f2 u3 = new com.aspose.slides.internal.o9b.f2();

   public n4c(String var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.o9b.f2 h0() {
      if (this.u3.n5()) {
         d2k var1 = this.n5("Sample", 10000.0F, 10000.0F).u3();
         this.u3 = new com.aspose.slides.internal.o9b.f2(var1.n5, var1.l6);
      }

      return this.u3;
   }

   public final com.aspose.slides.internal.o9b.n3 c8() {
      return this.u3();
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      if (this.k5 == null) {
         Chart var1 = (Chart)this.t2().getChart();
         this.k5 = var1.n5(this.t2().getTextFormat());
      }

      return this.k5;
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      Chart var1 = (Chart)this.t2().getChart();
      com.aspose.slides.internal.o9b.c8 var2 = var1.n5((byte)(var1.getStyle() + 1 > 40 ? 1 : 0)).o8();
      return var1.n5(this.t2().getTextFormat(), var2.o8());
   }

   @Override
   protected float u9() {
      return 0.0F;
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(((Chart)this.t2().getChart()).getLegend().getTextFormat());
      IGenericEnumerator var2 = var1.l6().getParagraphs().iterator();

      try {
         while (var2.hasNext()) {
            IParagraph var3 = (IParagraph)var2.next();
            var3.getParagraphFormat().setAlignment(0);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void u3(z5 var1) {
      d2k var2 = this.n5(this.l6, var1.n5(), var1.l6(), true).u3();
      if (var2.l6 > var1.l6()) {
         String var3 = this.n5.l6().u3.n5(var1.n5(), var1.l6(), false);
         this.n5(var3, var1.n5(), var1.l6(), true).n5(var2);
         var2.n5 = com.aspose.slides.ms.System.q1.n5((float)(0.0F), (float)(var2.n5));
      }

      this.n5(var2.u3());
   }

   private LegendEntryProperties t2() {
      return ((h9p)this.y1()).u3();
   }
}
