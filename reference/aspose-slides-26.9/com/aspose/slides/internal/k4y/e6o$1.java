package com.aspose.slides.internal.k4y;

class e6o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e6o l6;

   e6o$1(e6o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e6o.n5().n5(this.n5.n3())) {
         case 0:
            e6o.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            e6o.n5(this.l6, new g1p(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
