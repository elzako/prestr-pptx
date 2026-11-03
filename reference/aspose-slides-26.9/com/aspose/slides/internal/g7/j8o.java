package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class j8o extends a1k {
   private int n5;
   private short l6;
   private int k5;
   private int u3;
   private int a6;
   private short u9;
   private short h0;
   private short c8;
   private short t2;
   private short s7;
   private short x8;
   private short n3;
   private short y4;
   private short z1;
   private short t4;
   private short q0;
   private byte[] z3;
   private long m1;
   private long k7;
   private long m3;
   private long z8;
   private byte[] j5;
   private int w1;
   private int r4;
   private int c4;
   private short y2;
   private short y1;
   private short a0;
   private int d2;
   private int d5;
   private long s3;
   private long p8;
   private short f2;
   private short i1;
   private int e5;
   private int b3;
   private int o0;

   public final int n5() {
      return this.n5;
   }

   public final short l6() {
      return this.y1;
   }

   public final void n5(short var1) {
      this.n5(70, var1);
      this.y1 = var1;
   }

   public j8o(byte[] var1) {
      super("OS/2", var1);
      t4 var2 = new t4(var1);
      this.n5 = var2.u9();
      this.l6 = var2.h0();
      this.k5 = var2.u9();
      this.u3 = var2.u9();
      this.a6 = var2.u9();
      this.u9 = var2.h0();
      this.h0 = var2.h0();
      this.c8 = var2.h0();
      this.t2 = var2.h0();
      this.s7 = var2.h0();
      this.x8 = var2.h0();
      this.n3 = var2.h0();
      this.y4 = var2.h0();
      this.z1 = var2.h0();
      this.t4 = var2.h0();
      this.q0 = var2.h0();
      this.z3 = new byte[10];

      for (int var3 = 0; var3 < this.z3.length; var3++) {
         this.z3[var3] = var2.c8();
      }

      this.m1 = var2.u3();
      this.k7 = var2.u3();
      this.m3 = var2.u3();
      this.z8 = var2.u3();
      this.j5 = new byte[4];

      for (int var4 = 0; var4 < this.j5.length; var4++) {
         this.j5[var4] = var2.c8();
      }

      this.w1 = var2.u9();
      this.r4 = var2.u9();
      this.c4 = var2.u9();
      this.y2 = var2.h0();
      this.y1 = var2.h0();
      this.a0 = var2.h0();
      this.d2 = var2.u9();
      this.d5 = var2.u9();
      if (com.aspose.slides.internal.v6g.k5.k5(this.n5(), 8) > 0) {
         this.s3 = var2.u3();
         this.p8 = var2.u3();
         if (com.aspose.slides.internal.v6g.k5.k5(this.n5(), 8) > 1) {
            this.f2 = var2.h0();
            this.i1 = var2.h0();
            this.e5 = var2.u9();
            this.b3 = var2.u9();
            this.o0 = var2.u9();
         }
      }

      if (var2.n5() != var1.length) {
         throw new InvalidOperationException("Incorrect length of 'OS/2' table");
      }
   }
}
