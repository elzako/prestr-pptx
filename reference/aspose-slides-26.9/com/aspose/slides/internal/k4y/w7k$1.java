package com.aspose.slides.internal.k4y;

class w7k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w7k l6;

   w7k$1(w7k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w7k.k5().n5(this.n5.n3())) {
         case 0:
            w7k.n5(this.l6, new n0g(this.n5));
            break;
         case 1:
            s0m var2 = new s0m(this.n5);
            w7k.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
