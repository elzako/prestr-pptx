package com.aspose.slides.internal.k4y;

class x2o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x2o l6;

   x2o$1(x2o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x2o.a6().n5(this.n5.n3())) {
         case 0:
            x2o.n5(this.l6, new b8n(this.n5));
            break;
         case 1:
            t9z var2 = new t9z(this.n5);
            x2o.n5(this.l6).addItem(var2);
            break;
         case 2:
            x2o.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
