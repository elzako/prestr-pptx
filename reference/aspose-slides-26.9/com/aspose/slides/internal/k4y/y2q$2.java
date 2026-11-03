package com.aspose.slides.internal.k4y;

class y2q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y2q l6;

   y2q$2(y2q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y2q.n5().n5(this.n5.n3())) {
         case 1:
            y2q.n5(this.l6, new g7("insertion", new u4y(this.n5)));
            break;
         case 2:
            y2q.n5(this.l6, new g7("deletion", new w9f(this.n5)));
            break;
         case 3:
            y2q.n5(this.l6, new g7("format-change", new z3h(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
