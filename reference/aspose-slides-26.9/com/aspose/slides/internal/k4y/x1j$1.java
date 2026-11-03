package com.aspose.slides.internal.k4y;

class x1j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x1j l6;

   x1j$1(x1j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x1j.z7().n5(this.n5.n3())) {
         case 0:
            x1j.n5(this.l6, new a6z(this.n5));
            break;
         case 1:
            x1j.n5(this.l6, new c8q(this.n5));
            break;
         case 2:
            e6q var2 = new e6q(this.n5);
            x1j.n5(this.l6).addItem(var2);
            break;
         case 3:
            x1j.n5(this.l6, new a4s(this.n5));
            break;
         case 4:
            x1j.n5(this.l6, new n9p(this.n5));
            break;
         case 5:
            x1j.l6(this.l6, new n9p(this.n5));
            break;
         case 6:
            x1j.n5(this.l6, new h0i(this.n5));
            break;
         case 7:
            x1j.l6(this.l6, new c8q(this.n5));
            break;
         case 8:
            x1j.k5(this.l6, new c8q(this.n5));
            break;
         case 9:
            y4x var3 = new y4x(this.n5);
            x1j.l6(this.l6).addItem(var3);
            break;
         case 10:
            x1j.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
