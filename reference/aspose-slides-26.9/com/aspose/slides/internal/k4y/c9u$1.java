package com.aspose.slides.internal.k4y;

class c9u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c9u l6;

   c9u$1(c9u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c9u.c8().n5(this.n5.n3())) {
         case 0:
            c9u.n5(this.l6, new g3p(this.n5));
            break;
         case 1:
            c9u.l6(this.l6, new g3p(this.n5));
            break;
         case 2:
            c9u.k5(this.l6, new g3p(this.n5));
            break;
         case 3:
            c9u.n5(this.l6, new s1y(this.n5));
            break;
         case 4:
            c9u.u3(this.l6, new g3p(this.n5));
            break;
         case 5:
            c9u.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
