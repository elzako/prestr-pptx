package com.aspose.slides.internal.k4y;

class u1v$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u1v l6;

   u1v$2(u1v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u1v.u9().n5(this.n5.n3())) {
         case 6:
            u1v.n5(this.l6, new h2d(this.n5));
            break;
         case 7:
            u1v.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  u1v.l6(this.l6, com.aspose.slides.ms.System.d1.n5(u1v.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 8:
            u1v.n5(this.l6, new h7x(this.n5));
            break;
         case 9:
            u1v.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
