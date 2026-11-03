package com.aspose.slides.internal.k4y;

class v7$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v7 l6;

   v7$1(v7 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v7.h0().n5(this.n5.n3())) {
         case 0:
            v7.n5(this.l6, new f6(this.n5));
            break;
         case 1:
            v7.n5(this.l6, new e3m(this.n5));
            break;
         case 2:
            v7.n5(this.l6, new u7c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
