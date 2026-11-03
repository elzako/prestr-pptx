package com.aspose.slides.internal.k4y;

public class d6q extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("X509IssuerName", "X509SerialNumber");

   public d6q(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d6q$1(this, var1));
   }

   public d6q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("", var2, "X509IssuerName", this.n5, false);
      this.n5("", var2, "X509SerialNumber", this.l6, false);
      var2.s7();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(d6q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(d6q var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static String l6(d6q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(d6q var0) {
      return var0.l6;
   }
}
