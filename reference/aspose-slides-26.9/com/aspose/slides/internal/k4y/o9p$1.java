package com.aspose.slides.internal.k4y;

class o9p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o9p l6;

   o9p$1(o9p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o9p.u3().n5(this.n5.n3())) {
         case 0:
            o9p.n5(this.l6, new p2v(this.n5));
            break;
         case 1:
            o9p.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            o9p.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
