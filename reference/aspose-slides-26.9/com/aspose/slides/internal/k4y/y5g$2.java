package com.aspose.slides.internal.k4y;

class y5g$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y5g l6;

   y5g$2(y5g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y5g.u9().n5(this.n5.n3())) {
         case 4:
            p5i var2 = new p5i(this.n5);
            y5g.n5(this.l6).addItem(new g7("alg", var2));
            break;
         case 5:
            r6v var3 = new r6v(this.n5);
            y5g.n5(this.l6).addItem(new g7("shape", var3));
            break;
         case 6:
            d4w var4 = new d4w(this.n5);
            y5g.n5(this.l6).addItem(new g7("presOf", var4));
            break;
         case 7:
            n8z var5 = new n8z(this.n5);
            y5g.n5(this.l6).addItem(new g7("constrLst", var5));
            break;
         case 8:
            k5r var6 = new k5r(this.n5);
            y5g.n5(this.l6).addItem(new g7("ruleLst", var6));
            break;
         case 9:
            s3p var7 = new s3p(this.n5);
            y5g.n5(this.l6).addItem(new g7("varLst", var7));
            break;
         case 10:
            c5z var8 = new c5z(this.n5);
            y5g.n5(this.l6).addItem(new g7("forEach", var8));
            break;
         case 11:
            y5g var9 = new y5g(this.n5);
            y5g.n5(this.l6).addItem(new g7("layoutNode", var9));
            break;
         case 12:
            i9l var10 = new i9l(this.n5);
            y5g.n5(this.l6).addItem(new g7("choose", var10));
            break;
         case 13:
            l8r var11 = new l8r(this.n5);
            y5g.n5(this.l6).addItem(new g7("extLst", var11));
            break;
         default:
            return false;
      }

      return true;
   }
}
