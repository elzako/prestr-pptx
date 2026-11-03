package com.aspose.slides.internal.k4y;

class b3w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b3w l6;

   b3w$2(b3w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b3w.n5().n5(this.n5.n3())) {
         case 2:
            b3w.n5(this.l6, new w3v(this.n5));
            break;
         case 3:
            b3w.n5(this.l6, new e3(this.n5));
            break;
         case 4:
            b3w.n5(this.l6, new b9y(this.n5));
            break;
         case 5:
            b3w.n5(this.l6, new d9m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
