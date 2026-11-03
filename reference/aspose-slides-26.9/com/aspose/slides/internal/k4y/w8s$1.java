package com.aspose.slides.internal.k4y;

class w8s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w8s l6;

   w8s$1(w8s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w8s.u9().n5(this.n5.n3())) {
         case 0:
            w8s.n5(this.l6, new d2x(this.n5));
            break;
         case 1:
            w8s.n5(this.l6, new a1v(this.n5));
            break;
         case 2:
            w8s.n5(this.l6, new m3e(this.n5));
            break;
         case 3:
            w8s.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
