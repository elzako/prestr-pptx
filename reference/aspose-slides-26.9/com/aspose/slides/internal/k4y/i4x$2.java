package com.aspose.slides.internal.k4y;

class i4x$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i4x l6;

   i4x$2(i4x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i4x.y4().n5(this.n5.n3())) {
         case 9:
            i4x.n5(this.l6, new b4i(this.n5));
            break;
         case 10:
            e6x var2 = new e6x(this.n5);
            i4x.n5(this.l6).addItem(new g7("rect", var2));
            break;
         case 11:
            j6v var3 = new j6v(this.n5);
            i4x.n5(this.l6).addItem(new g7("line", var3));
            break;
         case 12:
            u5l var4 = new u5l(this.n5);
            i4x.n5(this.l6).addItem(new g7("polyline", var4));
            break;
         case 13:
            s4p var5 = new s4p(this.n5);
            i4x.n5(this.l6).addItem(new g7("polygon", var5));
            break;
         case 14:
            z7d var6 = new z7d(this.n5);
            i4x.n5(this.l6).addItem(new g7("regular-polygon", var6));
            break;
         case 15:
            c5w var7 = new c5w(this.n5);
            i4x.n5(this.l6).addItem(new g7("path", var7));
            break;
         case 16:
            f1h var8 = new f1h(this.n5);
            i4x.n5(this.l6).addItem(new g7("circle", var8));
            break;
         case 17:
            d2z var9 = new d2z(this.n5);
            i4x.n5(this.l6).addItem(new g7("ellipse", var9));
            break;
         case 18:
            c4f var10 = new c4f(this.n5);
            i4x.n5(this.l6).addItem(new g7("g", var10));
            break;
         case 19:
            h4i var11 = new h4i(this.n5);
            i4x.n5(this.l6).addItem(new g7("page-thumbnail", var11));
            break;
         case 20:
            b4f var12 = new b4f(this.n5);
            i4x.n5(this.l6).addItem(new g7("frame", var12));
            break;
         case 21:
            v6z var13 = new v6z(this.n5);
            i4x.n5(this.l6).addItem(new g7("measure", var13));
            break;
         case 22:
            v8v var14 = new v8v(this.n5);
            i4x.n5(this.l6).addItem(new g7("caption", var14));
            break;
         case 23:
            l3d var15 = new l3d(this.n5);
            i4x.n5(this.l6).addItem(new g7("connector", var15));
            break;
         case 24:
            w4a var16 = new w4a(this.n5);
            i4x.n5(this.l6).addItem(new g7("control", var16));
            break;
         case 25:
            d8f var17 = new d8f(this.n5);
            i4x.n5(this.l6).addItem(new g7("scene", var17));
            break;
         case 26:
            g3c var18 = new g3c(this.n5);
            i4x.n5(this.l6).addItem(new g7("custom-shape", var18));
            break;
         case 27:
            i4x.n5(this.l6, new g7("animations", new q1c(this.n5)));
            break;
         case 28:
            i4x.n5(this.l6, new g7("animate", new r2z(this.n5)));
            break;
         case 29:
            i4x.n5(this.l6, new g7("set", new y2d(this.n5)));
            break;
         case 30:
            i4x.n5(this.l6, new g7("animateMotion", new c6q(this.n5)));
            break;
         case 31:
            i4x.n5(this.l6, new g7("animateColor", new z8y(this.n5)));
            break;
         case 32:
            i4x.n5(this.l6, new g7("animateTransform", new a6l(this.n5)));
            break;
         case 33:
            i4x.n5(this.l6, new g7("transitionFilter", new r3k(this.n5)));
            break;
         case 34:
            i4x.n5(this.l6, new g7("par", new g4z(this.n5)));
            break;
         case 35:
            i4x.n5(this.l6, new g7("seq", new n8k(this.n5)));
            break;
         case 36:
            i4x.n5(this.l6, new g7("iterate", new p8u(this.n5)));
            break;
         case 37:
            i4x.n5(this.l6, new g7("audio", new y8g(this.n5)));
            break;
         case 38:
            i4x.n5(this.l6, new g7("command", new k6o(this.n5)));
            break;
         case 39:
            i4x.n5(this.l6, new p0i(this.n5));
            break;
         case 40:
            p3p var19 = new p3p(this.n5);
            i4x.l6(this.l6).addItem(var19);
            break;
         default:
            return false;
      }

      return true;
   }
}
