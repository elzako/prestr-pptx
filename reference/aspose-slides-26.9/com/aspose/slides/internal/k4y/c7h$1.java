package com.aspose.slides.internal.k4y;

class c7h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c7h l6;

   c7h$1(c7h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c7h.n5().n5(this.n5.n3())) {
         case 0:
            c7h.n5(this.l6, new g7("number", new x9f(this.n5)));
            break;
         case 1:
            c7h.n5(this.l6, new g7("percent", new m0a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
