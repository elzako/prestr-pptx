package com.aspose.slides.internal.p5k;

public class x8 {
   public static byte[] n5(byte[] var0, int var1) {
      if (n5(var0)) {
         return var0;
      }

      try {
         com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(var0);

         try {
            return n5(var2, var1);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } catch (RuntimeException var8) {
         return com.aspose.slides.internal.s5.s7.l6();
      }
   }

   private static byte[] n5(com.aspose.slides.internal.j7.n5 var0, int var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      switch (var0.u9()) {
         case 4:
         case 6:
         default:
            var0.l6(var2, var1);
            break;
         case 5:
         case 7:
            var0.n5(var2, var0.u9());
      }

      return com.aspose.slides.internal.n2d.t4.l6(var2);
   }

   private static boolean n5(byte[] var0) {
      int var1 = com.aspose.slides.internal.k4d.a6.l6(var0);
      switch (var1) {
         case 4:
         case 6:
         default:
            return false;
         case 5:
         case 7:
            return true;
      }
   }
}
