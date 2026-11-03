package com.aspose.slides.internal.k4y;

class c7e$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c7e l6;

   c7e$2(c7e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c7e.h0().n5(this.n5.n3())) {
         case 4:
            c7e.n5(this.l6, new n0d(this.n5));
            break;
         case 5:
            c7e.n5(this.l6, new s2a(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
