package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.NotImplementedException;

public final class e7 {
   public static final com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0(
      new byte[]{-32, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11}
   );
   public static final com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0(new byte[]{3, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});
   public static final com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0(new byte[]{9, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});
   public static final com.aspose.slides.ms.System.o0 u3 = new com.aspose.slides.ms.System.o0(new byte[]{5, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});
   public static final com.aspose.slides.ms.System.o0 a6 = new com.aspose.slides.ms.System.o0(new byte[]{4, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});

   public static boolean n5(com.aspose.slides.ms.System.o0 var0) {
      return com.aspose.slides.ms.System.o0.n5(var0, n5)
         || com.aspose.slides.ms.System.o0.n5(var0, l6)
         || com.aspose.slides.ms.System.o0.n5(var0, k5)
         || com.aspose.slides.ms.System.o0.n5(var0, u3)
         || com.aspose.slides.ms.System.o0.n5(var0, a6);
   }

   public static v2 l6(com.aspose.slides.ms.System.o0 var0) {
      if (com.aspose.slides.ms.System.o0.n5(var0, l6)) {
         return new l2();
      } else if (com.aspose.slides.ms.System.o0.n5(var0, k5)) {
         return new s5();
      } else if (com.aspose.slides.ms.System.o0.n5(var0, a6)) {
         return new d4();
      } else if (com.aspose.slides.ms.System.o0.n5(var0, u3)) {
         return new k9();
      } else if (com.aspose.slides.ms.System.o0.n5(var0, n5)) {
         return new e6();
      } else {
         throw new NotImplementedException("Unsupported moniker type.");
      }
   }

   public static v2 n5(com.aspose.slides.ms.System.o0 var0, com.aspose.slides.internal.z0k.n5 var1) {
      v2 var2 = l6(var0.k5());
      var2.n5(var1);
      return var2;
   }
}
