package com.aspose.slides.internal.k4y;

class v4c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v4c l6;

   v4c$2(v4c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v4c.k5().n5(this.n5.n3())) {
         case 1:
            v4c.n5(this.l6, new g7("bgPr", new h5t(this.n5)));
            break;
         case 2:
            v4c.n5(this.l6, new g7("bgRef", new x2y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
