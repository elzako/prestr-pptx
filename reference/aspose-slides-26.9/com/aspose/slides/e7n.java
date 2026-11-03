package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class e7n {
   public static <T> void n5(T var0, String var1) {
      if (var0 == null) {
         throw new ArgumentException("Value cannot be null.", var1);
      }
   }

   public static void n5(String var0, String var1) {
      n5((Object)var0, var1);
      if (var0.length() == 0) {
         throw new ArgumentException("Value cannot be empty.", var1);
      }
   }
}
