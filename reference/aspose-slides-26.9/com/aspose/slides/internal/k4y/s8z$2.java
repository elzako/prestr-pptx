package com.aspose.slides.internal.k4y;

class s8z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s8z l6;

   s8z$2(s8z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s8z.n5().n5(this.n5.n3())) {
         case 15:
            s8z.n5(this.l6, new l7j(this.n5));
            break;
         case 16:
            s8z.n5(this.l6, new c6x(this.n5));
            break;
         case 17:
            u1x var2 = new u1x(this.n5);
            s8z.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
