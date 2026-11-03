package com.aspose.slides.internal.k4y;

class d2c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d2c l6;

   d2c$2(d2c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d2c.k5().n5(this.n5.n3())) {
         case 3:
            d2c.n5(this.l6, new x9u(this.n5));
            break;
         case 4:
            d2c.n5(this.l6, new v5j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
