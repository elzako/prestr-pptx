package com.aspose.slides.internal.k4y;

class n8k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n8k l6;

   n8k$2(n8k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n8k.k5().n5(this.n5.n3())) {
         case 20:
            r2z var2 = new r2z(this.n5);
            n8k.n5(this.l6).addItem(new g7("animate", var2));
            break;
         case 21:
            y2d var3 = new y2d(this.n5);
            n8k.n5(this.l6).addItem(new g7("set", var3));
            break;
         case 22:
            c6q var4 = new c6q(this.n5);
            n8k.n5(this.l6).addItem(new g7("animateMotion", var4));
            break;
         case 23:
            z8y var5 = new z8y(this.n5);
            n8k.n5(this.l6).addItem(new g7("animateColor", var5));
            break;
         case 24:
            a6l var6 = new a6l(this.n5);
            n8k.n5(this.l6).addItem(new g7("animateTransform", var6));
            break;
         case 25:
            r3k var7 = new r3k(this.n5);
            n8k.n5(this.l6).addItem(new g7("transitionFilter", var7));
            break;
         case 26:
            g4z var8 = new g4z(this.n5);
            n8k.n5(this.l6).addItem(new g7("par", var8));
            break;
         case 27:
            n8k var9 = new n8k(this.n5);
            n8k.n5(this.l6).addItem(new g7("seq", var9));
            break;
         case 28:
            p8u var10 = new p8u(this.n5);
            n8k.n5(this.l6).addItem(new g7("iterate", var10));
            break;
         case 29:
            y8g var11 = new y8g(this.n5);
            n8k.n5(this.l6).addItem(new g7("audio", var11));
            break;
         case 30:
            k6o var12 = new k6o(this.n5);
            n8k.n5(this.l6).addItem(new g7("command", var12));
            break;
         default:
            return false;
      }

      return true;
   }
}
