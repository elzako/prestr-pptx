package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class g8t extends x0g {
   private Object l6;
   private Object k5;
   private boolean u3;
   private float a6 = Float.NaN;
   private int u9;
   private ChartCategory h0;
   private w3 c8;
   private String[] t2 = new String[]{"m/d/yyyy"};
   private com.aspose.slides.internal.o9b.f2 s7 = new com.aspose.slides.internal.o9b.f2();

   g8t(Object var1, w3 var2) {
      this.c8 = var2;
      this.n5(var1);
      this.l6(var1);
   }

   @Override
   protected void n5(z5 var1) {
      d2k var2 = new d2k();
      if (com.aspose.slides.ms.System.d1.n5(this.s7()) && var1.n5() == 0.0F && var1.l6() == 0.0F) {
         var2 = new d2k(0.0F, this.n5 != null ? this.n5.getHeight() : 0.0F);
      } else {
         (com.aspose.slides.internal.v6g.k5.l6(this.c8, ValueAxisBase.class) ? this.u9(var1) : this.k5(var1)).n5(var2);
      }

      this.n5(var2.u3());
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   public int O_() {
      return 5;
   }

   final Object h0() {
      return this.l6;
   }

   final void n5(Object var1) {
      this.l6 = var1;
   }

   final Object c8() {
      return this.k5;
   }

   final void l6(Object var1) {
      this.k5 = var1;
   }

   final boolean t2() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
   }

   final d2k k5(z5 var1) {
      String var2 = this.s7();
      return var2 == null ? d2k.k5 : this.n5(var2, var1.n5(), var1.l6());
   }

   final com.aspose.slides.internal.o9b.f2 a6(z5 var1) {
      if (!this.s7.n5()) {
         return this.s7;
      }

      String var2 = this.s7();
      if (var2 == null) {
         this.s7 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
         return this.s7;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, u7.class) && ((u7)this.c8).c4() && this.c8.n5().r4() == 1) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, "-", "- ");
      }

      var2 = com.aspose.slides.internal.r7c.c8.n5(var2, "(\\p{L})/(\\p{L})", new g8t$1(this));
      var2 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var2, "\n", " "), "\r\n", " ");
      String[] var3 = com.aspose.slides.ms.System.d1.n5(var2, new char[]{' '}, (short)1);
      float var4 = 0.0F;
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var3.length; var6++) {
         String var7 = var3[var6];
         d2k var8 = this.n5(var7, var1.n5(), var1.l6()).u3();
         if (var8.n5 > var4) {
            var4 = var8.n5;
         }

         if (var8.l6 > var5) {
            var5 = var8.l6;
         }
      }

      this.s7 = new com.aspose.slides.internal.o9b.f2(var4, var5);
      return this.s7;
   }

   final String s7() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, o8r.class) && !this.t2()) {
         return this.t4();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.h0(), String.class) ? (String)this.h0() : f6z.n5(this.h0(), this.q0(), false);
      }
   }

   private String t4() {
      String var1 = this.c8.n5().c8().getNumberFormat();
      if (this.c8.n5().c8().isNumberFormatLinkedToSource()) {
         ChartCategoryCollection var2 = this.c8.l6.get_Item(0).u9().getPlotOnSecondAxis()
            ? (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getSecondaryCategories()
            : (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getCategories();
         var1 = com.aspose.slides.ms.System.d1.n5(var2.u3().n5()) ? "General" : var2.u3().n5();
      } else if ("".equals(var1) || "General".equals(var1)) {
         ChartCategoryCollection var5 = this.c8.l6.get_Item(0).u9().getPlotOnSecondAxis()
            ? (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getSecondaryCategories()
            : (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getCategories();
         if (!"".equals(var5.u3().n5()) && !"General".equals(var5.u3().n5())) {
            var1 = var5.u3().n5();
         }
      }

      com.aspose.slides.ms.System.j5 var6 = n5(com.aspose.slides.ms.System.z3.h0(this.h0()), false).m3();
      if ("0".equals(var1)) {
         return this.h0().toString();
      }

      if (!"".equals(var1)) {
         if (!this.n5(var1)) {
            var1 = com.aspose.slides.internal.x7n.l6.u3().a6().q0();
         }

         try {
            var6.n5(var1);
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
            if (this.c8.n5().c8().getBaseUnitScale() == 1) {
               var1 = "m/d/yyyy";
            } else if (this.c8.n5().c8().getBaseUnitScale() == 2) {
               var1 = "MMM-yy";
            } else {
               var1 = "yyyy";
            }
         }
      } else if (this.c8.n5().c8().getBaseUnitScale() == 1) {
         var1 = "M/d/yyyy";
      } else if (this.c8.n5().c8().getBaseUnitScale() == 2) {
         var1 = "MMM-yy";
      } else {
         var1 = "yyyy";
      }

      return "General".equals(var1) ? this.h0().toString() : f6z.n5(var6.m3(), var1, false);
   }

   static com.aspose.slides.ms.System.j5 n5(double var0, boolean var2) {
      if (var0 > 2958465.99) {
         return com.aspose.slides.ms.System.j5.k5;
      }

      if (var2) {
         var0 += 1462.0;
      }

      if (var0 < 60.0) {
         var0++;
      }

      return com.aspose.slides.ms.System.j5.h0(var0);
   }

   final d2k u9(z5 var1) {
      String var2 = this.x8();
      return this.n5(var2, var1.n5(), var1.l6());
   }

   final String x8() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, ValueAxisBase.class)) {
         double var1 = com.aspose.slides.internal.v6g.k5.u3(this.h0(), double.class) * this.c8.n5().s3();
         return p4.n5(var1, this.c8);
      } else {
         return p4.n5(this.c8(), this.c8.n5());
      }
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      return this.c8.n5().l6();
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return t7k.n5(this.h0(), this.c8.n5().c8().getNumberFormat(), this.c8.n5().u3().o8());
   }

   final float n3() {
      return this.a6;
   }

   final void n5(float var1) {
      this.a6 = var1;
   }

   @Override
   protected float u9() {
      return !com.aspose.slides.ms.System.n1.k5(this.n3()) ? this.n3() : this.c8.n5().u9();
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(this.c8.n5().c8().getTextFormat());
      this.l6(this.c8.n5().c8().getTextFormat());
      if (this.c8.n5().c8().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType(this.c8.n5().c8().getTextFormat().getTextBlockFormat().getTextVerticalType());
      }

      IGenericEnumerator var2 = var1.getTextFrame().getParagraphs().iterator();

      try {
         while (var2.hasNext()) {
            IParagraph var3 = (IParagraph)var2.next();
            IParagraphFormat var4 = var3.getParagraphFormat();
            if (this.c8.n5().c8().getTextFormat().getParagraphFormat().getAlignment() != -1) {
               var4.setAlignment(this.c8.n5().c8().getTextFormat().getParagraphFormat().getAlignment());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
   }

   @Override
   protected void l6() {
      if (this.T_()) {
         super.l6();
      }
   }

   public final int y4() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   final ChartCategory e2() {
      return this.h0;
   }

   final void n5(ChartCategory var1) {
      this.h0 = var1;
   }

   private boolean n5(String var1) {
      return !com.aspose.slides.ms.System.u3.n5(this.t2, new g8t$2(this, var1));
   }

   private String q0() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, v2m.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.c8, a0k.class) && "General".equals(this.c8.n5().c8().getNumberFormat()) && this.e2() != null) {
         ChartCategoryCollection var1 = this.c8.l6.get_Item(0).u9().getPlotOnSecondAxis()
            ? (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getSecondaryCategories()
            : (ChartCategoryCollection)this.c8.n5().d2().n3().getChartData().getCategories();
         String var2 = var1 != null && !com.aspose.slides.ms.System.d1.n5(var1.u3().n5()) ? var1.u3().n5() : "General";
         if (!this.n5(var2)) {
            var2 = com.aspose.slides.internal.x7n.l6.u3().a6().q0();
         }

         if (this.e2() != null && this.e2().n5() != null && !com.aspose.slides.ms.System.d1.n5(this.e2().l6())) {
            var2 = this.e2().l6();
         }

         return var2;
      } else {
         return this.c8.n5().c8().getNumberFormat();
      }
   }
}
