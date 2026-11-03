package com.aspose.slides.internal.k4y;

class s5v$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s5v l6;

   s5v$2(s5v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s5v.s7().n5(this.n5.n3())) {
         case 2:
            s5v.n5(this.l6, new u2q(this.n5));
            break;
         case 3:
            s5v.n5(this.l6, new b5b(this.n5));
            break;
         case 4:
            s5v.n5(this.l6, new z4(this.n5));
            break;
         case 5:
            s5v.l6(this.l6, new z4(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
