package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n7n extends z1 {
   private f1t n5;
   private e3 l6;
   private b9y k5;
   private d9m u3;
   private j9y a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("nvPicPr", "blipFill", "spPr", "style", "extLst");

   public n7n(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n7n$1(this, var1));
   }

   public n7n() {
      this.n5 = new f1t();
      this.l6 = new e3();
      this.k5 = new b9y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"p".equals(var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      this.n5.n5("p", var2, "nvPicPr");
      this.l6.n5("p", var2, "blipFill");
      this.k5.n5("p", var2, "spPr");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "style");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public d9m a6() {
      if (this.u3 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.u3 = new d9m();
      return this.u3;
   }

   @Override
   public t4 n5() {
      return this.n5;
   }

   @Override
   public e3 l6() {
      return this.l6;
   }

   @Override
   public b9y k5() {
      return this.k5;
   }

   @Override
   public d9m u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static f1t n5(n7n var0, f1t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e3 n5(n7n var0, e3 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(n7n var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static d9m n5(n7n var0, d9m var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j9y n5(n7n var0, j9y var1) {
      return var0.a6 = var1;
   }
}
