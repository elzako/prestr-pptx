package com.aspose.slides.internal.k4y;

class n6p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n6p l6;

   n6p$1(n6p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n6p.l6().n5(this.n5.n3())) {
         case 0:
            n6p.n5(this.l6, new c3d(this.n5));
            break;
         case 1:
            n6p.n5(this.l6, new p6k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
