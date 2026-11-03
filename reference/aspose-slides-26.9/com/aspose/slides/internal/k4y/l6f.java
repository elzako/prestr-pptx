package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l6f extends b3 {
   private String n5;
   private j6c l6;
   private s0d k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "Id", "SignedSignatureProperties", "SignedDataObjectProperties"
   );

   public l6f(com.aspose.slides.ms.System.Xml.c7 var1) {
      l6f$1 var2 = new l6f$1(this);
      n5(var1, var2);
      n5(var1, new l6f$2(this, var1));
   }

   public l6f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("xd", var2, "SignedSignatureProperties");
      }

      if (this.k5 != null) {
         this.k5.n5("xd", var2, "SignedDataObjectProperties");
      }

      var2.s7();
   }

   public final j6c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <signedSignatureProperties> element can be added.");
      }

      this.l6 = new j6c();
      return this.l6;
   }

   public final s0d l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <signedDataObjectProperties> element can be added.");
      }

      this.k5 = new s0d();
      return this.k5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(l6f var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static j6c n5(l6f var0, j6c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0d n5(l6f var0, s0d var1) {
      return var0.k5 = var1;
   }
}
