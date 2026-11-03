package com.aspose.slides.internal.k4y;

class b4o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b4o l6;

   b4o$2(b4o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b4o.n5().n5(this.n5.n3())) {
         case 1:
            d5t var2 = new d5t(this.n5);
            b4o.n5(this.l6).addItem(var2);
            break;
         case 2:
            b4o.n5(this.l6, new m0y(this.n5));
            break;
         case 3:
            b4o.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
