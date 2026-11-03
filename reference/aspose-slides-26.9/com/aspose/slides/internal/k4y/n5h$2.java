package com.aspose.slides.internal.k4y;

class n5h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n5h l6;

   n5h$2(n5h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n5h.h0().n5(this.n5.n3())) {
         case 2:
            n5h.n5(this.l6, new j3x(this.n5));
            break;
         case 3:
            n5h.n5(this.l6, new x3v(this.n5));
            break;
         case 4:
            n5h.n5(this.l6, new i6f(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
