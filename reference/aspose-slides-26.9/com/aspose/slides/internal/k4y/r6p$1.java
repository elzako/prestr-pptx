package com.aspose.slides.internal.k4y;

class r6p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6p l6;

   r6p$1(r6p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6p.k5().n5(this.n5.n3())) {
         case 0:
            r6p.n5(this.l6, new l2q(this.n5));
            break;
         case 1:
            r6p.n5(this.l6, new q8g(this.n5));
            break;
         case 2:
            r6p.n5(this.l6, new g7("sp", new j5z(this.n5)));
            break;
         case 3:
            r6p.n5(this.l6, new g7("grpSp", new p0q(this.n5)));
            break;
         case 4:
            r6p.n5(this.l6, new g7("graphicFrame", new h0m(this.n5)));
            break;
         case 5:
            r6p.n5(this.l6, new g7("cxnSp", new h1z(this.n5)));
            break;
         case 6:
            r6p.n5(this.l6, new g7("pic", new b3w(this.n5)));
            break;
         case 7:
            r6p.n5(this.l6, new v9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
