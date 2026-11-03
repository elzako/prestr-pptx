package com.aspose.slides.internal.k4y;

class e3m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e3m l6;

   e3m$2(e3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e3m.a6().n5(this.n5.n3())) {
         case 1:
            e3m.n5(this.l6, new p4l(this.n5));
            break;
         case 2:
            e3m.l6(this.l6, new p4l(this.n5));
            break;
         case 3:
            e3m.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
