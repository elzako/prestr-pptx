package com.aspose.slides.internal.k4y;

class u0y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u0y l6;

   u0y$2(u0y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u0y.u9().n5(this.n5.n3())) {
         case 2:
            u0y.n5(this.l6, new f0w(this.n5));
            break;
         case 3:
            b2k var2 = new b2k(this.n5);
            u0y.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
