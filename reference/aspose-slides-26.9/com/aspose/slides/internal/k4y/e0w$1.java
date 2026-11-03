package com.aspose.slides.internal.k4y;

class e0w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e0w l6;

   e0w$1(e0w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e0w.u3().n5(this.n5.n3())) {
         case 0:
            e0w.n5(this.l6, new c3d(this.n5));
            break;
         case 1:
            e0w.n5(this.l6, new p6k(this.n5));
            break;
         case 2:
            e0w.n5(this.l6, new o9n(this.n5));
            break;
         case 3:
            e0w.n5(this.l6, new d3v(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
