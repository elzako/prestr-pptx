package com.aspose.slides.internal.k4y;

class g6v$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g6v l6;

   g6v$2(g6v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g6v.h0().n5(this.n5.n3())) {
         case 1:
            g6v.n5(this.l6, new j2x(this.n5));
            break;
         case 2:
            g6v.n5(this.l6, new r8e(this.n5));
            break;
         case 3:
            g6v.n5(this.l6, new s5y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
