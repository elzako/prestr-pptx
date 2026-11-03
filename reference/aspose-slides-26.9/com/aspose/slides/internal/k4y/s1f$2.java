package com.aspose.slides.internal.k4y;

class s1f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s1f l6;

   s1f$2(s1f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s1f.n5().n5(this.n5.n3())) {
         case 4:
            s1f.n5(this.l6, new n6s(this.n5));
            break;
         case 5:
            s1f.n5(this.l6, new f5d(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
