package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h4j extends b3 {
   private d0m n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("handoutMasterId");

   public h4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h4j$1(this, var1));
   }

   public h4j() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("p", var2, "handoutMasterId");
      }

      var2.s7();
   }

   public final d0m n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <handoutMasterId> element can be added.");
      }

      this.n5 = new d0m();
      return this.n5;
   }

   public final d0m l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static d0m n5(h4j var0, d0m var1) {
      return var0.n5 = var1;
   }
}
