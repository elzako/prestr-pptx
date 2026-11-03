package com.aspose.slides.internal.k4y;

class a5e$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a5e l6;

   a5e$2(a5e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a5e.n5().n5(this.n5.n3())) {
         case 1:
            a5e.n5(this.l6, new y4q(this.n5));
            break;
         case 2:
            a5e.n5(this.l6, new c3k(this.n5));
            break;
         case 3:
            a5e.n5(this.l6, new c2z(this.n5));
            break;
         case 4:
            a5e.n5(this.l6, new s1i(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
