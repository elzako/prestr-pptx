package com.aspose.slides.internal.k4y;

public class e5m extends b3 {
   private long n5;
   private w4s l6;
   private w4s k5;
   private w4s u3;
   private w4s a6;
   private w4s u9;
   private w4s h0;
   private w4s c8;
   private w4s t2;
   private w4s s7;
   private v3s x8;
   private w4s n3;
   private w4s y4;
   private w4s e2;
   private w4s t9;
   private w4s z1;
   private w4s t4;
   private w4s q0;
   private w4s z3;
   private w4s m1;
   private w4s k7;
   private w4s m3;
   private w4s z8;
   private w4s j5;
   private w4s w1;
   private w4s r4;
   private w4s c4;
   private w4s y2;
   private w4s y1;
   private w4s a0;
   private w4s d2;
   private w4s d5;
   private l8r s3;
   private static final com.aspose.slides.internal.v6g.u9 p8 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "axisTitle",
      "categoryAxis",
      "chartArea",
      "dataLabel",
      "dataLabelCallout",
      "dataPoint",
      "dataPoint3D",
      "dataPointLine",
      "dataPointMarker",
      "dataPointMarkerLayout",
      "dataPointWireframe",
      "dataTable",
      "downBar",
      "dropLine",
      "errorBar",
      "floor",
      "gridlineMajor",
      "gridlineMinor",
      "hiLoLine",
      "leaderLine",
      "legend",
      "plotArea",
      "plotArea3D",
      "seriesAxis",
      "seriesLine",
      "title",
      "trendline",
      "trendlineLabel",
      "upBar",
      "valueAxis",
      "wall",
      "extLst"
   );

   public e5m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.d5();
      e5m$1 var2 = new e5m$1(this);
      n5(var1, var2);
      n5(var1, new e5m$2(this, var1));
   }

   public e5m() {
      this.d5();
      this.l6 = new w4s();
      this.k5 = new w4s();
      this.u3 = new w4s();
      this.a6 = new w4s();
      this.h0 = new w4s();
      this.c8 = new w4s();
      this.t2 = new w4s();
      this.s7 = new w4s();
      this.n3 = new w4s();
      this.y4 = new w4s();
      this.e2 = new w4s();
      this.t9 = new w4s();
      this.z1 = new w4s();
      this.t4 = new w4s();
      this.q0 = new w4s();
      this.z3 = new w4s();
      this.m1 = new w4s();
      this.k7 = new w4s();
      this.m3 = new w4s();
      this.z8 = new w4s();
      this.j5 = new w4s();
      this.w1 = new w4s();
      this.r4 = new w4s();
      this.c4 = new w4s();
      this.y2 = new w4s();
      this.y1 = new w4s();
      this.a0 = new w4s();
      this.d2 = new w4s();
      this.d5 = new w4s();
   }

   private void d5() {
      this.n5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("cs", var3, "http://schemas.microsoft.com/office/drawing/2012/chartStyle");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      this.l6.n5("cs", var2, "axisTitle");
      this.k5.n5("cs", var2, "categoryAxis");
      this.u3.n5("cs", var2, "chartArea");
      this.a6.n5("cs", var2, "dataLabel");
      if (this.u9 != null) {
         this.u9.n5("cs", var2, "dataLabelCallout");
      }

      this.h0.n5("cs", var2, "dataPoint");
      this.c8.n5("cs", var2, "dataPoint3D");
      this.t2.n5("cs", var2, "dataPointLine");
      this.s7.n5("cs", var2, "dataPointMarker");
      if (this.x8 != null) {
         this.x8.n5("cs", var2, "dataPointMarkerLayout");
      }

      this.n3.n5("cs", var2, "dataPointWireframe");
      this.y4.n5("cs", var2, "dataTable");
      this.e2.n5("cs", var2, "downBar");
      this.t9.n5("cs", var2, "dropLine");
      this.z1.n5("cs", var2, "errorBar");
      this.t4.n5("cs", var2, "floor");
      this.q0.n5("cs", var2, "gridlineMajor");
      this.z3.n5("cs", var2, "gridlineMinor");
      this.m1.n5("cs", var2, "hiLoLine");
      this.k7.n5("cs", var2, "leaderLine");
      this.m3.n5("cs", var2, "legend");
      this.z8.n5("cs", var2, "plotArea");
      this.j5.n5("cs", var2, "plotArea3D");
      this.w1.n5("cs", var2, "seriesAxis");
      this.r4.n5("cs", var2, "seriesLine");
      this.c4.n5("cs", var2, "title");
      this.y2.n5("cs", var2, "trendline");
      this.y1.n5("cs", var2, "trendlineLabel");
      this.a0.n5("cs", var2, "upBar");
      this.d2.n5("cs", var2, "valueAxis");
      this.d5.n5("cs", var2, "wall");
      if (this.s3 != null) {
         this.s3.n5("cs", var2, "extLst");
      }

      var2.s7();
   }

   public final w4s n5() {
      return this.l6;
   }

   public final w4s l6() {
      return this.k5;
   }

   public final w4s k5() {
      return this.u3;
   }

   public final w4s u3() {
      return this.a6;
   }

   public final w4s a6() {
      return this.u9;
   }

   public final w4s u9() {
      return this.h0;
   }

   public final w4s h0() {
      return this.c8;
   }

   public final w4s c8() {
      return this.t2;
   }

   public final w4s t2() {
      return this.s7;
   }

   public final w4s s7() {
      return this.n3;
   }

   public final w4s x8() {
      return this.y4;
   }

   public final w4s n3() {
      return this.e2;
   }

   public final w4s y4() {
      return this.t9;
   }

   public final w4s e2() {
      return this.z1;
   }

   public final w4s t9() {
      return this.t4;
   }

   public final w4s z1() {
      return this.q0;
   }

   public final w4s t4() {
      return this.z3;
   }

   public final w4s q0() {
      return this.m1;
   }

   public final w4s z3() {
      return this.k7;
   }

   public final w4s m1() {
      return this.m3;
   }

   public final w4s k7() {
      return this.z8;
   }

   public final w4s m3() {
      return this.j5;
   }

   public final w4s z8() {
      return this.w1;
   }

   public final w4s j5() {
      return this.r4;
   }

   public final w4s w1() {
      return this.c4;
   }

   public final w4s r4() {
      return this.y2;
   }

   public final w4s c4() {
      return this.y1;
   }

   public final w4s y2() {
      return this.a0;
   }

   public final w4s y1() {
      return this.d2;
   }

   public final w4s a0() {
      return this.d5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 d2() {
      return p8;
   }

   // $VF: synthetic method
   static long n5(e5m var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w4s n5(e5m var0, w4s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w4s l6(e5m var0, w4s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static w4s k5(e5m var0, w4s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static w4s u3(e5m var0, w4s var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static w4s a6(e5m var0, w4s var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static w4s u9(e5m var0, w4s var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static w4s h0(e5m var0, w4s var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static w4s c8(e5m var0, w4s var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static w4s t2(e5m var0, w4s var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static v3s n5(e5m var0, v3s var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static w4s s7(e5m var0, w4s var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static w4s x8(e5m var0, w4s var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static w4s n3(e5m var0, w4s var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static w4s y4(e5m var0, w4s var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static w4s e2(e5m var0, w4s var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static w4s t9(e5m var0, w4s var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static w4s z1(e5m var0, w4s var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static w4s t4(e5m var0, w4s var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static w4s q0(e5m var0, w4s var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static w4s z3(e5m var0, w4s var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static w4s m1(e5m var0, w4s var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static w4s k7(e5m var0, w4s var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static w4s m3(e5m var0, w4s var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static w4s z8(e5m var0, w4s var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static w4s j5(e5m var0, w4s var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static w4s w1(e5m var0, w4s var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static w4s r4(e5m var0, w4s var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static w4s c4(e5m var0, w4s var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static w4s y2(e5m var0, w4s var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static w4s y1(e5m var0, w4s var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static w4s a0(e5m var0, w4s var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(e5m var0, l8r var1) {
      return var0.s3 = var1;
   }
}
