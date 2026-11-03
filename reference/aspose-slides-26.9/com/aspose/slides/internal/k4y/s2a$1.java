package com.aspose.slides.internal.k4y;

class s2a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s2a l6;

   s2a$1(s2a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s2a.l6().n5(this.n5.n3())) {
         case 0:
            s2a.n5(this.l6, new g7("sldTgt", new e0j(this.n5)));
            break;
         case 1:
            s2a.n5(this.l6, new g7("sndTgt", new x7n(this.n5)));
            break;
         case 2:
            s2a.n5(this.l6, new g7("spTgt", new h1f(this.n5)));
            break;
         case 3:
            s2a.n5(this.l6, new g7("inkTgt", new y7r(this.n5)));
            break;
         case 4:
            s2a.n5(this.l6, new g7("bmkTgt", new q6a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
