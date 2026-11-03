package com.aspose.slides.internal.k4y;

class e1$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e1 l6;

   e1$1(e1 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e1.k5().n5(this.n5.n3())) {
         case 0:
            e1.n5(this.l6, new m2(this.n5));
            break;
         case 1:
            e1.l6(this.l6, new m2(this.n5));
            break;
         case 2:
            e1.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
