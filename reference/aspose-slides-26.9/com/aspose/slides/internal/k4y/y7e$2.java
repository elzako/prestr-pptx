package com.aspose.slides.internal.k4y;

class y7e$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y7e l6;

   y7e$2(y7e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y7e.x8().n5(this.n5.n3())) {
         case 14:
            y7e.n5(this.l6, new p0z(this.n5));
            break;
         case 15:
            y7e.n5(this.l6, new p3x(this.n5));
            break;
         case 16:
            y7e.n5(this.l6, new m4g(this.n5));
            break;
         case 17:
            y7e.n5(this.l6, new b4i(this.n5));
            break;
         case 18:
            y7e.n5(this.l6, new z1c(this.n5));
            break;
         case 19:
            y2p var2 = new y2p(this.n5);
            y7e.n5(this.l6).addItem(new g7("table-column-group", var2));
            break;
         case 20:
            v0q var3 = new v0q(this.n5);
            y7e.n5(this.l6).addItem(new g7("table-columns", var3));
            break;
         case 21:
            l5h var4 = new l5h(this.n5);
            y7e.n5(this.l6).addItem(new g7("table-column", var4));
            break;
         case 22:
            w2c var5 = new w2c(this.n5);
            y7e.n5(this.l6).addItem(new g7("table-header-columns", var5));
            break;
         case 23:
            p0w var6 = new p0w(this.n5);
            y7e.l6(this.l6).addItem(new g7("table-row-group", var6));
            break;
         case 24:
            h6i var7 = new h6i(this.n5);
            y7e.l6(this.l6).addItem(new g7("table-rows", var7));
            break;
         case 25:
            w1x var8 = new w1x(this.n5);
            y7e.l6(this.l6).addItem(new g7("table-row", var8));
            break;
         case 26:
            u1j var9 = new u1j(this.n5);
            y7e.l6(this.l6).addItem(new g7("table-header-rows", var9));
            break;
         case 27:
            j0v var10 = new j0v(this.n5);
            y7e.l6(this.l6).addItem(new g7("soft-page-break", var10));
            break;
         default:
            return false;
      }

      return true;
   }
}
