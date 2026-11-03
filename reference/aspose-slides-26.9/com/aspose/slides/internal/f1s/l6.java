package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private final String n5;
   private final String l6;
   private final int k5;
   private static final l6 u3 = new l6("DeviceGray", "G", 1);
   private static final l6 a6 = new l6("DeviceRGB", "RGB", 3);
   private static final l6 u9 = new l6("DeviceCMYK", "CMYK", 4);
   private static final l6 h0 = new l6("Indexed", "I", 1);
   private static final l6 c8 = new l6("Pattern", d1.n5, 0);

   private l6(String var1, String var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public static l6 n5(int var0) {
      switch (var0) {
         case 0:
            return l6();
         case 1:
            return k5();
         case 2:
            return n5();
         default:
            throw new InvalidOperationException("Unknown bitmap color space.");
      }
   }

   public static l6 n5() {
      return u3;
   }

   public static l6 l6() {
      return a6;
   }

   public static l6 k5() {
      return h0;
   }

   public static l6 u3() {
      return c8;
   }

   public final String a6() {
      return this.n5;
   }

   public final int u9() {
      return this.k5;
   }
}
