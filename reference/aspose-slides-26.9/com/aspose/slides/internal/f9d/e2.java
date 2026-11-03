package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.d1;

final class e2 {
   public byte[] n5;
   public int l6;
   public int k5;
   public long u3;
   public byte[] a6;
   public int u9;
   public int h0;
   public long c8;
   u9 t2;
   private long n3;
   private int y4 = 6;
   public int s7 = 15;
   public int x8 = 0;

   public final long n5() {
      return this.n3;
   }

   public final void n5(long var1) {
      this.n3 = var1;
   }

   public final int l6() {
      return this.y4;
   }

   public final void n5(int var1) {
      this.y4 = var1;
   }

   public e2() {
      int var1 = this.a6();
      if (var1 != 0) {
         throw new com.aspose.slides.internal.z3b.n5("Cannot initialize for deflate.");
      }
   }

   private int a6() {
      return this.l6(true);
   }

   public final int n5(int var1, boolean var2) {
      this.n5(var1);
      return this.l6(var2);
   }

   private int l6(boolean var1) {
      this.t2 = new u9();
      this.t2.n5(var1);
      return this.t2.n5(this, this.l6());
   }

   public final int n5(boolean var1) {
      if (this.t2 == null) {
         throw new com.aspose.slides.internal.z3b.n5("No Deflate State!");
      } else {
         return this.t2.l6(var1);
      }
   }

   public final int k5() {
      if (this.t2 == null) {
         throw new com.aspose.slides.internal.z3b.n5("No Deflate State!");
      }

      int var1 = this.t2.u9();
      this.t2 = null;
      return var1;
   }

   final void u3() {
      int var1 = this.t2.l6();
      if (var1 > this.h0) {
         var1 = this.h0;
      }

      if (var1 != 0) {
         if (this.t2.u3().length > this.t2.k5() && this.a6.length > this.u9 && this.t2.u3().length >= this.t2.k5() + var1 && this.a6.length >= this.u9 + var1) {
            System.arraycopy(this.t2.u3(), this.t2.k5(), this.a6, this.u9, var1);
            this.u9 += var1;
            this.c8 += var1;
            this.h0 -= var1;
            this.t2.n5(this.t2.l6() - var1);
            if (this.t2.l6() == 0) {
               this.t2.l6(0);
            } else {
               this.t2.l6(this.t2.k5() + var1);
            }
         } else {
            throw new com.aspose.slides.internal.z3b.n5(d1.n5("Invalid State. (pending.Length={0}, pendingCount={1})",new Object[]{ this.t2.u3().length, this.t2.l6()}));
         }
      }
   }

   final int n5(byte[] var1, int var2, int var3) {
      int var4 = this.k5;
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 == 0) {
         return 0;
      }

      this.k5 -= var4;
      if (this.t2.n5()) {
         this.n5(com.aspose.slides.internal.g3j.n5.n5(this.n5() & 4294967295L, this.n5, this.l6, var4) & 4294967295L);
      }

      System.arraycopy(this.n5, this.l6, var1, var2, var4);
      this.l6 += var4;
      this.u3 += var4;
      return var4;
   }
}
