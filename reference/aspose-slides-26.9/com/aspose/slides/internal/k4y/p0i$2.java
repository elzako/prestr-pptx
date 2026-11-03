package com.aspose.slides.internal.k4y;

class p0i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p0i l6;

   p0i$2(p0i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p0i.k5().n5(this.n5.n3())) {
         case 5:
            p0i.n5(this.l6, new b4i(this.n5));
            break;
         case 6:
            e6x var2 = new e6x(this.n5);
            p0i.n5(this.l6).addItem(new g7("rect", var2));
            break;
         case 7:
            j6v var3 = new j6v(this.n5);
            p0i.n5(this.l6).addItem(new g7("line", var3));
            break;
         case 8:
            u5l var4 = new u5l(this.n5);
            p0i.n5(this.l6).addItem(new g7("polyline", var4));
            break;
         case 9:
            s4p var5 = new s4p(this.n5);
            p0i.n5(this.l6).addItem(new g7("polygon", var5));
            break;
         case 10:
            z7d var6 = new z7d(this.n5);
            p0i.n5(this.l6).addItem(new g7("regular-polygon", var6));
            break;
         case 11:
            c5w var7 = new c5w(this.n5);
            p0i.n5(this.l6).addItem(new g7("path", var7));
            break;
         case 12:
            f1h var8 = new f1h(this.n5);
            p0i.n5(this.l6).addItem(new g7("circle", var8));
            break;
         case 13:
            d2z var9 = new d2z(this.n5);
            p0i.n5(this.l6).addItem(new g7("ellipse", var9));
            break;
         case 14:
            c4f var10 = new c4f(this.n5);
            p0i.n5(this.l6).addItem(new g7("g", var10));
            break;
         case 15:
            h4i var11 = new h4i(this.n5);
            p0i.n5(this.l6).addItem(new g7("page-thumbnail", var11));
            break;
         case 16:
            b4f var12 = new b4f(this.n5);
            p0i.n5(this.l6).addItem(new g7("frame", var12));
            break;
         case 17:
            v6z var13 = new v6z(this.n5);
            p0i.n5(this.l6).addItem(new g7("measure", var13));
            break;
         case 18:
            v8v var14 = new v8v(this.n5);
            p0i.n5(this.l6).addItem(new g7("caption", var14));
            break;
         case 19:
            l3d var15 = new l3d(this.n5);
            p0i.n5(this.l6).addItem(new g7("connector", var15));
            break;
         case 20:
            w4a var16 = new w4a(this.n5);
            p0i.n5(this.l6).addItem(new g7("control", var16));
            break;
         case 21:
            d8f var17 = new d8f(this.n5);
            p0i.n5(this.l6).addItem(new g7("scene", var17));
            break;
         case 22:
            g3c var18 = new g3c(this.n5);
            p0i.n5(this.l6).addItem(new g7("custom-shape", var18));
            break;
         default:
            return false;
      }

      return true;
   }
}
