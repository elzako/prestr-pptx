package com.aspose.slides.internal.k4y;

class p2j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p2j l6;

   p2j$1(p2j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p2j.u3().n5(this.n5.n3())) {
         case 0:
            p2j.n5(this.l6, new u2q(this.n5));
            break;
         case 1:
            p2j.n5(this.l6, new k7v(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
