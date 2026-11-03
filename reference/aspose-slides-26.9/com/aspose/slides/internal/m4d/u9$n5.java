package com.aspose.slides.internal.m4d;

public class u9$n5 {
   public boolean n5;
   public int l6;
   u9$n5[] k5;
   public int u3;
   public long a6;
   public long u9;
   public long h0;
   public int c8;
   public int t2;
   u9$n5 s7;
   // $VF: synthetic field
   final u9 x8;

   public u9$n5(u9 var1) {
      this.x8 = var1;
      this.n5 = false;
      this.t2 = 0;
      this.l6 = 0;
      this.k5 = new u9$n5[8];

      for (int var2 = 0; var2 < 8; var2++) {
         this.k5[var2] = null;
      }

      this.u3 = 0;
      this.a6 = this.h0 = this.u9 = 0L;
      this.c8 = 0;
   }

   public int n5() {
      if (this.n5) {
         return 0;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < this.k5.length; var2++) {
         if (this.k5[var2] != null) {
            if (this.k5[var2].n5) {
               var1++;
            } else {
               var1 += this.k5[var2].n5();
            }
         }
      }

      return var1;
   }
}
