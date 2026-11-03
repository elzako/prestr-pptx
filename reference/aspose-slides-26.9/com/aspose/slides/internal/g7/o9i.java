package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

public class o9i extends f1s {
   private int l6;
   private long k5;
   private boolean u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private e3m t2 = null;
   private e3m s7 = null;
   private e3m x8 = null;
   private e3m n3 = null;

   public o9i(int var1, long var2, long var4, boolean var6) {
      super(var2);
      if ((var1 & 65535) == 0) {
         throw new ArgumentException("ValueFormat passed for ValueRecord table must not be 0");
      }

      this.l6 = var1;
      this.k5 = var4;
      this.u3 = var6;
   }

   public final int l6() {
      return this.a6;
   }

   public final int k5() {
      return this.u9;
   }

   public final int u3() {
      return this.h0;
   }

   public final int a6() {
      return this.c8;
   }

   public final e3m u9() {
      return this.t2;
   }

   public final e3m h0() {
      return this.s7;
   }

   public final e3m c8() {
      return this.x8;
   }

   public final e3m t2() {
      return this.n3;
   }

   public final int s7() {
      return this.l6;
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != (this.n5 & 4294967295L)) {
         var1.n5(this.n5 & 4294967295L);
      }

      if ((this.l6 & 65535 & 1) != 0) {
         this.a6 = var1.n3();
      }

      if ((this.l6 & 65535 & 2) != 0) {
         this.u9 = var1.n3();
      }

      if ((this.l6 & 65535 & 4) != 0) {
         this.h0 = var1.n3();
      }

      if ((this.l6 & 65535 & 8) != 0) {
         this.c8 = var1.n3();
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      if ((this.l6 & 65535 & 16) != 0) {
         var2 = var1.n3() & 65535;
      }

      if ((this.l6 & 65535 & 32) != 0) {
         var3 = var1.n3() & 65535;
      }

      if ((this.l6 & 65535 & 64) != 0) {
         var4 = var1.n3() & 65535;
      }

      if ((this.l6 & 65535 & 128) != 0) {
         var5 = var1.n3() & 65535;
      }

      long var6 = this.u3 ? var1.n5() : 0L;
      if (var2 != 0) {
         this.t2 = f1s.n5(new e3m(this.k5 + var2), var1);
      }

      if (var3 != 0) {
         this.s7 = f1s.n5(new e3m(this.k5 + var3), var1);
      }

      if (var4 != 0) {
         this.x8 = f1s.n5(new e3m(this.k5 + var4), var1);
      }

      if (var5 != 0) {
         this.n3 = f1s.n5(new e3m(this.k5 + var5), var1);
      }

      if (var6 != 0L) {
         var1.n5(var6);
      }
   }
}
