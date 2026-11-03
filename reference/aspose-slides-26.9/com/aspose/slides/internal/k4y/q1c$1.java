package com.aspose.slides.internal.k4y;

class q1c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q1c l6;

   q1c$1(q1c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q1c.n5().n5(this.n5.n3())) {
         case 0:
            y7q var2 = new y7q(this.n5);
            q1c.n5(this.l6).addItem(new g7("show-shape", var2));
            break;
         case 1:
            k8i var3 = new k8i(this.n5);
            q1c.n5(this.l6).addItem(new g7("show-text", var3));
            break;
         case 2:
            u5v var4 = new u5v(this.n5);
            q1c.n5(this.l6).addItem(new g7("hide-shape", var4));
            break;
         case 3:
            q3m var5 = new q3m(this.n5);
            q1c.n5(this.l6).addItem(new g7("hide-text", var5));
            break;
         case 4:
            f4p var6 = new f4p(this.n5);
            q1c.n5(this.l6).addItem(new g7("dim", var6));
            break;
         case 5:
            i5o var7 = new i5o(this.n5);
            q1c.n5(this.l6).addItem(new g7("play", var7));
            break;
         case 6:
            r6e var8 = new r6e(this.n5);
            q1c.n5(this.l6).addItem(new g7("animation-group", var8));
            break;
         default:
            return false;
      }

      return true;
   }
}
