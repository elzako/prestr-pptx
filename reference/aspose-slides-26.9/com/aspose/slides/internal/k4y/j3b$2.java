package com.aspose.slides.internal.k4y;

class j3b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j3b l6;

   j3b$2(j3b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j3b.a6().n5(this.n5.n3())) {
         case 1:
            w3k var2 = new w3k(this.n5);
            j3b.n5(this.l6).addItem(var2);
            break;
         case 2:
            j3b.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
