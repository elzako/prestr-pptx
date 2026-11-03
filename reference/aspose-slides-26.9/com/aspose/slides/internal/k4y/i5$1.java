package com.aspose.slides.internal.k4y;

class i5$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i5 l6;

   i5$1(i5 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i5.u3().n5(this.n5.n3())) {
         case 0:
            i5.n5(this.l6, new o5k(this.n5));
            break;
         case 1:
            i5.n5(this.l6, new o7b(this.n5));
            break;
         case 2:
            i5.l6(this.l6, new o7b(this.n5));
            break;
         case 3:
            i5.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
