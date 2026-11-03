package com.aspose.slides.internal.k4y;

class n4a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n4a l6;

   n4a$1(n4a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n4a.l6().n5(this.n5.n3())) {
         case 0:
            n4a.n5(this.l6, new x9u(this.n5));
            return false;
         case 1:
            n4a.n5(this.l6, new l9h(this.n5));
            break;
         case 2:
            n4a.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
