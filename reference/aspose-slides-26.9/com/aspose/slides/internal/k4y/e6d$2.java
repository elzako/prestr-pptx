package com.aspose.slides.internal.k4y;

class e6d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e6d l6;

   e6d$2(e6d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e6d.a6().n5(this.n5.n3())) {
         case 4:
            e6d.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            e6d.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
