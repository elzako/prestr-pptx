package com.aspose.slides.internal.k4y;

public class t2c extends b3 {
   private c4t n5;
   private z1n l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvSpPr");

   public t2c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t2c$1(this, var1));
   }

   public t2c() {
      this.n5 = new c4t();
      this.l6 = new z1n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xdr", var2, "cNvPr");
      this.l6.n5("xdr", var2, "cNvSpPr");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(t2c var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z1n n5(t2c var0, z1n var1) {
      return var0.l6 = var1;
   }
}
