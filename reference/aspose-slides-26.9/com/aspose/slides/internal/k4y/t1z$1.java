package com.aspose.slides.internal.k4y;

class t1z$1 extends b3$n5 {
   // $VF: synthetic field
   final t1z n5;

   t1z$1(t1z var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (t1z.u3().n5(var1)) {
         case 0:
            t1z.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 1:
            t1z.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 2:
            t1z.k5(
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
