package com.aspose.slides.internal.k4y;

class p8u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p8u l6;

   p8u$2(p8u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p8u.n3().n5(this.n5.n3())) {
         case 24:
            r2z var2 = new r2z(this.n5);
            p8u.l6(this.l6).addItem(new g7("animate", var2));
            break;
         case 25:
            y2d var3 = new y2d(this.n5);
            p8u.l6(this.l6).addItem(new g7("set", var3));
            break;
         case 26:
            c6q var4 = new c6q(this.n5);
            p8u.l6(this.l6).addItem(new g7("animateMotion", var4));
            break;
         case 27:
            z8y var5 = new z8y(this.n5);
            p8u.l6(this.l6).addItem(new g7("animateColor", var5));
            break;
         case 28:
            a6l var6 = new a6l(this.n5);
            p8u.l6(this.l6).addItem(new g7("animateTransform", var6));
            break;
         case 29:
            r3k var7 = new r3k(this.n5);
            p8u.l6(this.l6).addItem(new g7("transitionFilter", var7));
            break;
         case 30:
            g4z var8 = new g4z(this.n5);
            p8u.l6(this.l6).addItem(new g7("par", var8));
            break;
         case 31:
            n8k var9 = new n8k(this.n5);
            p8u.l6(this.l6).addItem(new g7("seq", var9));
            break;
         case 32:
            p8u var10 = new p8u(this.n5);
            p8u.l6(this.l6).addItem(new g7("iterate", var10));
            break;
         case 33:
            y8g var11 = new y8g(this.n5);
            p8u.l6(this.l6).addItem(new g7("audio", var11));
            break;
         case 34:
            k6o var12 = new k6o(this.n5);
            p8u.l6(this.l6).addItem(new g7("command", var12));
            break;
         default:
            return false;
      }

      return true;
   }
}
