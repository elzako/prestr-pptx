package com.aspose.slides.internal.x1;

class t9 extends n5 {
   private long u3 = 0L;
   private int a6 = 0;

   public t9(int var1) {
      this.a6 = var1;
   }

   public final void n5(long var1, e2 var3, s7 var4) {
      long[] var5 = var3.n5(var1);
      this.n5 = new long[var5.length * var4.n5(0).n5().length];

      for (int var6 = 0; var6 < var5.length; var6++) {
         y4 var7 = var4.n5((int)var5[var6]);
         if (var7 != null) {
            this.n5(var7, var7.n5().length);
         }
      }
   }

   public final long l6(long var1) {
      Object var3 = null;
      if ((var1 & 4294967295L) < 4294967290L) {
         var3 = this.n5(var1);
      } else {
         var3 = new long[0];
      }

      long var4 = this.u3();
      if (((long[])var3).length != 0) {
         this.n5[(int)((long[])var3)[((long[])var3).length - 1]] = var4;
      }

      this.n5[(int)var4] = 4294967294L;
      return var4;
   }

   private long u3() {
      if (((this.u3 & 4294967295L) + 1L & 4294967295L) > this.n5.length - 1) {
         this.k5();
      }

      while ((this.n5[(int)this.u3] & 4294967295L) != 4294967295L) {
         this.u3++;
      }

      return this.u3;
   }

   public final long k5(int var1) {
      long var2 = this.l6(4294967290L);
      long var4 = var2;

      for (int var6 = 1; var6 < var1; var6++) {
         var2 = this.l6(var2);
      }

      return var4;
   }
}
