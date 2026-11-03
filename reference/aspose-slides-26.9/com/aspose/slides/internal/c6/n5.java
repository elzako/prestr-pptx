package com.aspose.slides.internal.c6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class n5 {
   private static final Pattern n5 = Pattern.compile("```json\\s*([\\s\\S]*?)```");

   public static <T> T n5(Class<T> var0, String var1) {
      Matcher var2 = n5.matcher(var1);
      if (var2.find()) {
         String var3 = var2.group(1);
         if (var3 != null) {
            var1 = var3.trim();
         }
      }

      try {
         return (T)(var0 == z8.class ? z8.n5(com.aspose.slides.internal.y7.u3.n5().n5(var1)) : z3.n5(com.aspose.slides.internal.y7.u3.n5().n5(var1)));
      } catch (com.aspose.slides.internal.y7.a6 var7) {
         try {
            return (T)var0.newInstance();
         } catch (InstantiationException var5) {
            throw new RuntimeException("Failed to create instance of " + var0.getSimpleName(), var5);
         } catch (IllegalAccessException var6) {
            throw new RuntimeException("Failed to create instance of " + var0.getSimpleName(), var6);
         }
      }
   }
}
