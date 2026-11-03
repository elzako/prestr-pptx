package com.aspose.slides.internal.k4y;

public class l6p extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "sqref",
      "evalError",
      "twoDigitTextYear",
      "numberStoredAsText",
      "formula",
      "formulaRange",
      "unlockedFormula",
      "emptyCellReference",
      "listDataValidation",
      "calculatedColumn"
   );

   public l6p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l6p$1 var2 = new l6p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l6p() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("sqref", this.n5);
      if (this.l6) {
         var2.l6("evalError", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("twoDigitTextYear", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("numberStoredAsText", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("formula", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("formulaRange", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("unlockedFormula", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("emptyCellReference", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("listDataValidation", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("calculatedColumn", this.s7 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(l6p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l6p var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l6p var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l6p var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(l6p var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean a6(l6p var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u9(l6p var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean h0(l6p var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean c8(l6p var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean t2(l6p var0, boolean var1) {
      return var0.s7 = var1;
   }
}
