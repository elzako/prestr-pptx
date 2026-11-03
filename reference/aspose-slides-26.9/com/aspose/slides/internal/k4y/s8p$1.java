package com.aspose.slides.internal.k4y;

class s8p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s8p l6;

   s8p$1(s8p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s8p.u3().n5(this.n5.n3())) {
         case 0:
            s8p.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            s8p.n5(this.l6, new z1n(this.n5));
            break;
         case 2:
            s8p.n5(this.l6, new s1q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
