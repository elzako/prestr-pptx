package com.aspose.slides.internal.t5n;

import com.aspose.slides.ms.System.d1;
import java.util.Map;

public class n5 {
   private static final Map<Integer, String> n5 = new k5();

   public static String n5(int var0) {
      String var1 = n5.get(var0);
      return !d1.n5(var1) ? var1 : d1.n5("Unknown error ({0:X})", new Object[]{var0});
   }
}
