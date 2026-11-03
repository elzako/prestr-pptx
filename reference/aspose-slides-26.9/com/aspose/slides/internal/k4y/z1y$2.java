package com.aspose.slides.internal.k4y;

class z1y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z1y l6;

   z1y$2(z1y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z1y.u3().n5(this.n5.n3())) {
         case 1:
            z1y.n5(this.l6, new l2q(this.n5));
            break;
         case 2:
            z1y.l6(this.l6, new l2q(this.n5));
            break;
         case 3:
            z1y.n5(this.l6, new g7("sp", new j5z(this.n5)));
            break;
         case 4:
            z1y.n5(this.l6, new g7("grpSp", new p0q(this.n5)));
            break;
         case 5:
            z1y.n5(this.l6, new g7("graphicFrame", new h0m(this.n5)));
            break;
         case 6:
            z1y.n5(this.l6, new g7("cxnSp", new h1z(this.n5)));
            break;
         case 7:
            z1y.n5(this.l6, new g7("pic", new b3w(this.n5)));
            break;
         case 8:
            z1y.n5(this.l6, new v9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
