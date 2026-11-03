package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class j6c extends b3 {
   private String n5;
   private String l6;
   private y6f k5;
   private y2l u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "Id", "SigningTime", "SigningCertificate", "SignaturePolicyIdentifier"
   );

   public j6c(com.aspose.slides.ms.System.Xml.c7 var1) {
      j6c$1 var2 = new j6c$1(this);
      n5(var1, var2);
      n5(var1, new j6c$2(this, var1));
   }

   public j6c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      if (this.l6 != null) {
         this.n5("xd", var2, "SigningTime", this.l6, false);
      }

      if (this.k5 != null) {
         this.k5.n5("xd", var2, "SigningCertificate");
      }

      if (this.u3 != null) {
         this.u3.n5("xd", var2, "SignaturePolicyIdentifier");
      }

      var2.s7();
   }

   public final y6f n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <signingCertificate> element can be added.");
      }

      this.k5 = new y6f();
      return this.k5;
   }

   public final y2l l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <signaturePolicyIdentifier> element can be added.");
      }

      this.u3 = new y2l();
      return this.u3;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(j6c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(j6c var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(j6c var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static y6f n5(j6c var0, y6f var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y2l n5(j6c var0, y2l var1) {
      return var0.u3 = var1;
   }
}
