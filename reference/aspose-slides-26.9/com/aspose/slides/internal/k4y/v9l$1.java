package com.aspose.slides.internal.k4y;

class v9l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v9l l6;

   v9l$1(v9l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v9l.u6().n5(this.n5.n3())) {
         case 0:
            v9l.n5(this.l6, new w1y(this.n5));
            break;
         case 1:
            v9l.n5(this.l6, new c8q(this.n5));
            break;
         case 2:
            t6w var2 = new t6w(this.n5);
            v9l.n5(this.l6).addItem(var2);
            break;
         case 3:
            v9l.n5(this.l6, new a4s(this.n5));
            break;
         case 4:
            v9l.n5(this.l6, new m9a(this.n5));
            break;
         case 5:
            v9l.n5(this.l6, new d9v(this.n5));
            break;
         case 6:
            v9l.n5(this.l6, new x8w(this.n5));
            break;
         case 7:
            v9l.n5(this.l6, new t7q(this.n5));
            break;
         case 8:
            v9l.n5(this.l6, new g0t(this.n5));
            break;
         case 9:
            n9p var3 = new n9p(this.n5);
            v9l.l6(this.l6).addItem(var3);
            break;
         case 10:
            v9l.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
