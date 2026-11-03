package com.aspose.slides.internal.k4y;

class a6c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a6c l6;

   a6c$1(a6c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a6c.a6().n5(this.n5.n3())) {
         case 0:
            a6c.n5(this.l6, new l6r(this.n5));
            break;
         case 1:
            a6c.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            a6c.l6(this.l6, new s0m(this.n5));
            break;
         case 3:
            a6c.k5(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
