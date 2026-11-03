package com.aspose.slides.internal.k4y;

class c7f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c7f l6;

   c7f$2(c7f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c7f.h0().n5(this.n5.n3())) {
         case 5:
            g4u var2 = new g4u(this.n5);
            c7f.n5(this.l6).addItem(new g7("close", var2));
            break;
         case 6:
            p7x var3 = new p7x(this.n5);
            c7f.n5(this.l6).addItem(new g7("moveTo", var3));
            break;
         case 7:
            c1x var4 = new c1x(this.n5);
            c7f.n5(this.l6).addItem(new g7("lnTo", var4));
            break;
         case 8:
            z6e var5 = new z6e(this.n5);
            c7f.n5(this.l6).addItem(new g7("arcTo", var5));
            break;
         case 9:
            o6t var6 = new o6t(this.n5);
            c7f.n5(this.l6).addItem(new g7("quadBezTo", var6));
            break;
         case 10:
            y8m var7 = new y8m(this.n5);
            c7f.n5(this.l6).addItem(new g7("cubicBezTo", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
