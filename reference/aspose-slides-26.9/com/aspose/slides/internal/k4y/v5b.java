package com.aspose.slides.internal.k4y;

public class v5b extends b3 {
   private c4t n5;
   private c6 l6;
   private s1q k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvContentPartPr", "nvPr");

   public v5b(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v5b$1(this, var1));
   }

   public v5b() {
      this.n5 = new c4t();
      this.k5 = new s1q();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p14", var2, "cNvPr");
      if (this.l6 != null) {
         this.l6.n5("p14", var2, "cNvContentPartPr");
      }

      this.k5.n5("p14", var2, "nvPr");
      var2.s7();
   }

   public final void n5(c6 var1) {
      this.l6 = var1;
   }

   public final c4t n5() {
      return this.n5;
   }

   public final c6 l6() {
      return this.l6;
   }

   public final s1q k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static c4t n5(v5b var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c6 n5(v5b var0, c6 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s1q n5(v5b var0, s1q var1) {
      return var0.k5 = var1;
   }
}
