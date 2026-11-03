package com.aspose.slides.internal.k4y;

class u7q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u7q l6;

   u7q$1(u7q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u7q.a6().n5(this.n5.n3())) {
         case 0:
            u7q.n5(this.l6, new d9l(this.n5));
            break;
         case 1:
            u7q.n5(this.l6, new n5u(this.n5));
            break;
         case 2:
            p5w var2 = new p5w(this.n5);
            u7q.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 3:
            j9u var3 = new j9u(this.n5);
            u7q.n5(this.l6).addItem(new g7("AlternateContent", var3));
            break;
         case 4:
            u7q var4 = new u7q(this.n5);
            u7q.n5(this.l6).addItem(new g7("grpSp", var4));
            break;
         case 5:
            g7i var5 = new g7i(this.n5);
            u7q.n5(this.l6).addItem(new g7("graphicFrame", var5));
            break;
         case 6:
            a3p var6 = new a3p(this.n5);
            u7q.n5(this.l6).addItem(new g7("cxnSp", var6));
            break;
         case 7:
            d8y var7 = new d8y(this.n5);
            u7q.n5(this.l6).addItem(new g7("pic", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
