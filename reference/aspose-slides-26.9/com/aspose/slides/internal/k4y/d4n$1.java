package com.aspose.slides.internal.k4y;

class d4n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d4n l6;

   d4n$1(d4n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d4n.l6().n5(this.n5.n3())) {
         case 0:
            e4w var2 = new e4w(this.n5);
            d4n.n5(this.l6).addItem(new g7("scrgbClr", var2));
            break;
         case 1:
            e8p var3 = new e8p(this.n5);
            d4n.n5(this.l6).addItem(new g7("srgbClr", var3));
            break;
         case 2:
            d0p var4 = new d0p(this.n5);
            d4n.n5(this.l6).addItem(new g7("hslClr", var4));
            break;
         case 3:
            s0i var5 = new s0i(this.n5);
            d4n.n5(this.l6).addItem(new g7("sysClr", var5));
            break;
         case 4:
            q4d var6 = new q4d(this.n5);
            d4n.n5(this.l6).addItem(new g7("schemeClr", var6));
            break;
         case 5:
            x4a var7 = new x4a(this.n5);
            d4n.n5(this.l6).addItem(new g7("prstClr", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
