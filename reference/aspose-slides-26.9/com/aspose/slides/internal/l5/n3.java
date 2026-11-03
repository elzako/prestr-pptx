package com.aspose.slides.internal.l5;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.v4;

public final class n3 implements IDisposable, v4 {
   private m3 n5;
   private l6 l6;
   private k5 k5;
   private k5 u3;

   private n3() {
   }

   public n3(l6 var1) {
      this.l6 = var1;
      this.n5 = new m3(var1.n5());
   }

   public n3(com.aspose.slides.internal.o9b.c8 var1) {
      this.l6 = new y4(var1.o8());
      this.n5 = new m3(var1.o8());
   }

   public final m3 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.n5.n5();
   }

   public final l6 k5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 u3() {
      return this.n5.k5();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5.n5(var1.o8());
      this.l6 = new y4(var1.o8());
   }

   public final float[] a6() {
      return this.n5.a6();
   }

   public final k5 u9() {
      return this.k5;
   }

   public final k5 h0() {
      return this.u3;
   }

   public final int c8() {
      return this.n5.c8();
   }

   public final void n5(int var1) {
      this.n5.l6(var1);
   }

   public final float t2() {
      return this.n5.t2();
   }

   public final void n5(float var1) {
      this.n5.n5(var1);
   }

   public final float[] s7() {
      return this.n5.s7();
   }

   public final void n5(float[] var1) {
      this.n5.l6(var1);
   }

   public final int x8() {
      return this.n5.x8();
   }

   public final int n3() {
      return this.n5.y4();
   }

   public final void l6(int var1) {
      this.n5.a6(var1);
   }

   public final int y4() {
      return this.n5.e2();
   }

   public final void k5(int var1) {
      this.n5.u9(var1);
   }

   public final float e2() {
      return this.n5.t9();
   }

   public final void l6(float var1) {
      this.n5.l6(var1);
   }

   public final int t9() {
      return this.n5.n3();
   }

   public final void u3(int var1) {
      this.n5.u3(var1);
   }

   public final m1 z1() {
      return this.n5.t4();
   }

   public final float t4() {
      return this.n5.q0();
   }

   public final void k5(float var1) {
      this.n5.k5(var1);
   }

   @Override
   public final Object deepClone() {
      n3 var1 = new n3();
      var1.n5 = (m3)this.n5.deepClone();
      var1.l6 = (l6)this.l6.deepClone();
      return var1;
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
      this.l6.dispose();
   }

   private boolean n5(n3 var1) {
      return j8.n5(this.n5, var1.n5) && j8.n5(this.l6, var1.l6) && j8.n5(this.u9(), var1.u9()) && j8.n5(this.h0(), var1.h0());
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, n3.class) && this.n5((n3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ (this.u9() != null ? this.u9().hashCode() : 0);
      return var1 * 397 ^ (this.h0() != null ? this.h0().hashCode() : 0);
   }
}
