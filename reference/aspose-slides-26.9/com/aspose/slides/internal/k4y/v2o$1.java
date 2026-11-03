package com.aspose.slides.internal.k4y;

class v2o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v2o l6;

   v2o$1(v2o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v2o.u3().n5(this.n5.n3())) {
         case 0:
            v2o.n5(this.l6, new v1y(this.n5));
            break;
         case 1:
            v2o.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
