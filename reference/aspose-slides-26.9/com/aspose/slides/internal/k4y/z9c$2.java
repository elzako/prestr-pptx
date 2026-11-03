package com.aspose.slides.internal.k4y;

class z9c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z9c l6;

   z9c$2(z9c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z9c.t2().n5(this.n5.n3())) {
         case 6:
            z9c.n5(this.l6, new y1g(this.n5));
            break;
         case 7:
            z9c.n5(this.l6, new a6(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
