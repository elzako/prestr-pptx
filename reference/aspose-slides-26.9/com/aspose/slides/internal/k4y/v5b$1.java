package com.aspose.slides.internal.k4y;

class v5b$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v5b l6;

   v5b$1(v5b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v5b.u3().n5(this.n5.n3())) {
         case 0:
            v5b.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            v5b.n5(this.l6, new c6(this.n5));
            break;
         case 2:
            v5b.n5(this.l6, new s1q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
