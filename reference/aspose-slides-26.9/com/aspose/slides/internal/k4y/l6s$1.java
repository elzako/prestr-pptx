package com.aspose.slides.internal.k4y;

class l6s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l6s l6;

   l6s$1(l6s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l6s.u9().n5(this.n5.n3())) {
         case 0:
            l6s.n5(this.l6, new g7("numRef", new z3o(this.n5)));
            break;
         case 1:
            l6s.n5(this.l6, new g7("numLit", new a8e(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
