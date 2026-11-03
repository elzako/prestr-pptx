package com.aspose.slides.internal.k4y;

class k6l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k6l l6;

   k6l$1(k6l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k6l.u3().n5(this.n5.n3())) {
         case 0:
            k6l.n5(this.l6, new m6v(this.n5));
            break;
         case 1:
            k6l.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            k6l.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
