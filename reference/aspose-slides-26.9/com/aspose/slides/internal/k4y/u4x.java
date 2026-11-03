package com.aspose.slides.internal.k4y;

public class u4x extends b3 {
   private j2k n5;
   private f1i l6;
   private y8s k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("headerFooter", "pageMargins", "pageSetup");

   public u4x(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u4x$1(this, var1));
   }

   public u4x() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "headerFooter");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "pageMargins");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "pageSetup");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static j2k n5(u4x var0, j2k var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f1i n5(u4x var0, f1i var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y8s n5(u4x var0, y8s var1) {
      return var0.k5 = var1;
   }
}
