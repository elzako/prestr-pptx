package com.aspose.slides.internal.k4y;

class t3c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t3c l6;

   t3c$1(t3c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t3c.n5().n5(this.n5.n3())) {
         case 0:
            t3c.n5(this.l6, new n4b(this.n5));
            break;
         case 1:
            t3c.n5(this.l6, new b9q(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
