package com.aspose.slides.internal.k4y;

class z0q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z0q l6;

   z0q$1(z0q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z0q.n5().n5(this.n5.n3())) {
         case 0:
            z0q.n5(this.l6, new p3x(this.n5));
            break;
         case 1:
            z0q.n5(this.l6, new y7e(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
