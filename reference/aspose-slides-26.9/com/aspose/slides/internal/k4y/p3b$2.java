package com.aspose.slides.internal.k4y;

class p3b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p3b l6;

   p3b$2(p3b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p3b.k5().n5(this.n5.n3())) {
         case 1:
            p3b.n5(this.l6, new h6l(this.n5));
            break;
         case 2:
            p3b.n5(this.l6, new q9u(this.n5));
            break;
         case 3:
            p3b.n5(this.l6, new b2v(this.n5));
            break;
         case 4:
            p3b.n5(this.l6, new d9m(this.n5));
            break;
         case 5:
            p3b.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
