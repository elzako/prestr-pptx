package com.aspose.slides.internal.k4y;

class g2u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g2u l6;

   g2u$2(g2u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g2u.n5().n5(this.n5.n3())) {
         case 4:
            g2u.n5(this.l6, new g7("sldAll", new e0j(this.n5)));
            break;
         case 5:
            g2u.n5(this.l6, new g7("sldRg", new v6b(this.n5)));
            break;
         case 6:
            g2u.n5(this.l6, new g7("custShow", new v4z(this.n5)));
            break;
         case 7:
            g2u.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
