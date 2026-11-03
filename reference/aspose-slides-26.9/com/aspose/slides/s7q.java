package com.aspose.slides;

class s7q {
   static String n5(r8e var0, r8e[] var1, y2[] var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(32);
      var3.n5(r8e.n5.n5(var0.u9()));
      int var4 = r8e.l6[var0.u9()];
      var3.n5(" {0}",new Object[]{ u7a.n5(var0.k5(), var1, var2)});
      if (var4 > 1) {
         var3.n5(" {0}",new Object[]{ u7a.n5(var0.u3(), var1, var2)});
         if (var4 > 2) {
            var3.n5(" {0}",new Object[]{ u7a.n5(var0.a6(), var1, var2)});
         }
      }

      return var3.toString();
   }
}
