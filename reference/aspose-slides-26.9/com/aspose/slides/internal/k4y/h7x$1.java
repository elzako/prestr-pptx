package com.aspose.slides.internal.k4y;

class h7x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h7x l6;

   h7x$1(h7x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h7x.k5().n5(this.n5.n3())) {
         case 0:
            h7x.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  h7x.n5(this.l6, com.aspose.slides.ms.System.d1.n5(h7x.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            c5f var2 = new c5f(this.n5);
            h7x.l6(this.l6).addItem(var2);
            break;
         case 2:
            z4h var3 = new z4h(this.n5);
            h7x.k5(this.l6).addItem(var3);
            break;
         case 3:
            h7x.n5(this.l6, new d6b(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
