package com.aspose.slides.internal.k4y;

class u7f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u7f l6;

   u7f$1(u7f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u7f.u3().n5(this.n5.n3())) {
         case 0:
            u7f.n5(this.l6, new h3r(this.n5));
            break;
         case 1:
            u7f.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
