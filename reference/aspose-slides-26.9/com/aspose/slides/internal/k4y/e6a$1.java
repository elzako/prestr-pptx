package com.aspose.slides.internal.k4y;

class e6a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e6a l6;

   e6a$1(e6a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e6a.a6().n5(this.n5.n3())) {
         case 0:
            e6a.n5(this.l6, new g3y(this.n5));
            break;
         case 1:
            e6a.l6(this.l6, new g3y(this.n5));
            break;
         case 2:
            e6a.k5(this.l6, new g3y(this.n5));
            break;
         case 3:
            e6a.u3(this.l6, new g3y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
