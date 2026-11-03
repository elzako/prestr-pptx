package com.aspose.slides.internal.k4y;

class k6r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k6r l6;

   k6r$1(k6r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k6r.e2().n5(this.n5.n3())) {
         case 0:
            k6r.n5(this.l6, new h2v(this.n5));
            break;
         case 1:
            p2n var2 = new p2n(this.n5);
            k6r.n5(this.l6).addItem(var2);
            break;
         case 2:
            k6r.n5(this.l6, new v2o(this.n5));
            break;
         case 3:
            k6r.n5(this.l6, new c8q(this.n5));
            break;
         case 4:
            k6r.n5(this.l6, new b9y(this.n5));
            break;
         case 5:
            k6r.n5(this.l6, new j3z(this.n5));
            break;
         case 6:
            k6r.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
