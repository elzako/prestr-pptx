package com.aspose.slides.internal.v7o;

import com.aspose.slides.internal.y5s.c8;
import java.util.HashMap;
import java.util.Map;

public class n5 extends c8 {
   private final int[] n5;
   private final Map<Integer, Integer> l6 = new HashMap<>();

   public n5(int[] var1) {
      super(var1);
      this.n5 = var1;
   }

   @Override
   public int n5(int var1) {
      Integer var2 = this.l6.get(var1);
      if (var2 == null) {
         var2 = this.l6(var1);
         this.l6.put(var1, var2);
      }

      return var2;
   }

   private int l6(int var1) {
      int var2 = var1 >> 24 & 0xFF;
      int var3 = var1 >> 16 & 0xFF;
      int var4 = var1 >> 8 & 0xFF;
      int var5 = var1 & 0xFF;
      int var6 = Integer.MAX_VALUE;
      int[] var7 = this.n5;
      int var8 = 0;

      for (int var9 = 0; var9 < var7.length; var9++) {
         int var10 = var7[var9];
         if (var10 == var1) {
            var8 = var9;
            break;
         }

         int var11 = (var10 >> 16 & 0xFF) - var3;
         int var12 = var11 * var11;
         if (var12 < var6) {
            var11 = (var10 >> 8 & 0xFF) - var4;
            var12 += var11 * var11;
            if (var12 < var6) {
               var11 = (var10 & 0xFF) - var5;
               var12 += var11 * var11;
               if (var12 < var6) {
                  var11 = (var10 >>> 24) - var2;
                  var12 += var11 * var11;
                  if (var12 < var6) {
                     var8 = var9;
                     var6 = var12;
                  }
               }
            }
         }
      }

      return var8;
   }
}
