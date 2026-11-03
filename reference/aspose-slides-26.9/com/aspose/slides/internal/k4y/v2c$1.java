package com.aspose.slides.internal.k4y;

class v2c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v2c l6;

   v2c$1(v2c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v2c.a6().n5(this.n5.n3())) {
         case 0:
            v2c.n5(this.l6, new g7("custUnit", new x8w(this.n5)));
            break;
         case 1:
            v2c.n5(this.l6, new g7("builtInUnit", new l3a(this.n5)));
            break;
         case 2:
            v2c.n5(this.l6, new s0c(this.n5));
            break;
         case 3:
            v2c.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
