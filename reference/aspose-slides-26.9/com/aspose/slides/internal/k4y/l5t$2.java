package com.aspose.slides.internal.k4y;

class l5t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l5t l6;

   l5t$2(l5t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l5t.n5().n5(this.n5.n3())) {
         case 9:
            l5t.n5(this.l6, new l7j(this.n5));
            break;
         case 10:
            l5t.n5(this.l6, new c6x(this.n5));
            break;
         case 11:
            j5m var2 = new j5m(this.n5);
            l5t.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
