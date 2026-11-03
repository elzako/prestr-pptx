package com.aspose.slides.internal.k4y;

class h8v$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h8v l6;

   h8v$2(h8v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h8v.h0().n5(this.n5.n3())) {
         case 2:
            h8v.n5(this.l6, new y4o(this.n5));
            break;
         case 3:
            h8v.n5(this.l6, new e9h(this.n5));
            break;
         case 4:
            h8v.n5(this.l6, new b2t(this.n5));
            break;
         case 5:
            h8v.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
