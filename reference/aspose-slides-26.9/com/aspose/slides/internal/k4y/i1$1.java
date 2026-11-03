package com.aspose.slides.internal.k4y;

class i1$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i1 l6;

   i1$1(i1 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i1.s7().n5(this.n5.n3())) {
         case 0:
            i1.n5(this.l6, new q2u(this.n5));
            break;
         case 1:
            i1.n5(this.l6, new u8b(this.n5));
            break;
         case 2:
            i1.n5(this.l6, new w6(this.n5));
            break;
         case 3:
            i1.n5(this.l6, new t7p(this.n5));
            break;
         case 4:
            i1.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
