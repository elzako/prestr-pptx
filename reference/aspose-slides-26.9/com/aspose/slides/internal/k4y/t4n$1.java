package com.aspose.slides.internal.k4y;

class t4n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4n l6;

   t4n$1(t4n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4n.l6().n5(this.n5.n3())) {
         case 0:
            t4n.n5(this.l6, new g7("charRg", new v6b(this.n5)));
            break;
         case 1:
            t4n.n5(this.l6, new g7("pRg", new v6b(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
