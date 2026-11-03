package com.aspose.slides.internal.k4y;

class j8h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j8h l6;

   j8h$2(j8h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j8h.n5().n5(this.n5.n3())) {
         case 3:
            j8h.n5(this.l6, new z4(this.n5));
            break;
         case 4:
            j8h.n5(this.l6, new h7z(this.n5));
            break;
         case 5:
            j8h.n5(this.l6, new o5k(this.n5));
            break;
         case 6:
            j8h.l6(this.l6, new o5k(this.n5));
            break;
         case 7:
            j8h.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
