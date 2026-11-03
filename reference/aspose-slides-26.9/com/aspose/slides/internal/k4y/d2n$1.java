package com.aspose.slides.internal.k4y;

class d2n$1 extends b3$n5 {
   // $VF: synthetic field
   final d2n n5;

   d2n$1(d2n var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (d2n.l6().n5(var1)) {
         case 0:
            d2n.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         default:
            return false;
      }
   }
}
