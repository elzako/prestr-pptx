package com.aspose.slides.internal.u1;

import com.aspose.slides.exceptions.IOException;

public class h0 {
   public static u3 n5(com.aspose.slides.internal.v2.k5 var0) {
      u3 var1 = null;
      com.aspose.slides.internal.v2.c8 var2 = (com.aspose.slides.internal.v2.c8)var0.u9(com.aspose.slides.internal.v2.c8.g2x);
      if (var2 != null && !com.aspose.slides.internal.v2.c8.c7.equals(var2)) {
         throw new IOException("Unknown font type is encountered: " + var2);
      }

      com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var0.u9(com.aspose.slides.internal.v2.c8.u7f);
      if (var3 == null) {
         throw new IOException("A SubType entry is not found in font data.");
      }

      if (var3.equals(com.aspose.slides.internal.v2.c8.o5k)) {
         var1 = new y4(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.v5)) {
         var1 = new c8(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.o6t)) {
         var1 = new s7(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.n1g)) {
         var1 = new e2(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.s2b)) {
         var1 = new x8(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.s0)) {
         var1 = new l6(var0);
      } else if (var3.equals(com.aspose.slides.internal.v2.c8.v8)) {
         var1 = new k5(var0);
      } else {
         var1 = new y4(var0);
      }

      return var1;
   }

   public static u3 n5() {
      return new y4("Helvetica");
   }
}
