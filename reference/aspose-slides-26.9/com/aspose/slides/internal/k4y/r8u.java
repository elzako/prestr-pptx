package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r8u extends b3 {
   private String n5;
   private String l6;
   private a3g k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("Id", "KeyName", "X509Data");

   public r8u(com.aspose.slides.ms.System.Xml.c7 var1) {
      r8u$1 var2 = new r8u$1(this);
      n5(var1, var2);
      n5(var1, new r8u$2(this, var1));
   }

   public r8u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      if (this.l6 != null) {
         this.n5("", var2, "KeyName", this.l6, false);
      }

      if (this.k5 != null) {
         this.k5.n5("", var2, "X509Data");
      }

      var2.s7();
   }

   public final a3g n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <x509Data> element can be added.");
      }

      this.k5 = new a3g();
      return this.k5;
   }

   public final a3g l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(r8u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r8u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(r8u var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a3g n5(r8u var0, a3g var1) {
      return var0.k5 = var1;
   }
}
