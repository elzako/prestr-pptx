package com.aspose.slides.internal.k4y;

class n1w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n1w l6;

   n1w$1(n1w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n1w.l6().n5(this.n5.n3())) {
         case 0:
            n1w.n5(this.l6, new d2c(this.n5));
            break;
         case 1:
            n1w.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
