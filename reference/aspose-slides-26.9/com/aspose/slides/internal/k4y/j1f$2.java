package com.aspose.slides.internal.k4y;

class j1f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j1f l6;

   j1f$2(j1f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j1f.n5().n5(this.n5.n3())) {
         case 1:
            this.n5.u9();
            break;
         case 2:
            this.n5.u9();
            j1f.n5(this.l6, new g7("posOffset", com.aspose.slides.ms.System.a3.n5(this.n5.z1())));
            break;
         default:
            return false;
      }

      return true;
   }
}
