package com.aspose.slides.internal.k4y;

class l4s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l4s l6;

   l4s$2(l4s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l4s.a6().n5(this.n5.n3())) {
         case 1:
            l4s.n5(this.l6, new b9y(this.n5));
            break;
         case 2:
            l4s.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
