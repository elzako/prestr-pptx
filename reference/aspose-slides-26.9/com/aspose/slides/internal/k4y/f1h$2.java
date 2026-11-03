package com.aspose.slides.internal.k4y;

class f1h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f1h l6;

   f1h$2(f1h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f1h.e2().n5(this.n5.n3())) {
         case 27:
            f1h.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  f1h.k7(this.l6, com.aspose.slides.ms.System.d1.n5(f1h.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 28:
            f1h.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  f1h.m3(this.l6, com.aspose.slides.ms.System.d1.n5(f1h.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 29:
            f1h.n5(this.l6, new c6x(this.n5));
            break;
         case 30:
            l4y var2 = new l4y(this.n5);
            f1h.k5(this.l6).addItem(var2);
            break;
         case 31:
            u1x var3 = new u1x(this.n5);
            f1h.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 32:
            u0y var4 = new u0y(this.n5);
            f1h.u3(this.l6).addItem(new g7("list", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
