package com.aspose.slides.internal.k4y;

class d7b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d7b l6;

   d7b$2(d7b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d7b.u3().n5(this.n5.n3())) {
         case 2:
            d7b.n5(this.l6, new c3j(this.n5));
            break;
         case 3:
            d7b.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
