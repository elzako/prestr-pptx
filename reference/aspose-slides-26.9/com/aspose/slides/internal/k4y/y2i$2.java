package com.aspose.slides.internal.k4y;

class y2i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y2i l6;

   y2i$2(y2i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y2i.a6().n5(this.n5.n3())) {
         case 11:
            a8k var2 = new a8k(this.n5);
            y2i.n5(this.l6).addItem(new g7("chart-properties", var2));
            break;
         case 12:
            p3w var3 = new p3w(this.n5);
            y2i.n5(this.l6).addItem(new g7("graphic-properties", var3));
            break;
         case 13:
            b4u var4 = new b4u(this.n5);
            y2i.n5(this.l6).addItem(new g7("table-cell-properties", var4));
            break;
         case 14:
            v5n var5 = new v5n(this.n5);
            y2i.n5(this.l6).addItem(new g7("paragraph-properties", var5));
            break;
         case 15:
            j9d var6 = new j9d(this.n5);
            y2i.n5(this.l6).addItem(new g7("text-properties", var6));
            break;
         case 16:
            d5z var7 = new d5z(this.n5);
            y2i.n5(this.l6).addItem(new g7("section-properties", var7));
            break;
         case 17:
            r1w var8 = new r1w(this.n5);
            y2i.n5(this.l6).addItem(new g7("ruby-properties", var8));
            break;
         case 18:
            m3y var9 = new m3y(this.n5);
            y2i.n5(this.l6).addItem(new g7("table-properties", var9));
            break;
         case 19:
            n0l var10 = new n0l(this.n5);
            y2i.n5(this.l6).addItem(new g7("table-column-properties", var10));
            break;
         case 20:
            s6j var11 = new s6j(this.n5);
            y2i.n5(this.l6).addItem(new g7("table-row-properties", var11));
            break;
         case 21:
            r9l var12 = new r9l(this.n5);
            y2i.n5(this.l6).addItem(new g7("drawing-page-properties", var12));
            break;
         case 22:
            j3t var13 = new j3t(this.n5);
            y2i.l6(this.l6).addItem(var13);
            break;
         default:
            return false;
      }

      return true;
   }
}
