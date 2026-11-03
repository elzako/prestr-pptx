package com.aspose.slides;

class z9j {
   int n5 = 0;
   com.aspose.slides.internal.z0k.a0 l6 = com.aspose.slides.ms.System.t4.n5();
   String k5 = "-- line {0} col {1}: {2}";

   public void n5(int var1, int var2, int var3) {
      String var4;
      switch (var3) {
         case 0:
            var4 = "EOF expected";
            break;
         case 1:
            var4 = "value expected";
            break;
         case 2:
            var4 = "\"rotate\" expected";
            break;
         case 3:
            var4 = "\"scale\" expected";
            break;
         case 4:
            var4 = "\"skewX\" expected";
            break;
         case 5:
            var4 = "\"skewY\" expected";
            break;
         case 6:
            var4 = "\"translate\" expected";
            break;
         case 7:
            var4 = "\"(\" expected";
            break;
         case 8:
            var4 = "\")\" expected";
            break;
         case 9:
            var4 = "\",\" expected";
            break;
         case 10:
            var4 = "??? expected";
            break;
         case 11:
            var4 = "invalid Transform";
            break;
         default:
            var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"error ", com.aspose.slides.ms.System.a3.l6(var3)});
      }

      this.l6.l6(this.k5, com.aspose.slides.internal.v6g.k5.l6(var1), com.aspose.slides.internal.v6g.k5.l6(var2), var4);
      this.n5++;
   }
}
