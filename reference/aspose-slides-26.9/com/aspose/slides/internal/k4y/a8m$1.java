package com.aspose.slides.internal.k4y;

class a8m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a8m l6;

   a8m$1(a8m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a8m.n5().n5(this.n5.n3())) {
         case 0:
            a8m.n5(this.l6, new w7e(this.n5));
            break;
         case 1:
            a8m.n5(this.l6, new r2t(this.n5));
            break;
         case 2:
            a8m.n5(this.l6, new x9p(this.n5));
            break;
         case 3:
            a8m.n5(this.l6, new e9b(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
