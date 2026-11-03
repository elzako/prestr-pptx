package com.aspose.slides.internal.k4y;

class a3g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a3g l6;

   a3g$1(a3g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a3g.l6().n5(this.n5.n3())) {
         case 0:
            a3g.n5(this.l6, new d6q(this.n5));
            break;
         case 1:
            a3g.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a3g.n5(this.l6, com.aspose.slides.ms.System.d1.n5(a3g.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 2:
            a3g.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a3g.l6(this.l6, com.aspose.slides.ms.System.d1.n5(a3g.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 3:
            a3g.k5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a3g.k5(this.l6, com.aspose.slides.ms.System.d1.n5(a3g.k5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 4:
            a3g.u3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a3g.u3(this.l6, com.aspose.slides.ms.System.d1.n5(a3g.u3(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
