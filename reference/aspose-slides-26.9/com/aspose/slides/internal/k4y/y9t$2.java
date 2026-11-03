package com.aspose.slides.internal.k4y;

class y9t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y9t l6;

   y9t$2(y9t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y9t.u3().n5(this.n5.n3())) {
         case 1:
            y9t.n5(this.l6, new d1w(this.n5));
            break;
         case 2:
            y9t.n5(this.l6, new m8y(this.n5));
            break;
         case 3:
            y9t.n5(this.l6, new e1u(this.n5));
            break;
         case 4:
            y9t.n5(this.l6, new r1l(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
