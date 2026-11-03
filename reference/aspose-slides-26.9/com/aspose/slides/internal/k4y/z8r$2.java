package com.aspose.slides.internal.k4y;

class z8r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z8r l6;

   z8r$2(z8r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z8r.n5().n5(this.n5.n3())) {
         case 4:
            z8r.n5(this.l6, new g7("filter-condition", new f3f(this.n5)));
            break;
         case 5:
            z8r.n5(this.l6, new g7("filter-and", new v4d(this.n5)));
            break;
         case 6:
            z8r.n5(this.l6, new g7("filter-or", new e3u(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
