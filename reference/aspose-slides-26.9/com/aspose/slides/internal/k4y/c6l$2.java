package com.aspose.slides.internal.k4y;

class c6l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c6l l6;

   c6l$2(c6l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c6l.y4().n5(this.n5.n3())) {
         case 6:
            c6l.n5(this.l6, new o0s(this.n5));
            break;
         case 7:
            c6l.n5(this.l6, new i9f(this.n5));
            break;
         case 8:
            c6l.n5(this.l6, new y6s(this.n5));
            break;
         case 9:
            c6l.n5(this.l6, new c8k(this.n5));
            break;
         case 10:
            r1m var2 = new r1m(this.n5);
            c6l.n5(this.l6).addItem(var2);
            break;
         case 11:
            c6l.n5(this.l6, new o2i(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
