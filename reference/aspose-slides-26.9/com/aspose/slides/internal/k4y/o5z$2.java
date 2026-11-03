package com.aspose.slides.internal.k4y;

class o5z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o5z l6;

   o5z$2(o5z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o5z.u3().n5(this.n5.n3())) {
         case 1:
            o5z.n5(this.l6, new v6p(this.n5));
            break;
         case 2:
            o5z.l6(this.l6, new v6p(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
