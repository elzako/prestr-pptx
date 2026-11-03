package com.aspose.slides.internal.k4y;

class d8y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d8y l6;

   d8y$2(d8y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d8y.u9().n5(this.n5.n3())) {
         case 2:
            d8y.n5(this.l6, new q0y(this.n5));
            break;
         case 3:
            d8y.n5(this.l6, new e3(this.n5));
            break;
         case 4:
            d8y.n5(this.l6, new b9y(this.n5));
            break;
         case 5:
            d8y.n5(this.l6, new d9m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
