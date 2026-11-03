package com.aspose.slides.internal.k4y;

class w0l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w0l l6;

   w0l$1(w0l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w0l.l6().n5(this.n5.n3())) {
         case 0:
            q2z var2 = new q2z(this.n5);
            w0l.n5(this.l6).addItem(new g7("name", var2));
            break;
         case 1:
            p2k var3 = new p2k(this.n5);
            w0l.n5(this.l6).addItem(new g7("charset", var3));
            break;
         case 2:
            p2k var4 = new p2k(this.n5);
            w0l.n5(this.l6).addItem(new g7("family", var4));
            break;
         case 3:
            w7c var5 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("b", var5));
            break;
         case 4:
            w7c var6 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("i", var6));
            break;
         case 5:
            w7c var7 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("strike", var7));
            break;
         case 6:
            w7c var8 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("outline", var8));
            break;
         case 7:
            w7c var9 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("shadow", var9));
            break;
         case 8:
            w7c var10 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("condense", var10));
            break;
         case 9:
            w7c var11 = new w7c(this.n5);
            w0l.n5(this.l6).addItem(new g7("extend", var11));
            break;
         case 10:
            v6p var12 = new v6p(this.n5);
            w0l.n5(this.l6).addItem(new g7("color", var12));
            break;
         case 11:
            o4f var13 = new o4f(this.n5);
            w0l.n5(this.l6).addItem(new g7("sz", var13));
            break;
         case 12:
            y5v var14 = new y5v(this.n5);
            w0l.n5(this.l6).addItem(new g7("u", var14));
            break;
         case 13:
            q0b var15 = new q0b(this.n5);
            w0l.n5(this.l6).addItem(new g7("vertAlign", var15));
            break;
         case 14:
            a8v var16 = new a8v(this.n5);
            w0l.n5(this.l6).addItem(new g7("scheme", var16));
            break;
         default:
            return false;
      }

      return true;
   }
}
