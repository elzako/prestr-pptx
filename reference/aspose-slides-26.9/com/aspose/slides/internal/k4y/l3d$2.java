package com.aspose.slides.internal.k4y;

class l3d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l3d l6;

   l3d$2(l3d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l3d.t9().n5(this.n5.n3())) {
         case 27:
            l3d.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  l3d.k7(this.l6, com.aspose.slides.ms.System.d1.n5(l3d.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 28:
            l3d.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  l3d.m3(this.l6, com.aspose.slides.ms.System.d1.n5(l3d.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 29:
            l3d.n5(this.l6, new c6x(this.n5));
            break;
         case 30:
            l4y var2 = new l4y(this.n5);
            l3d.k5(this.l6).addItem(var2);
            break;
         case 31:
            u1x var3 = new u1x(this.n5);
            l3d.u3(this.l6).addItem(new g7("p", var3));
            break;
         case 32:
            u0y var4 = new u0y(this.n5);
            l3d.u3(this.l6).addItem(new g7("list", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
