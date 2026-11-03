package com.aspose.slides.internal.k4y;

class j2a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j2a l6;

   j2a$1(j2a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j2a.n5().n5(this.n5.n3())) {
         case 0:
            j2a.n5(this.l6, new d5n(this.n5));
            break;
         case 1:
            j2a.n5(this.l6, new v2f(this.n5));
            break;
         case 2:
            j2a.n5(this.l6, new g2g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
