package com.aspose.slides.internal.k4y;

class s7k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s7k l6;

   s7k$1(s7k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s7k.a6().n5(this.n5.n3())) {
         case 0:
            s7k.n5(this.l6, new k5w(this.n5));
            break;
         case 1:
            s7k.n5(this.l6, new o9i(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
