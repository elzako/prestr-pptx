package com.aspose.slides.internal.k4y;

class t4e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4e l6;

   t4e$1(t4e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4e.k5().n5(this.n5.n3())) {
         case 0:
            t4e.n5(this.l6, new b9y(this.n5));
            break;
         case 1:
            t4e.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
