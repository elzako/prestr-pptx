package com.aspose.slides.internal.k4y;

class b3x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b3x l6;

   b3x$1(b3x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b3x.k5().n5(this.n5.n3())) {
         case 0:
            b3x.n5(this.l6, new n2q(this.n5));
            break;
         case 1:
            b3x.n5(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
