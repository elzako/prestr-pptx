package com.aspose.slides.internal.k4y;

class t1g$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t1g l6;

   t1g$2(t1g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t1g.h0().n5(this.n5.n3())) {
         case 1:
            t1g.n5(this.l6, new m8y(this.n5));
            break;
         case 2:
            t1g.n5(this.l6, new y1m(this.n5));
            break;
         case 3:
            t1g.n5(this.l6, new e1u(this.n5));
            break;
         case 4:
            t1g.n5(this.l6, new o5r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
