package com.aspose.slides.internal.k4y;

class v7w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v7w l6;

   v7w$1(v7w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v7w.u3().n5(this.n5.n3())) {
         case 0:
            v7w.n5(this.l6, new g2u(this.n5));
            break;
         case 1:
            v7w.n5(this.l6, new i0a(this.n5));
            break;
         case 2:
            v7w.n5(this.l6, new n9s(this.n5));
            break;
         case 3:
            v7w.n5(this.l6, new k6n(this.n5));
            break;
         case 4:
            v7w.n5(this.l6, new h3(this.n5));
            break;
         case 5:
            v7w.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
