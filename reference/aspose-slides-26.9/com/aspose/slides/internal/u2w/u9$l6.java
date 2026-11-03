package com.aspose.slides.internal.u2w;

public class u9$l6 implements com.aspose.slides.internal.b8u.n5 {
   private final com.aspose.slides.internal.v6s.a6 n5;
   private final long l6;
   private final long[] k5;
   private final long[] u3;
   private final long a6;
   private final boolean u9;
   private long h0;
   private long c8;
   private long t2;
   private long s7;

   public u9$l6(com.aspose.slides.internal.f2i.n5 var1, com.aspose.slides.internal.v6s.a6 var2, long var3, long var5, long var7, boolean var9) {
      this.u9 = var9;
      this.n5 = var2;
      this.h0 = var3;
      if ((var7 & 4294967295L) == 0L) {
         var7 = var5;
      }

      this.l6 = var7;
      long var10 = (var5 & 4294967295L) / (var7 & 4294967295L) & 4294967295L;
      if (((var5 & 4294967295L) % (var7 & 4294967295L) & 4294967295L) != 0L) {
         var10++;
      }

      var10 = var1.y1() == 1 ? var10 : (var10 & 4294967295L) * (var1.s3() & 65535) & 4294967295L;
      this.k5 = new long[(int)(var10 & 4294967295L)];
      this.u3 = new long[(int)(var10 & 4294967295L)];
      this.k5[0] = var3;
      this.a6 = var5;
   }

   public final long[] n5() {
      return this.k5;
   }

   public final long[] l6() {
      return this.u3;
   }

   public final long k5() {
      return this.l6;
   }

   public final long u3() {
      return this.h0;
   }

   static u9$l6 n5(com.aspose.slides.internal.f2i.n5 var0, com.aspose.slides.internal.v6s.a6 var1, long var2, long var4, long var6, boolean var8) {
      u9$l6 var9;
      switch (var0.m3()) {
         case 6:
            var9 = new u9$a6(var0, var1, var2, var4, var6, var8);
            break;
         default:
            var9 = new u9$l6(var0, var1, var2, var4, var6, var8);
      }

      return var9;
   }

   @Override
   public void n5(byte[] var1, int var2) {
      if (this.u9) {
         com.aspose.slides.internal.u2w.n5.n5(var1, 0, var2);
      }

      synchronized (this.n5.n5()) {
         this.n5.n5(this.h0 & 4294967295L);
         this.n5.n5(var1, 0, var2);
      }

      this.h0 = (this.h0 & 4294967295L) + (var2 & 4294967295L) & 4294967295L;
      this.s7 = (this.s7 & 4294967295L) + (var2 & 4294967295L) & 4294967295L;
   }

   @Override
   public final void a6() {
      this.c8++;
      if (((this.c8 & 4294967295L) % (this.l6 & 4294967295L) & 4294967295L) == 0L || ((this.c8 & 4294967295L) % (this.a6 & 4294967295L) & 4294967295L) == 0L) {
         this.u3[(int)(this.t2++)] = this.s7;
         if ((this.t2 & 4294967295L) < this.k5.length) {
            this.k5[(int)this.t2] = this.h0;
         }

         this.s7 = 0L;
      }
   }

   @Override
   public final void n5(int var1) {
      this.c8 = (this.c8 & 4294967295L) + (var1 & 4294967295L) & 4294967295L;
      if (((this.c8 & 4294967295L) % (this.l6 & 4294967295L) & 4294967295L) == 0L || ((this.c8 & 4294967295L) % (this.a6 & 4294967295L) & 4294967295L) == 0L) {
         this.u3[(int)(this.t2++)] = this.s7;
         if ((this.t2 & 4294967295L) < this.k5.length) {
            this.k5[(int)this.t2] = this.h0;
         }

         this.s7 = 0L;
      }
   }
}
