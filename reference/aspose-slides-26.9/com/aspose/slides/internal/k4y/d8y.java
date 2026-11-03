package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d8y extends z1 {
   private String n5;
   private boolean l6;
   private q0y k5;
   private e3 u3;
   private b9y a6;
   private d9m u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "macro", "fPublished", "nvPicPr", "blipFill", "spPr", "style"
   );

   public d8y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      d8y$1 var2 = new d8y$1(this);
      n5(var1, var2);
      n5(var1, new d8y$2(this, var1));
   }

   public d8y() {
      this.h0();
      this.k5 = new q0y();
      this.u3 = new e3();
      this.a6 = new b9y();
   }

   private void h0() {
      this.n5 = "";
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("macro", this.n5);
      }

      if (this.l6) {
         var2.l6("fPublished", this.l6 ? "1" : "0");
      }

      this.k5.n5("cdr", var2, "nvPicPr");
      this.u3.n5("cdr", var2, "blipFill");
      this.a6.n5("cdr", var2, "spPr");
      if (this.u9 != null) {
         this.u9.n5("cdr", var2, "style");
      }

      var2.s7();
   }

   @Override
   public d9m a6() {
      if (this.u9 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.u9 = new d9m();
      return this.u9;
   }

   @Override
   public t4 n5() {
      return this.k5;
   }

   @Override
   public e3 l6() {
      return this.u3;
   }

   @Override
   public b9y k5() {
      return this.a6;
   }

   @Override
   public d9m u3() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(d8y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d8y var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q0y n5(d8y var0, q0y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e3 n5(d8y var0, e3 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(d8y var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static d9m n5(d8y var0, d9m var1) {
      return var0.u9 = var1;
   }
}
