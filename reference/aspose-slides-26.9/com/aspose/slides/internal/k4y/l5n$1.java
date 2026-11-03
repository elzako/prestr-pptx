package com.aspose.slides.internal.k4y;

class l5n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l5n l6;

   l5n$1(l5n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l5n.n5().n5(this.n5.n3())) {
         case 0:
            n3y var2 = new n3y(this.n5);
            l5n.n5(this.l6).addItem(var2);
            break;
         case 1:
            l5n.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
