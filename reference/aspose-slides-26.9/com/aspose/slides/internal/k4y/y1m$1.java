package com.aspose.slides.internal.k4y;

class y1m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y1m l6;

   y1m$1(y1m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y1m.l6().n5(this.n5.n3())) {
         case 0:
            y2i var2 = new y2i(this.n5);
            y1m.n5(this.l6).addItem(new g7("style", var2));
            break;
         case 1:
            a8r var3 = new a8r(this.n5);
            y1m.n5(this.l6).addItem(new g7("list-style", var3));
            break;
         case 2:
            c1s var4 = new c1s(this.n5);
            y1m.n5(this.l6).addItem(new g7("number-style", var4));
            break;
         case 3:
            b2y var5 = new b2y(this.n5);
            y1m.n5(this.l6).addItem(new g7("currency-style", var5));
            break;
         case 4:
            h1s var6 = new h1s(this.n5);
            y1m.n5(this.l6).addItem(new g7("percentage-style", var6));
            break;
         case 5:
            b6l var7 = new b6l(this.n5);
            y1m.n5(this.l6).addItem(new g7("date-style", var7));
            break;
         case 6:
            l7y var8 = new l7y(this.n5);
            y1m.n5(this.l6).addItem(new g7("time-style", var8));
            break;
         case 7:
            j4b var9 = new j4b(this.n5);
            y1m.n5(this.l6).addItem(new g7("boolean-style", var9));
            break;
         case 8:
            r1f var10 = new r1f(this.n5);
            y1m.n5(this.l6).addItem(new g7("text-style", var10));
            break;
         case 9:
            m3i var11 = new m3i(this.n5);
            y1m.n5(this.l6).addItem(new g7("default-style", var11));
            break;
         case 10:
            x7b var12 = new x7b(this.n5);
            y1m.n5(this.l6).addItem(new g7("outline-style", var12));
            break;
         case 11:
            z4a var13 = new z4a(this.n5);
            y1m.n5(this.l6).addItem(new g7("notes-configuration", var13));
            break;
         case 12:
            d5q var14 = new d5q(this.n5);
            y1m.n5(this.l6).addItem(new g7("bibliography-configuration", var14));
            break;
         case 13:
            q6s var15 = new q6s(this.n5);
            y1m.n5(this.l6).addItem(new g7("linenumbering-configuration", var15));
            break;
         case 14:
            a6y var16 = new a6y(this.n5);
            y1m.n5(this.l6).addItem(new g7("gradient", var16));
            break;
         case 15:
            l3l var17 = new l3l(this.n5);
            y1m.n5(this.l6).addItem(new g7("linearGradient", var17));
            break;
         case 16:
            t3x var18 = new t3x(this.n5);
            y1m.n5(this.l6).addItem(new g7("radialGradient", var18));
            break;
         case 17:
            x7t var19 = new x7t(this.n5);
            y1m.n5(this.l6).addItem(new g7("hatch", var19));
            break;
         case 18:
            r9i var20 = new r9i(this.n5);
            y1m.n5(this.l6).addItem(new g7("fill-image", var20));
            break;
         case 19:
            s1v var21 = new s1v(this.n5);
            y1m.n5(this.l6).addItem(new g7("marker", var21));
            break;
         case 20:
            x2k var22 = new x2k(this.n5);
            y1m.n5(this.l6).addItem(new g7("stroke-dash", var22));
            break;
         case 21:
            k5d var23 = new k5d(this.n5);
            y1m.n5(this.l6).addItem(new g7("opacity", var23));
            break;
         case 22:
            q9k var24 = new q9k(this.n5);
            y1m.n5(this.l6).addItem(new g7("presentation-page-layout", var24));
            break;
         case 23:
            r5v var25 = new r5v(this.n5);
            y1m.n5(this.l6).addItem(new g7("table-template", var25));
            break;
         default:
            return false;
      }

      return true;
   }
}
