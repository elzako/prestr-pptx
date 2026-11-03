package com.aspose.slides.internal.k4y;

class m3i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m3i l6;

   m3i$2(m3i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m3i.k5().n5(this.n5.n3())) {
         case 1:
            a8k var2 = new a8k(this.n5);
            m3i.n5(this.l6).addItem(new g7("chart-properties", var2));
            break;
         case 2:
            p3w var3 = new p3w(this.n5);
            m3i.n5(this.l6).addItem(new g7("graphic-properties", var3));
            break;
         case 3:
            b4u var4 = new b4u(this.n5);
            m3i.n5(this.l6).addItem(new g7("table-cell-properties", var4));
            break;
         case 4:
            v5n var5 = new v5n(this.n5);
            m3i.n5(this.l6).addItem(new g7("paragraph-properties", var5));
            break;
         case 5:
            j9d var6 = new j9d(this.n5);
            m3i.n5(this.l6).addItem(new g7("text-properties", var6));
            break;
         case 6:
            d5z var7 = new d5z(this.n5);
            m3i.n5(this.l6).addItem(new g7("section-properties", var7));
            break;
         case 7:
            r1w var8 = new r1w(this.n5);
            m3i.n5(this.l6).addItem(new g7("ruby-properties", var8));
            break;
         case 8:
            m3y var9 = new m3y(this.n5);
            m3i.n5(this.l6).addItem(new g7("table-properties", var9));
            break;
         case 9:
            n0l var10 = new n0l(this.n5);
            m3i.n5(this.l6).addItem(new g7("table-column-properties", var10));
            break;
         case 10:
            s6j var11 = new s6j(this.n5);
            m3i.n5(this.l6).addItem(new g7("table-row-properties", var11));
            break;
         case 11:
            r9l var12 = new r9l(this.n5);
            m3i.n5(this.l6).addItem(new g7("drawing-page-properties", var12));
            break;
         default:
            return false;
      }

      return true;
   }
}
