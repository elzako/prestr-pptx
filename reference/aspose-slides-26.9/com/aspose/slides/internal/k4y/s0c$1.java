package com.aspose.slides.internal.k4y;

class s0c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s0c l6;

   s0c$1(s0c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s0c.t2().n5(this.n5.n3())) {
         case 0:
            s0c.n5(this.l6, new v2o(this.n5));
            break;
         case 1:
            s0c.n5(this.l6, new k2s(this.n5));
            break;
         case 2:
            s0c.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            s0c.n5(this.l6, new j3z(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
