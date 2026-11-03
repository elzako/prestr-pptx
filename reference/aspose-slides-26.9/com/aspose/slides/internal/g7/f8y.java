package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class f8y extends n3c {
   private f8y$n5[] n5;
   private int[] l6 = new int[256];
   private int[] k5;
   private long u3;

   public f8y(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.n3();
      var1.n3();
      Dictionary var2 = new Dictionary();

      for (int var3 = 0; var3 < 256; var3++) {
         this.l6[var3] = var1.n3() & 65535;
         var2.set_Item(this.l6[var3], 0);
      }

      this.n5 = (f8y$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(f8y$n5.class), var2.size()));
      this.u3 = var1.l6() - 1L;
      long var4 = 0L;

      for (int var6 = 0; var6 < this.n5.length; var6++) {
         this.n5[var6] = new f8y$n5();
         this.n5[var6].n5 = var1.n3();
         this.n5[var6].l6 = var1.n3();
         this.n5[var6].k5 = var1.t2();
         this.n5[var6].u3 = var1.n3();
         this.n5[var6].a6 = var1.n5();
         long var7 = var1.n5() + (this.n5[var6].u3 & 65535);
         long var9 = var1.n5() + (this.n5[var6].u3 & 65535) + (this.n5[var6].l6 & 65535) * 2;
         if (var7 < this.u3) {
            this.u3 = var7;
         }

         if (var9 > var4) {
            var4 = var9;
         }
      }

      this.k5 = new int[(int)((var4 - this.u3) / 2L)];
      var1.n5(this.u3);

      for (long var11 = 0L; var11 < this.k5.length; var11++) {
         this.k5[(int)var11] = var1.n3();
      }

      super.n5(var1);
   }

   @Override
   public int[] n5() {
      return this.k5;
   }

   @Override
   public int n5(int var1) {
      byte[] var2 = com.aspose.slides.ms.System.x8.n5((short)var1);
      if (!this.u9()) {
         var2 = this.l6(var1);
      }

      byte var3 = var2[0];
      int var4;
      byte var5;
      if (var2.length > 1) {
         var4 = this.l6[var3 & 0xFF] / 8;
         if (var4 == 0) {
            var5 = var3;
         } else {
            var5 = var2[1];
         }
      } else {
         var4 = 0;
         var5 = var3;
      }

      f8y$n5 var6 = this.n5[var4].n5();
      if ((var6.n5 & 65535) <= (var5 & 255) && (var5 & 255) < (var6.n5 & 65535) + (var6.l6 & 65535)) {
         int var7 = this.k5[(int)((var6.a6 + (var6.u3 & 65535) - this.u3) / 2L + ((var5 & 255) - (var6.n5 & 65535)))] & 65535;
         if (--var7 != 0) {
            var7 += var6.k5;
            var7 %= 65536;
         }

         return var7;
      } else {
         return 0;
      }
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(f8y$n5.class, new f8y$1());
   }
}
