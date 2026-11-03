package com.aspose.slides.internal.k4y;

class c0$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c0 l6;

   c0$1(c0 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c0.u3().n5(this.n5.n3())) {
         case 0:
            c0.n5(this.l6, new f6(this.n5));
            break;
         case 1:
            c0.n5(this.l6, new d0(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
