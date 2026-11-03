package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s5y extends b3 {
   private String n5;
   private String l6;
   private l6f k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("Target", "Id", "SignedProperties");

   public s5y(com.aspose.slides.ms.System.Xml.c7 var1) {
      s5y$1 var2 = new s5y$1(this);
      n5(var1, var2);
      n5(var1, new s5y$2(this, var1));
   }

   public s5y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("xd", var3, "http://uri.etsi.org/01903/v1.3.2#");
      if (var2.n5("http://www.w3.org/2000/09/xmldsig#") == null) {
         var2.u3("xmlns", "", null, "http://www.w3.org/2000/09/xmldsig#");
      }

      var2.l6("Target", this.n5);
      if (this.l6 != null) {
         var2.l6("Id", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("xd", var2, "SignedProperties");
      }

      var2.s7();
   }

   public final l6f n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <signedProperties> element can be added.");
      }

      this.k5 = new l6f();
      return this.k5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(s5y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s5y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l6f n5(s5y var0, l6f var1) {
      return var0.k5 = var1;
   }
}
