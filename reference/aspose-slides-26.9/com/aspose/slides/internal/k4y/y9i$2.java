package com.aspose.slides.internal.k4y;

class y9i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y9i l6;

   y9i$2(y9i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y9i.n5().n5(this.n5.n3())) {
         case 2:
            y9i.n5(this.l6, new z4(this.n5));
            break;
         case 3:
            y9i.n5(this.l6, new h7z(this.n5));
            break;
         case 4:
            y9i.n5(this.l6, new o5k(this.n5));
            break;
         case 5:
            y9i.l6(this.l6, new o5k(this.n5));
            break;
         case 6:
            y9i.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
