package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a3p extends t2 {
   private String n5;
   private boolean l6;
   private q0g k5;
   private b9y u3;
   private d9m a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("macro", "fPublished", "nvCxnSpPr", "spPr", "style");

   public a3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      a3p$1 var2 = new a3p$1(this);
      n5(var1, var2);
      n5(var1, new a3p$2(this, var1));
   }

   public a3p() {
      this.h0();
      this.k5 = new q0g();
      this.u3 = new b9y();
   }

   private void h0() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("macro", this.n5);
      }

      if (this.l6) {
         var2.l6("fPublished", this.l6 ? "1" : "0");
      }

      this.k5.n5("cdr", var2, "nvCxnSpPr");
      this.u3.n5("cdr", var2, "spPr");
      if (this.a6 != null) {
         this.a6.n5("cdr", var2, "style");
      }

      var2.s7();
   }

   @Override
   public d9m u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.a6 = new d9m();
      return this.a6;
   }

   @Override
   public s7 n5() {
      return this.k5;
   }

   @Override
   public b9y l6() {
      return this.u3;
   }

   @Override
   public d9m k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(a3p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a3p var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q0g n5(a3p var0, q0g var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(a3p var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d9m n5(a3p var0, d9m var1) {
      return var0.a6 = var1;
   }
}
