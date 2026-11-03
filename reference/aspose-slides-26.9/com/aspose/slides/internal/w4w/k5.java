package com.aspose.slides.internal.w4w;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@Deprecated
public class k5 {
   public static <K, V> boolean n5(Map<K, V> var0, K var1, V[] var2) {
      boolean var3 = var0.containsKey(var1);
      if (var3) {
         var2[0] = var0.get(var1);
      } else {
         try {
            var2[0] = (V)n5(var2.getClass().getComponentType());
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }
      }

      return var3;
   }

   private static <V> V n5(Class<V> var0) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
      if (Number.class.isAssignableFrom(var0)) {
         return (V)var0.getConstructor(int.class).newInstance(0);
      } else {
         return (V)(com.aspose.slides.internal.v6g.h0.class.isAssignableFrom(var0) ? var0.newInstance() : null);
      }
   }
}
