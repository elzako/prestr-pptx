package com.aspose.slides.internal.q6f;

import com.aspose.slides.internal.o9b.y4;
import java.util.HashMap;

public class u3 {
   private static HashMap<Integer, y4> n5 = new HashMap<>(3);

   public static y4 n5(int var0) {
      if (!n5.containsKey(var0)) {
         n5.put(var0, l6(var0));
      }

      return n5.get(var0);
   }

   private static y4 l6(int var0) {
      switch (var0) {
         case 0:
            return com.aspose.slides.internal.f3l.k5.k5("Times New Roman");
         case 1:
            return com.aspose.slides.internal.f3l.k5.k5("Microsoft Sans Serif");
         default:
            return com.aspose.slides.internal.f3l.k5.k5("Courier New");
      }
   }
}
