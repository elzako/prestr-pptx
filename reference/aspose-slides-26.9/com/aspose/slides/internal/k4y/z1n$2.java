package com.aspose.slides.internal.k4y;

class z1n$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z1n l6;

   z1n$2(z1n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z1n.a6().n5(this.n5.n3())) {
         case 1:
            z1n.n5(this.l6, new y5s(this.n5));
            break;
         case 2:
            z1n.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
