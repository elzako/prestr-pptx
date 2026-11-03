package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p5w extends q0 {
   private String n5;
   private String l6;
   private boolean k5;
   private boolean u3;
   private g7e a6;
   private b9y u9;
   private d9m h0;
   private j3z c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "macro", "textlink", "fLocksText", "fPublished", "nvSpPr", "spPr", "style", "txBody"
   );

   public p5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z1();
      p5w$1 var2 = new p5w$1(this);
      n5(var1, var2);
      n5(var1, new p5w$2(this, var1));
   }

   public p5w() {
      this.z1();
      this.a6 = new g7e();
      this.u9 = new b9y();
   }

   private void z1() {
      this.k5 = true;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("macro", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("textlink", this.l6);
      }

      if (!this.k5) {
         var2.l6("fLocksText", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("fPublished", this.u3 ? "1" : "0");
      }

      this.a6.n5("cdr", var2, "nvSpPr");
      this.u9.n5("cdr", var2, "spPr");
      if (this.h0 != null) {
         this.h0.n5("cdr", var2, "style");
      }

      if (this.c8 != null) {
         this.c8.n5("cdr", var2, "txBody");
      }

      var2.s7();
   }

   @Override
   public d9m u3() {
      if (this.h0 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.h0 = new d9m();
      return this.h0;
   }

   @Override
   public j3z u9() {
      if (this.c8 != null) {
         throw new Exception("Only one <txBody> element can be added.");
      }

      this.c8 = new j3z();
      return this.c8;
   }

   @Override
   public String t2() {
      return this.n5;
   }

   @Override
   public void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public String s7() {
      return this.l6;
   }

   @Override
   public void l6(String var1) {
      this.l6 = var1;
   }

   @Override
   public boolean x8() {
      return this.k5;
   }

   @Override
   public void l6(boolean var1) {
      this.k5 = var1;
   }

   @Override
   public boolean n3() {
      return this.u3;
   }

   @Override
   public void k5(boolean var1) {
      this.u3 = var1;
   }

   @Override
   public z3 n5() {
      return this.a6;
   }

   @Override
   public b9y l6() {
      return this.u9;
   }

   @Override
   public d9m k5() {
      return this.h0;
   }

   @Override
   public j3z a6() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(p5w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(p5w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p5w var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(p5w var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7e n5(p5w var0, g7e var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(p5w var0, b9y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static d9m n5(p5w var0, d9m var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j3z n5(p5w var0, j3z var1) {
      return var0.c8 = var1;
   }
}
