package com.aspose.slides.internal.k4y;

class x1s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x1s l6;

   x1s$2(x1s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x1s.h0().n5(this.n5.n3())) {
         case 2:
            x1s.n5(this.l6, new v5b(this.n5));
            break;
         case 3:
            x1s.n5(this.l6, new e8b(this.n5));
            break;
         case 4:
            x1s.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
