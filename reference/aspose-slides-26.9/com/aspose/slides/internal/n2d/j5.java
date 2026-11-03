package com.aspose.slides.internal.n2d;

import com.aspose.slides.ms.System.d1;
import java.util.Comparator;

public class j5 implements Comparator<String> {
   public static final Comparator<String> n5 = new j5();

   private j5() {
   }

   public final int n5(String var1, String var2) {
      if (d1.a6(var1, var2)) {
         return 0;
      }

      if (var1 == null) {
         return -1;
      }

      if (var2 == null) {
         return 1;
      }

      int var3 = var1.length();
      int var4 = var2.length();
      int var5 = 0;

      for (int var6 = 0; var5 < var3 && var6 < var4; var6++) {
         char var7 = var1.charAt(var5);
         char var8 = var2.charAt(var6);
         if ((var7 | var8) <= 127) {
            if (var7 >= 'a' && var7 <= 'z') {
               var7 ^= ' ';
            }

            if (var8 >= 'a' && var8 <= 'z') {
               var8 ^= ' ';
            }

            if (var7 != var8) {
               return var7 - var8;
            }
         } else if (var7 != var8) {
            var7 = com.aspose.slides.internal.t6j.n5.n5((char)var7);
            var8 = com.aspose.slides.internal.t6j.n5.n5((char)var8);
            if (var7 != var8) {
               var7 = com.aspose.slides.internal.t6j.n5.l6((char)var7);
               var8 = com.aspose.slides.internal.t6j.n5.l6((char)var8);
               if (var7 != var8) {
                  return var7 - var8;
               }
            }
         }

         var5++;
      }

      return var3 - var4;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(String bridgeArg0, String bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
