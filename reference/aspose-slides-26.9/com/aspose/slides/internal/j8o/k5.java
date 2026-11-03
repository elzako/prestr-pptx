package com.aspose.slides.internal.j8o;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.z1;

public abstract class k5 {
   protected static int n5 = 11;
   protected static int l6 = 10;
   protected static int k5 = 15;
   protected static int u3 = 14;
   private z1 u9;
   protected v0 a6;
   private boolean h0 = false;

   protected k5(z1 var1, v0 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("encoderState");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rawDataWriter");
      }

      this.n5(var1);
      this.a6 = var2;
   }

   public final boolean a6() {
      return this.h0;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public final z1 u9() {
      return this.u9;
   }

   public final void n5(z1 var1) {
      this.u9 = var1;
   }

   public abstract com.aspose.slides.internal.b7s.u3[] n5();

   public abstract void n5(short[][] var1);

   public abstract void l6();

   public abstract void l6(short[][] var1);

   public abstract void k5();

   public abstract void u3();

   static com.aspose.slides.internal.b7s.u3 n5(long[] var0) {
      com.aspose.slides.internal.b7s.u3 var1 = new com.aspose.slides.internal.b7s.u3();
      byte[] var2 = new byte[33];
      int[] var3 = new int[257];
      int[] var4 = new int[257];

      for (int var5 = 0; var5 < 257; var5++) {
         var4[var5] = -1;
      }

      var0[256] = 1L;

      while (true) {
         int var6 = -1;
         long var7 = Long.MAX_VALUE;

         for (int var12 = 0; var12 <= 256; var12++) {
            if (var0[var12] != 0L && var0[var12] <= var7) {
               var7 = var0[var12];
               var6 = var12;
            }
         }

         int var9 = -1;
         var7 = Long.MAX_VALUE;

         for (int var13 = 0; var13 <= 256; var13++) {
            if (var0[var13] != 0L && var0[var13] <= var7 && var13 != var6) {
               var7 = var0[var13];
               var9 = var13;
            }
         }

         if (var9 < 0) {
            for (int var14 = 0; var14 <= 256; var14++) {
               if (var3[var14] != 0) {
                  var2[var3[var14]]++;
               }
            }

            int var15;
            for (var15 = 32; var15 > 16; var15--) {
               while ((var2[var15] & 255) > 0) {
                  int var10 = var15 - 2;

                  while ((var2[var10] & 255) == 0) {
                     var10--;
                  }

                  var2[var15] = (byte)((var2[var15] & 255) - 2);
                  var2[var15 - 1]++;
                  var2[var10 + 1] = (byte)((var2[var10 + 1] & 255) + 2);
                  var2[var10]--;
               }
            }

            while ((var2[var15] & 255) == 0) {
               var15--;
            }

            var2[var15]--;
            var1.n5(var2);
            int var11 = 0;

            for (int var16 = 1; var16 <= 32; var16++) {
               for (int var18 = 0; var18 <= 255; var18++) {
                  if (var3[var18] == var16) {
                     var1.a6()[var11] = (byte)var18;
                     var11++;
                  }
               }
            }

            var1.y4();
            return var1;
         }

         var0[var6] += var0[var9];
         var0[var9] = 0L;
         var3[var6]++;

         while (var4[var6] >= 0) {
            var6 = var4[var6];
            var3[var6]++;
         }

         var4[var6] = var9;
         var3[var9]++;

         while (var4[var9] >= 0) {
            var9 = var4[var9];
            var3[var9]++;
         }
      }
   }
}
