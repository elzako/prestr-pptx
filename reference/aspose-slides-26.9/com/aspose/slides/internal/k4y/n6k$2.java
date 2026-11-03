package com.aspose.slides.internal.k4y;

class n6k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n6k l6;

   n6k$2(n6k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n6k.k5().n5(this.n5.n3())) {
         case 5:
            n6k.n5(this.l6, new g7("document", new q7u(this.n5)));
            break;
         case 6:
            n6k.n5(this.l6, new g7("math", new p6s(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
