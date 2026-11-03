package com.aspose.slides.internal.k4y;

class t4t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4t l6;

   t4t$2(t4t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4t.a6().n5(this.n5.n3())) {
         case 2:
            t4t.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            t4t.n5(this.l6, new k1e(this.n5));
            break;
         case 4:
            t4t.n5(this.l6, new i8f(this.n5));
            break;
         case 5:
            t4t.n5(this.l6, new q1v(this.n5));
            break;
         case 6:
            t4t.n5(this.l6, new l8r(this.n5));
            break;
         case 7:
            t4t.n5(this.l6, new g7("objViewport", new l8k(this.n5)));
            break;
         case 8:
            t4t.n5(this.l6, new g7("winViewport", new y0v(this.n5)));
            break;
         case 9:
            t4t.n5(this.l6, new c0e(this.n5));
            break;
         case 10:
            o6d var2 = new o6d(this.n5);
            t4t.n5(this.l6).addItem(new g7("ptLight", var2));
            break;
         case 11:
            j8h var3 = new j8h(this.n5);
            t4t.n5(this.l6).addItem(new g7("spotLight", var3));
            break;
         case 12:
            y9i var4 = new y9i(this.n5);
            t4t.n5(this.l6).addItem(new g7("dirLight", var4));
            break;
         case 13:
            d4x var5 = new d4x(this.n5);
            t4t.n5(this.l6).addItem(new g7("unkLight", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
