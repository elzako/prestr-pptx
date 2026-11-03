package com.aspose.slides.internal.k4y;

class o0s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o0s l6;

   o0s$2(o0s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o0s.u3().n5(this.n5.n3())) {
         case 1:
            j0p var2 = new j0p(this.n5);
            o0s.n5(this.l6).addItem(var2);
            break;
         case 2:
            o0s.n5(this.l6, new z3k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
