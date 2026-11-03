package com.aspose.slides.internal.t5;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class t2 extends q0 {
   private com.aspose.slides.internal.k1.k7 n5;
   private com.aspose.slides.internal.k1.k7 l6;
   private int k5;
   private long u3 = 65536L;
   private long a6;
   private long u9;
   private int h0;
   private int c8;
   private long t2;
   private long s7;
   private long x8;
   private com.aspose.slides.internal.k1.w1 n3;
   private com.aspose.slides.internal.k1.w1 y4;

   public t2() {
      this.n5 = new com.aspose.slides.internal.k1.k7();
      this.l6 = new com.aspose.slides.internal.k1.k7();
      this.k5 = (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class);
      this.n3 = new com.aspose.slides.internal.k1.w1();
      this.y4 = new com.aspose.slides.internal.k1.w1();
   }

   public final com.aspose.slides.internal.k1.k7 u3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.k7 u9() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.k1.k7 var1) {
      this.l6 = var1;
   }

   public final int h0() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final long c8() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final long t2() {
      return this.a6;
   }

   public final void a6(long var1) {
      this.a6 = var1;
   }

   public final long s7() {
      return this.u9;
   }

   public final void u9(long var1) {
      this.u9 = var1;
   }

   public final int x8() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final int n3() {
      return this.c8;
   }

   public final void k5(int var1) {
      this.c8 = var1;
   }

   public final long y4() {
      return this.t2;
   }

   public final void h0(long var1) {
      this.t2 = var1;
   }

   public final long e2() {
      return this.s7;
   }

   public final void c8(long var1) {
      this.s7 = var1;
   }

   public final long t9() {
      return this.x8;
   }

   public final void t2(long var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.internal.k1.w1 z1() {
      return this.n3;
   }

   public final void n5(com.aspose.slides.internal.k1.w1 var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.k1.w1 t4() {
      return this.y4;
   }

   public final void l6(com.aspose.slides.internal.k1.w1 var1) {
      this.y4 = var1;
   }

   public final boolean q0() {
      return this.k5 == 1179469088;
   }

   public final y2 z3() {
      y2 var1 = this.u9().c8().n3();
      y2 var2 = y2.n5(q1.l6(var1.u3(), var1.u9()), q1.l6(var1.c8(), var1.n5()), q1.n5(var1.u3(), var1.u9()), q1.n5(var1.c8(), var1.n5())).n3();
      float var3 = n5((int)this.n3.l6(), (int)this.t4().l6(), var2.c8());
      float var4 = n5((int)this.n3.n5(), (int)this.t4().n5(), var2.u3());
      float var5 = n5((int)this.n3.l6(), (int)this.t4().l6(), var2.l6());
      float var6 = n5((int)this.n3.n5(), (int)this.t4().n5(), var2.t2());
      return y2.l6(new y1(var4, var3, var6 + 1.0F, var5 + 1.0F));
   }

   private static float n5(int var0, int var1, int var2) {
      return (float)var0 * var2 / (var1 * 100.0F);
   }

   @Override
   public String toString() {
      return d1.n5(
         "[Bonds: {0}, Frame: {1}, RecordSignature: {2}, Version: {3}, Bytes: {4}, Records: {5}, Handles: {6}, Reserved: {7}, NDesription: {8}, OffDescription: {9}, NPalEntries: {10}, Device: {11}, Millimeters: {12}]",
         this.n5,
         this.l6,
         s3.n5(com.aspose.slides.internal.c5.a6.class, this.k5),
         this.u3,
         this.a6,
         this.u9,
         this.h0,
         this.c8,
         this.t2,
         this.s7,
         this.x8,
         this.n3,
         this.y4
      );
   }

   protected final boolean n5(t2 var1) {
      return j8.n5(this.n5, var1.n5)
         && j8.n5(this.l6, var1.l6)
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && j8.n5(this.n3, var1.n3)
         && j8.n5(this.y4, var1.y4);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((t2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ (int)this.u9;
      var1 = var1 * 397 ^ c3.n5(this.h0);
      var1 = var1 * 397 ^ c3.n5(this.c8);
      var1 = var1 * 397 ^ (int)this.t2;
      var1 = var1 * 397 ^ (int)this.s7;
      var1 = var1 * 397 ^ (int)this.x8;
      var1 = var1 * 397 ^ (this.n3 != null ? this.n3.hashCode() : 0);
      return var1 * 397 ^ (this.y4 != null ? this.y4.hashCode() : 0);
   }
}
