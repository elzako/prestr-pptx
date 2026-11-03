package com.aspose.slides.internal.k4y;

class d5g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d5g l6;

   d5g$1(d5g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d5g.n5().n5(this.n5.n3())) {
         case 0:
            v7z var2 = new v7z(this.n5);
            d5g.n5(this.l6).addItem(var2);
            break;
         case 1:
            d5g.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
