package com.aspose.slides.internal.k4y;

class t6w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t6w l6;

   t6w$1(t6w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t6w.p8().n5(this.n5.n3())) {
         case 0:
            t6w.n5(this.l6, new b8n(this.n5));
            break;
         case 1:
            t6w.l6(this.l6, new b8n(this.n5));
            break;
         case 2:
            t6w.n5(this.l6, new w1c(this.n5));
            break;
         case 3:
            t6w.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            t6w.k5(this.l6, new b8n(this.n5));
            break;
         case 5:
            v0v var2 = new v0v(this.n5);
            t6w.n5(this.l6).addItem(var2);
            break;
         case 6:
            t6w.n5(this.l6, new a4s(this.n5));
            break;
         case 7:
            t6w.n5(this.l6, new l0u(this.n5));
            break;
         case 8:
            t6w.n5(this.l6, new l6s(this.n5));
            break;
         case 9:
            t6w.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
