package com.aspose.slides.internal.k4y;

class v2$1 extends b3$n5 {
   // $VF: synthetic field
   final v2 n5;

   v2$1(v2 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (v2.n5().n5(var1)) {
         case 0:
            v2.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 1:
            v2.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t4(var2));
            return true;
         default:
            return false;
      }
   }
}
