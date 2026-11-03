package com.aspose.slides.internal.k4y;

class d6z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d6z l6;

   d6z$1(d6z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d6z.h0().n5(this.n5.n3())) {
         case 0:
            d6z.n5(this.l6, new l9e(this.n5));
            break;
         case 1:
            d6z.n5(this.l6, new m1y(this.n5));
            break;
         case 2:
            d6z.n5(this.l6, new x4t(this.n5));
            break;
         case 3:
            d6z.n5(this.l6, new g7("aggregation", new p2h(this.n5)));
            break;
         case 4:
            d6z.n5(this.l6, new g7("binning", new d4r(this.n5)));
            break;
         case 5:
            d6z.n5(this.l6, new r2r(this.n5));
            break;
         case 6:
            d6z.n5(this.l6, new r0s(this.n5));
            break;
         case 7:
            d6z.n5(this.l6, new k1i(this.n5));
            break;
         case 8:
            d6z.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
