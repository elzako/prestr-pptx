package com.aspose.slides.internal.k4y;

class d1w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d1w l6;

   d1w$1(d1w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d1w.n5().n5(this.n5.n3())) {
         case 0:
            t4x var2 = new t4x(this.n5);
            d1w.n5(this.l6).addItem(var2);
            break;
         case 1:
            d1w.n5(this.l6, new c6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
