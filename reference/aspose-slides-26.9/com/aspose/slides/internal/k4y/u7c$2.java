package com.aspose.slides.internal.k4y;

class u7c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u7c l6;

   u7c$2(u7c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u7c.u9().n5(this.n5.n3())) {
         case 1:
            u7c.n5(this.l6, new f1c(this.n5));
            break;
         case 2:
            u7c.n5(this.l6, new t5g(this.n5));
            break;
         case 3:
            u7c.n5(this.l6, new v7u(this.n5));
            break;
         case 4:
            u7c.n5(this.l6, new j2(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
