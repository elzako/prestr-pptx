package com.aspose.slides.internal.k4y;

class x3s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x3s l6;

   x3s$1(x3s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x3s.a6().n5(this.n5.n3())) {
         case 0:
            x3s.n5(this.l6, new i9o(this.n5));
            break;
         case 1:
            x3s.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            x3s.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
