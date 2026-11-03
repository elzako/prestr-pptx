package com.aspose.slides.internal.g7;

public class c9t extends s7k {
   private c9t$n5 n5;

   public c9t(d7u var1, u0a var2) {
      super(var1, var2);
   }

   public c9t(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public c9t$n5 n5() {
      this.s3();
      return this.n5;
   }

   @Override
   public void n5(f3c var1) {
      super.n5(var1);
   }

   @Override
   public void l6(f3c var1) {
      super.l6(var1);
      if (!this.a0()) {
         var1.n5(this.d2() & 4294967295L);
         int var2 = this.y2().a6().n5() & 65535;
         short var3 = this.y2().k5().s7();
         this.n5 = new c9t$n5(var2 + 1);
         if (var3 == 0) {
            for (int var4 = 0; var4 < var2 + 1; var4++) {
               this.n5.n5((var1.n3() & 65535) * 2 & 4294967295L);
            }
         } else {
            for (int var5 = 0; var5 < var2 + 1; var5++) {
               this.n5.n5(var1.y4());
            }
         }
      } else {
         this.n5 = new c9t$n5(1);
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (!this.a0()) {
         super.n5(var1, var2, var3);
      }

      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();
      j2p var5 = new j2p(var4, true);

      try {
         for (int var6 = 0; var6 < this.n5().n5(); var6++) {
            switch (this.y2().k5().s7()) {
               case 0:
                  var5.n5((short)((this.n5().n5(var6) & 4294967295L) / 2L));
                  break;
               case 1:
                  var5.l6((int)this.n5().n5(var6));
            }
         }

         this.n5(var5, var4, var1, var2, var3);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }
}
