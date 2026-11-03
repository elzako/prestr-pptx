package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.EndOfStreamException;

public class s7k {
   private boolean n5;
   private d7u l6;
   private g9t k5;
   private long u3;
   private long a6;
   private long u9;
   private Object h0 = new Object();
   private boolean c8;

   s7k(d7u var1, u0a var2) {
      this.n5 = true;
      this.l6 = var1;
      this.k5 = new g9t(null, var2, var1);
   }

   s7k(g9t var1, long var2, long var4, long var6) {
      this.n5 = false;
      this.k5 = var1;
      this.l6 = var1.l6();
      this.u3 = var2;
      this.a6 = var4;
      this.u9 = var6;
   }

   public final d7u y2() {
      return this.l6;
   }

   public final g9t y1() {
      return this.k5;
   }

   public final boolean a0() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final long d2() {
      return this.a6;
   }

   protected final long d5() {
      return this.u9;
   }

   final void s3() {
      if (!this.c8) {
         synchronized (this.h0) {
            if (!this.c8) {
               try {
                  if (!this.a0()) {
                     f3c var2 = new f3c(this.y1().n5());

                     try {
                        this.l6(var2);
                     } finally {
                        if (var2 != null) {
                           var2.dispose();
                        }
                     }
                  } else {
                     this.l6(null);
                  }
               } catch (EndOfStreamException var15) {
                  if (r6.n5().k5() != 1) {
                     throw var15;
                  }
               } finally {
                  this.c8 = true;
               }
            }
         }
      }
   }

   void l6(f3c var1) {
   }

   void n5(f3c var1) {
   }

   void n5(byte[][] var1, long[] var2, long[] var3) {
      try {
         f3c var4 = new f3c(this.y1().n5());

         try {
            var4.n5(com.aspose.slides.internal.v6g.k5.u9(this.d2(), 10));
            com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

            try {
               j2p var6 = new j2p(var5);

               try {
                  var6.n5(var4.n5(com.aspose.slides.internal.v6g.k5.u3(this.d5(), 10)));
                  this.n5(var6, var5, var1, var2, var3);
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
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
      } catch (EndOfStreamException var25) {
         if (r6.n5().k5() != 1) {
            throw var25;
         }

         var1[0] = new byte[0];
         var2[0] = 0L;
         var3[0] = n5(var1[0]);
      }
   }

   final void n5(j2p var1, com.aspose.slides.internal.z0k.e2 var2, byte[][] var3, long[] var4, long[] var5) {
      var4[0] = com.aspose.slides.internal.v6g.k5.a6(var1.n5(), 11);

      while (var1.n5() % 4L != 0L) {
         var1.n5((byte)0);
      }

      var2.close();
      var3[0] = var2.toArray();
      var5[0] = n5(var3[0]);
   }

   static long n5(byte[] var0) {
      int var1 = var0.length / 4;
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1; var7++) {
         var5 += com.aspose.slides.internal.v6g.k5.u3(var0[var6++], 6) & 0xFF;
         var4 += com.aspose.slides.internal.v6g.k5.u3(var0[var6++], 6) & 0xFF;
         var3 += com.aspose.slides.internal.v6g.k5.u3(var0[var6++], 6) & 0xFF;
         var2 += com.aspose.slides.internal.v6g.k5.u3(var0[var6++], 6) & 0xFF;
      }

      return com.aspose.slides.internal.v6g.k5.a6(var2 + (var3 << 8) + (var4 << 16) + (var5 << 24), 9);
   }
}
