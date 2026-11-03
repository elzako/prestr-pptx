package com.aspose.slides.internal.g7;

public class x2y extends s7k {
   public byte[] n5;

   public x2y(d7u var1, u0a var2) {
      super(var1, var2);
   }

   public x2y(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final byte[] n5() {
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
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.n5((int)this.d5());
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
