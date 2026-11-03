package com.aspose.slides.internal.k4y;

class u0a$1 extends b3$n5 {
   // $VF: synthetic field
   final u0a n5;

   u0a$1(u0a var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (u0a.k5().n5(var1)) {
         case 0:
            u0a.n5(
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
