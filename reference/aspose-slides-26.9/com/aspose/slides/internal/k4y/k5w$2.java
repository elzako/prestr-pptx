package com.aspose.slides.internal.k4y;

class k5w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k5w l6;

   k5w$2(k5w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k5w.u9().n5(this.n5.n3())) {
         case 2:
            k5w.n5(this.l6, new g7("font", new p4l(this.n5)));
            break;
         case 3:
            k5w.n5(this.l6, new g7("fontRef", new p6t(this.n5)));
            break;
         case 4:
            k5w.l6(this.l6, new g7("scrgbClr", new e4w(this.n5)));
            break;
         case 5:
            k5w.l6(this.l6, new g7("srgbClr", new e8p(this.n5)));
            break;
         case 6:
            k5w.l6(this.l6, new g7("hslClr", new d0p(this.n5)));
            break;
         case 7:
            k5w.l6(this.l6, new g7("sysClr", new s0i(this.n5)));
            break;
         case 8:
            k5w.l6(this.l6, new g7("schemeClr", new q4d(this.n5)));
            break;
         case 9:
            k5w.l6(this.l6, new g7("prstClr", new x4a(this.n5)));
            break;
         case 10:
            k5w.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
