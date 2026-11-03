package com.aspose.slides.internal.k4y;

class o3i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o3i l6;

   o3i$2(o3i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o3i.x8().n5(this.n5.n3())) {
         case 9:
            o3i.n5(this.l6, new g7("scrgbClr", new e4w(this.n5)));
            break;
         case 10:
            o3i.n5(this.l6, new g7("srgbClr", new e8p(this.n5)));
            break;
         case 11:
            o3i.n5(this.l6, new g7("hslClr", new d0p(this.n5)));
            break;
         case 12:
            o3i.n5(this.l6, new g7("sysClr", new s0i(this.n5)));
            break;
         case 13:
            o3i.n5(this.l6, new g7("schemeClr", new q4d(this.n5)));
            break;
         case 14:
            o3i.n5(this.l6, new g7("prstClr", new x4a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
