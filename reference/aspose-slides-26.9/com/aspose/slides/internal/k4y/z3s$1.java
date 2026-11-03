package com.aspose.slides.internal.k4y;

class z3s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z3s l6;

   z3s$1(z3s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z3s.l6().n5(this.n5.n3())) {
         case 0:
            n8o var2 = new n8o(this.n5);
            z3s.n5(this.l6).addItem(new g7("brush", var2));
            break;
         case 1:
            u4z var3 = new u4z(this.n5);
            z3s.n5(this.l6).addItem(new g7("canvas", var3));
            break;
         case 2:
            n1d var4 = new n1d(this.n5);
            z3s.n5(this.l6).addItem(new g7("canvasTransform", var4));
            break;
         case 3:
            h8y var5 = new h8y(this.n5);
            z3s.n5(this.l6).addItem(new g7("context", var5));
            break;
         case 4:
            c6l var6 = new c6l(this.n5);
            z3s.n5(this.l6).addItem(new g7("inkSource", var6));
            break;
         case 5:
            p1n var7 = new p1n(this.n5);
            z3s.n5(this.l6).addItem(new g7("mapping", var7));
            break;
         case 6:
            o6m var8 = new o6m(this.n5);
            z3s.n5(this.l6).addItem(new g7("timestamp", var8));
            break;
         case 7:
            o3x var9 = new o3x(this.n5);
            z3s.n5(this.l6).addItem(new g7("trace", var9));
            break;
         case 8:
            o0s var10 = new o0s(this.n5);
            z3s.n5(this.l6).addItem(new g7("traceFormat", var10));
            break;
         case 9:
            z9x var11 = new z9x(this.n5);
            z3s.n5(this.l6).addItem(new g7("traceGroup", var11));
            break;
         case 10:
            l5u var12 = new l5u(this.n5);
            z3s.n5(this.l6).addItem(new g7("traceView", var12));
            break;
         default:
            return false;
      }

      return true;
   }
}
