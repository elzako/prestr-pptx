package com.aspose.slides.internal.k4y;

class k1s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k1s l6;

   k1s$2(k1s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k1s.n5().n5(this.n5.n3())) {
         case 1:
            k1s.n5(this.l6, new l3f(this.n5));
            break;
         case 2:
            k1s.n5(this.l6, new u6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
