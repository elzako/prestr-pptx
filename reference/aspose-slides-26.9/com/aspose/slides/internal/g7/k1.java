package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

public class k1 extends a1k {
   public int n5;
   public int l6;
   public long k5;
   public int u3;
   public long a6;
   public long u9;
   public int h0;
   public int c8;
   public short t2;
   public short s7;
   private long x8;
   private int n3;
   private short y4;
   private short z1;
   private short t4;
   private short q0;
   private short z3;

   public final void n5(long var1) {
      this.n5(8, (long)var1);
      this.x8 = var1;
   }

   public final int n5() {
      return this.n3;
   }

   public final void n5(int var1) {
      this.n5(16, (int)var1);
      this.n3 = var1;
   }

   public final void n5(short var1) {
      this.n5(36, var1);
      this.y4 = var1;
   }

   public final short l6() {
      return this.z1;
   }

   public final void l6(short var1) {
      this.n5(38, var1);
      this.z1 = var1;
   }

   public final void k5(short var1) {
      this.n5(40, var1);
      this.t4 = var1;
   }

   public final void u3(short var1) {
      this.n5(42, var1);
      this.q0 = var1;
   }

   public final void a6(short var1) {
      this.n5(50, var1);
      this.z3 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.n5((this.n5() & 65535 | 16) & 65535);
      } else {
         this.n5(this.n5() & 65535 & -17 & 65535);
      }
   }

   public k1(byte[] var1) {
      super("head", var1);
      t4 var2 = new t4(var1);
      this.n5 = var2.a6();
      int var3 = 65536;
      if (this.n5 != 65536) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5("Version of 'head' table is incorrect: {0}, expected {1} for v1.0",new Object[]{ this.n5, 65536})
         );
      }

      this.l6 = var2.a6();
      this.n5(0L);
      var2.n5(var2.n5() + 4);
      this.k5 = var2.u3();
      int var4 = 1594834165;
      if ((this.k5 & 4294967295L) != 1594834165L) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5("Magic number of 'head' table is incorrect: {0}, expected {1}",new Object[]{ this.k5, 1594834165})
         );
      }

      this.n3 = var2.u9();
      this.u3 = var2.u9();
      this.a6 = var2.k5();
      this.u9 = var2.k5();
      this.y4 = var2.h0();
      this.z1 = var2.h0();
      this.t4 = var2.h0();
      this.q0 = var2.h0();
      this.h0 = var2.u9();
      this.c8 = var2.u9();
      this.t2 = var2.h0();
      this.z3 = var2.h0();
      this.s7 = var2.h0();
      if (var1.length != var2.n5()) {
         throw new InvalidOperationException("Incorrect length of 'head' table");
      }
   }
}
