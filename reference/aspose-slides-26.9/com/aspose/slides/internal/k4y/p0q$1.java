package com.aspose.slides.internal.k4y;

class p0q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p0q l6;

   p0q$1(p0q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p0q.n5().n5(this.n5.n3())) {
         case 0:
            p0q.n5(this.l6, new y4e(this.n5));
            break;
         case 1:
            p0q.n5(this.l6, new n5u(this.n5));
            break;
         case 2:
            j5z var2 = new j5z(this.n5);
            p0q.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 3:
            j9u var3 = new j9u(this.n5);
            p0q.n5(this.l6).addItem(new g7("AlternateContent", var3));
            break;
         case 4:
            p0q var4 = new p0q(this.n5);
            p0q.n5(this.l6).addItem(new g7("grpSp", var4));
            break;
         case 5:
            h0m var5 = new h0m(this.n5);
            p0q.n5(this.l6).addItem(new g7("graphicFrame", var5));
            break;
         case 6:
            h1z var6 = new h1z(this.n5);
            p0q.n5(this.l6).addItem(new g7("cxnSp", var6));
            break;
         case 7:
            b3w var7 = new b3w(this.n5);
            p0q.n5(this.l6).addItem(new g7("pic", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
