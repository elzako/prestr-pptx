package com.aspose.slides.internal.k4y;

class u3k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u3k l6;

   u3k$2(u3k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u3k.h0().n5(this.n5.n3())) {
         case 1:
            u3k.n5(this.l6, new y0k(this.n5));
            break;
         case 2:
            u3k.n5(this.l6, new u7v(this.n5));
            break;
         case 3:
            u3k.n5(this.l6, new r8u(this.n5));
            break;
         case 4:
            g6v var2 = new g6v(this.n5);
            u3k.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
