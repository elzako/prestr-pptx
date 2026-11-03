package com.aspose.slides.internal.k4y;

class w4c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w4c l6;

   w4c$1(w4c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w4c.s7().n5(this.n5.n3())) {
         case 0:
            w4c.n5(this.l6, new v2o(this.n5));
            break;
         case 1:
            d9r var2 = new d9r(this.n5);
            w4c.n5(this.l6).addItem(new g7("areaChart", var2));
            break;
         case 2:
            l1f var3 = new l1f(this.n5);
            w4c.n5(this.l6).addItem(new g7("area3DChart", var3));
            break;
         case 3:
            x1j var4 = new x1j(this.n5);
            w4c.n5(this.l6).addItem(new g7("lineChart", var4));
            break;
         case 4:
            d1z var5 = new d1z(this.n5);
            w4c.n5(this.l6).addItem(new g7("line3DChart", var5));
            break;
         case 5:
            l9o var6 = new l9o(this.n5);
            w4c.n5(this.l6).addItem(new g7("stockChart", var6));
            break;
         case 6:
            p5g var7 = new p5g(this.n5);
            w4c.n5(this.l6).addItem(new g7("radarChart", var7));
            break;
         case 7:
            t2h var8 = new t2h(this.n5);
            w4c.n5(this.l6).addItem(new g7("scatterChart", var8));
            break;
         case 8:
            q9r var9 = new q9r(this.n5);
            w4c.n5(this.l6).addItem(new g7("pieChart", var9));
            break;
         case 9:
            q6f var10 = new q6f(this.n5);
            w4c.n5(this.l6).addItem(new g7("pie3DChart", var10));
            break;
         case 10:
            i2i var11 = new i2i(this.n5);
            w4c.n5(this.l6).addItem(new g7("doughnutChart", var11));
            break;
         case 11:
            c9v var12 = new c9v(this.n5);
            w4c.n5(this.l6).addItem(new g7("barChart", var12));
            break;
         case 12:
            u3r var13 = new u3r(this.n5);
            w4c.n5(this.l6).addItem(new g7("bar3DChart", var13));
            break;
         case 13:
            v9l var14 = new v9l(this.n5);
            w4c.n5(this.l6).addItem(new g7("ofPieChart", var14));
            break;
         case 14:
            o8x var15 = new o8x(this.n5);
            w4c.n5(this.l6).addItem(new g7("surfaceChart", var15));
            break;
         case 15:
            o3n var16 = new o3n(this.n5);
            w4c.n5(this.l6).addItem(new g7("surface3DChart", var16));
            break;
         case 16:
            w1g var17 = new w1g(this.n5);
            w4c.n5(this.l6).addItem(new g7("bubbleChart", var17));
            break;
         case 17:
            f5n var18 = new f5n(this.n5);
            w4c.l6(this.l6).addItem(new g7("valAx", var18));
            break;
         case 18:
            a0q var19 = new a0q(this.n5);
            w4c.l6(this.l6).addItem(new g7("catAx", var19));
            break;
         case 19:
            c5e var20 = new c5e(this.n5);
            w4c.l6(this.l6).addItem(new g7("dateAx", var20));
            break;
         case 20:
            q2c var21 = new q2c(this.n5);
            w4c.l6(this.l6).addItem(new g7("serAx", var21));
            break;
         case 21:
            w4c.n5(this.l6, new e5q(this.n5));
            break;
         case 22:
            w4c.n5(this.l6, new b9y(this.n5));
            break;
         case 23:
            w4c.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
