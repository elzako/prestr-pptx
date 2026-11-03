package com.aspose.slides.internal.k4y;

class n8o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n8o l6;

   n8o$2(n8o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n8o.u9().n5(this.n5.n3())) {
         case 2:
            z0x var2 = new z0x(this.n5);
            n8o.n5(this.l6).addItem(var2);
            break;
         case 3:
            i3p var3 = new i3p(this.n5);
            n8o.l6(this.l6).addItem(var3);
            break;
         case 4:
            s4z var4 = new s4z(this.n5);
            n8o.k5(this.l6).addItem(var4);
            break;
         default:
            return false;
      }

      return true;
   }
}
