package com.aspose.slides.internal.k4y;

class y4k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y4k l6;

   y4k$1(y4k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y4k.k5().n5(this.n5.n3())) {
         case 0:
            y4k.n5(this.l6, new g3y(this.n5));
            break;
         case 1:
            y4k.l6(this.l6, new g3y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
