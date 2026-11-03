package com.aspose.slides.internal.k4y;

class t2h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t2h l6;

   t2h$1(t2h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t2h.o0().n5(this.n5.n3())) {
         case 0:
            t2h.n5(this.l6, new p0s(this.n5));
            break;
         case 1:
            t2h.n5(this.l6, new c8q(this.n5));
            break;
         case 2:
            v4y var2 = new v4y(this.n5);
            t2h.n5(this.l6).addItem(var2);
            break;
         case 3:
            t2h.n5(this.l6, new a4s(this.n5));
            break;
         case 4:
            y4x var3 = new y4x(this.n5);
            t2h.l6(this.l6).addItem(var3);
            break;
         case 5:
            t2h.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
