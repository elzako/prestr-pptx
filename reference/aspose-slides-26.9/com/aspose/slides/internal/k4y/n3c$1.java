package com.aspose.slides.internal.k4y;

class n3c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n3c l6;

   n3c$1(n3c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n3c.u9().n5(this.n5.n3())) {
         case 0:
            n3c.n5(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 1:
            n3c.n5(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         case 2:
            n3c.n5(this.l6, new h6l(this.n5));
            break;
         case 3:
            n3c.n5(this.l6, new q9u(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
