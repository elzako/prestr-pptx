package com.aspose.slides.internal.k4y;

class j7d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j7d l6;

   j7d$2(j7d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j7d.a6().n5(this.n5.n3())) {
         case 1:
            j7d.n5(this.l6, new b9y(this.n5));
            break;
         case 2:
            j7d.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
