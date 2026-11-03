package com.aspose.slides;

class m2v {
   m2c n5;
   Object l6;

   static byte[] n5(com.aspose.slides.internal.e5a.d2 var0, com.aspose.slides.internal.e5a.y2 var1) {
      byte[] var2 = new byte[(int)var1.t2()];
      com.aspose.slides.internal.e5a.t2 var3 = var1.c4();

      try {
         int var4 = 0;

         while (var4 < var2.length) {
            var4 += var3.read(var2, var4, var2.length - var4);
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2;
   }
}
