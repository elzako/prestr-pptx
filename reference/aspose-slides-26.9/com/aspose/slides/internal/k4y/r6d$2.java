package com.aspose.slides.internal.k4y;

class r6d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6d l6;

   r6d$2(r6d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6d.s7().n5(this.n5.n3())) {
         case 18:
            d5k var2 = new d5k(this.n5);
            r6d.n5(this.l6).addItem(var2);
            break;
         case 19:
            m3z var3 = new m3z(this.n5);
            r6d.l6(this.l6).addItem(var3);
            break;
         case 20:
            m4k var4 = new m4k(this.n5);
            r6d.k5(this.l6).addItem(var4);
            break;
         case 21:
            r6d.n5(this.l6, new k2a(this.n5));
            break;
         case 22:
            r6d.n5(this.l6, new t3n(this.n5));
            break;
         case 23:
            r6d.n5(this.l6, new q8v(this.n5));
            break;
         case 24:
            r6d.n5(this.l6, new h2i(this.n5));
            break;
         case 25:
            r6d.n5(this.l6, new s1a(this.n5));
            break;
         case 26:
            r6d.n5(this.l6, new s8d(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
