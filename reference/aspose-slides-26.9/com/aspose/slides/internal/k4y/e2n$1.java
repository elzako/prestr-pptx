package com.aspose.slides.internal.k4y;

class e2n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e2n l6;

   e2n$1(e2n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e2n.n5().n5(this.n5.n3())) {
         case 0:
            u5q var2 = new u5q(this.n5);
            e2n.n5(this.l6).addItem(new g7("font-face-uri", var2));
            break;
         case 1:
            v6o var3 = new v6o(this.n5);
            e2n.n5(this.l6).addItem(new g7("font-face-name", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
