package com.aspose.slides.internal.k4y;

class x6g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x6g l6;

   x6g$1(x6g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x6g.a6().n5(this.n5.n3())) {
         case 0:
            x6g.n5(this.l6, new w3g(this.n5));
            break;
         case 1:
            x6g.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            x6g.l6(this.l6, new s0m(this.n5));
            break;
         case 3:
            x6g.k5(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
