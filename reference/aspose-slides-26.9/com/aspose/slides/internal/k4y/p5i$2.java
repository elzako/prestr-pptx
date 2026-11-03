package com.aspose.slides.internal.k4y;

class p5i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p5i l6;

   p5i$2(p5i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p5i.k5().n5(this.n5.n3())) {
         case 2:
            s6m var2 = new s6m(this.n5);
            p5i.n5(this.l6).addItem(var2);
            break;
         case 3:
            p5i.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
