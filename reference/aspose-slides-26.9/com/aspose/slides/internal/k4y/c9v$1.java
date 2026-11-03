package com.aspose.slides.internal.k4y;

class c9v$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c9v l6;

   c9v$1(c9v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c9v.u6().n5(this.n5.n3())) {
         case 0:
            c9v.n5(this.l6, new r0w(this.n5));
            break;
         case 1:
            c9v.n5(this.l6, new n3o(this.n5));
            break;
         case 2:
            c9v.n5(this.l6, new c8q(this.n5));
            break;
         case 3:
            i5k var2 = new i5k(this.n5);
            c9v.n5(this.l6).addItem(var2);
            break;
         case 4:
            c9v.n5(this.l6, new a4s(this.n5));
            break;
         case 5:
            c9v.n5(this.l6, new m9a(this.n5));
            break;
         case 6:
            c9v.n5(this.l6, new g7p(this.n5));
            break;
         case 7:
            n9p var3 = new n9p(this.n5);
            c9v.l6(this.l6).addItem(var3);
            break;
         case 8:
            y4x var4 = new y4x(this.n5);
            c9v.k5(this.l6).addItem(var4);
            break;
         case 9:
            c9v.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
