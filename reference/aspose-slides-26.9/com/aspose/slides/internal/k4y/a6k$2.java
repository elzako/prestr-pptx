package com.aspose.slides.internal.k4y;

class a6k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a6k l6;

   a6k$2(a6k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a6k.l6().n5(this.n5.n3())) {
         case 1:
            p5i var2 = new p5i(this.n5);
            a6k.n5(this.l6).addItem(new g7("alg", var2));
            break;
         case 2:
            r6v var3 = new r6v(this.n5);
            a6k.n5(this.l6).addItem(new g7("shape", var3));
            break;
         case 3:
            d4w var4 = new d4w(this.n5);
            a6k.n5(this.l6).addItem(new g7("presOf", var4));
            break;
         case 4:
            n8z var5 = new n8z(this.n5);
            a6k.n5(this.l6).addItem(new g7("constrLst", var5));
            break;
         case 5:
            k5r var6 = new k5r(this.n5);
            a6k.n5(this.l6).addItem(new g7("ruleLst", var6));
            break;
         case 6:
            c5z var7 = new c5z(this.n5);
            a6k.n5(this.l6).addItem(new g7("forEach", var7));
            break;
         case 7:
            y5g var8 = new y5g(this.n5);
            a6k.n5(this.l6).addItem(new g7("layoutNode", var8));
            break;
         case 8:
            i9l var9 = new i9l(this.n5);
            a6k.n5(this.l6).addItem(new g7("choose", var9));
            break;
         case 9:
            l8r var10 = new l8r(this.n5);
            a6k.n5(this.l6).addItem(new g7("extLst", var10));
            break;
         default:
            return false;
      }

      return true;
   }
}
