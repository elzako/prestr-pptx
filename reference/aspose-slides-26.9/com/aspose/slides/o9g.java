package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;

class o9g extends com.aspose.slides.internal.c8m.e9 {
   private boolean n5;
   private com.aspose.slides.internal.c8m.b6 l6;
   private ChartDataWorkbook k5;
   private int u3 = 0;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IPPImage> a6;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IAudio> u9;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IVideo> h0;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, ITheme> c8;
   private final Dictionary<String, List<IHyperlink>> t2;
   private final Dictionary<Long, ICommentAuthor> s7;
   private final Dictionary<String, IChartDataWorksheet> x8;
   private final List<IShape> n3 = new List<>();
   private final SortedList<String, SortedList<String, com.aspose.slides.internal.c8m.j8>> y4;
   private final com.aspose.slides.internal.q7.l6 e2;
   private final p6f t9;
   private final InterruptionToken z1;

   public o9g(IChartDataWorkbook var1, com.aspose.slides.internal.q7.l6 var2, InterruptionToken var3) {
      this.e2 = var2;
      this.z1 = var3;
      this.k5 = (ChartDataWorkbook)var1;
      this.a6 = new Dictionary<>();
      this.u9 = new Dictionary<>();
      this.h0 = new Dictionary<>();
      this.c8 = new Dictionary<>();
      this.t2 = new Dictionary<>();
      this.s7 = new Dictionary<>();
      this.x8 = new Dictionary<>();
      this.y4 = new SortedList<>();
      this.t9 = new p6f();
   }

   final Dictionary<String, IChartDataWorksheet> n5() {
      return this.x8;
   }

   final ChartDataWorkbook l6() {
      return this.k5;
   }

   final com.aspose.slides.internal.q7.l6 k5() {
      return this.e2;
   }

   final p6f u3() {
      return this.t9;
   }

   final InterruptionToken a6() {
      return this.z1;
   }

   final boolean u9() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   final void n5(String var1, int var2) {
      if (this.l6().u3() != null && this.l6().u3().n5() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.l6().u3().n5());
      }
   }

   final com.aspose.slides.internal.c8m.b6 h0() {
      return this.l6;
   }

   final void n5(com.aspose.slides.internal.c8m.b6 var1) {
      this.l6 = var1;
   }
}
