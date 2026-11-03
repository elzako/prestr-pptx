package com.aspose.slides.internal.k4y;

class a4w$1 extends b3$n5 {
   // $VF: synthetic field
   final a4w n5;

   a4w$1(a4w var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (a4w.t2().n5(var1)) {
         case 0:
            a4w.n5(this.n5, var2);
            return true;
         case 1:
            a4w.l6(this.n5, var2);
            return true;
         case 2:
            a4w.k5(this.n5, var2);
            return true;
         case 3:
            a4w.n5(this.n5, v6.n5(var2));
            return true;
         case 4:
            a4w.l6(this.n5, x0.n5(var2));
            return true;
         case 5:
            a4w.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         default:
            return false;
      }
   }
}
