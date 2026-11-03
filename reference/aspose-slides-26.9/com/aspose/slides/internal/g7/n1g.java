package com.aspose.slides.internal.g7;

public class n1g extends s7k {
   private float l6;
   private int k5;
   private float u3;
   private long a6;
   private long u9;
   private long h0;
   private com.aspose.slides.ms.System.j5 c8 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 t2 = new com.aspose.slides.ms.System.j5();
   private short s7;
   private short x8;
   private short n3;
   private short y4;
   private int e2;
   private int t9;
   private short z1;
   private short t4;
   private short q0;
   public long n5;

   public n1g(d7u var1, u0a var2) {
      super(var1, var2);
      this.l6 = 1.0F;
      this.k5 = 0;
      this.u3 = 0.0F;
      this.a6 = 0L;
      this.u9 = 1594834165L;
      this.h0 = 2048L;
      com.aspose.slides.ms.System.j5.s7().u3(this.c8);
      com.aspose.slides.ms.System.j5.s7().u3(this.t2);
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = (short)this.h0;
      this.y4 = (short)this.h0;
      this.e2 = 0;
      this.t9 = 6;
      this.z1 = 0;
      this.t4 = 1;
      this.q0 = 0;
   }

   public n1g(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final long l6() {
      return this.h0;
   }

   public final void n5(long var1) {
      this.h0 = var1;
   }

   public final short k5() {
      return this.s7;
   }

   public final void n5(short var1) {
      this.s7 = var1;
   }

   public final short u3() {
      return this.x8;
   }

   public final void l6(short var1) {
      this.x8 = var1;
   }

   public final short a6() {
      return this.n3;
   }

   public final void k5(short var1) {
      this.n3 = var1;
   }

   public final short u9() {
      return this.y4;
   }

   public final void u3(short var1) {
      this.y4 = var1;
   }

   public final int h0() {
      return this.e2;
   }

   public final void l6(int var1) {
      this.e2 = var1;
   }

   public final int c8() {
      return this.t9;
   }

   public final void k5(int var1) {
      this.t9 = var1;
   }

   public final short t2() {
      return this.z1;
   }

   public final void a6(short var1) {
      this.z1 = var1;
   }

   public final short s7() {
      return this.t4;
   }

   public final void u9(short var1) {
      this.t4 = var1;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);
      this.l6 = var1.u3();
      this.u3 = var1.u3();
      this.a6 = var1.y4();
      this.u9 = var1.y4();
      this.k5 = var1.n3() & 65535;
      this.h0 = var1.n3() & 65535;
      var1.n5(true).u3(this.c8);
      var1.n5(true).u3(this.t2);
      this.s7 = var1.u9();
      this.x8 = var1.u9();
      this.n3 = var1.u9();
      this.y4 = var1.u9();
      this.e2 = var1.n3() & 65535;
      this.t9 = var1.n3();
      this.z1 = var1.t2();
      this.t4 = var1.t2();
      this.q0 = var1.t2();
      super.n5(var1);
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      this.n5 = 8L;
      if (this.a0() && this.l6 == 1.0F) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               var5.n5(this.l6);
               var5.n5(this.u3);
               var5.k5(this.a6);
               var5.k5(this.u9);
               var5.n5(this.k5 & 65535);
               var5.n5((int)(this.h0 & 65535L));
               var5.n5(this.c8.m3());
               var5.n5(this.t2.m3());
               var5.l6(this.s7);
               var5.l6(this.x8);
               var5.l6(this.n3);
               var5.l6(this.y4);
               var5.n5(this.e2 & 65535);
               var5.n5(this.t9);
               var5.n5(this.z1);
               var5.n5(this.t4);
               var5.n5(this.q0);
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
