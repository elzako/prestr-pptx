package com.aspose.slides.internal.k4y;

class e2p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e2p l6;

   e2p$2(e2p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e2p.n5().n5(this.n5.n3())) {
         case 2:
            m0r var2 = new m0r(this.n5);
            e2p.n5(this.l6).addItem(var2);
            break;
         case 3:
            s4n var3 = new s4n(this.n5);
            e2p.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
