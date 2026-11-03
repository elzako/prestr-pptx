package com.aspose.slides.internal.k4y;

class d8p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d8p l6;

   d8p$1(d8p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d8p.u3().n5(this.n5.n3())) {
         case 0:
            d8p.n5(this.l6, new m0s(this.n5));
            break;
         case 1:
            d8p.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
