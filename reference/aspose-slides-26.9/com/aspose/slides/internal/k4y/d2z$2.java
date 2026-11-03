package com.aspose.slides.internal.k4y;

class d2z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d2z l6;

   d2z$2(d2z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d2z.e2().n5(this.n5.n3())) {
         case 28:
            d2z.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d2z.m3(this.l6, com.aspose.slides.ms.System.d1.n5(d2z.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 29:
            d2z.z8(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d2z.z8(this.l6, com.aspose.slides.ms.System.d1.n5(d2z.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 30:
            d2z.n5(this.l6, new c6x(this.n5));
            break;
         case 31:
            l4y var2 = new l4y(this.n5);
            d2z.k5(this.l6).addItem(var2);
            break;
         case 32:
            u1x var3 = new u1x(this.n5);
            d2z.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 33:
            u0y var4 = new u0y(this.n5);
            d2z.u3(this.l6).addItem(new g7("list", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
