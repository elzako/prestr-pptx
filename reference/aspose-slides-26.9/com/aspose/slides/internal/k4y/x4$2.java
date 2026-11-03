package com.aspose.slides.internal.k4y;

class x4$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x4 l6;

   x4$2(x4 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x4.u3().n5(this.n5.n3())) {
         case 1:
            x4.n5(this.l6, new z4(this.n5));
            break;
         case 2:
            x4.l6(this.l6, new z4(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
