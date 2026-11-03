package com.aspose.slides.internal.k4y;

class a6w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a6w l6;

   a6w$2(a6w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a6w.z8().n5(this.n5.n3())) {
         case 28:
            a6w.n5(this.l6, new s3p(this.n5));
            break;
         case 29:
            a6w.n5(this.l6, new d9m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
