package com.aspose.slides.internal.k4y;

public class m9f extends b3 {
   private y4q n5;
   private y4q l6;
   private a5j k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("docPartGallery", "docPartCategory", "docPartUnique");

   public m9f(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new m9f$1(this, var1));
   }

   public m9f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("w", var2, "docPartGallery");
      }

      if (this.l6 != null) {
         this.l6.n5("w", var2, "docPartCategory");
      }

      if (this.k5 != null) {
         this.k5.n5("w", var2, "docPartUnique");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static y4q n5(m9f var0, y4q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y4q l6(m9f var0, y4q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a5j n5(m9f var0, a5j var1) {
      return var0.k5 = var1;
   }
}
