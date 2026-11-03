package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c9q extends b3 {
   private String n5;
   private p4t l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("f", "strCache", "extLst");

   public c9q(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c9q$1(this, var1));
   }

   public c9q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("c", var2, "f", this.n5, false);
      if (this.l6 != null) {
         this.l6.n5("c", var2, "strCache");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final p4t n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <strCache> element can be added.");
      }

      this.l6 = new p4t();
      return this.l6;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final p4t k5() {
      return this.l6;
   }

   public final x8 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(c9q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(c9q var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static p4t n5(c9q var0, p4t var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(c9q var0, a9t var1) {
      return var0.k5 = var1;
   }
}
