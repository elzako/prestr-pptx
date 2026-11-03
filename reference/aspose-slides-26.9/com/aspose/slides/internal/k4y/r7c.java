package com.aspose.slides.internal.k4y;

public class r7c extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private l8r h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "noGrp", "noDrilldown", "noSelect", "noChangeAspect", "noMove", "noResize", "extLst"
   );

   public r7c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      r7c$1 var2 = new r7c$1(this);
      n5(var1, var2);
      n5(var1, new r7c$2(this, var1));
   }

   public r7c() {
      this.t2();
   }

   private void t2() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5) {
         var2.l6("noGrp", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("noDrilldown", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("noSelect", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("noChangeAspect", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("noMove", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("noResize", this.u9 ? "1" : "0");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.h0 = (l8r)var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final void a6(boolean var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void u9(boolean var1) {
      this.u9 = var1;
   }

   public final x8 h0() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return c8;
   }

   // $VF: synthetic method
   static boolean n5(r7c var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(r7c var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(r7c var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(r7c var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(r7c var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u9(r7c var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(r7c var0, l8r var1) {
      return var0.h0 = var1;
   }
}
