package com.aspose.slides.internal.k4y;

class o5o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o5o l6;

   o5o$2(o5o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o5o.k5().n5(this.n5.n3())) {
         case 2:
            h7x var2 = new h7x(this.n5);
            o5o.n5(this.l6).addItem(var2);
            break;
         case 3:
            o5o.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
