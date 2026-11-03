package com.aspose.slides.internal.k4y;

class j8d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j8d l6;

   j8d$2(j8d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j8d.n5().n5(this.n5.n3())) {
         case 24:
            j8d.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j8d.m1(this.l6, com.aspose.slides.ms.System.d1.n5(j8d.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            j8d.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j8d.k7(this.l6, com.aspose.slides.ms.System.d1.n5(j8d.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 26:
            j8d.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j8d.m3(this.l6, com.aspose.slides.ms.System.d1.n5(j8d.k5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 27:
            u1x var2 = new u1x(this.n5);
            j8d.u3(this.l6).addItem(new g7("p", var2));
            break;
         case 28:
            u0y var3 = new u0y(this.n5);
            j8d.u3(this.l6).addItem(new g7("list", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
