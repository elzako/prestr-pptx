package com.aspose.slides.internal.k4y;

class b3q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b3q l6;

   b3q$1(b3q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b3q.u3().n5(this.n5.n3())) {
         case 0:
            b3q.n5(this.l6, new c4t(this.n5));
            break;
         case 1:
            b3q.n5(this.l6, new z1n(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
