package com.aspose.slides.internal.k4y;

class z9x$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z9x l6;

   z9x$2(z9x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z9x.t2().n5(this.n5.n3())) {
         case 3:
            s4z var2 = new s4z(this.n5);
            z9x.l6(this.l6).addItem(var2);
            break;
         case 4:
            i3p var3 = new i3p(this.n5);
            z9x.k5(this.l6).addItem(var3);
            break;
         case 5:
            l5u var4 = new l5u(this.n5);
            z9x.u3(this.l6).addItem(var4);
            break;
         case 6:
            z9x var5 = new z9x(this.n5);
            z9x.a6(this.l6).addItem(var5);
            break;
         case 7:
            o3x var6 = new o3x(this.n5);
            z9x.u9(this.l6).addItem(var6);
            break;
         default:
            return false;
      }

      return true;
   }
}
