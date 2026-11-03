package com.aspose.slides.internal.k4y;

class f7s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f7s l6;

   f7s$1(f7s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f7s.u9().n5(this.n5.n3())) {
         case 0:
            f7s.n5(this.l6, new c0z(this.n5));
            break;
         case 1:
            f7s.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            f7s.l6(this.l6, new s0m(this.n5));
            break;
         case 3:
            f7s.k5(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
