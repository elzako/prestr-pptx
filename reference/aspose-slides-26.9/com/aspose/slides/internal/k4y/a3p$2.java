package com.aspose.slides.internal.k4y;

class a3p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a3p l6;

   a3p$2(a3p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a3p.u9().n5(this.n5.n3())) {
         case 2:
            a3p.n5(this.l6, new q0g(this.n5));
            break;
         case 3:
            a3p.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            a3p.n5(this.l6, new d9m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
