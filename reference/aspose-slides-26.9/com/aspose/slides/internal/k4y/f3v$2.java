package com.aspose.slides.internal.k4y;

class f3v$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f3v l6;

   f3v$2(f3v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f3v.k5().n5(this.n5.n3())) {
         case 1:
            f3v.n5(this.l6, new c3j(this.n5));
            break;
         case 2:
            f3v.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
