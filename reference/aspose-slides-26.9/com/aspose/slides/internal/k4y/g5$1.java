package com.aspose.slides.internal.k4y;

class g5$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g5 l6;

   g5$1(g5 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g5.a6().n5(this.n5.n3())) {
         case 0:
            g5.n5(this.l6, new f6(this.n5));
            break;
         case 1:
            g5.n5(this.l6, new e3m(this.n5));
            break;
         case 2:
            g5.n5(this.l6, new u7c(this.n5));
            break;
         case 3:
            g5.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
