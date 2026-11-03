package com.aspose.slides.internal.k4y;

public class g7e extends z3 {
   private c4t n5;
   private z1n l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvSpPr");

   public g7e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new g7e$1(this, var1));
   }

   public g7e() {
      this.n5 = new c4t();
      this.l6 = new z1n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "cNvPr");
      this.l6.n5("cdr", var2, "cNvSpPr");
      var2.s7();
   }

   @Override
   public c4t n5() {
      return this.n5;
   }

   @Override
   public z1n l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(g7e var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z1n n5(g7e var0, z1n var1) {
      return var0.l6 = var1;
   }
}
