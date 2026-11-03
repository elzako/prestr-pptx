package com.aspose.slides.internal.k4y;

class s1o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s1o l6;

   s1o$2(s1o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s1o.a6().n5(this.n5.n3())) {
         case 1:
            s1o.n5(this.l6, new g2x(this.n5));
            break;
         case 2:
            s1o.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
