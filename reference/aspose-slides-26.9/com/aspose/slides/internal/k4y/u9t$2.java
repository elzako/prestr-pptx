package com.aspose.slides.internal.k4y;

class u9t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u9t l6;

   u9t$2(u9t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u9t.u9().n5(this.n5.n3())) {
         case 5:
            u9t.n5(this.l6, new h6j(this.n5));
            break;
         case 6:
            u9t.n5(this.l6, new m1g(this.n5));
            break;
         case 7:
            u9t.n5(this.l6, new i4v(this.n5));
            break;
         case 8:
            u9t.n5(this.l6, new x0a(this.n5));
            break;
         case 9:
            u9t.n5(this.l6, new b4i(this.n5));
            break;
         case 10:
            y2i var2 = new y2i(this.n5);
            u9t.n5(this.l6).addItem(var2);
            break;
         case 11:
            e6x var3 = new e6x(this.n5);
            u9t.l6(this.l6).addItem(new g7("rect", var3));
            break;
         case 12:
            j6v var4 = new j6v(this.n5);
            u9t.l6(this.l6).addItem(new g7("line", var4));
            break;
         case 13:
            u5l var5 = new u5l(this.n5);
            u9t.l6(this.l6).addItem(new g7("polyline", var5));
            break;
         case 14:
            s4p var6 = new s4p(this.n5);
            u9t.l6(this.l6).addItem(new g7("polygon", var6));
            break;
         case 15:
            z7d var7 = new z7d(this.n5);
            u9t.l6(this.l6).addItem(new g7("regular-polygon", var7));
            break;
         case 16:
            c5w var8 = new c5w(this.n5);
            u9t.l6(this.l6).addItem(new g7("path", var8));
            break;
         case 17:
            f1h var9 = new f1h(this.n5);
            u9t.l6(this.l6).addItem(new g7("circle", var9));
            break;
         case 18:
            d2z var10 = new d2z(this.n5);
            u9t.l6(this.l6).addItem(new g7("ellipse", var10));
            break;
         case 19:
            c4f var11 = new c4f(this.n5);
            u9t.l6(this.l6).addItem(new g7("g", var11));
            break;
         case 20:
            h4i var12 = new h4i(this.n5);
            u9t.l6(this.l6).addItem(new g7("page-thumbnail", var12));
            break;
         case 21:
            b4f var13 = new b4f(this.n5);
            u9t.l6(this.l6).addItem(new g7("frame", var13));
            break;
         case 22:
            v6z var14 = new v6z(this.n5);
            u9t.l6(this.l6).addItem(new g7("measure", var14));
            break;
         case 23:
            v8v var15 = new v8v(this.n5);
            u9t.l6(this.l6).addItem(new g7("caption", var15));
            break;
         case 24:
            l3d var16 = new l3d(this.n5);
            u9t.l6(this.l6).addItem(new g7("connector", var16));
            break;
         case 25:
            w4a var17 = new w4a(this.n5);
            u9t.l6(this.l6).addItem(new g7("control", var17));
            break;
         case 26:
            d8f var18 = new d8f(this.n5);
            u9t.l6(this.l6).addItem(new g7("scene", var18));
            break;
         case 27:
            g3c var19 = new g3c(this.n5);
            u9t.l6(this.l6).addItem(new g7("custom-shape", var19));
            break;
         case 28:
            u9t.n5(this.l6, new p0i(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
