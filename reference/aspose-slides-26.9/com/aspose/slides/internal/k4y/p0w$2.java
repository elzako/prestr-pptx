package com.aspose.slides.internal.k4y;

class p0w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p0w l6;

   p0w$2(p0w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p0w.l6().n5(this.n5.n3())) {
         case 1:
            p0w var2 = new p0w(this.n5);
            p0w.n5(this.l6).addItem(new g7("table-row-group", var2));
            break;
         case 2:
            h6i var3 = new h6i(this.n5);
            p0w.n5(this.l6).addItem(new g7("table-rows", var3));
            break;
         case 3:
            w1x var4 = new w1x(this.n5);
            p0w.n5(this.l6).addItem(new g7("table-row", var4));
            break;
         case 4:
            u1j var5 = new u1j(this.n5);
            p0w.n5(this.l6).addItem(new g7("table-header-rows", var5));
            break;
         case 5:
            j0v var6 = new j0v(this.n5);
            p0w.n5(this.l6).addItem(new g7("soft-page-break", var6));
            break;
         default:
            return false;
      }

      return true;
   }
}
