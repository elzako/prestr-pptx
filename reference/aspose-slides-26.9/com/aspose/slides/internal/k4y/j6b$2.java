package com.aspose.slides.internal.k4y;

class j6b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j6b l6;

   j6b$2(j6b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j6b.n5().n5(this.n5.n3())) {
         case 1:
            j6b.n5(this.l6, new y8d(this.n5));
            break;
         case 2:
            j6b.n5(this.l6, new c7h(this.n5));
            break;
         case 3:
            j6b.l6(this.l6, new y8d(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
