package com.aspose.slides.internal.k4y;

class u5l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u5l l6;

   u5l$2(u5l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u5l.n5().n5(this.n5.n3())) {
         case 23:
            u5l.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  u5l.m1(this.l6, com.aspose.slides.ms.System.d1.n5(u5l.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 24:
            u5l.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  u5l.k7(this.l6, com.aspose.slides.ms.System.d1.n5(u5l.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            u5l.n5(this.l6, new c6x(this.n5));
            break;
         case 26:
            l4y var2 = new l4y(this.n5);
            u5l.k5(this.l6).addItem(var2);
            break;
         case 27:
            u1x var3 = new u1x(this.n5);
            u5l.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 28:
            u0y var4 = new u0y(this.n5);
            u5l.u3(this.l6).addItem(new g7("list", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
