package com.aspose.slides.internal.k4y;

class k2d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k2d l6;

   k2d$1(k2d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k2d.n5().n5(this.n5.n3())) {
         case 0:
            k2d.n5(this.l6, new d0x(this.n5));
            break;
         case 1:
            k2d.n5(this.l6, new y4q(this.n5));
            break;
         case 2:
            k2d.n5(this.l6, new k4b(this.n5));
            break;
         case 3:
            k2d.l6(this.l6, new y4q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
