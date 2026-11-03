package com.aspose.slides.internal.k4y;

public class d9m extends b3 {
   private x2y n5;
   private x2y l6;
   private x2y k5;
   private p6t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("lnRef", "fillRef", "effectRef", "fontRef");

   public d9m(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d9m$1(this, var1));
   }

   public d9m() {
      this.n5 = new x2y();
      this.l6 = new x2y();
      this.k5 = new x2y();
      this.u3 = new p6t();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "lnRef");
      this.l6.n5("a", var2, "fillRef");
      this.k5.n5("a", var2, "effectRef");
      this.u3.n5("a", var2, "fontRef");
      var2.s7();
   }

   public final x2y n5() {
      return this.n5;
   }

   public final x2y l6() {
      return this.l6;
   }

   public final x2y k5() {
      return this.k5;
   }

   public final p6t u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static x2y n5(d9m var0, x2y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static x2y l6(d9m var0, x2y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x2y k5(d9m var0, x2y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static p6t n5(d9m var0, p6t var1) {
      return var0.u3 = var1;
   }
}
