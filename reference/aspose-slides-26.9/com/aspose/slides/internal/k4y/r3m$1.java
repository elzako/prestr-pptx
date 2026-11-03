package com.aspose.slides.internal.k4y;

class r3m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r3m l6;

   r3m$1(r3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r3m.u3().n5(this.n5.n3())) {
         case 0:
            r3m.n5(this.l6, new c9u(this.n5));
            break;
         case 1:
            r3m.n5(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
