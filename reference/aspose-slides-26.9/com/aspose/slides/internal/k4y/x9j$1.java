package com.aspose.slides.internal.k4y;

class x9j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x9j l6;

   x9j$1(x9j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x9j.n5().n5(this.n5.n3())) {
         case 0:
            v9j var2 = new v9j(this.n5);
            x9j.n5(this.l6).addItem(new g7("anchor", var2));
            break;
         case 1:
            n4z var3 = new n4z(this.n5);
            x9j.n5(this.l6).addItem(new g7("inline", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
