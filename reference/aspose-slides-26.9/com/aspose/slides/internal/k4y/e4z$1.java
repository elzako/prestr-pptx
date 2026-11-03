package com.aspose.slides.internal.k4y;

class e4z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e4z l6;

   e4z$1(e4z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e4z.n5().n5(this.n5.n3())) {
         case 0:
            e4z.n5(this.l6, new q2u(this.n5));
            break;
         case 1:
            e4z.n5(this.l6, new u8b(this.n5));
            break;
         case 2:
            e4z.n5(this.l6, new w6(this.n5));
            break;
         case 3:
            e4z.n5(this.l6, new t7p(this.n5));
            break;
         case 4:
            e4z.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
