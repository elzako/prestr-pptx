package com.aspose.slides.internal.k4y;

class q9r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q9r l6;

   q9r$1(q9r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q9r.o0().n5(this.n5.n3())) {
         case 0:
            q9r.n5(this.l6, new c8q(this.n5));
            break;
         case 1:
            t6w var2 = new t6w(this.n5);
            q9r.n5(this.l6).addItem(var2);
            break;
         case 2:
            q9r.n5(this.l6, new a4s(this.n5));
            break;
         case 3:
            q9r.n5(this.l6, new n4m(this.n5));
            break;
         case 4:
            q9r.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
