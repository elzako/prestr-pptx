package com.aspose.slides.internal.k4y;

class h6l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h6l l6;

   h6l$1(h6l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h6l.a6().n5(this.n5.n3())) {
         case 0:
            h6l.n5(this.l6, new y3(this.n5));
            break;
         case 1:
            h6l.n5(this.l6, new r5d(this.n5));
            break;
         case 2:
            h6l.n5(this.l6, new i5(this.n5));
            break;
         case 3:
            h6l.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
