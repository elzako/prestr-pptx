package com.aspose.slides.internal.k4y;

class v8$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v8 l6;

   v8$2(v8 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v8.l6().n5(this.n5.n3())) {
         case 1:
            z3s var2 = new z3s(this.n5);
            v8.n5(this.l6).addItem(new g7("definitions", var2));
            break;
         case 2:
            h8y var3 = new h8y(this.n5);
            v8.n5(this.l6).addItem(new g7("context", var3));
            break;
         case 3:
            o3x var4 = new o3x(this.n5);
            v8.n5(this.l6).addItem(new g7("trace", var4));
            break;
         case 4:
            z9x var5 = new z9x(this.n5);
            v8.n5(this.l6).addItem(new g7("traceGroup", var5));
            break;
         case 5:
            l5u var6 = new l5u(this.n5);
            v8.n5(this.l6).addItem(new g7("traceView", var6));
            break;
         case 6:
            i3p var7 = new i3p(this.n5);
            v8.n5(this.l6).addItem(new g7("annotation", var7));
            break;
         case 7:
            s4z var8 = new s4z(this.n5);
            v8.n5(this.l6).addItem(new g7("annotationXML", var8));
            break;
         default:
            return false;
      }

      return true;
   }
}
