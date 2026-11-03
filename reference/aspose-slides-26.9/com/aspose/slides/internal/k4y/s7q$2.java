package com.aspose.slides.internal.k4y;

class s7q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s7q l6;

   s7q$2(s7q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s7q.u9().n5(this.n5.n3())) {
         case 2:
            s7q.n5(this.l6, new r3p(this.n5));
            break;
         case 3:
            s7q.n5(this.l6, new l6w(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
