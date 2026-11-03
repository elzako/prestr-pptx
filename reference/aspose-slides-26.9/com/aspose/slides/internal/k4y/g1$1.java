package com.aspose.slides.internal.k4y;

class g1$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g1 l6;

   g1$1(g1 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g1.u9().n5(this.n5.n3())) {
         case 0:
            g1.n5(this.l6, new d7u(this.n5));
            break;
         case 1:
            g1.n5(this.l6, new r2n(this.n5));
            break;
         case 2:
            j3b var2 = new j3b(this.n5);
            g1.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
