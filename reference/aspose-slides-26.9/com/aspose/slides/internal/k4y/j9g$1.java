package com.aspose.slides.internal.k4y;

class j9g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j9g l6;

   j9g$1(j9g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j9g.n5().n5(this.n5.n3())) {
         case 0:
            j9g.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j9g.n5(this.l6, com.aspose.slides.ms.System.d1.n5(j9g.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            j9g.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j9g.l6(this.l6, com.aspose.slides.ms.System.d1.n5(j9g.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 2:
            u1x var2 = new u1x(this.n5);
            j9g.k5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
