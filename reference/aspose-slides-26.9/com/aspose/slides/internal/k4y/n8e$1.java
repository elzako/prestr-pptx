package com.aspose.slides.internal.k4y;

class n8e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n8e l6;

   n8e$1(n8e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n8e.n3().n5(this.n5.n3())) {
         case 0:
            n8e.n5(this.l6, new k2s(this.n5));
            break;
         case 1:
            n8e.n5(this.l6, new v2o(this.n5));
            break;
         case 2:
            n8e.n5(this.l6, new c8q(this.n5));
            break;
         case 3:
            n8e.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            n8e.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            n8e.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
