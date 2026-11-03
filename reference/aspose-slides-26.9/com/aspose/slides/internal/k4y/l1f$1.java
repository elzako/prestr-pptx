package com.aspose.slides.internal.k4y;

class l1f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l1f l6;

   l1f$1(l1f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l1f.v4().n5(this.n5.n3())) {
         case 0:
            l1f.n5(this.l6, new a6z(this.n5));
            break;
         case 1:
            l1f.n5(this.l6, new c8q(this.n5));
            break;
         case 2:
            w3u var2 = new w3u(this.n5);
            l1f.n5(this.l6).addItem(var2);
            break;
         case 3:
            l1f.n5(this.l6, new a4s(this.n5));
            break;
         case 4:
            l1f.n5(this.l6, new n9p(this.n5));
            break;
         case 5:
            l1f.n5(this.l6, new m9a(this.n5));
            break;
         case 6:
            y4x var3 = new y4x(this.n5);
            l1f.l6(this.l6).addItem(var3);
            break;
         case 7:
            l1f.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
