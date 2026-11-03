package com.aspose.slides;

class l1 {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
            return k5(var0, var1);
         case 3:
         case 4:
            return l6(var0, var1);
         case 5:
            return n5(var0, 0.25F);
         case 6:
            return n5(var0, 0.5F);
         case 7:
            return n5(var0, 0.75F);
         default:
            return var0;
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, float var1) {
      return l5g.n5(var0, com.aspose.slides.internal.v6g.k5.n5((Object)(var1 * 255.0F), 13));
   }

   private static com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      return c7t.n5(var0);
   }

   private static com.aspose.slides.internal.o9b.l6 k5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      return q2c.n5(var0);
   }
}
