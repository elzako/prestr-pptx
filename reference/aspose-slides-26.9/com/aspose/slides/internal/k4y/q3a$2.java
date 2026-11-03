package com.aspose.slides.internal.k4y;

class q3a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q3a l6;

   q3a$2(q3a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q3a.t2().n5(this.n5.n3())) {
         case 3:
            q3a.n5(this.l6, new n0d(this.n5));
            break;
         case 4:
            q3a.n5(this.l6, new z2x(this.n5));
            break;
         case 5:
            q3a.l6(this.l6, new z2x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
