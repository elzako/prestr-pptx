package com.aspose.slides.internal.k4y;

class g2n$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g2n l6;

   g2n$2(g2n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g2n.n5().n5(this.n5.n3())) {
         case 23:
            g2n.n5(this.l6, new l7j(this.n5));
            break;
         case 24:
            g2n.n5(this.l6, new c6x(this.n5));
            break;
         case 25:
            k5l var2 = new k5l(this.n5);
            g2n.n5(this.l6).addItem(new g7("text", var2));
            break;
         case 26:
            s8z var3 = new s8z(this.n5);
            g2n.n5(this.l6).addItem(new g7("textarea", var3));
            break;
         case 27:
            b4b var4 = new b4b(this.n5);
            g2n.n5(this.l6).addItem(new g7("formatted-text", var4));
            break;
         case 28:
            c0u var5 = new c0u(this.n5);
            g2n.n5(this.l6).addItem(new g7("number", var5));
            break;
         case 29:
            f9e var6 = new f9e(this.n5);
            g2n.n5(this.l6).addItem(new g7("date", var6));
            break;
         case 30:
            e8y var7 = new e8y(this.n5);
            g2n.n5(this.l6).addItem(new g7("combobox", var7));
            break;
         case 31:
            i2h var8 = new i2h(this.n5);
            g2n.n5(this.l6).addItem(new g7("listbox", var8));
            break;
         case 32:
            l6v var9 = new l6v(this.n5);
            g2n.n5(this.l6).addItem(new g7("checkbox", var9));
            break;
         case 33:
            l3u var10 = new l3u(this.n5);
            g2n.n5(this.l6).addItem(new g7("password", var10));
            break;
         case 34:
            x3z var11 = new x3z(this.n5);
            g2n.n5(this.l6).addItem(new g7("file", var11));
            break;
         case 35:
            c2h var12 = new c2h(this.n5);
            g2n.n5(this.l6).addItem(new g7("time", var12));
            break;
         case 36:
            y4t var13 = new y4t(this.n5);
            g2n.n5(this.l6).addItem(new g7("fixed-text", var13));
            break;
         case 37:
            n4k var14 = new n4k(this.n5);
            g2n.n5(this.l6).addItem(new g7("button", var14));
            break;
         case 38:
            l1p var15 = new l1p(this.n5);
            g2n.n5(this.l6).addItem(new g7("image", var15));
            break;
         case 39:
            k5y var16 = new k5y(this.n5);
            g2n.n5(this.l6).addItem(new g7("radio", var16));
            break;
         case 40:
            b3h var17 = new b3h(this.n5);
            g2n.n5(this.l6).addItem(new g7("frame", var17));
            break;
         case 41:
            t9v var18 = new t9v(this.n5);
            g2n.n5(this.l6).addItem(new g7("image-frame", var18));
            break;
         case 42:
            j1g var19 = new j1g(this.n5);
            g2n.n5(this.l6).addItem(new g7("hidden", var19));
            break;
         case 43:
            l5t var20 = new l5t(this.n5);
            g2n.n5(this.l6).addItem(new g7("grid", var20));
            break;
         case 44:
            l1z var21 = new l1z(this.n5);
            g2n.n5(this.l6).addItem(new g7("value-range", var21));
            break;
         case 45:
            x4w var22 = new x4w(this.n5);
            g2n.n5(this.l6).addItem(new g7("generic-control", var22));
            break;
         case 46:
            g2n var23 = new g2n(this.n5);
            g2n.n5(this.l6).addItem(new g7("form", var23));
            break;
         case 47:
            g2n.n5(this.l6, new n7e(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
