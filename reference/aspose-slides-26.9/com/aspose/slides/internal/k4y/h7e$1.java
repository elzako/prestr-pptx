package com.aspose.slides.internal.k4y;

class h7e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h7e l6;

   h7e$1(h7e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h7e.l6().n5(this.n5.n3())) {
         case 0:
            o2n var2 = new o2n(this.n5);
            h7e.n5(this.l6).addItem(new g7("par", var2));
            break;
         case 1:
            q3a var3 = new q3a(this.n5);
            h7e.n5(this.l6).addItem(new g7("seq", var3));
            break;
         case 2:
            g8z var4 = new g8z(this.n5);
            h7e.n5(this.l6).addItem(new g7("excl", var4));
            break;
         case 3:
            a4w var5 = new a4w(this.n5);
            h7e.n5(this.l6).addItem(new g7("anim", var5));
            break;
         case 4:
            s5v var6 = new s5v(this.n5);
            h7e.n5(this.l6).addItem(new g7("animClr", var6));
            break;
         case 5:
            n3m var7 = new n3m(this.n5);
            h7e.n5(this.l6).addItem(new g7("animEffect", var7));
            break;
         case 6:
            h7g var8 = new h7g(this.n5);
            h7e.n5(this.l6).addItem(new g7("animMotion", var8));
            break;
         case 7:
            c3t var9 = new c3t(this.n5);
            h7e.n5(this.l6).addItem(new g7("animRot", var9));
            break;
         case 8:
            q6i var10 = new q6i(this.n5);
            h7e.n5(this.l6).addItem(new g7("animScale", var10));
            break;
         case 9:
            s1z var11 = new s1z(this.n5);
            h7e.n5(this.l6).addItem(new g7("cmd", var11));
            break;
         case 10:
            p2j var12 = new p2j(this.n5);
            h7e.n5(this.l6).addItem(new g7("set", var12));
            break;
         case 11:
            e3b var13 = new e3b(this.n5);
            h7e.n5(this.l6).addItem(new g7("audio", var13));
            break;
         case 12:
            u3l var14 = new u3l(this.n5);
            h7e.n5(this.l6).addItem(new g7("video", var14));
            break;
         default:
            return false;
      }

      return true;
   }
}
