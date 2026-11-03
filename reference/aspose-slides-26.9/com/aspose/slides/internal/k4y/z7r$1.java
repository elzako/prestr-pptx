package com.aspose.slides.internal.k4y;

class z7r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z7r l6;

   z7r$1(z7r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z7r.n5().n5(this.n5.n3())) {
         case 0:
            z7r.n5(this.l6, new u1u(this.n5));
            break;
         case 1:
            z7r.n5(this.l6, new f7o(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
