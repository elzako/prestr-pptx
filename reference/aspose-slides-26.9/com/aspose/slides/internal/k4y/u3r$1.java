package com.aspose.slides.internal.k4y;

class u3r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u3r l6;

   u3r$1(u3r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u3r.v4().n5(this.n5.n3())) {
         case 0:
            u3r.n5(this.l6, new r0w(this.n5));
            break;
         case 1:
            u3r.n5(this.l6, new n3o(this.n5));
            break;
         case 2:
            u3r.n5(this.l6, new c8q(this.n5));
            break;
         case 3:
            i5k var2 = new i5k(this.n5);
            u3r.n5(this.l6).addItem(var2);
            break;
         case 4:
            u3r.n5(this.l6, new a4s(this.n5));
            break;
         case 5:
            u3r.n5(this.l6, new m9a(this.n5));
            break;
         case 6:
            u3r.l6(this.l6, new m9a(this.n5));
            break;
         case 7:
            u3r.n5(this.l6, new r3x(this.n5));
            break;
         case 8:
            y4x var3 = new y4x(this.n5);
            u3r.l6(this.l6).addItem(var3);
            break;
         case 9:
            u3r.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
