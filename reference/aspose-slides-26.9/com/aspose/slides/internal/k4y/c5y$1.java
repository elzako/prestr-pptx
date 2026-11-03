package com.aspose.slides.internal.k4y;

class c5y$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c5y l6;

   c5y$1(c5y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c5y.l6().n5(this.n5.n3())) {
         case 0:
            c5y.n5(this.l6, new g7("patternFill", new o5z(this.n5)));
            break;
         case 1:
            c5y.n5(this.l6, new g7("gradientFill", new w9d(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
