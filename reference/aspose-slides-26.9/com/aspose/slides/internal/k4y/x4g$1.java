package com.aspose.slides.internal.k4y;

class x4g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x4g l6;

   x4g$1(x4g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x4g.l6().n5(this.n5.n3())) {
         case 0:
            x4g.n5(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 1:
            x4g.n5(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
