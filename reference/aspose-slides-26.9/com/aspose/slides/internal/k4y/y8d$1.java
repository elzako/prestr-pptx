package com.aspose.slides.internal.k4y;

class y8d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y8d l6;

   y8d$1(y8d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y8d.n5().n5(this.n5.n3())) {
         case 0:
            y8d.n5(this.l6, new g7("extremeValue", new i4u(this.n5)));
            break;
         case 1:
            y8d.n5(this.l6, new g7("number", new x9f(this.n5)));
            break;
         case 2:
            y8d.n5(this.l6, new g7("percent", new m0a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
