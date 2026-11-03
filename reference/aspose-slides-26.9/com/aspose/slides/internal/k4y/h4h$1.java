package com.aspose.slides.internal.k4y;

class h4h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h4h l6;

   h4h$1(h4h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h4h.l6().n5(this.n5.n3())) {
         case 0:
            h4h.n5(this.l6, new d7b(this.n5));
            break;
         case 1:
            h4h.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
