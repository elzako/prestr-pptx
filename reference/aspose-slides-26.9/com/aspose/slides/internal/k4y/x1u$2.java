package com.aspose.slides.internal.k4y;

class x1u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x1u l6;

   x1u$2(x1u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x1u.t9().n5(this.n5.n3())) {
         case 1:
            x1u.n5(this.l6, new s8p(this.n5));
            break;
         case 2:
            x1u.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            x1u.n5(this.l6, new d9m(this.n5));
            break;
         case 4:
            x1u.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            x1u.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
