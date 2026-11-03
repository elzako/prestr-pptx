package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.NullReferenceException;

public final class j8 {
   public static boolean n5(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var1 != null && var0.equals(var1);
   }

   public static boolean l6(Object var0, Object var1) {
      return var0 == var1;
   }

   public static y8 n5(Object var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var0 instanceof u3) {
         var0 = u3.n5((u3)var0);
      }

      return com.aspose.slides.internal.v6g.k5.n5(var0.getClass());
   }

   public static y8 n5(int var0) {
      return com.aspose.slides.internal.v6g.k5.n5(int.class);
   }
}
