package com.aspose.slides.internal.k4y;

class d0u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d0u l6;

   d0u$2(d0u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d0u.n5().n5(this.n5.n3())) {
         case 5:
            d0u.n5(this.l6, new k8n(this.n5));
            break;
         case 6:
            d0u.n5(this.l6, new g7("error-message", new a1f(this.n5)));
            break;
         case 7:
            d0u.n5(this.l6, new m0i(this.n5));
            break;
         case 8:
            d0u.n5(this.l6, new c6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
