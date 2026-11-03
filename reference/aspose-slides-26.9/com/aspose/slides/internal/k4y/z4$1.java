package com.aspose.slides.internal.k4y;

class z4$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z4 l6;

   z4$1(z4 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z4.l6().n5(this.n5.n3())) {
         case 0:
            z4.n5(this.l6, new g7("scrgbClr", new e4w(this.n5)));
            break;
         case 1:
            z4.n5(this.l6, new g7("srgbClr", new e8p(this.n5)));
            break;
         case 2:
            z4.n5(this.l6, new g7("hslClr", new d0p(this.n5)));
            break;
         case 3:
            z4.n5(this.l6, new g7("sysClr", new s0i(this.n5)));
            break;
         case 4:
            z4.n5(this.l6, new g7("schemeClr", new q4d(this.n5)));
            break;
         case 5:
            z4.n5(this.l6, new g7("prstClr", new x4a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
