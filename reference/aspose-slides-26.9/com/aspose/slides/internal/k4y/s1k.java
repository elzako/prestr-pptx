package com.aspose.slides.internal.k4y;

public class s1k extends n3 {
   private p5c n5;
   private e8b l6;
   private l7h k5;
   private j9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("nvGraphicFramePr", "xfrm", "graphic", "extLst");

   public s1k(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new s1k$1(this, var1));
   }

   public s1k() {
      this.n5 = new p5c();
      this.l6 = new e8b();
      this.k5 = new l7h();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"p".equals(var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      this.n5.n5("p", var2, "nvGraphicFramePr");
      this.l6.n5("p", var2, "xfrm");
      this.k5.n5("a", var2, "graphic");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public void n5(x8 var1) {
      this.u3 = (j9y)var1;
   }

   @Override
   public y4 n5() {
      return this.n5;
   }

   @Override
   public e8b l6() {
      return this.l6;
   }

   @Override
   public l7h k5() {
      return this.k5;
   }

   @Override
   public x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static p5c n5(s1k var0, p5c var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e8b n5(s1k var0, e8b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l7h n5(s1k var0, l7h var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j9y n5(s1k var0, j9y var1) {
      return var0.u3 = var1;
   }
}
