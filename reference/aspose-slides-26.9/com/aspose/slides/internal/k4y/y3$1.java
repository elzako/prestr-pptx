package com.aspose.slides.internal.k4y;

class y3$1 extends b3$n5 {
   // $VF: synthetic field
   final y3 n5;

   y3$1(y3 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (y3.u9().n5(var1)) {
         case 0:
            y3.n5(this.n5, n7.n5(var2));
            return true;
         case 1:
            y3.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 2:
            y3.l6(
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
