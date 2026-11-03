package com.aspose.slides.internal.k4y;

class d2o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d2o l6;

   d2o$2(d2o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d2o.k5().n5(this.n5.n3())) {
         case 1:
            d2o.n5(this.l6, new t2w(this.n5));
            break;
         case 2:
            d2o.n5(this.l6, new d6q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
