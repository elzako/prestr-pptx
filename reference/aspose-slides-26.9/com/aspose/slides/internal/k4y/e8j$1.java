package com.aspose.slides.internal.k4y;

class e8j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e8j l6;

   e8j$1(e8j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e8j.l6().n5(this.n5.n3())) {
         case 0:
            e8j.n5(this.l6, new g7("txData", new q8h(this.n5)));
            break;
         case 1:
            e8j.n5(this.l6, new g7("rich", new j3z(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
