package com.aspose.slides.internal.k4y;

class e8y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e8y l6;

   e8y$2(e8y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e8y.n5().n5(this.n5.n3())) {
         case 20:
            e8y.n5(this.l6, new l7j(this.n5));
            break;
         case 21:
            e8y.n5(this.l6, new c6x(this.n5));
            break;
         case 22:
            k0w var2 = new k0w(this.n5);
            e8y.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
