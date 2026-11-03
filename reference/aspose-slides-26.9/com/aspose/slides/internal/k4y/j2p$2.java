package com.aspose.slides.internal.k4y;

class j2p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j2p l6;

   j2p$2(j2p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j2p.c8().n5(this.n5.n3())) {
         case 2:
            j2p.n5(this.l6, new w1n(this.n5));
            break;
         case 3:
            j2p.n5(this.l6, new g7("lin", new m5l(this.n5)));
            break;
         case 4:
            j2p.n5(this.l6, new g7("path", new l1b(this.n5)));
            break;
         case 5:
            j2p.n5(this.l6, new p6r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
