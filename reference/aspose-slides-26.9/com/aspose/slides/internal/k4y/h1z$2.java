package com.aspose.slides.internal.k4y;

class h1z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h1z l6;

   h1z$2(h1z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h1z.n5().n5(this.n5.n3())) {
         case 2:
            h1z.n5(this.l6, new e6o(this.n5));
            break;
         case 3:
            h1z.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            h1z.n5(this.l6, new d9m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
