package com.aspose.slides.internal.k4y;

class i9$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i9 l6;

   i9$2(i9 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i9.h0().n5(this.n5.n3())) {
         case 2:
            i9.n5(this.l6, new f2a(this.n5));
            break;
         case 3:
            i9.n5(this.l6, new c1(this.n5));
            break;
         case 4:
            i9.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
