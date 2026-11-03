package com.aspose.slides.internal.k4y;

class l0u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l0u l6;

   l0u$1(l0u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l0u.u9().n5(this.n5.n3())) {
         case 0:
            l0u.n5(this.l6, new g7("multiLvlStrRef", new w9n(this.n5)));
            break;
         case 1:
            l0u.n5(this.l6, new g7("numRef", new z3o(this.n5)));
            break;
         case 2:
            l0u.n5(this.l6, new g7("strRef", new c9q(this.n5)));
            break;
         case 3:
            l0u.n5(this.l6, new g7("numLit", new a8e(this.n5)));
            break;
         case 4:
            l0u.n5(this.l6, new g7("strLit", new p4t(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
