package com.aspose.slides.internal.k4y;

class c7e$1 extends b3$n5 {
   // $VF: synthetic field
   final c7e n5;

   c7e$1(c7e var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (c7e.h0().n5(var1)) {
         case 0:
            c7e.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 1:
            c7e.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 2:
            c7e.n5(this.n5, b3.q0(var2));
            return true;
         case 3:
            c7e.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         default:
            return false;
      }
   }
}
