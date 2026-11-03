package com.aspose.slides.internal.k4y;

class n9q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n9q l6;

   n9q$2(n9q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n9q.u9().n5(this.n5.n3())) {
         case 1:
            n9q.n5(this.l6, new z4(this.n5));
            break;
         case 2:
            n9q.l6(this.l6, new z4(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
