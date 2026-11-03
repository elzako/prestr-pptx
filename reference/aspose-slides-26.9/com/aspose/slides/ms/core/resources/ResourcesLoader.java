package com.aspose.slides.ms.core.resources;

import com.aspose.slides.internal.z0k.t4;
import java.io.InputStream;

public final class ResourcesLoader {
   public static t4 loadResource(String packageName, String fileName) {
      String var2 = n5(packageName, fileName);
      InputStream var3 = ResourcesLoader.class.getResourceAsStream(var2);
      if (var3 == null) {
         throw new IllegalStateException(String.format("Resource file %s not found in assembly", var2));
      } else {
         return t4.fromJava(var3);
      }
   }

   private static String n5(String var0, String var1) {
      if (var0 == null) {
         throw new IllegalStateException("packageName is null");
      }

      if (var1 == null) {
         throw new IllegalStateException("fileName is null");
      }

      if (var1.length() == 0) {
         throw new IllegalStateException("fileName is empty");
      }

      if (var0.length() == 0) {
         return var1;
      }

      char var2 = '/';
      var0 = var0.replace('.', var2);
      if (var0.charAt(var0.length() - 1) != var2) {
         var0 = var0 + var2;
      }

      return var0 + var1;
   }
}
