package com.aspose.slides.internal.g7;

public class e6a extends s7k {
   private e6a$l6 n5;
   private short[] l6;

   public e6a(d7u var1, u0a var2) {
      super(var1, var2);
   }

   public e6a(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final e6a$l6 n5() {
      this.s3();
      return this.n5;
   }

   public final short[] l6() {
      this.s3();
      return this.l6;
   }

   public final void n5(short[] var1) {
      this.l6 = var1;
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
         int var2 = this.y2().t2().n5() & 65535;
         this.n5 = new e6a$l6(var2);

         for (int var3 = 0; var3 < var2; var3++) {
            int var4 = var1.n3();
            short var5 = var1.t2();
            this.n5.n5(new e6a$n5(var4, var5));
         }

         int var6 = (this.y2().a6().n5() & 65535) - (this.y2().t2().n5() & 65535);
         if (var6 >= 0) {
            this.l6 = new short[var6];

            for (int var7 = 0; var7 < var6; var7++) {
               this.l6[var7] = var1.u9();
            }
         }
      } else {
         this.n5 = new e6a$l6();
         this.l6 = new short[0];
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               for (int var6 = 0; var6 < this.n5.n5(); var6++) {
                  e6a$n5 var7 = this.n5.n5(var6).k5();
                  var5.n5(var7.n5());
                  var5.n5(var7.l6());
               }

               for (short var9 : this.l6) {
                  var5.l6(var9);
               }

               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }
}
