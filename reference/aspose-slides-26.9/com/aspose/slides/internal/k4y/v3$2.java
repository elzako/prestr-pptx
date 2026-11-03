package com.aspose.slides.internal.k4y;

class v3$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v3 l6;

   v3$2(v3 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v3.u3().n5(this.n5.n3())) {
         case 3:
            k6j var2 = new k6j(this.n5);
            v3.n5(this.l6).addItem(var2);
            break;
         case 4:
            a5c var3 = new a5c(this.n5);
            v3.l6(this.l6).addItem(var3);
            break;
         case 5:
            v3.n5(this.l6, new t5j(this.n5));
            break;
         case 6:
            v3.n5(this.l6, new c8j(this.n5));
            break;
         case 7:
            v3.l6(this.l6, new c8j(this.n5));
            break;
         case 8:
            v3.k5(this.l6, new c8j(this.n5));
            break;
         case 9:
            v3.n5(this.l6, new y5g(this.n5));
            break;
         case 10:
            v3.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
