package com.aspose.slides.internal.k4y;

class h1f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h1f l6;

   h1f$2(h1f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h1f.k5().n5(this.n5.n3())) {
         case 1:
            h1f.n5(this.l6, new g7("bg", new e0j(this.n5)));
            break;
         case 2:
            h1f.n5(this.l6, new g7("subSp", new y7r(this.n5)));
            break;
         case 3:
            h1f.n5(this.l6, new g7("oleChartEl", new v4l(this.n5)));
            break;
         case 4:
            h1f.n5(this.l6, new g7("txEl", new t4n(this.n5)));
            break;
         case 5:
            h1f.n5(this.l6, new g7("graphicEl", new f3(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
