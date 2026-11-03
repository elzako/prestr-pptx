package com.aspose.slides.internal.k4y;

class d9l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d9l l6;

   d9l$1(d9l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d9l.u3().n5(this.n5.n3())) {
         case 0:
            d9l.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            d9l.n5(this.l6, new u7f(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
