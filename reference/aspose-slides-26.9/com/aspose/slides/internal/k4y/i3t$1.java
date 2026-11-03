package com.aspose.slides.internal.k4y;

class i3t$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i3t l6;

   i3t$1(i3t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i3t.a6().n5(this.n5.n3())) {
         case 0:
            i3t.n5(this.l6, new h4q(this.n5));
            break;
         case 1:
            i3t.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            i3t.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
