package com.aspose.slides.internal.g7e;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.b7s.p8;
import com.aspose.slides.internal.b7s.t2;
import com.aspose.slides.internal.r1x.r4;
import com.aspose.slides.internal.t6q.s7;

public class n5 extends r4 {
   private int l6;
   private int k5;
   private int u3 = 0;
   private com.aspose.slides.internal.l0u.n5 a6;
   private com.aspose.slides.internal.l0u.n5 u9;
   private int h0 = 1;
   private String c8;
   private com.aspose.slides.internal.d0c.l6 t2;
   private t2 s7;
   private byte x8 = 8;
   private int n3 = 104857600;
   private int y4;
   private int e2;
   private p8 t9;
   private byte[] z1;
   private byte[] t4;
   private int q0 = 0;
   private boolean z3 = true;
   private u3 m1;

   public n5() {
      this.k5(75);
   }

   public n5(n5 var1) {
      super(var1);
      this.k5 = var1.k5;
      this.l6 = var1.l6;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      this.x8 = var1.x8;
      this.n5(var1.z3());
      this.n5(var1.l6());
      this.n5 = var1.n5;
   }

   public final int x8() {
      return this.n3;
   }

   @Override
   public s7 n5() {
      return this.n5;
   }

   @Override
   public void n5(s7 var1) {
      this.n5 = var1;
   }

   public final t2 n3() {
      return this.s7;
   }

   public final void n5(t2 var1) {
      this.s7 = var1;
   }

   public final String y4() {
      return this.c8;
   }

   public final void n5(String var1) {
      this.c8 = var1;
   }

   public final com.aspose.slides.internal.d0c.l6 e2() {
      return this.t2;
   }

   public final void n5(com.aspose.slides.internal.d0c.l6 var1) {
      this.t2 = var1;
   }

   public final int t9() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int z1() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final byte t4() {
      return this.x8;
   }

   public final void n5(byte var1) {
      this.x8 = var1;
   }

   public final void k5(int var1) {
      if (var1 <= 100 && var1 >= 1) {
         this.k5 = var1;
         this.l6 = u9(var1);
      } else {
         throw new ArgumentOutOfRangeException("Quality must be between 1 and 100.");
      }
   }

   public final int q0() {
      return this.l6;
   }

   public final u3 z3() {
      return this.m1;
   }

   public final void n5(u3 var1) {
      this.m1 = var1;
   }

   public final com.aspose.slides.internal.l0u.n5 m1() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.l0u.n5 var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.l0u.n5 k7() {
      return this.u9;
   }

   public final void l6(com.aspose.slides.internal.l0u.n5 var1) {
      this.u9 = var1;
   }

   public final int m3() {
      return this.y4;
   }

   public final void u3(int var1) {
      this.y4 = var1;
   }

   public final int z8() {
      return this.e2;
   }

   public final void a6(int var1) {
      this.e2 = var1;
   }

   public final p8 j5() {
      return this.t9;
   }

   public final void n5(p8 var1) {
      this.t9 = var1;
   }

   public final byte[] w1() {
      return this.z1;
   }

   public final void n5(byte[] var1) {
      this.z1 = var1;
   }

   public final byte[] r4() {
      return this.t4;
   }

   public final void l6(byte[] var1) {
      this.t4 = var1;
   }

   public final int c4() {
      return this.q0;
   }

   public final boolean y2() {
      return this.z3;
   }

   private static int u9(int var0) {
      if (var0 <= 0) {
         var0 = 1;
      }

      if (var0 > 100) {
         var0 = 100;
      }

      return var0 < 50 ? 5000 / var0 : 200 - var0 * 2;
   }
}
