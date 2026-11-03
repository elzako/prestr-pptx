package com.aspose.slides.internal.k4y;

class l6f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l6f l6;

   l6f$2(l6f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l6f.k5().n5(this.n5.n3())) {
         case 1:
            l6f.n5(this.l6, new j6c(this.n5));
            break;
         case 2:
            l6f.n5(this.l6, new s0d(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
