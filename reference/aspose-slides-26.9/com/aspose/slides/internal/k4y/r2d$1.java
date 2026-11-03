package com.aspose.slides.internal.k4y;

class r2d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r2d l6;

   r2d$1(r2d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r2d.h0().n5(this.n5.n3())) {
         case 0:
            r2d.n5(this.l6, new g3p(this.n5));
            break;
         case 1:
            r2d.n5(this.l6, new g7("nor", new g3p(this.n5)));
            break;
         case 2:
            r2d.n5(this.l6, new y1w(this.n5));
            break;
         case 3:
            r2d.n5(this.l6, new c1m(this.n5));
            break;
         case 4:
            r2d.n5(this.l6, new s1y(this.n5));
            break;
         case 5:
            r2d.l6(this.l6, new g3p(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
