package com.aspose.slides.internal.k4y;

class y0k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y0k l6;

   y0k$2(y0k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y0k.u3().n5(this.n5.n3())) {
         case 1:
            y0k.n5(this.l6, new f2q(this.n5));
            break;
         case 2:
            y0k.n5(this.l6, new w8e(this.n5));
            break;
         case 3:
            u7a var2 = new u7a(this.n5);
            y0k.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
