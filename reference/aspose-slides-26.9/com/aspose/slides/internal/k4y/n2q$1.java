package com.aspose.slides.internal.k4y;

class n2q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n2q l6;

   n2q$1(n2q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n2q.u3().n5(this.n5.n3())) {
         case 0:
            n2q.n5(this.l6, new m4f(this.n5));
            break;
         case 1:
            n2q.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
