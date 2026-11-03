package com.aspose.slides.internal.k4y;

class a1v$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a1v l6;

   a1v$1(a1v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a1v.u9().n5(this.n5.n3())) {
         case 0:
            a1v.n5(this.l6, new o3m(this.n5));
            break;
         case 1:
            n3p var2 = new n3p(this.n5);
            a1v.n5(this.l6).addItem(var2);
            break;
         case 2:
            a1v.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            a1v.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
