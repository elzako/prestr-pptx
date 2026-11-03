package com.aspose.slides.internal.k4y;

class t8f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t8f l6;

   t8f$1(t8f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t8f.a6().n5(this.n5.n3())) {
         case 0:
            t8f.n5(this.l6, new s6h(this.n5));
            break;
         case 1:
            t8f.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            t8f.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
