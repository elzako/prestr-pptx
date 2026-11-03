package com.aspose.slides.internal.k4y;

class e3$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e3 l6;

   e3$2(e3 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e3.c8().n5(this.n5.n3())) {
         case 2:
            e3.n5(this.l6, new w7(this.n5));
            break;
         case 3:
            e3.n5(this.l6, new p6r(this.n5));
            break;
         case 4:
            e3.n5(this.l6, new g7("tile", new l3e(this.n5)));
            break;
         case 5:
            e3.n5(this.l6, new g7("stretch", new y9r(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
