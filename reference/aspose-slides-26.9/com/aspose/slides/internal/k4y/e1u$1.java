package com.aspose.slides.internal.k4y;

class e1u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e1u l6;

   e1u$1(e1u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e1u.l6().n5(this.n5.n3())) {
         case 0:
            y2i var2 = new y2i(this.n5);
            e1u.n5(this.l6).addItem(new g7("style", var2));
            break;
         case 1:
            a8r var3 = new a8r(this.n5);
            e1u.n5(this.l6).addItem(new g7("list-style", var3));
            break;
         case 2:
            c1s var4 = new c1s(this.n5);
            e1u.n5(this.l6).addItem(new g7("number-style", var4));
            break;
         case 3:
            b2y var5 = new b2y(this.n5);
            e1u.n5(this.l6).addItem(new g7("currency-style", var5));
            break;
         case 4:
            h1s var6 = new h1s(this.n5);
            e1u.n5(this.l6).addItem(new g7("percentage-style", var6));
            break;
         case 5:
            b6l var7 = new b6l(this.n5);
            e1u.n5(this.l6).addItem(new g7("date-style", var7));
            break;
         case 6:
            l7y var8 = new l7y(this.n5);
            e1u.n5(this.l6).addItem(new g7("time-style", var8));
            break;
         case 7:
            j4b var9 = new j4b(this.n5);
            e1u.n5(this.l6).addItem(new g7("boolean-style", var9));
            break;
         case 8:
            r1f var10 = new r1f(this.n5);
            e1u.n5(this.l6).addItem(new g7("text-style", var10));
            break;
         case 9:
            j4k var11 = new j4k(this.n5);
            e1u.n5(this.l6).addItem(new g7("page-layout", var11));
            break;
         default:
            return false;
      }

      return true;
   }
}
