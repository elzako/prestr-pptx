package com.aspose.slides.internal.k4y;

class d9m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d9m l6;

   d9m$1(d9m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d9m.a6().n5(this.n5.n3())) {
         case 0:
            d9m.n5(this.l6, new x2y(this.n5));
            break;
         case 1:
            d9m.l6(this.l6, new x2y(this.n5));
            break;
         case 2:
            d9m.k5(this.l6, new x2y(this.n5));
            break;
         case 3:
            d9m.n5(this.l6, new p6t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
