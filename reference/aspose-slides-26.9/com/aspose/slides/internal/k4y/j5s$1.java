package com.aspose.slides.internal.k4y;

class j5s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j5s l6;

   j5s$1(j5s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j5s.n5().n5(this.n5.n3())) {
         case 0:
            j5s.n5(this.l6, new w2z(this.n5));
            break;
         case 1:
            j5s.n5(this.l6, new b7i(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
