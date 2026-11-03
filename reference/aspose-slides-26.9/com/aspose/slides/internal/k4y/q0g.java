package com.aspose.slides.internal.k4y;

public class q0g extends s7 {
   private c4t n5;
   private g1p l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvCxnSpPr");

   public q0g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new q0g$1(this, var1));
   }

   public q0g() {
      this.n5 = new c4t();
      this.l6 = new g1p();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "cNvPr");
      this.l6.n5("cdr", var2, "cNvCxnSpPr");
      var2.s7();
   }

   @Override
   public c4t n5() {
      return this.n5;
   }

   @Override
   public g1p l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(q0g var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g1p n5(q0g var0, g1p var1) {
      return var0.l6 = var1;
   }
}
