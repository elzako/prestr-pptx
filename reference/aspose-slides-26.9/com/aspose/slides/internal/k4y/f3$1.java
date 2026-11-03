package com.aspose.slides.internal.k4y;

class f3$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f3 l6;

   f3$1(f3 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f3.n5().n5(this.n5.n3())) {
         case 0:
            f3.n5(this.l6, new g7("dgm", new t8(this.n5)));
            break;
         case 1:
            f3.n5(this.l6, new g7("chart", new h7(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
