package com.aspose.slides.internal.k4y;

class n6s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n6s l6;

   n6s$2(n6s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n6s.n5().n5(this.n5.n3())) {
         case 14:
            n6s.n5(this.l6, new s4r(this.n5));
            break;
         case 15:
            d5f var2 = new d5f(this.n5);
            n6s.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
