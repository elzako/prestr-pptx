package com.aspose.slides.internal.k4y;

class d8f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d8f l6;

   d8f$2(d8f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d8f.n5().n5(this.n5.n3())) {
         case 29:
            d8f.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d8f.m3(this.l6, com.aspose.slides.ms.System.d1.n5(d8f.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 30:
            d8f.z8(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d8f.z8(this.l6, com.aspose.slides.ms.System.d1.n5(d8f.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 31:
            d5k var2 = new d5k(this.n5);
            d8f.k5(this.l6).addItem(var2);
            break;
         case 32:
            d8f var3 = new d8f(this.n5);
            d8f.u3(this.l6).addItem(new g7("scene", var3));
            break;
         case 33:
            d1l var4 = new d1l(this.n5);
            d8f.u3(this.l6).addItem(new g7("extrude", var4));
            break;
         case 34:
            f2d var5 = new f2d(this.n5);
            d8f.u3(this.l6).addItem(new g7("sphere", var5));
            break;
         case 35:
            y9k var6 = new y9k(this.n5);
            d8f.u3(this.l6).addItem(new g7("rotate", var6));
            break;
         case 36:
            w4j var7 = new w4j(this.n5);
            d8f.u3(this.l6).addItem(new g7("cube", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
