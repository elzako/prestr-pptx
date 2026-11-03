package com.aspose.slides.internal.k4y;

class d1z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d1z l6;

   d1z$1(d1z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d1z.z7().n5(this.n5.n3())) {
         case 0:
            d1z.n5(this.l6, new a6z(this.n5));
            break;
         case 1:
            d1z.n5(this.l6, new c8q(this.n5));
            break;
         case 2:
            e6q var2 = new e6q(this.n5);
            d1z.n5(this.l6).addItem(var2);
            break;
         case 3:
            d1z.n5(this.l6, new a4s(this.n5));
            break;
         case 4:
            d1z.n5(this.l6, new n9p(this.n5));
            break;
         case 5:
            d1z.n5(this.l6, new m9a(this.n5));
            break;
         case 6:
            y4x var3 = new y4x(this.n5);
            d1z.l6(this.l6).addItem(var3);
            break;
         case 7:
            d1z.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
