package com.aspose.slides.internal.k4y;

class k4r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k4r l6;

   k4r$2(k4r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k4r.n5().n5(this.n5.n3())) {
         case 6:
            k4r.n5(this.l6, new s4r(this.n5));
            break;
         case 7:
            a4h var2 = new a4h(this.n5);
            k4r.n5(this.l6).addItem(var2);
            break;
         case 8:
            p8x var3 = new p8x(this.n5);
            k4r.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
