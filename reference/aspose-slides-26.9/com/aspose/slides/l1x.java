package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class l1x extends x3 {
   private f4p n5 = new f4p();
   private int l6 = 0;
   private com.aspose.slides.internal.k4y.u1g k5;
   private com.aspose.slides.internal.k4y.v0y u3;
   private com.aspose.slides.internal.k4y.k4x a6;
   private com.aspose.slides.internal.k4y.x8 u9;
   private float h0 = 0.5F;
   private boolean c8 = true;
   private boolean t2 = false;
   private boolean s7 = false;
   private boolean x8 = false;
   private boolean n3 = true;
   private boolean y4 = false;
   private boolean e2 = true;
   private int t9 = 1;
   private a1c z1;
   private p8x t4;
   private o9q q0 = new o9q();
   private List<b8o> z3 = new List<>();
   private g8z m1;
   private long k7 = 256L;
   private long m3 = 2147483648L;
   private byte[] z8;
   private byte[] j5;
   private VbaProject w1;
   private j1p r4;
   private boolean c4;

   public final f4p n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.k4y.u1g k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.k4y.u1g var1) {
      this.k5 = var1;
   }

   public final j1p u3() {
      return this.r4;
   }

   public final void n5(j1p var1) {
      this.r4 = var1;
   }

   public final com.aspose.slides.internal.k4y.v0y a6() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.k4y.v0y var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.k4y.k4x u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.k4y.k4x var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.k4y.x8 h0() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.k4y.x8 var1) {
      this.u9 = var1;
   }

   public final float c8() {
      return this.h0;
   }

   public final void n5(float var1) {
      if (!(var1 < 0.0F) && !(var1 > 100.0F)) {
         this.h0 = var1;
      } else {
         throw new ArgumentOutOfRangeException("ServerZoom must be in range [0;100]");
      }
   }

   public final boolean t2() {
      return this.c8;
   }

   public final void n5(boolean var1) {
      this.c8 = var1;
   }

   public final boolean s7() {
      return this.t2;
   }

   public final void l6(boolean var1) {
      this.t2 = var1;
   }

   public final boolean x8() {
      return this.s7;
   }

   public final void k5(boolean var1) {
      this.s7 = var1;
   }

   public final boolean n3() {
      return this.x8;
   }

   public final void u3(boolean var1) {
      this.x8 = var1;
   }

   public final boolean y4() {
      return this.n3;
   }

   public final void a6(boolean var1) {
      this.n3 = var1;
   }

   public final boolean e2() {
      return this.y4;
   }

   public final void u9(boolean var1) {
      this.y4 = var1;
   }

   public final boolean t9() {
      return this.e2;
   }

   public final void h0(boolean var1) {
      this.e2 = var1;
   }

   public final int z1() {
      return this.t9;
   }

   public final void l6(int var1) {
      this.t9 = var1;
   }

   public final a1c t4() {
      return this.z1;
   }

   public final void n5(a1c var1) {
      this.z1 = var1;
   }

   public final p8x q0() {
      return this.t4;
   }

   public final void n5(p8x var1) {
      this.t4 = var1;
   }

   public final o9q z3() {
      return this.q0;
   }

   public final List<b8o> m1() {
      return this.z3;
   }

   public final g8z k7() {
      return this.m1;
   }

   public final void n5(g8z var1) {
      this.m1 = var1;
   }

   public final byte[] m3() {
      return this.z8;
   }

   public final void n5(byte[] var1) {
      this.z8 = var1;
   }

   public final VbaProject z8() {
      return this.w1;
   }

   public final void n5(VbaProject var1) {
      this.w1 = var1;
   }

   public final byte[] j5() {
      return this.j5;
   }

   public final void l6(byte[] var1) {
      this.j5 = var1;
   }

   public final long n5(Presentation var1) {
      if ((this.k7 & 4294967295L) > 2147483647L) {
         this.k7 = 256L;
         this.c4 = true;
      }

      long var2 = this.k7++;
      if (this.c4) {
         while (var1.l6(var2)) {
            var2 = this.k7++;
         }
      }

      return var2;
   }

   public final void n5(long var1) {
      if ((this.k7 & 4294967295L) <= (var1 & 4294967295L)) {
         this.k7 = (var1 & 4294967295L) + 1L & 4294967295L;
      }
   }

   public final long w1() {
      return this.m3++;
   }

   public final void l6(long var1) {
      if ((var1 & 4294967295L) != 4294967295L && (this.m3 & 4294967295L) <= (var1 & 4294967295L)) {
         this.m3 = (var1 & 4294967295L) + 1L & 4294967295L;
      }
   }
}
