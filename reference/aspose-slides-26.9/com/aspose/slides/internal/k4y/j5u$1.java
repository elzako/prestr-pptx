package com.aspose.slides.internal.k4y;

class j5u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j5u l6;

   j5u$1(j5u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j5u.l6().n5(this.n5.n3())) {
         case 0:
            j5u.n5(this.l6, new f3v(this.n5));
            break;
         case 1:
            j5u.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
