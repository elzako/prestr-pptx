package com.aspose.slides.internal.k4y;

class n3m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n3m l6;

   n3m$2(n3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n3m.u9().n5(this.n5.n3())) {
         case 3:
            n3m.n5(this.l6, new u2q(this.n5));
            break;
         case 4:
            n3m.n5(this.l6, new k7v(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
