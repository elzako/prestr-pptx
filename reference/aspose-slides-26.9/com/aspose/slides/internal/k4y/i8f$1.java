package com.aspose.slides.internal.k4y;

class i8f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i8f l6;

   i8f$1(i8f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i8f.n5().n5(this.n5.n3())) {
         case 0:
            i8f.n5(this.l6, new h7z(this.n5));
            break;
         case 1:
            i8f.n5(this.l6, new o7b(this.n5));
            break;
         case 2:
            i8f.n5(this.l6, new w5c(this.n5));
            break;
         case 3:
            i8f.n5(this.l6, new i9b(this.n5));
            break;
         case 4:
            i8f.l6(this.l6, new o7b(this.n5));
            break;
         case 5:
            i8f.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
