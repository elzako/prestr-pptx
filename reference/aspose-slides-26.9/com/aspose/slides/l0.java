package com.aspose.slides;

abstract class l0 {
   protected final com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();

   protected l0(ColorEffect var1, IBaseSlide var2) {
      ((ColorFormat)var1.getTo()).l6(var2).n5().n5(this.n5);
   }

   protected static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, com.aspose.slides.internal.o9b.c8 var1, float var2) {
      return com.aspose.slides.internal.o9b.c8.n5(
         n5(var0.s7(), var1.s7(), var2) & 255, n5(var0.x8(), var1.x8(), var2) & 255, n5(var0.n3(), var1.n3(), var2) & 255, n5(var0.y4(), var1.y4(), var2) & 255
      );
   }

   private static byte n5(byte var0, byte var1, float var2) {
      return com.aspose.slides.internal.v6g.k5.n5((Object)((var0 & 0xFF) + ((float)(var1 & 0xFF) - (var0 & 0xFF)) * var2), 13);
   }
}
