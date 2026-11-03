package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

class n5 {
   public static int n5(com.aspose.slides.internal.z0k.n5 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("reader");
      }

      int var1 = var0.r4();
      var0.x8().seek(-2L, 1);
      return var1;
   }

   public static byte l6(com.aspose.slides.internal.z0k.n5 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("reader");
      }

      byte var1 = var0.z1();
      var0.x8().seek(-1L, 1);
      return var1;
   }

   public static String n5(com.aspose.slides.internal.z0k.n5 var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("reader");
      } else {
         return k5.n5(var0.c8(var1), var2);
      }
   }

   public static String n5(com.aspose.slides.internal.z0k.n5 var0, int var1, com.aspose.slides.internal.l7h.j5 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("reader");
      } else if (var2 == null) {
         throw new ArgumentNullException("encoding");
      } else {
         return k5.n5(var0.c8(var1), var2);
      }
   }

   public static byte[] n5(com.aspose.slides.internal.z0k.n5 var0, byte var1) {
      List var2 = new List();

      for (byte var3 = var0.z1(); com.aspose.slides.internal.v6g.k5.u3(var3, 6) != com.aspose.slides.internal.v6g.k5.u3(var1, 6); var3 = var0.z1()) {
         var2.addItem(var3);
      }

      return com.aspose.slides.internal.n8e.v4.l6(var2);
   }
}
