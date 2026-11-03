package com.aspose.slides.internal.k4y;

class v1w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v1w l6;

   v1w$1(v1w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v1w.h0().n5(this.n5.n3())) {
         case 0:
            v1w.n5(this.l6, new e8j(this.n5));
            break;
         case 1:
            v1w.n5(this.l6, new b9y(this.n5));
            break;
         case 2:
            v1w.n5(this.l6, new j3z(this.n5));
            break;
         case 3:
            v1w.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
