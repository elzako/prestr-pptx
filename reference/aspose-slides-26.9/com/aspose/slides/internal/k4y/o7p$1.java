package com.aspose.slides.internal.k4y;

class o7p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o7p l6;

   o7p$1(o7p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o7p.u3().n5(this.n5.n3())) {
         case 0:
            o7p.n5(this.l6, new w2i(this.n5));
            break;
         case 1:
            o7p.n5(this.l6, new q8g(this.n5));
            break;
         case 2:
            o7p.n5(this.l6, new g7("sp", new p5w(this.n5)));
            break;
         case 3:
            o7p.n5(this.l6, new g7("grpSp", new u7q(this.n5)));
            break;
         case 4:
            o7p.n5(this.l6, new g7("graphicFrame", new g7i(this.n5)));
            break;
         case 5:
            o7p.n5(this.l6, new g7("cxnSp", new a3p(this.n5)));
            break;
         case 6:
            o7p.n5(this.l6, new g7("pic", new d8y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
