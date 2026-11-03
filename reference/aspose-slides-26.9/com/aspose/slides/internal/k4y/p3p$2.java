package com.aspose.slides.internal.k4y;

class p3p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p3p l6;

   p3p$2(p3p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p3p.u9().n5(this.n5.n3())) {
         case 24:
            p3p.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  p3p.m1(this.l6, com.aspose.slides.ms.System.d1.n5(p3p.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            p3p.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  p3p.k7(this.l6, com.aspose.slides.ms.System.d1.n5(p3p.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 26:
            p3p.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  p3p.m3(this.l6, com.aspose.slides.ms.System.d1.n5(p3p.k5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 27:
            u1x var2 = new u1x(this.n5);
            p3p.u3(this.l6).addItem(new g7("p", var2));
            break;
         case 28:
            u0y var3 = new u0y(this.n5);
            p3p.u3(this.l6).addItem(new g7("list", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
