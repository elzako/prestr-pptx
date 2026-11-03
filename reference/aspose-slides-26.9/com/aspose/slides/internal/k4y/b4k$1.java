package com.aspose.slides.internal.k4y;

class b4k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b4k l6;

   b4k$1(b4k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b4k.n5().n5(this.n5.n3())) {
         case 0:
            b4k.n5(this.l6, new k4b(this.n5));
            break;
         case 1:
            b4k.l6(this.l6, new k4b(this.n5));
            break;
         case 2:
            y4q var2 = new y4q(this.n5);
            b4k.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
