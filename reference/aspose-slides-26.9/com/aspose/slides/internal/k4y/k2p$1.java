package com.aspose.slides.internal.k4y;

class k2p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k2p l6;

   k2p$1(k2p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k2p.u3().n5(this.n5.n3())) {
         case 0:
            k2p.n5(this.l6, new r7c(this.n5));
            break;
         case 1:
            k2p.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
