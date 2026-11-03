package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentNullException;

class l6 {
   public static void n5(com.aspose.slides.internal.z0k.l6 var0, String var1, com.aspose.slides.internal.l7h.j5 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("writer");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("encoding");
      }

      byte[] var3 = var2.u3(var1);
      if (var3.length > 0) {
         var0.n5(var3);
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, String var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("writer");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.internal.l7h.j5 var3 = com.aspose.slides.internal.n2d.x8.n5(var2);
      n5(var0, var1, var3);
   }

   public static void l6(com.aspose.slides.internal.z0k.l6 var0, String var1, com.aspose.slides.internal.l7h.j5 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("writer");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("encoding");
      }

      byte[] var3 = var2.u3(var1);
      var0.n5(var3.length & 4294967295L);
      if (var3.length > 0) {
         var0.n5(var3);
      }
   }

   public static void l6(com.aspose.slides.internal.z0k.l6 var0, String var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("writer");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.internal.l7h.j5 var3 = com.aspose.slides.internal.n2d.x8.n5(var2);
      l6(var0, var1, var3);
   }
}
