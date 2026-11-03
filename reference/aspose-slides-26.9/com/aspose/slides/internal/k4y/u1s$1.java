package com.aspose.slides.internal.k4y;

class u1s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u1s l6;

   u1s$1(u1s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u1s.n3().n5(this.n5.n3())) {
         case 0:
            u1s.n5(this.l6, new u6p(this.n5));
            break;
         case 1:
            u1s.l6(this.l6, new u6p(this.n5));
            break;
         case 2:
            u1s.n5(this.l6, new x2(this.n5));
            break;
         case 3:
            u1s.n5(this.l6, new z6z(this.n5));
            break;
         case 4:
            u1s.n5(this.l6, new o8m(this.n5));
            break;
         case 5:
            u1s.n5(this.l6, new j8m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
