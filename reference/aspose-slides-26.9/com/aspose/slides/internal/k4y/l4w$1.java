package com.aspose.slides.internal.k4y;

class l4w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l4w l6;

   l4w$1(l4w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l4w.l6().n5(this.n5.n3())) {
         case 0:
            l4w.n5(this.l6, new g7("ln", new r5w(this.n5)));
            break;
         case 1:
            l4w.n5(this.l6, new g7("lnRef", new x2y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
