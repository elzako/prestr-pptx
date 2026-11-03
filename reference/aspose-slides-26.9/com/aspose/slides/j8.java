package com.aspose.slides;

class j8 {
   public static com.aspose.slides.internal.w0.t4 n5(int var0) {
      switch (var0) {
         case 0:
            return new com.aspose.slides.internal.w0.t4(-1, 0);
         case 1:
            return new com.aspose.slides.internal.w0.t4(0, 1);
         case 2:
            return new com.aspose.slides.internal.w0.t4(0, -1);
         case 3:
            return new com.aspose.slides.internal.w0.t4(1, 0);
         default:
            return new com.aspose.slides.internal.w0.t4(0, 0);
      }
   }

   public static com.aspose.slides.internal.w0.t4 l6(int var0) {
      switch (var0) {
         case 0:
            return new com.aspose.slides.internal.w0.t4(-1, -1);
         case 1:
            return new com.aspose.slides.internal.w0.t4(-1, 1);
         case 2:
            return new com.aspose.slides.internal.w0.t4(1, -1);
         case 3:
            return new com.aspose.slides.internal.w0.t4(1, 1);
         case 4:
            return new com.aspose.slides.internal.w0.t4(-1, 0);
         case 5:
            return new com.aspose.slides.internal.w0.t4(0, 1);
         case 6:
            return new com.aspose.slides.internal.w0.t4(0, -1);
         case 7:
            return new com.aspose.slides.internal.w0.t4(1, 0);
         default:
            return new com.aspose.slides.internal.w0.t4(0, 0);
      }
   }

   public static d2k n5(IShape var0) {
      IShapeFrame var1 = var0.getFrame();
      return new d2k(var1.getX(), var1.getY());
   }

   public static d2k n5(com.aspose.slides.internal.o9b.w1 var0) {
      return new d2k(var0.l6(), var0.k5());
   }

   public static d2k n5(com.aspose.slides.internal.o9b.f2 var0) {
      return new d2k(var0.l6(), var0.k5());
   }
}
