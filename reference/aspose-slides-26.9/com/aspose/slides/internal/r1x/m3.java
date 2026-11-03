package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.q1;

public abstract class m3 extends e2 {
   private m3 y4;
   private com.aspose.slides.internal.b8u.a6 e2;
   private Object t9;
   private boolean z1 = false;
   private static m3$n5 t4;
   static final com.aspose.slides.internal.v6g.n5<m3$n5> n3 = new z8();
   private boolean q0;

   protected m3() {
   }

   public final com.aspose.slides.internal.o9b.y2 x8() {
      this.s7();
      return new com.aspose.slides.internal.o9b.y2(com.aspose.slides.internal.o9b.j5.n5.k5(), this.t9().u3());
   }

   public final m3 n3() {
      return this.y4;
   }

   public abstract int y4();

   public final com.aspose.slides.internal.b8u.a6 e2() {
      return this.e2;
   }

   public final void n5(com.aspose.slides.internal.b8u.a6 var1) {
      if (this.e2 != var1) {
         com.aspose.slides.internal.b8u.a6 var2 = this.e2;
         this.l6(var2, var1);
         this.e2 = var1;
         this.n5(var2, var1);
      }
   }

   public final com.aspose.slides.internal.o9b.p8 t9() {
      this.s7();
      return new com.aspose.slides.internal.o9b.p8(this.z1(), this.y4());
   }

   public abstract int z1();

   public final boolean t4() {
      return this.q0;
   }

   public boolean q0() {
      return false;
   }

   public com.aspose.slides.internal.o9b.c8 z3() {
      return com.aspose.slides.internal.o9b.c8.w4();
   }

   protected void k5(boolean var1) {
      this.z1 = var1;
   }

   public static com.aspose.slides.internal.o9b.y2 n5(com.aspose.slides.internal.o9b.y2 var0, int var1, int var2) {
      com.aspose.slides.internal.o9b.y2 var3 = com.aspose.slides.internal.o9b.y2.n5(
            var0.n3(),
            new com.aspose.slides.internal.o9b.y2(new com.aspose.slides.internal.o9b.j5(), new com.aspose.slides.internal.o9b.p8(q1.n5(var1), q1.n5(var2)))
         )
         .n3();
      if (var3.t2() > 0 && var3.l6() > 0) {
         return var3;
      } else {
         throw new ArgumentException("The rectangle has no common processing area. Cannot proceed.");
      }
   }

   public static m3 n5(com.aspose.slides.internal.z0k.t4 var0, d2 var1) {
      return com.aspose.slides.internal.n6h.k5.n5(var0, var1);
   }

   public static m3 u3(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, null);
   }

   public void n5(Object var1) {
      this.t9 = var1;
   }

   public final void n5(m3 var1) {
      this.y4 = var1;
   }

   protected boolean n5(int var1) {
      return false;
   }

   final boolean m1() {
      return this.t4() || this.y4 != null && this.y4.m1();
   }

   protected final com.aspose.slides.internal.o9b.y2 n5(com.aspose.slides.internal.o9b.y2 var1) {
      return n5(var1.n3(), this.z1(), this.y4());
   }

   protected void n5(com.aspose.slides.internal.b8u.a6 var1, com.aspose.slides.internal.b8u.a6 var2) {
   }

   protected void l6(com.aspose.slides.internal.b8u.a6 var1, com.aspose.slides.internal.b8u.a6 var2) {
   }

   @Override
   protected void a6() {
      this.y4 = null;
      this.e2 = null;
      super.a6();
   }

   protected static void n5(long[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      if (t4 != null) {
         t4.n5(var0, var1);
      }
   }

   public static m3 n5(v3 var0, d2 var1) {
      try {
         m3 var2 = null;
         synchronized (var0.n5()) {
            com.aspose.slides.internal.b8u.h0 var4 = w1.l6(var0.k5(), var1, false);
            if (var4 == null) {
               throw new com.aspose.slides.internal.z3b.a6("Cannot open an image. The image file format may be not supported at the moment.");
            }

            var2 = var4.n5(var0, var1);
            var2.n5(var0);
            if (var1 == null || !var1.a6()) {
               long[] var5 = new long[]{var2.l6};
               n5(var5, var0.k5());
               var2.l6 = var5[0];
            }

            var2.k5(false);
            return var2;
         }
      } catch (RuntimeException var8) {
         i9 var3 = (i9)i9.n5();
         var3.n5(var0);
         throw new com.aspose.slides.internal.z3b.a6("Image loading failed.", var8);
      }
   }

   // $VF: synthetic method
   static m3$n5 n5(m3$n5 var0) {
      t4 = var0;
      return var0;
   }
}
