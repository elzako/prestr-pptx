package com.aspose.slides.internal.k4y;

class r0j$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r0j l6;

   r0j$2(r0j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r0j.x8().n5(this.n5.n3())) {
         case 7:
            r0j.n5(this.l6, new g7("embed", new d5m(this.n5)));
            break;
         case 8:
            r0j.n5(this.l6, new g7("link", new e7k(this.n5)));
            break;
         case 9:
            r0j.n5(this.l6, new a6(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
