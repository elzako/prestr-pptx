package com.aspose.slides.internal.k4y;

class g2$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g2 l6;

   g2$2(g2 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g2.n3().n5(this.n5.n3())) {
         case 3:
            g2.n5(this.l6, new f2a(this.n5));
            break;
         case 4:
            g2.n5(this.l6, new c1(this.n5));
            break;
         case 5:
            g2.n5(this.l6, new u9(this.n5));
            break;
         case 6:
            g2.n5(this.l6, new k8g(this.n5));
            break;
         case 7:
            g2.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
