package com.aspose.slides.internal.k4y;

class i2i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i2i l6;

   i2i$1(i2i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i2i.z7().n5(this.n5.n3())) {
         case 0:
            i2i.n5(this.l6, new c8q(this.n5));
            break;
         case 1:
            t6w var2 = new t6w(this.n5);
            i2i.n5(this.l6).addItem(var2);
            break;
         case 2:
            i2i.n5(this.l6, new a4s(this.n5));
            break;
         case 3:
            i2i.n5(this.l6, new n4m(this.n5));
            break;
         case 4:
            i2i.n5(this.l6, new w2f(this.n5));
            break;
         case 5:
            i2i.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
