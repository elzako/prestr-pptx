package com.aspose.slides.internal.k4y;

class z7$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z7 l6;

   z7$1(z7 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z7.a6().n5(this.n5.n3())) {
         case 0:
            z7.n5(this.l6, new f2a(this.n5));
            break;
         case 1:
            z7.n5(this.l6, new d0(this.n5));
            break;
         case 2:
            z7.n5(this.l6, new c1v(this.n5));
            break;
         case 3:
            z7.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
