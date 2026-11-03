package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y9r extends b3 {
   private p6r n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("fillRect");

   public y9r(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new y9r$1(this, var1));
   }

   public y9r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "fillRect");
      }

      var2.s7();
   }

   public final p6r n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <fillRect> element can be added.");
      }

      this.n5 = new p6r();
      return this.n5;
   }

   public final p6r l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static p6r n5(y9r var0, p6r var1) {
      return var0.n5 = var1;
   }
}
