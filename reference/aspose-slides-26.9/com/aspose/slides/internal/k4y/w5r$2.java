package com.aspose.slides.internal.k4y;

class w5r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w5r l6;

   w5r$2(w5r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w5r.u3().n5(this.n5.n3())) {
         case 5:
            w5r.n5(this.l6, new z4(this.n5));
            break;
         case 6:
            w5r.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
