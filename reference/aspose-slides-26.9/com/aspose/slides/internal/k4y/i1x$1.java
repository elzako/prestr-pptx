package com.aspose.slides.internal.k4y;

class i1x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i1x l6;

   i1x$1(i1x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i1x.l6().n5(this.n5.n3())) {
         case 0:
            w5r var2 = new w5r(this.n5);
            i1x.n5(this.l6).addItem(var2);
            break;
         case 1:
            i1x.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
