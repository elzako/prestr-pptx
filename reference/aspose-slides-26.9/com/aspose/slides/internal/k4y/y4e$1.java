package com.aspose.slides.internal.k4y;

class y4e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y4e l6;

   y4e$1(y4e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y4e.n5().n5(this.n5.n3())) {
         case 0:
            y4e.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            y4e.n5(this.l6, new u7f(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
