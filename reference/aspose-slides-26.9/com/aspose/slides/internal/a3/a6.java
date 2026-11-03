package com.aspose.slides.internal.a3;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class a6 {
   private int n5;
   private int l6;

   public static a6 n5(String var0) {
      String[] var1 = d1.n5(d1.n5(var0, "..", "."), '.');
      a6 var2 = null;
      if (var1.length == 2) {
         String var3 = d1.l6(var1[0]);

         try {
            int var4 = a3.n5(var3);
            if (var4 % 100 != 0) {
            }

            int var5 = a3.n5(var1[1]);
            if (var5 % 100 != 0) {
            }

            if (var4 <= var5) {
               var2 = new a6(var4, var5);
            }
         } catch (RuntimeException var6) {
            if (!com.aspose.slides.internal.v6g.k5.l6(var6, FormatException.class)) {
               throw var6;
            }
         }
      }

      return var2;
   }

   public a6(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final boolean n5(int var1) {
      return var1 >= this.n5 && var1 <= this.l6;
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{a3.l6(this.n5), "..", a3.l6(this.l6)});
   }

   public final int[] n5() {
      int var1 = 0;

      for (int var2 = this.n5; var2 <= this.l6; var2 += 100) {
         var1++;
      }

      int[] var4 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var4[var3] = this.n5 + var3 * 100;
      }

      return var4;
   }
}
