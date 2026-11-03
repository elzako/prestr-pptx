package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x1u extends q0 {
   private boolean n5;
   private s8p l6;
   private b9y k5;
   private d9m u3;
   private j3z a6;
   private j9y u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("useBgFill", "nvSpPr", "spPr", "style", "txBody", "extLst");

   public x1u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z1();
      x1u$1 var2 = new x1u$1(this);
      n5(var1, var2);
      n5(var1, new x1u$2(this, var1));
   }

   public x1u() {
      this.z1();
      this.l6 = new s8p();
      this.k5 = new b9y();
   }

   private void z1() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"p".equals(var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5) {
         var2.l6("useBgFill", this.n5 ? "1" : "0");
      }

      this.l6.n5("p", var2, "nvSpPr");
      this.k5.n5("p", var2, "spPr");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "style");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "txBody");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public d9m u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.u3 = new d9m();
      return this.u3;
   }

   @Override
   public j3z u9() {
      if (this.a6 != null) {
         throw new Exception("Only one <txBody> element can be added.");
      }

      this.a6 = new j3z();
      return this.a6;
   }

   @Override
   public void n5(x8 var1) {
      this.u9 = (j9y)var1;
   }

   @Override
   public boolean c8() {
      return this.n5;
   }

   @Override
   public void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public z3 n5() {
      return this.l6;
   }

   @Override
   public b9y l6() {
      return this.k5;
   }

   @Override
   public d9m k5() {
      return this.u3;
   }

   @Override
   public j3z a6() {
      return this.a6;
   }

   @Override
   public x8 h0() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return h0;
   }

   // $VF: synthetic method
   static boolean n5(x1u var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s8p n5(x1u var0, s8p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(x1u var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static d9m n5(x1u var0, d9m var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(x1u var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j9y n5(x1u var0, j9y var1) {
      return var0.u9 = var1;
   }
}
