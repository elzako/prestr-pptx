package com.aspose.slides.internal.k4y;

public class y4e extends b3 {
   private c4t n5;
   private u7f l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvGrpSpPr");

   public y4e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new y4e$1(this, var1));
   }

   public y4e() {
      this.n5 = new c4t();
      this.l6 = new u7f();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xdr", var2, "cNvPr");
      this.l6.n5("xdr", var2, "cNvGrpSpPr");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(y4e var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u7f n5(y4e var0, u7f var1) {
      return var0.l6 = var1;
   }
}
