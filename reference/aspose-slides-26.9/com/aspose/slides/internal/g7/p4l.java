package com.aspose.slides.internal.g7;

public class p4l extends s7k {
   public byte[] n5;
   private short[] l6;

   public p4l(d7u var1, u0a var2) {
      super(var1, var2);
   }

   public p4l(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   private short[] n5() {
      this.s3();
      return this.l6;
   }

   @Override
   public void n5(f3c var1) {
      super.n5(var1);
   }

   @Override
   public void l6(f3c var1) {
      super.l6(var1);
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.n5((int)this.d5());
      f3c var2 = new f3c(new m3(this.n5));

      try {
         this.l6 = new short[this.n5.length / 2];
         int var3 = 0;

         while (var2.n5() < this.n5.length - 2) {
            this.l6[var3++] = var2.u9();
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final short n5(int var1) {
      return var1 < this.n5().length ? this.n5()[var1] : 0;
   }

   public final void n5(int var1, short var2) {
      if (var1 < this.n5().length) {
         this.n5()[var1] = var2;
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               if (this.n5 != null) {
                  var5.n5(this.n5);
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
