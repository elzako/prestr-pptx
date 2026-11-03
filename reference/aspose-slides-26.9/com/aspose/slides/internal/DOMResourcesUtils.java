package com.aspose.slides.internal;

import com.aspose.slides.internal.n8e.v4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import java.io.IOException;
import java.io.InputStream;

public class DOMResourcesUtils {
   public static t4 getResourceStream(String resourceName) {
      return getResourceStream("resources", resourceName);
   }

   public static t4 getResourceStream(String resourcePath, String resourceName) {
      InputStream var2 = null;

      try {
         var2 = DOMResourcesUtils.class.getResourceAsStream(resourcePath.replace('.', '/') + '/' + resourceName);
         if (var2 == null) {
            var2 = DOMResourcesUtils.class.getResourceAsStream("/com/aspose/slides/" + resourcePath.replace('.', '/') + '/' + resourceName);
            if (var2 == null) {
               String var3 = "./src/main/resources/com/aspose/slides/";
               Object var4 = null;
               if (var2 == null) {
                  if (var4 == null) {
                     throw new IllegalStateException(d1.n5("Resource file {0} not found in assembly.", new Object[]{resourceName}));
                  }

                  return (t4)var4;
               }
            }
         }

         return t4.fromJava(var2);
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var13) {
            v4.n5(var13);
         }
      }
   }

   public static byte[] getResourceBytes(String resourcePath, String resourceName) {
      t4 var2 = getResourceStream(resourcePath, resourceName);
      return n5(var2);
   }

   public static o0 getResourceGuid(String resourcePath, String resourceName) {
      return new o0(getResourceBytes(resourcePath, resourceName));
   }

   private static byte[] n5(t4 var0) {
      byte[] var1 = new byte[16384];
      e2 var2 = new e2();

      try {
         int var3;
         while ((var3 = var0.read(var1, 0, var1.length)) > 0) {
            var2.write(var1, 0, var3);
         }

         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
