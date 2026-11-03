package com.aspose.slides.internal.k4y;

class o9i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o9i l6;

   o9i$1(o9i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o9i.a6().n5(this.n5.n3())) {
         case 0:
            o9i.n5(this.l6, new a2w(this.n5));
            break;
         case 1:
            o9i.n5(this.l6, new g7("fill", new v2s(this.n5)));
            break;
         case 2:
            o9i.n5(this.l6, new g7("fillRef", new x2y(this.n5)));
            break;
         case 3:
            o9i.n5(this.l6, new u7(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
