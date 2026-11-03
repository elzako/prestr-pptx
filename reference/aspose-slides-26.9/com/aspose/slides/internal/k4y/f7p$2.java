package com.aspose.slides.internal.k4y;

class f7p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f7p l6;

   f7p$2(f7p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f7p.n5().n5(this.n5.n3())) {
         case 10:
            f7p.c8(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  f7p.c8(this.l6, com.aspose.slides.ms.System.d1.n5(f7p.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 11:
            f7p.t2(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  f7p.t2(this.l6, com.aspose.slides.ms.System.d1.n5(f7p.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 12:
            f7p.n5(this.l6, new c6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
