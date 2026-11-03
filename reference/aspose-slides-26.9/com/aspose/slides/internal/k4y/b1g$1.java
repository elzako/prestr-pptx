package com.aspose.slides.internal.k4y;

class b1g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b1g l6;

   b1g$1(b1g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b1g.n5().n5(this.n5.n3())) {
         case 0:
            b1g.n5(this.l6, new y1i(this.n5));
            break;
         case 1:
            b1g.n5(this.l6, new o3h(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
