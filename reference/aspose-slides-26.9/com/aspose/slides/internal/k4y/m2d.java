package com.aspose.slides.internal.k4y;

public class m2d extends b3 {
   private int l6;
   private int k5;
   public static final int n5 = g3g.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("number:style", "number:decimal-places");

   public m2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m2d$1 var2 = new m2d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m2d() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("number:style", g3g.n5(this.l6));
      }

      if (this.k5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:decimal-places", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(m2d var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(m2d var0, int var1) {
      return var0.k5 = var1;
   }
}
