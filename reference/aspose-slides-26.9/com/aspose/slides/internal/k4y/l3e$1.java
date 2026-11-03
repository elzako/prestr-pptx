package com.aspose.slides.internal.k4y;

class l3e$1 extends b3$n5 {
   // $VF: synthetic field
   final l3e n5;

   l3e$1(l3e var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (l3e.h0().n5(var1)) {
         case 0:
            l3e.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 1:
            l3e.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 2:
            l3e.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 3:
            l3e.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 4:
            l3e.n5(this.n5, t0.n5(var2));
            return true;
         case 5:
            l3e.n5(this.n5, j6.n5(var2));
            return true;
         default:
            return false;
      }
   }
}
