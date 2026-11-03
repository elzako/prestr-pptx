package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f6w extends q0 {
   private String n5;
   private b3q l6;
   private b9y k5;
   private d9m u3;
   private j3z a6;
   private e8b u9;
   private l8r h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "modelId", "nvSpPr", "spPr", "style", "txBody", "txXfrm", "extLst"
   );

   public f6w(com.aspose.slides.ms.System.Xml.c7 var1) {
      f6w$1 var2 = new f6w$1(this);
      n5(var1, var2);
      n5(var1, new f6w$2(this, var1));
   }

   public f6w() {
      this.l6 = new b3q();
      this.k5 = new b9y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("modelId", this.n5);
      this.l6.n5("dsp", var2, "nvSpPr");
      this.k5.n5("dsp", var2, "spPr");
      if (this.u3 != null) {
         this.u3.n5("dsp", var2, "style");
      }

      if (this.a6 != null) {
         this.a6.n5("dsp", var2, "txBody");
      }

      if (this.u9 != null) {
         this.u9.n5("dsp", var2, "txXfrm");
      }

      if (this.h0 != null) {
         this.h0.n5("dsp", var2, "extLst");
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
   public void n5(e8b var1) {
      this.u9 = var1;
   }

   @Override
   public void n5(x8 var1) {
      this.h0 = (l8r)var1;
   }

   @Override
   public String y4() {
      return this.n5;
   }

   @Override
   public void k5(String var1) {
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
   public e8b e2() {
      return this.u9;
   }

   @Override
   public x8 h0() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(f6w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b3q n5(f6w var0, b3q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(f6w var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static d9m n5(f6w var0, d9m var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(f6w var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e8b n5(f6w var0, e8b var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(f6w var0, l8r var1) {
      return var0.h0 = var1;
   }
}
