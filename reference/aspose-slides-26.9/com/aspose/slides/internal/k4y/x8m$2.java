package com.aspose.slides.internal.k4y;

class x8m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x8m l6;

   x8m$2(x8m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x8m.s7().n5(this.n5.n3())) {
         case 8:
            x8m.n5(this.l6, new j1w(this.n5));
            break;
         case 9:
            x8m.n5(this.l6, new j9d(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
