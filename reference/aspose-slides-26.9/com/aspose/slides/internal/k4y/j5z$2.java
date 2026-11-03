package com.aspose.slides.internal.k4y;

class j5z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j5z l6;

   j5z$2(j5z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j5z.n5().n5(this.n5.n3())) {
         case 4:
            j5z.n5(this.l6, new t2c(this.n5));
            break;
         case 5:
            j5z.n5(this.l6, new b9y(this.n5));
            break;
         case 6:
            j5z.n5(this.l6, new d9m(this.n5));
            break;
         case 7:
            j5z.n5(this.l6, new j3z(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
