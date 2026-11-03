package com.aspose.slides.internal.k4y;

class b4f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b4f l6;

   b4f$2(b4f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b4f.z1().n5(this.n5.n3())) {
         case 27:
            o2e var2 = new o2e(this.n5);
            b4f.n5(this.l6).addItem(new g7("text-box", var2));
            break;
         case 28:
            s3o var3 = new s3o(this.n5);
            b4f.n5(this.l6).addItem(new g7("image", var3));
            break;
         case 29:
            n6k var4 = new n6k(this.n5);
            b4f.n5(this.l6).addItem(new g7("object", var4));
            break;
         case 30:
            j1a var5 = new j1a(this.n5);
            b4f.n5(this.l6).addItem(new g7("object-ole", var5));
            break;
         case 31:
            w3i var6 = new w3i(this.n5);
            b4f.n5(this.l6).addItem(new g7("applet", var6));
            break;
         case 32:
            f2f var7 = new f2f(this.n5);
            b4f.n5(this.l6).addItem(new g7("floating-frame", var7));
            break;
         case 33:
            h9p var8 = new h9p(this.n5);
            b4f.n5(this.l6).addItem(new g7("plugin", var8));
            break;
         case 34:
            y7e var9 = new y7e(this.n5);
            b4f.n5(this.l6).addItem(new g7("table", var9));
            break;
         case 35:
            b4f.n5(this.l6, new c6x(this.n5));
            break;
         case 36:
            l4y var10 = new l4y(this.n5);
            b4f.l6(this.l6).addItem(var10);
            break;
         case 37:
            b4f.n5(this.l6, new o7s(this.n5));
            break;
         case 38:
            b4f.k7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  b4f.k7(this.l6, com.aspose.slides.ms.System.d1.n5(b4f.k5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 39:
            b4f.m3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  b4f.m3(this.l6, com.aspose.slides.ms.System.d1.n5(b4f.u3(this.l6), this.n5.c4()));
               }
            }
            break;
         case 40:
            b4f.n5(this.l6, new g7("contour-polygon", new e5g(this.n5)));
            break;
         case 41:
            b4f.n5(this.l6, new g7("contour-path", new m3l(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
