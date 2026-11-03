package com.aspose.slides.internal.k4y;

class k4d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k4d l6;

   k4d$2(k4d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k4d.u3().n5(this.n5.n3())) {
         case 2:
            e4w var2 = new e4w(this.n5);
            k4d.n5(this.l6).addItem(new g7("scrgbClr", var2));
            break;
         case 3:
            e8p var3 = new e8p(this.n5);
            k4d.n5(this.l6).addItem(new g7("srgbClr", var3));
            break;
         case 4:
            d0p var4 = new d0p(this.n5);
            k4d.n5(this.l6).addItem(new g7("hslClr", var4));
            break;
         case 5:
            s0i var5 = new s0i(this.n5);
            k4d.n5(this.l6).addItem(new g7("sysClr", var5));
            break;
         case 6:
            q4d var6 = new q4d(this.n5);
            k4d.n5(this.l6).addItem(new g7("schemeClr", var6));
            break;
         case 7:
            x4a var7 = new x4a(this.n5);
            k4d.n5(this.l6).addItem(new g7("prstClr", var7));
            break;
         case 8:
            t6j var8 = new t6j(this.n5);
            k4d.l6(this.l6).addItem(var8);
            break;
         case 9:
            k4d.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
