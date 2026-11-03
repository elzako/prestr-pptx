package com.aspose.slides.internal.k4y;

class f1t$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f1t l6;

   f1t$1(f1t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f1t.u3().n5(this.n5.n3())) {
         case 0:
            f1t.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            f1t.n5(this.l6, new s1o(this.n5));
            break;
         case 2:
            f1t.n5(this.l6, new s1q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
