package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class z3o extends b3 {
   private String n5;
   private a8e l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("f", "numCache", "extLst");

   public z3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new z3o$1(this, var1));
   }

   public z3o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("c", var2, "f", this.n5, false);
      if (this.l6 != null) {
         this.l6.n5("c", var2, "numCache");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final a8e n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <numCache> element can be added.");
      }

      this.l6 = new a8e();
      return this.l6;
   }

   public final void n5(a8e var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final a8e k5() {
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
   static String n5(z3o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(z3o var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static a8e n5(z3o var0, a8e var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(z3o var0, a9t var1) {
      return var0.k5 = var1;
   }
}
