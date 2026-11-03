package com.aspose.slides.internal.k4y;

class x7u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x7u l6;

   x7u$1(x7u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x7u.c8().n5(this.n5.n3())) {
         case 0:
            x7u.n5(this.l6, new m5k(this.n5));
            break;
         case 1:
            x7u.n5(this.l6, new t4p(this.n5));
            break;
         case 2:
            x7u.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            x7u.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
