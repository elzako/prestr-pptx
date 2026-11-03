package com.aspose.slides.internal.k4y;

class u1j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u1j l6;

   u1j$1(u1j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u1j.l6().n5(this.n5.n3())) {
         case 0:
            u1j.n5(this.l6, new j0v(this.n5));
            break;
         case 1:
            u1j.n5(this.l6, new w1x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
