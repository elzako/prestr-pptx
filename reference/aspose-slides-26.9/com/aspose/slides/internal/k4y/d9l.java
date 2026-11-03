package com.aspose.slides.internal.k4y;

public class d9l extends t9 {
   private c4t n5;
   private u7f l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvGrpSpPr");

   public d9l(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d9l$1(this, var1));
   }

   public d9l() {
      this.n5 = new c4t();
      this.l6 = new u7f();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "cNvPr");
      this.l6.n5("cdr", var2, "cNvGrpSpPr");
      var2.s7();
   }

   @Override
   public c4t n5() {
      return this.n5;
   }

   @Override
   public u7f l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(d9l var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u7f n5(d9l var0, u7f var1) {
      return var0.l6 = var1;
   }
}
