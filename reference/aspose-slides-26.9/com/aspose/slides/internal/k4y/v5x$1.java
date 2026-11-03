package com.aspose.slides.internal.k4y;

class v5x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v5x l6;

   v5x$1(v5x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v5x.n5().n5(this.n5.n3())) {
         case 0:
            l6p var2 = new l6p(this.n5);
            v5x.n5(this.l6).addItem(var2);
            break;
         case 1:
            v5x.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
