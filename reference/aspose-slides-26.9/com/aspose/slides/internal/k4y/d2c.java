package com.aspose.slides.internal.k4y;

public class d2c extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private x9u u3;
   private v5j a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "snapToGrid", "snapToObjects", "showGuides", "cViewPr", "guideLst"
   );

   public d2c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      d2c$1 var2 = new d2c$1(this);
      n5(var1, var2);
      n5(var1, new d2c$2(this, var1));
   }

   public d2c() {
      this.u3();
      this.u3 = new x9u();
   }

   private void u3() {
      this.n5 = true;
      this.l6 = false;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("snapToGrid", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("snapToObjects", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("showGuides", this.k5 ? "1" : "0");
      }

      this.u3.n5("p", var2, "cViewPr");
      if (this.a6 != null) {
         this.a6.n5("p", var2, "guideLst");
      }

      var2.s7();
   }

   public final void n5(v5j var1) {
      this.a6 = var1;
   }

   public final x9u n5() {
      return this.u3;
   }

   public final v5j l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(d2c var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d2c var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(d2c var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static x9u n5(d2c var0, x9u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static v5j n5(d2c var0, v5j var1) {
      return var0.a6 = var1;
   }
}
