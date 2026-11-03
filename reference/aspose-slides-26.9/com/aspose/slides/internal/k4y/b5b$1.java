package com.aspose.slides.internal.k4y;

class b5b$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b5b l6;

   b5b$1(b5b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b5b.l6().n5(this.n5.n3())) {
         case 0:
            b5b.n5(this.l6, new g7("rgb", new i5j(this.n5)));
            break;
         case 1:
            b5b.n5(this.l6, new g7("hsl", new c4p(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
