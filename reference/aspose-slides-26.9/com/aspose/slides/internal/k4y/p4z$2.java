package com.aspose.slides.internal.k4y;

class p4z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p4z l6;

   p4z$2(p4z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p4z.n5().n5(this.n5.n3())) {
         case 2:
            s5b var2 = new s5b(this.n5);
            p4z.n5(this.l6).addItem(new g7("index-entry-span", var2));
            break;
         case 3:
            i0d var3 = new i0d(this.n5);
            p4z.n5(this.l6).addItem(new g7("index-entry-tab-stop", var3));
            break;
         case 4:
            d6m var4 = new d6m(this.n5);
            p4z.n5(this.l6).addItem(new g7("index-entry-bibliography", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
