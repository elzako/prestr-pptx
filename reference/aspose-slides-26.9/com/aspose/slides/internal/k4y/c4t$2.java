package com.aspose.slides.internal.k4y;

class c4t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c4t l6;

   c4t$2(c4t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c4t.x8().n5(this.n5.n3())) {
         case 5:
            c4t.n5(this.l6, new x6s(this.n5));
            break;
         case 6:
            c4t.l6(this.l6, new x6s(this.n5));
            break;
         case 7:
            c4t.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
