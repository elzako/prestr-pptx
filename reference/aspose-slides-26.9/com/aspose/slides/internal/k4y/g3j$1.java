package com.aspose.slides.internal.k4y;

class g3j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g3j l6;

   g3j$1(g3j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g3j.l6().n5(this.n5.n3())) {
         case 0:
            g3j.n5(this.l6, new g7("spcPct", new z3b(this.n5)));
            break;
         case 1:
            g3j.n5(this.l6, new g7("spcPts", new r1q(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
