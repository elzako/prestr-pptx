package com.aspose.slides.internal.k4y;

class n9a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n9a l6;

   n9a$1(n9a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n9a.u3().n5(this.n5.n3())) {
         case 0:
            n9a.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  n9a.n5(this.l6, com.aspose.slides.ms.System.d1.n5(n9a.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            n9a.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  n9a.l6(this.l6, com.aspose.slides.ms.System.d1.n5(n9a.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 2:
            n9a.n5(this.l6, new p4t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
