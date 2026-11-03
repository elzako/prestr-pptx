package com.aspose.slides.internal.k4y;

class q0y$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q0y l6;

   q0y$1(q0y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q0y.u3().n5(this.n5.n3())) {
         case 0:
            q0y.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            q0y.n5(this.l6, new s1o(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
