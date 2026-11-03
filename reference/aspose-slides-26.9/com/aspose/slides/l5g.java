package com.aspose.slides;

class l5g {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, byte var1) {
      o3 var2 = o3.n5(var0);
      return n5(var2, var1);
   }

   public static com.aspose.slides.internal.o9b.l6 n5(o3 var0, byte var1) {
      o3 var2 = o3.n5(var0.a6().u3(), 196865);

      for (int var3 = 0; var3 < var2.n5(); var3++) {
         for (int var4 = 0; var4 < var2.l6(); var4++) {
            var2.n5(var3, var4, (byte)((var0.n5(var3, var4) & 255) > (var1 & 255) ? -1 : 0));
         }
      }

      return var2.u9();
   }
}
