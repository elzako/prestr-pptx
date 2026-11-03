package com.aspose.slides.internal.k4y;

class v3y$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v3y l6;

   v3y$1(v3y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v3y.u3().n5(this.n5.n3())) {
         case 0:
            v3y.n5(this.l6, new q7j(this.n5));
            break;
         case 1:
            g1i var2 = new g1i(this.n5);
            v3y.n5(this.l6).addItem(var2);
            break;
         case 2:
            v3y.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
