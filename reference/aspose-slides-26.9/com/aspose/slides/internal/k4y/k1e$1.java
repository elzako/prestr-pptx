package com.aspose.slides.internal.k4y;

class k1e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k1e l6;

   k1e$1(k1e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k1e.n5().n5(this.n5.n3())) {
         case 0:
            k1e.n5(this.l6, new o5k(this.n5));
            break;
         case 1:
            k1e.n5(this.l6, new o7b(this.n5));
            break;
         case 2:
            k1e.l6(this.l6, new o5k(this.n5));
            break;
         case 3:
            k1e.n5(this.l6, new g7("orthographic", new h3m(this.n5)));
            break;
         case 4:
            k1e.n5(this.l6, new g7("perspective", new f1b(this.n5)));
            break;
         case 5:
            k1e.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
