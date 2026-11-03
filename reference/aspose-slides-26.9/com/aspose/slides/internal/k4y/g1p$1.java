package com.aspose.slides.internal.k4y;

class g1p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g1p l6;

   g1p$1(g1p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g1p.c8().n5(this.n5.n3())) {
         case 0:
            g1p.n5(this.l6, new y9w(this.n5));
            break;
         case 1:
            g1p.n5(this.l6, new e6r(this.n5));
            break;
         case 2:
            g1p.l6(this.l6, new e6r(this.n5));
            break;
         case 3:
            g1p.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
