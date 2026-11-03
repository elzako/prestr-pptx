package com.aspose.slides.internal.k4y;

class p2i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p2i l6;

   p2i$2(p2i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p2i.a6().n5(this.n5.n3())) {
         case 3:
            p2i.n5(this.l6, new g7("scrgbClr", new e4w(this.n5)));
            break;
         case 4:
            p2i.n5(this.l6, new g7("srgbClr", new e8p(this.n5)));
            break;
         case 5:
            p2i.n5(this.l6, new g7("hslClr", new d0p(this.n5)));
            break;
         case 6:
            p2i.n5(this.l6, new g7("sysClr", new s0i(this.n5)));
            break;
         case 7:
            p2i.n5(this.l6, new g7("schemeClr", new q4d(this.n5)));
            break;
         case 8:
            p2i.n5(this.l6, new g7("prstClr", new x4a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
