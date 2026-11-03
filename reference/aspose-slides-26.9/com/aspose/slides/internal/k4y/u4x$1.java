package com.aspose.slides.internal.k4y;

class u4x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u4x l6;

   u4x$1(u4x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u4x.n5().n5(this.n5.n3())) {
         case 0:
            u4x.n5(this.l6, new j2k(this.n5));
            break;
         case 1:
            u4x.n5(this.l6, new f1i(this.n5));
            break;
         case 2:
            u4x.n5(this.l6, new y8s(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
