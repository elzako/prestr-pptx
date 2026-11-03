package com.aspose.slides.internal.k4y;

class u2q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u2q l6;

   u2q$2(u2q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u2q.t2().n5(this.n5.n3())) {
         case 8:
            u2q.n5(this.l6, new n0d(this.n5));
            break;
         case 9:
            u2q.n5(this.l6, new s2a(this.n5));
            break;
         case 10:
            u2q.n5(this.l6, new g1l(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
