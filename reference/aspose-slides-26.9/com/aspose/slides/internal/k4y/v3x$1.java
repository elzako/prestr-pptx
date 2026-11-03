package com.aspose.slides.internal.k4y;

class v3x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v3x l6;

   v3x$1(v3x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v3x.n5().n5(this.n5.n3())) {
         case 0:
            x8c var2 = new x8c(this.n5);
            v3x.n5(this.l6).addItem(var2);
            break;
         case 1:
            v6p var3 = new v6p(this.n5);
            v3x.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
