package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.y8;
import java.util.HashMap;
import java.util.Map;

public final class d2 {
   private static final Map<Integer, y8> n5 = new HashMap<>();

   public static y8 n5(Class<?> var0) {
      if (var0 == null) {
         throw new ArgumentNullException("aClass", "Class should be not null");
      }

      int var1 = var0.hashCode();
      synchronized (n5) {
         y8 var3 = n5.get(var1);
         if (var3 == null) {
            var3 = new c4(var0);
            n5.put(var1, var3);
         }

         return var3;
      }
   }
}
