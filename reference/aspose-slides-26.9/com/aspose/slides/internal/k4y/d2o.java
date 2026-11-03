package com.aspose.slides.internal.k4y;

public class d2o extends b3 {
   private String n5;
   private t2w l6;
   private d6q k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("URI", "CertDigest", "IssuerSerial");

   public d2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      d2o$1 var2 = new d2o$1(this);
      n5(var1, var2);
      n5(var1, new d2o$2(this, var1));
   }

   public d2o() {
      this.l6 = new t2w();
      this.k5 = new d6q();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("URI", this.n5);
      }

      this.l6.n5("xd", var2, "CertDigest");
      this.k5.n5("xd", var2, "IssuerSerial");
      var2.s7();
   }

   public final t2w n5() {
      return this.l6;
   }

   public final d6q l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(d2o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static t2w n5(d2o var0, t2w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static d6q n5(d2o var0, d6q var1) {
      return var0.k5 = var1;
   }
}
