package com.aspose.slides.internal.k4y;

public class a3g extends b3 {
   private d6q n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "X509IssuerSerial", "X509SKI", "X509SubjectName", "X509Certificate", "X509CRL"
   );

   public a3g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new a3g$1(this, var1));
   }

   public a3g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("", var2, "X509IssuerSerial");
      }

      if (this.l6 != null) {
         this.n5("", var2, "X509SKI", this.l6, false);
      }

      if (this.k5 != null) {
         this.n5("", var2, "X509SubjectName", this.k5, false);
      }

      if (this.u3 != null) {
         this.n5("", var2, "X509Certificate", this.u3, false);
      }

      if (this.a6 != null) {
         this.n5("", var2, "X509CRL", this.a6, false);
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u9;
   }

   // $VF: synthetic method
   static d6q n5(a3g var0, d6q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(a3g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(a3g var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static String l6(a3g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(a3g var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static String k5(a3g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(a3g var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static String u3(a3g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(a3g var0) {
      return var0.a6;
   }
}
