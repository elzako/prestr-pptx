package com.aspose.slides.internal.k4y;

class k7m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k7m l6;

   k7m$2(k7m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k7m.u3().n5(this.n5.n3())) {
         case 2:
            k7m.n5(this.l6, new g7("font", new v6s(this.n5)));
            break;
         case 3:
            k7m.n5(this.l6, new g7("picture", new f2i(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
