package com.aspose.slides.internal.t7;

import com.aspose.slides.internal.l7h.j5;

public class n5 {
   public static void n5(short[] var0, com.aspose.slides.internal.z0k.l6 var1) {
      if (var0 != null) {
         for (short var5 : var0) {
            var1.n5(var5);
         }
      }
   }

   public static void n5(int[] var0, com.aspose.slides.internal.z0k.l6 var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            var1.n5(var0[var2] & 65535);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, long[] var1) {
      if (var1 != null) {
         for (long var5 : var1) {
            var0.n5(var5);
         }
      }
   }

   public static void n5(float[] var0, com.aspose.slides.internal.z0k.l6 var1) {
      for (float var5 : var0) {
         var1.n5(var5);
      }
   }

   public static void n5(String var0, com.aspose.slides.internal.z0k.l6 var1) {
      byte[] var2 = j5.z1().u3(var0);
      var1.n5(var2);
   }
}
