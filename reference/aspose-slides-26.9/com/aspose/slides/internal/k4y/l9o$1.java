package com.aspose.slides.internal.k4y;

class l9o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l9o l6;

   l9o$1(l9o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l9o.o0().n5(this.n5.n3())) {
         case 0:
            e6q var2 = new e6q(this.n5);
            l9o.n5(this.l6).addItem(var2);
            break;
         case 1:
            l9o.n5(this.l6, new a4s(this.n5));
            break;
         case 2:
            l9o.n5(this.l6, new n9p(this.n5));
            break;
         case 3:
            l9o.l6(this.l6, new n9p(this.n5));
            break;
         case 4:
            l9o.n5(this.l6, new h0i(this.n5));
            break;
         case 5:
            y4x var3 = new y4x(this.n5);
            l9o.l6(this.l6).addItem(var3);
            break;
         case 6:
            l9o.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
