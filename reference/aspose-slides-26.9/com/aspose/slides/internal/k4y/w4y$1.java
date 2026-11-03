package com.aspose.slides.internal.k4y;

class w4y$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w4y l6;

   w4y$1(w4y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w4y.n5().n5(this.n5.n3())) {
         case 0:
            w4y.n5(this.l6, new g7("size", new l9i(this.n5)));
            break;
         case 1:
            w4y.n5(this.l6, new g7("sizeAuto", new a5j(this.n5)));
            break;
         case 2:
            w4y.n5(this.l6, new a5j(this.n5));
            break;
         case 3:
            w4y.l6(this.l6, new a5j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
