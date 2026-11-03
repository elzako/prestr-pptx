package com.aspose.slides.internal.p8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v3.x8;
import com.aspose.slides.ms.System.d1;

public class u3 {
   public static int[] n5(String var0, int var1, boolean var2) {
      int var3;
      if ((var3 = var0.length()) == 0) {
         return new int[0];
      }

      int[] var4 = new int[var3];
      int var5 = 0;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var0.charAt(var6);
         if (var7 >= 55296 && var7 < 57344) {
            int var8 = var7;
            char var9 = var6 + 1 < var3 ? var0.charAt(var6 + 1) : '\u0000';
            if (var8 < 56320) {
               if (var9 >= '\udc00' && var9 < '\ue000') {
                  var7 = (var8 - 55296 << 10) + (var9 - '\udc00') + 65536;
                  var6++;
               } else {
                  if (var2) {
                     throw new ArgumentException("isolated high (leading) surrogate");
                  }

                  var7 = var1;
               }
            } else {
               if (var2) {
                  throw new ArgumentException("isolated low (trailing) surrogate");
               }

               var7 = var1;
            }
         }

         var4[var5++] = var7;
      }

      if (var5 == var3) {
         return var4;
      }

      int[] var10 = new int[var5];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, var5);
      return var10;
   }

   public static String n5(int[] var0) {
      a5 var1 = new a5();

      for (int var5 : var0) {
         if (var5 < 65535) {
            if (var5 >= 55296 && var5 <= 57343) {
               String var6 = com.aspose.slides.internal.v3.l6.t2(var5);
               throw new ArgumentException(d1.n5(new String[]{"illegal scalar value 0x", x8.n5(var6, 2, var6.length() - 1), "; cannot be UTF-16 surrogate"}));
            }

            var1.n5((char)var5);
         } else {
            if (var5 >= 1114112) {
               String var9 = com.aspose.slides.internal.v3.l6.t2(var5);
               throw new ArgumentException(d1.n5(new String[]{"illegal scalar value 0x", x8.n5(var9, 2, var9.length() - 1), "; out of range for UTF-16"}));
            }

            int var8 = (var5 - 65536 >> 10 & 1023) + 55296;
            int var7 = (var5 - 65536 >> 0 & 1023) + 56320;
            var1.n5((char)var8);
            var1.n5((char)var7);
         }
      }

      return var1.toString();
   }
}
