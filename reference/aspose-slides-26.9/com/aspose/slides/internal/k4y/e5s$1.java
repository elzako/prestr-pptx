package com.aspose.slides.internal.k4y;

class e5s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e5s l6;

   e5s$1(e5s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e5s.u3().n5(this.n5.n3())) {
         case 0:
            e5s.n5(this.l6, new b9y(this.n5));
            break;
         case 1:
            e5s.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
