package com.aspose.slides.internal.k4y;

class f2a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f2a l6;

   f2a$2(f2a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f2a.s7().n5(this.n5.n3())) {
         case 1:
            f2a.n5(this.l6, new v4c(this.n5));
            break;
         case 2:
            f2a.n5(this.l6, new t4z(this.n5));
            break;
         case 3:
            f2a.n5(this.l6, new r9o(this.n5));
            break;
         case 4:
            f2a.n5(this.l6, new f3b(this.n5));
            break;
         case 5:
            f2a.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
