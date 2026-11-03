package com.aspose.slides.internal.k4y;

class c6$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c6 l6;

   c6$2(c6 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c6.n5().n5(this.n5.n3())) {
         case 1:
            c6.n5(this.l6, new i7(this.n5));
            break;
         case 2:
            c6.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
