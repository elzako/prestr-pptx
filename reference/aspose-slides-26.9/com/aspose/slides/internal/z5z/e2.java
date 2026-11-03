package com.aspose.slides.internal.z5z;

import java.util.Comparator;

public class e2 implements Comparator {
   public static final Comparator n5 = new e2();

   private e2() {
   }

   @Override
   public final int compare(Object a, Object b) {
      if (a == b) {
         return 0;
      }

      if (a == null) {
         return -1;
      }

      if (b == null) {
         return 1;
      }

      String var3 = (String)a;
      String var4 = (String)b;
      int var5 = var3.length();
      int var6 = var4.length();
      int var7 = 0;

      for (int var8 = 0; var7 < var5 && var8 < var6; var8++) {
         char var9 = var3.charAt(var7);
         char var10 = var4.charAt(var8);
         if ((var9 | var10) <= 127) {
            if (var9 >= 'a' && var9 <= 'z') {
               var9 ^= ' ';
            }

            if (var10 >= 'a' && var10 <= 'z') {
               var10 ^= ' ';
            }

            if (var9 != var10) {
               return var9 - var10;
            }
         } else if (var9 != var10) {
            var9 = h0.n5((char)var9);
            var10 = h0.n5((char)var10);
            if (var9 != var10) {
               var9 = h0.l6((char)var9);
               var10 = h0.l6((char)var10);
               if (var9 != var10) {
                  return var9 - var10;
               }
            }
         }

         var7++;
      }

      return var5 - var6;
   }
}
