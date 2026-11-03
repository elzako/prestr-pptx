package com.aspose.slides.internal.k4y;

class c1$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c1 l6;

   c1$1(c1 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c1.l6().n5(this.n5.n3())) {
         case 0:
            c1.n5(this.l6, new g7("masterClrMapping", new z0k(this.n5)));
            break;
         case 1:
            c1.n5(this.l6, new g7("overrideClrMapping", new d0(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
