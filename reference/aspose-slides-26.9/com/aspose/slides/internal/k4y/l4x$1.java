package com.aspose.slides.internal.k4y;

class l4x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l4x l6;

   l4x$1(l4x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l4x.u9().n5(this.n5.n3())) {
         case 0:
            l4x.n5(this.l6, new m4f(this.n5));
            break;
         case 1:
            l4x.n5(this.l6, new m0s(this.n5));
            break;
         case 2:
            l4x.l6(this.l6, new m0s(this.n5));
            break;
         case 3:
            l4x.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
