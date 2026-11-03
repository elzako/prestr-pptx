package com.aspose.slides.internal.k4y;

class o9d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o9d l6;

   o9d$1(o9d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o9d.k5().n5(this.n5.n3())) {
         case 0:
            o9d.n5(this.l6, new f6p(this.n5));
            break;
         case 1:
            o9d.n5(this.l6, new y6e(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
