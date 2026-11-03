package com.aspose.slides.internal.k4y;

class g3o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g3o l6;

   g3o$2(g3o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g3o.k5().n5(this.n5.n3())) {
         case 3:
            x8c var2 = new x8c(this.n5);
            g3o.n5(this.l6).addItem(var2);
            break;
         case 4:
            g3o.n5(this.l6, new v6p(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
