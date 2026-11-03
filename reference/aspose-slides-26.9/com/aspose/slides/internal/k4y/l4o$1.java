package com.aspose.slides.internal.k4y;

class l4o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l4o l6;

   l4o$1(l4o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l4o.k5().n5(this.n5.n3())) {
         case 0:
            l4o.n5(this.l6, new g7("fill", new v2s(this.n5)));
            break;
         case 1:
            l4o.n5(this.l6, new g7("fillRef", new x2y(this.n5)));
            break;
         case 2:
            l4o.l6(this.l6, new g7("effect", new x4g(this.n5)));
            break;
         case 3:
            l4o.l6(this.l6, new g7("effectRef", new x2y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
