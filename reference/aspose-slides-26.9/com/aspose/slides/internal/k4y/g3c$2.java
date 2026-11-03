package com.aspose.slides.internal.k4y;

class g3c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g3c l6;

   g3c$2(g3c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g3c.z1().n5(this.n5.n3())) {
         case 23:
            g3c.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  g3c.m1(this.l6, com.aspose.slides.ms.System.d1.n5(g3c.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 24:
            g3c.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  g3c.k7(this.l6, com.aspose.slides.ms.System.d1.n5(g3c.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            g3c.n5(this.l6, new c6x(this.n5));
            break;
         case 26:
            l4y var2 = new l4y(this.n5);
            g3c.k5(this.l6).addItem(var2);
            break;
         case 27:
            u1x var3 = new u1x(this.n5);
            g3c.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 28:
            u0y var4 = new u0y(this.n5);
            g3c.u3(this.l6).addItem(new g7("list", var4));
            break;
         case 29:
            g3c.n5(this.l6, new y1z(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
