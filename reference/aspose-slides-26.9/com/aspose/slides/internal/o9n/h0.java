package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.o0;
import com.aspose.slides.internal.r1x.p6;

abstract class h0 extends com.aspose.slides.internal.u2w.l6 {
   private static int u9;
   private final d2 h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;

   public h0(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, d2 var4) {
      super(var1, var2, var3);
      this.h0 = var4;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final void u3(int var1) {
      this.s7 = var1;
   }

   public final int x8() {
      return this.x8;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.v6s.u3 var1, y2 var2, com.aspose.slides.internal.b8u.x8 var3) {
      int var4 = this.c8().y1();
      com.aspose.slides.internal.t6g.n5 var5 = this.n5
         ? new h0$k5(this, var1, var3, var2.n3())
         : (var4 == 1 ? new h0$n5(this, var1, var3, var2.n3()) : new h0$l6(this, var1, var3, var2.n3()));
      o0.n5(var2.n3(), var5);
   }

   protected abstract void n5(com.aspose.slides.internal.r2q.u9 var1);

   protected abstract p6 n5(byte[] var1, int var2);

   // $VF: synthetic method
   static d2 n5(h0 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static int n3() {
      return u9;
   }

   // $VF: synthetic method
   static void n5(h0 var0, long[] var1, int var2, int var3) {
      var0.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   static void n5(h0 var0, int[] var1, int var2, int var3) {
      var0.n5((int[])var1, var2, var3);
   }

   // $VF: synthetic method
   static void l6(h0 var0, long[] var1, int var2, int var3) {
      var0.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   static void l6(h0 var0, int[] var1, int var2, int var3) {
      var0.n5((int[])var1, var2, var3);
   }

   // $VF: synthetic method
   static void k5(h0 var0, int[] var1, int var2, int var3) {
      var0.n5((int[])var1, var2, var3);
   }

   // $VF: synthetic method
   static long[] l6(h0 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static long[] k5(h0 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int u3(h0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int a6(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int u9(h0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int h0(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int c8(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int t2(h0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static void u3(h0 var0, int[] var1, int var2, int var3) {
      var0.n5((int[])var1, var2, var3);
   }

   // $VF: synthetic method
   static int s7(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int x8(h0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int n3(h0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int y4(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static long[] e2(h0 var0) {
      return var0.u3;
   }
}
