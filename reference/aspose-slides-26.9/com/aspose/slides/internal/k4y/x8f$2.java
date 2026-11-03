package com.aspose.slides.internal.k4y;

class x8f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x8f l6;

   x8f$2(x8f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x8f.n5().n5(this.n5.n3())) {
         case 9:
            x8f.n5(this.l6, new s4r(this.n5));
            break;
         case 10:
            g5s var2 = new g5s(this.n5);
            x8f.n5(this.l6).addItem(var2);
            break;
         case 11:
            p8x var3 = new p8x(this.n5);
            x8f.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
