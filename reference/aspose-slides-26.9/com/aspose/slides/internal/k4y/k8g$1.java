package com.aspose.slides.internal.k4y;

class k8g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k8g l6;

   k8g$1(k8g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k8g.u9().n5(this.n5.n3())) {
         case 0:
            k8g.n5(this.l6, new h7e(this.n5));
            break;
         case 1:
            k8g.n5(this.l6, new h5h(this.n5));
            break;
         case 2:
            k8g.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
