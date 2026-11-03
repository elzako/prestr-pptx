package com.aspose.slides.internal.k4y;

class r0a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r0a l6;

   r0a$1(r0a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r0a.u9().n5(this.n5.n3())) {
         case 0:
            r0a.n5(this.l6, new k7t(this.n5));
            break;
         case 1:
            r0a.n5(this.l6, new b9y(this.n5));
            break;
         case 2:
            r0a.n5(this.l6, new d9m(this.n5));
            break;
         case 3:
            r0a.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
