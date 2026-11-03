package com.aspose.slides.internal.k4y;

class b6l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b6l l6;

   b6l$2(b6l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b6l.n5().n5(this.n5.n3())) {
         case 11:
            b6l.n5(this.l6, new j9d(this.n5));
            break;
         case 12:
            x3f var2 = new x3f(this.n5);
            b6l.n5(this.l6).addItem(new g7("day", var2));
            break;
         case 13:
            e8s var3 = new e8s(this.n5);
            b6l.n5(this.l6).addItem(new g7("month", var3));
            break;
         case 14:
            c8r var4 = new c8r(this.n5);
            b6l.n5(this.l6).addItem(new g7("year", var4));
            break;
         case 15:
            x5n var5 = new x5n(this.n5);
            b6l.n5(this.l6).addItem(new g7("era", var5));
            break;
         case 16:
            t7e var6 = new t7e(this.n5);
            b6l.n5(this.l6).addItem(new g7("day-of-week", var6));
            break;
         case 17:
            d8b var7 = new d8b(this.n5);
            b6l.n5(this.l6).addItem(new g7("week-of-year", var7));
            break;
         case 18:
            p1e var8 = new p1e(this.n5);
            b6l.n5(this.l6).addItem(new g7("quarter", var8));
            break;
         case 19:
            h5m var9 = new h5m(this.n5);
            b6l.n5(this.l6).addItem(new g7("hours", var9));
            break;
         case 20:
            k6m var10 = new k6m(this.n5);
            b6l.n5(this.l6).addItem(new g7("am-pm", var10));
            break;
         case 21:
            v1l var11 = new v1l(this.n5);
            b6l.n5(this.l6).addItem(new g7("minutes", var11));
            break;
         case 22:
            m2d var12 = new m2d(this.n5);
            b6l.n5(this.l6).addItem(new g7("seconds", var12));
            break;
         case 23:
            this.n5.u9();
            String var13 = this.n5.z1();
            b6l.n5(this.l6).addItem(new g7("text", var13));
            break;
         case 24:
            j3t var14 = new j3t(this.n5);
            b6l.l6(this.l6).addItem(var14);
            break;
         default:
            return false;
      }

      return true;
   }
}
