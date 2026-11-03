package com.aspose.slides.internal.k4y;

class x9m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final x9m l6;

   x9m$2(x9m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (x9m.n5().n5(this.n5.n3())) {
         case 1:
            c4b var2 = new c4b(this.n5);
            x9m.n5(this.l6).addItem(new g7("index-entry-page-number", var2));
            break;
         case 2:
            l1x var3 = new l1x(this.n5);
            x9m.n5(this.l6).addItem(new g7("index-entry-text", var3));
            break;
         case 3:
            s5b var4 = new s5b(this.n5);
            x9m.n5(this.l6).addItem(new g7("index-entry-span", var4));
            break;
         case 4:
            i0d var5 = new i0d(this.n5);
            x9m.n5(this.l6).addItem(new g7("index-entry-tab-stop", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
