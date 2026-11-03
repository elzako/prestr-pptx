package com.aspose.slides.internal.k4y;

class e1x$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e1x l6;

   e1x$2(e1x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e1x.u3().n5(this.n5.n3())) {
         case 2:
            e1x.n5(this.l6, new g7("scrgbClr", new e4w(this.n5)));
            break;
         case 3:
            e1x.n5(this.l6, new g7("srgbClr", new e8p(this.n5)));
            break;
         case 4:
            e1x.n5(this.l6, new g7("hslClr", new d0p(this.n5)));
            break;
         case 5:
            e1x.n5(this.l6, new g7("sysClr", new s0i(this.n5)));
            break;
         case 6:
            e1x.n5(this.l6, new g7("schemeClr", new q4d(this.n5)));
            break;
         case 7:
            e1x.n5(this.l6, new g7("prstClr", new x4a(this.n5)));
            break;
         case 8:
            e1x.n5(this.l6, new c4y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
