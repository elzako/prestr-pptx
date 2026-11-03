package com.aspose.slides.internal.k4y;

class h3m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h3m l6;

   h3m$1(h3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h3m.n5().n5(this.n5.n3())) {
         case 0:
            h3m.n5(this.l6, new h7z(this.n5));
            break;
         case 1:
            h3m.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
