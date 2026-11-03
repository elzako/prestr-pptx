package com.aspose.slides.internal.k4y;

class f5w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f5w l6;

   f5w$2(f5w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f5w.k5().n5(this.n5.n3())) {
         case 2:
            e4w var2 = new e4w(this.n5);
            f5w.n5(this.l6).addItem(new g7("scrgbClr", var2));
            break;
         case 3:
            e8p var3 = new e8p(this.n5);
            f5w.n5(this.l6).addItem(new g7("srgbClr", var3));
            break;
         case 4:
            d0p var4 = new d0p(this.n5);
            f5w.n5(this.l6).addItem(new g7("hslClr", var4));
            break;
         case 5:
            s0i var5 = new s0i(this.n5);
            f5w.n5(this.l6).addItem(new g7("sysClr", var5));
            break;
         case 6:
            q4d var6 = new q4d(this.n5);
            f5w.n5(this.l6).addItem(new g7("schemeClr", var6));
            break;
         case 7:
            x4a var7 = new x4a(this.n5);
            f5w.n5(this.l6).addItem(new g7("prstClr", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
