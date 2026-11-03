package com.aspose.slides.internal.k4y;

class x9u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x9u l6;

   x9u$2(x9u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x9u.u3().n5(this.n5.n3())) {
         case 1:
            x9u.n5(this.l6, new y4k(this.n5));
            break;
         case 2:
            x9u.n5(this.l6, new s2b(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
