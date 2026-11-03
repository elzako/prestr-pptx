package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d8r extends b3 {
   private o9d n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("mcPr");

   public d8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d8r$1(this, var1));
   }

   public d8r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "mcPr");
      }

      var2.s7();
   }

   public final o9d n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <mcPr> element can be added.");
      }

      this.n5 = new o9d();
      return this.n5;
   }

   public final o9d l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static o9d n5(d8r var0, o9d var1) {
      return var0.n5 = var1;
   }
}
