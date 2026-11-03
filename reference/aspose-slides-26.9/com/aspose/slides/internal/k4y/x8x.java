package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x8x extends b3 {
   private String n5;
   private String l6;
   private k7v k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("tm", "fmla", "val");

   public x8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      x8x$1 var2 = new x8x$1(this);
      n5(var1, var2);
      n5(var1, new x8x$2(this, var1));
   }

   public x8x() {
      this.u9();
   }

   private void u9() {
      this.n5 = "indefinite";
      this.l6 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"indefinite".equals(this.n5)) {
         var2.l6("tm", this.n5);
      }

      if (!"".equals(this.l6)) {
         var2.l6("fmla", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "val");
      }

      var2.s7();
   }

   public final k7v n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <val> element can be added.");
      }

      this.k5 = new k7v();
      return this.k5;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final k7v u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(x8x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x8x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static k7v n5(x8x var0, k7v var1) {
      return var0.k5 = var1;
   }
}
