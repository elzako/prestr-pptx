package com.aspose.slides.internal.f9d;

class n5 {
   private static final long[] n5 = new long[256];
   private long l6 = 4294967295L;
   private long k5;

   public final int n5() {
      return (int)(~(this.l6 & 4294967295L) & 4294967295L);
   }

   public final long l6() {
      return this.k5;
   }

   public final void n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new com.aspose.slides.internal.z3b.n5("The data buffer must not be null.");
      }

      long var4 = this.l6;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var2 + var6;
         var4 = ((var4 & 4294967295L) >> 8 ^ n5[(int)((var1[var7] & 0xFF ^ var4 & 4294967295L & 255L & 4294967295L) & 4294967295L)]) & 4294967295L;
      }

      this.l6 = var4;
      this.k5 += var3;
   }

   static {
      long var0 = 3988292384L;

      for (long var2 = 0L; (var2 & 4294967295L) < 256L; var2++) {
         long var4 = var2;

         for (long var6 = 8L; (var6 & 4294967295L) > 0L; var6--) {
            if ((var4 & 4294967295L & 1L & 4294967295L) == 1L) {
               var4 = ((var4 & 4294967295L) >> 1 ^ var0) & 4294967295L;
            } else {
               var4 = (var4 & 4294967295L) >> 1 & 4294967295L;
            }
         }

         n5[(int)var2] = var4;
      }
   }
}
