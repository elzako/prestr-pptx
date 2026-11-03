package com.aspose.slides.internal.v3;

import com.aspose.slides.Collections.Generic.List;

public class t2 {
   public static <T> T n5(List<T> var0) {
      return (T)(var0.size() == 0 ? null : var0.get_Item(var0.size() - 1));
   }

   public static <T> T l6(List<T> var0) {
      Object var1 = n5(var0);
      var0.removeAt(var0.size() - 1);
      return (T)var1;
   }

   public static <T> void n5(List<T> var0, List<T> var1) {
      var0.addRange(var1);
   }
}
