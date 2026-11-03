package com.aspose.slides.internal.k4y;

class z7d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z7d l6;

   z7d$2(z7d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z7d.n5().n5(this.n5.n3())) {
         case 24:
            z7d.z3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  z7d.z3(this.l6, com.aspose.slides.ms.System.d1.n5(z7d.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            z7d.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  z7d.m1(this.l6, com.aspose.slides.ms.System.d1.n5(z7d.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 26:
            z7d.n5(this.l6, new c6x(this.n5));
            break;
         case 27:
            l4y var2 = new l4y(this.n5);
            z7d.k5(this.l6).addItem(var2);
            break;
         case 28:
            u1x var3 = new u1x(this.n5);
            z7d.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 29:
            u0y var4 = new u0y(this.n5);
            z7d.u3(this.l6).addItem(new g7("list", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
