package com.aspose.slides.internal.k4y;

class r1l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r1l l6;

   r1l$1(r1l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r1l.l6().n5(this.n5.n3())) {
         case 0:
            r1l.n5(this.l6, new g7("text", new x2d(this.n5)));
            break;
         case 1:
            r1l.n5(this.l6, new g7("drawing", new k3k(this.n5)));
            break;
         case 2:
            r1l.n5(this.l6, new g7("presentation", new l4i(this.n5)));
            break;
         case 3:
            r1l.n5(this.l6, new g7("spreadsheet", new c2p(this.n5)));
            break;
         case 4:
            r1l.n5(this.l6, new g7("chart", new a5l(this.n5)));
            break;
         case 5:
            r1l.n5(this.l6, new g7("image", new h5z(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
