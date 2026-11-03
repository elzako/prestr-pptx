package com.aspose.slides.internal.k4y;

class w3g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w3g l6;

   w3g$1(w3g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w3g.c8().n5(this.n5.n3())) {
         case 0:
            w3g.n5(this.l6, new m4f(this.n5));
            break;
         case 1:
            w3g.n5(this.l6, new k8x(this.n5));
            break;
         case 2:
            w3g.n5(this.l6, new g3p(this.n5));
            break;
         case 3:
            w3g.l6(this.l6, new g3p(this.n5));
            break;
         case 4:
            w3g.k5(this.l6, new g3p(this.n5));
            break;
         case 5:
            w3g.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
