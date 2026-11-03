package com.aspose.slides.internal.k4y;

class s1k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s1k l6;

   s1k$1(s1k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s1k.a6().n5(this.n5.n3())) {
         case 0:
            s1k.n5(this.l6, new p5c(this.n5));
            break;
         case 1:
            s1k.n5(this.l6, new e8b(this.n5));
            break;
         case 2:
            s1k.n5(this.l6, new l7h(this.n5));
            break;
         case 3:
            s1k.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
