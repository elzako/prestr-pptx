package com.aspose.slides.internal.k4y;

class y1$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y1 l6;

   y1$2(y1 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y1.u3().n5(this.n5.n3())) {
         case 2:
            y4p var2 = new y4p(this.n5);
            y1.n5(this.l6).addItem(var2);
            break;
         case 3:
            l6x var3 = new l6x(this.n5);
            y1.l6(this.l6).addItem(var3);
            break;
         case 4:
            y1.n5(this.l6, new q5b(this.n5));
            break;
         case 5:
            b8s var4 = new b8s(this.n5);
            y1.k5(this.l6).addItem(var4);
            break;
         case 6:
            y1.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
