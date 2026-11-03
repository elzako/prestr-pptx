package com.aspose.slides.internal.e0w;

class k5 {
   private static final int[] n5;

   public static int[] n5() {
      return n5;
   }

   static {
      int[] var0 = u3.n5();
      int[] var1 = a6.n5();
      int[] var2 = new int[var0.length + var1.length];
      com.aspose.slides.ms.System.u3.n5(var0).copyTo(com.aspose.slides.ms.System.u3.n5(var2), 0);
      com.aspose.slides.ms.System.u3.n5(var1).copyTo(com.aspose.slides.ms.System.u3.n5(var2), var0.length);
      n5 = var2;
   }
}
