package com.aspose.slides.internal.k4y;

class r9g$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r9g l6;

   r9g$2(r9g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r9g.n5().n5(this.n5.n3())) {
         case 2:
            r9g.n5(this.l6, new q4v(this.n5));
            break;
         case 3:
            r9g.n5(this.l6, new u7g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
