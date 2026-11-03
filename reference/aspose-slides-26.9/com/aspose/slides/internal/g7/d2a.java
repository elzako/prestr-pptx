package com.aspose.slides.internal.g7;

public abstract class d2a implements r3 {
   protected p6r n5;
   protected int l6;
   protected q7[] k5;

   public d2a(p6r var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   protected abstract void n5();

   @Override
   public boolean n5(g2x var1, int[] var2, int var3) {
      if (this.k5 == null) {
         this.n5();
      }

      boolean var4 = false;
      if (var3 > var1.l6()) {
         var3 = var1.l6();
      }

      while (var2[0] < var3) {
         if (this.n5(var1, var2)) {
            var4 = true;
         } else {
            var2[0]++;
         }
      }

      return var4;
   }

   @Override
   public boolean n5(g2x var1) {
      if (this.k5 == null) {
         this.n5();
      }

      boolean var2 = false;
      int var3 = var1.c8();

      while (var1.u3(var3)) {
         int[] var4 = new int[]{var3};
         boolean var5 = this.n5(var1, var4);
         var3 = var4[0];
         if (var5) {
            var2 = true;
         } else {
            var4[0] = var3;
            var1.n5(var4);
            var3 = var4[0];
         }
      }

      return var2;
   }

   @Override
   public boolean n5(g2x var1, int[] var2) {
      boolean var3 = this.n5(var1, var2[0]);
      if (!var3) {
         return false;
      }

      for (int var4 = 0; var4 < this.n5.u3().size(); var4++) {
         if (this.k5[var4].n5(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean n5(g2x var1, int var2) {
      if (var1.h0() != null) {
         if (com.aspose.slides.ms.System.d1.a6(var1.h0().l6(), "rphf")) {
            if ((~var1.n5(var2).k5() & 4L) == 0L) {
               return false;
            }
         } else {
            for (t6 var6 : v6.n5) {
               if (com.aspose.slides.ms.System.d1.a6(var1.h0().l6(), var6.k5)) {
                  long var7 = var1.n5(var2).k5();
                  if ((var7 & var6.l6) != var6.l6) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
