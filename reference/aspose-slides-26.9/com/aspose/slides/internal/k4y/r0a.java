package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r0a extends t2 {
   private k7t n5;
   private b9y l6;
   private d9m k5;
   private j9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("nvCxnSpPr", "spPr", "style", "extLst");

   public r0a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r0a$1(this, var1));
   }

   public r0a() {
      this.n5 = new k7t();
      this.l6 = new b9y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p", var2, "nvCxnSpPr");
      this.l6.n5("p", var2, "spPr");
      if (this.k5 != null) {
         this.k5.n5("p", var2, "style");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public d9m u3() {
      if (this.k5 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.k5 = new d9m();
      return this.k5;
   }

   @Override
   public void n5(x8 var1) {
      this.u3 = (j9y)var1;
   }

   @Override
   public s7 n5() {
      return this.n5;
   }

   @Override
   public b9y l6() {
      return this.l6;
   }

   @Override
   public d9m k5() {
      return this.k5;
   }

   @Override
   public x8 a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static k7t n5(r0a var0, k7t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(r0a var0, b9y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static d9m n5(r0a var0, d9m var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j9y n5(r0a var0, j9y var1) {
      return var0.u3 = var1;
   }
}
