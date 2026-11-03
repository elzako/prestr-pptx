package com.aspose.slides.internal.k4y;

class g7i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g7i l6;

   g7i$2(g7i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g7i.a6().n5(this.n5.n3())) {
         case 2:
            g7i.n5(this.l6, new d3l(this.n5));
            break;
         case 3:
            g7i.n5(this.l6, new e8b(this.n5));
            break;
         case 4:
            g7i.n5(this.l6, new l7h(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
