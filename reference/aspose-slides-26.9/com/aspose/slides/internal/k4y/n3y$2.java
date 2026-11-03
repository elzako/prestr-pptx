package com.aspose.slides.internal.k4y;

class n3y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n3y l6;

   n3y$2(n3y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n3y.n5().n5(this.n5.n3())) {
         case 19:
            n3y.n5(this.l6, new c5r(this.n5));
            break;
         case 20:
            t4w var2 = new t4w(this.n5);
            n3y.n5(this.l6).addItem(var2);
            break;
         case 21:
            q1f var3 = new q1f(this.n5);
            n3y.l6(this.l6).addItem(var3);
            break;
         case 22:
            n3y.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
