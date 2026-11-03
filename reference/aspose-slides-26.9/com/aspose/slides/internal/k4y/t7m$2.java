package com.aspose.slides.internal.k4y;

class t7m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t7m l6;

   t7m$2(t7m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t7m.z1().n5(this.n5.n3())) {
         case 1:
            t7m.n5(this.l6, new n9v(this.n5));
            break;
         case 2:
            t7m.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            t7m.n5(this.l6, new j3z(this.n5));
            break;
         case 4:
            t7m.n5(this.l6, new e5k(this.n5));
            break;
         case 5:
            t7m.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  t7m.n5(this.l6, com.aspose.slides.ms.System.d1.n5(t7m.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 6:
            s7m var2 = new s7m(this.n5);
            t7m.l6(this.l6).addItem(var2);
            break;
         case 7:
            y8i var3 = new y8i(this.n5);
            t7m.k5(this.l6).addItem(var3);
            break;
         case 8:
            t7m.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
