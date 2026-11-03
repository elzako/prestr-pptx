package com.aspose.slides.internal.k4y;

class j8h$1 extends b3$n5 {
   // $VF: synthetic field
   final j8h n5;

   j8h$1(j8h var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (j8h.n5().n5(var1)) {
         case 0:
            j8h.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 1:
            j8h.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 2:
            j8h.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         default:
            return false;
      }
   }
}
