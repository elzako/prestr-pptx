package com.aspose.slides.internal.k4y;

class g7e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g7e l6;

   g7e$1(g7e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g7e.u3().n5(this.n5.n3())) {
         case 0:
            g7e.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            g7e.n5(this.l6, new z1n(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
