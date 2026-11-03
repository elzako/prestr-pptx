package com.aspose.slides.internal.k4y;

class t5p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t5p l6;

   t5p$1(t5p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t5p.n5().n5(this.n5.n3())) {
         case 0:
            t5p.n5(this.l6, new u3j(this.n5));
            break;
         case 1:
            t5p.n5(this.l6, new l9i(this.n5));
            break;
         case 2:
            t5p.l6(this.l6, new l9i(this.n5));
            break;
         case 3:
            t5p.k5(this.l6, new l9i(this.n5));
            break;
         case 4:
            t5p.n5(this.l6, new c3k(this.n5));
            break;
         case 5:
            t5p.n5(this.l6, new a5j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
