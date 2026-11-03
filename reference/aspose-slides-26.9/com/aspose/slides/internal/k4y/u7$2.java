package com.aspose.slides.internal.k4y;

class u7$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u7 l6;

   u7$2(u7 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u7.u3().n5(this.n5.n3())) {
         case 1:
            u7.n5(this.l6, new h8(this.n5));
            break;
         case 2:
            u7.n5(this.l6, new r5d(this.n5));
            break;
         case 3:
            u7.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
