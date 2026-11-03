package com.aspose.slides.internal.k4y;

class c5z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c5z l6;

   c5z$2(c5z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c5z.s7().n5(this.n5.n3())) {
         case 8:
            p5i var2 = new p5i(this.n5);
            c5z.n5(this.l6).addItem(new g7("alg", var2));
            break;
         case 9:
            r6v var3 = new r6v(this.n5);
            c5z.n5(this.l6).addItem(new g7("shape", var3));
            break;
         case 10:
            d4w var4 = new d4w(this.n5);
            c5z.n5(this.l6).addItem(new g7("presOf", var4));
            break;
         case 11:
            n8z var5 = new n8z(this.n5);
            c5z.n5(this.l6).addItem(new g7("constrLst", var5));
            break;
         case 12:
            k5r var6 = new k5r(this.n5);
            c5z.n5(this.l6).addItem(new g7("ruleLst", var6));
            break;
         case 13:
            c5z var7 = new c5z(this.n5);
            c5z.n5(this.l6).addItem(new g7("forEach", var7));
            break;
         case 14:
            y5g var8 = new y5g(this.n5);
            c5z.n5(this.l6).addItem(new g7("layoutNode", var8));
            break;
         case 15:
            i9l var9 = new i9l(this.n5);
            c5z.n5(this.l6).addItem(new g7("choose", var9));
            break;
         case 16:
            l8r var10 = new l8r(this.n5);
            c5z.n5(this.l6).addItem(new g7("extLst", var10));
            break;
         default:
            return false;
      }

      return true;
   }
}
