package com.aspose.slides.internal.k4y;

class k6n$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k6n l6;

   k6n$2(k6n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k6n.x8().n5(this.n5.n3())) {
         case 4:
            k6n.n5(this.l6, new g7("present", new e0j(this.n5)));
            break;
         case 5:
            k6n.n5(this.l6, new g7("browse", new t1u(this.n5)));
            break;
         case 6:
            k6n.n5(this.l6, new g7("kiosk", new v4n(this.n5)));
            break;
         case 7:
            k6n.l6(this.l6, new g7("sldAll", new e0j(this.n5)));
            break;
         case 8:
            k6n.l6(this.l6, new g7("sldRg", new v6b(this.n5)));
            break;
         case 9:
            k6n.l6(this.l6, new g7("custShow", new v4z(this.n5)));
            break;
         case 10:
            k6n.n5(this.l6, new z4(this.n5));
            break;
         case 11:
            k6n.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
