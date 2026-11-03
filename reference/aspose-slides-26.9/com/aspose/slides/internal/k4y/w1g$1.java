package com.aspose.slides.internal.k4y;

class w1g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w1g l6;

   w1g$1(w1g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w1g.u6().n5(this.n5.n3())) {
         case 0:
            w1g.n5(this.l6, new c8q(this.n5));
            break;
         case 1:
            g4d var2 = new g4d(this.n5);
            w1g.n5(this.l6).addItem(var2);
            break;
         case 2:
            w1g.n5(this.l6, new a4s(this.n5));
            break;
         case 3:
            w1g.l6(this.l6, new c8q(this.n5));
            break;
         case 4:
            w1g.n5(this.l6, new c3g(this.n5));
            break;
         case 5:
            w1g.k5(this.l6, new c8q(this.n5));
            break;
         case 6:
            w1g.n5(this.l6, new g3x(this.n5));
            break;
         case 7:
            y4x var3 = new y4x(this.n5);
            w1g.l6(this.l6).addItem(var3);
            break;
         case 8:
            w1g.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
