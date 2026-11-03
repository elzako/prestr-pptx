package com.aspose.slides.internal.k4y;

class r2o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r2o l6;

   r2o$2(r2o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r2o.u3().n5(this.n5.n3())) {
         case 1:
            r2o.n5(this.l6, new v1w(this.n5));
            break;
         case 2:
            r2o.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
