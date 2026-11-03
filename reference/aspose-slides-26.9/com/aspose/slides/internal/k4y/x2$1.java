package com.aspose.slides.internal.k4y;

class x2$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x2 l6;

   x2$1(x2 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x2.l6().n5(this.n5.n3())) {
         case 0:
            q4o var2 = new q4o(this.n5);
            x2.n5(this.l6).addItem(new g7("ahXY", var2));
            break;
         case 1:
            n1g var3 = new n1g(this.n5);
            x2.n5(this.l6).addItem(new g7("ahPolar", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
