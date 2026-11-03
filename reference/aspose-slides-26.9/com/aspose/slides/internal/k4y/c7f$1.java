package com.aspose.slides.internal.k4y;

class c7f$1 extends b3$n5 {
   // $VF: synthetic field
   final c7f n5;

   c7f$1(c7f var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (c7f.h0().n5(var1)) {
         case 0:
            c7f.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            break;
         case 1:
            c7f.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            break;
         case 2:
            c7f.n5(this.n5, i4.n5(var2));
            break;
         case 3:
            c7f.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            break;
         case 4:
            c7f.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            break;
         default:
            return false;
      }

      return true;
   }
}
