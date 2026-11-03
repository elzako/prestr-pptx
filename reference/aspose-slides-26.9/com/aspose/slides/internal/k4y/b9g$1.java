package com.aspose.slides.internal.k4y;

class b9g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b9g l6;

   b9g$1(b9g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b9g.a6().n5(this.n5.n3())) {
         case 0:
            b9g.n5(this.l6, new g8l(this.n5));
            break;
         case 1:
            b9g.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            b9g.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
