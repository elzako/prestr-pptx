package com.aspose.slides.internal.k4y;

class i2h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i2h l6;

   i2h$2(i2h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i2h.n5().n5(this.n5.n3())) {
         case 17:
            i2h.n5(this.l6, new l7j(this.n5));
            break;
         case 18:
            i2h.n5(this.l6, new c6x(this.n5));
            break;
         case 19:
            y6x var2 = new y6x(this.n5);
            i2h.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
