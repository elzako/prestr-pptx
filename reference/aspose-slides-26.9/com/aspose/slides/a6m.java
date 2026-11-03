package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a6m {
   private long n5 = 0L;
   private long l6 = 0L;

   public a6m(long var1, long var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public long n5(List<r8e> var1, long var2, byte[] var4) {
      long var5 = var2;
      long[] var7 = new long[]{var5};
      this.n5(var1, var7, var4);
      var5 = var7[0];
      return u3k.n5(var1, (byte)1, -27273042329608L, u3k.n5(var1, (byte)0, var5, -27273042329602L, this.n5), 0L);
   }

   public long l6(List<r8e> var1, long var2, byte[] var4) {
      long var5 = var2;
      long[] var7 = new long[]{var5};
      this.n5(var1, var7, var4);
      var5 = var7[0];
      return u3k.n5(var1, (byte)1, -27273042329609L, u3k.n5(var1, (byte)0, var5, -27273042329603L, this.l6), 0L);
   }

   public long k5(List<r8e> var1, long var2, byte[] var4) {
      return u3k.n5(var1, (byte)0, var2, -27273042329602L, this.n5);
   }

   public long u3(List<r8e> var1, long var2, byte[] var4) {
      return u3k.n5(var1, (byte)0, var2, -27273042329603L, this.l6);
   }

   private void n5(List<r8e> var1, long[] var2, byte[] var3) {
      byte var4 = 3;
      byte var5 = 12;
      byte var6 = 15;
      if (var2[0] < -27273042329600L) {
         int var7 = (int)(-27273042329600L - var2[0] - 1L);
         if (var7 < var3.length) {
            byte var8 = (byte)(var3[var7] & 15);
            if (var8 != 0) {
               byte var9 = (byte)(var8 & 3);
               byte var10 = (byte)(var8 & 12);
               if (var9 != 0) {
                  long var11 = u3k.n5(
                     var1,
                     (byte)3,
                     u3k.n5(var1, (byte)1, -27273042329602L, 0L, -27273042329603L),
                     u3k.n5(var1, (byte)0, -27273042329603L, 1L, -27273042329602L),
                     1L
                  );
                  if (var9 == 1) {
                     var2[0] = u3k.n5(var1, (byte)0, var2[0], var11, 1L);
                  } else if (var9 == 2) {
                     long var13 = u3k.n5(var1, (byte)1, this.n5, 0L, var2[0]);
                     long var15 = u3k.n5(var1, (byte)0, var13, var11, 1L);
                     var2[0] = u3k.n5(var1, (byte)1, this.n5, 0L, var15);
                  } else {
                     long var20 = u3k.n5(var1, (byte)0, this.n5, 1L, 2L);
                     long var23 = u3k.n5(var1, (byte)1, var2[0], 0L, var20);
                     long var17 = u3k.n5(var1, (byte)0, var23, var11, 1L);
                     var2[0] = u3k.n5(var1, (byte)1, var17, var20, 0L);
                  }
               }

               if (var10 != 0) {
                  long var19 = u3k.n5(
                     var1,
                     (byte)3,
                     u3k.n5(var1, (byte)1, -27273042329603L, 0L, -27273042329602L),
                     u3k.n5(var1, (byte)0, -27273042329602L, 1L, -27273042329603L),
                     1L
                  );
                  if (var10 == 4) {
                     var2[0] = u3k.n5(var1, (byte)0, var2[0], var19, 1L);
                  } else if (var10 == 8) {
                     long var21 = u3k.n5(var1, (byte)1, this.l6, 0L, var2[0]);
                     long var24 = u3k.n5(var1, (byte)0, var21, var19, 1L);
                     var2[0] = u3k.n5(var1, (byte)1, this.l6, 0L, var24);
                  } else {
                     long var22 = u3k.n5(var1, (byte)0, this.l6, 1L, 2L);
                     long var25 = u3k.n5(var1, (byte)1, var2[0], 0L, var22);
                     long var26 = u3k.n5(var1, (byte)0, var25, var19, 1L);
                     var2[0] = u3k.n5(var1, (byte)1, var26, var22, 0L);
                  }
               }
            }
         }
      }
   }
}
