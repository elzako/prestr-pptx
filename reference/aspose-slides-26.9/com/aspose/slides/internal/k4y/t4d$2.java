package com.aspose.slides.internal.k4y;

class t4d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4d l6;

   t4d$2(t4d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4d.t4().n5(this.n5.n3())) {
         case 13:
            t4d.n5(this.l6, new g4t(this.n5));
            break;
         case 14:
            t4d.n5(this.l6, new b1w(this.n5));
            break;
         case 15:
            t4d.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
