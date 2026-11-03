package com.aspose.slides.internal.k4y;

class f0w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f0w l6;

   f0w$1(f0w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f0w.l6().n5(this.n5.n3())) {
         case 0:
            f0w.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  f0w.n5(this.l6, com.aspose.slides.ms.System.d1.n5(f0w.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            u1x var2 = new u1x(this.n5);
            f0w.l6(this.l6).addItem(new g7("p", var2));
            break;
         case 2:
            m2v var3 = new m2v(this.n5);
            f0w.l6(this.l6).addItem(new g7("h", var3));
            break;
         case 3:
            u0y var4 = new u0y(this.n5);
            f0w.l6(this.l6).addItem(new g7("list", var4));
            break;
         case 4:
            j0v var5 = new j0v(this.n5);
            f0w.l6(this.l6).addItem(new g7("soft-page-break", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
