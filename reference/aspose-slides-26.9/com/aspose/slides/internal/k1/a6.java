package com.aspose.slides.internal.k1;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class a6 extends k5 {
   private int n5;
   private int l6;
   private long k5;
   private long u3;
   private int a6;
   private int u9;
   private long h0;
   private long c8;

   public final int u3() {
      return this.n5;
   }

   public final void k5(int var1) {
      if (var1 <= 0) {
         throw new ArgumentException("This value MUST be positive.");
      }

      this.n5 = var1;
   }

   public final int u9() {
      return this.l6;
   }

   public final void u3(int var1) {
      if (var1 == 0) {
         throw new ArgumentException("This value MUST NOT be zero.");
      }

      this.l6 = var1;
   }

   public final long h0() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final long c8() {
      return this.u3;
   }

   public final void k5(long var1) {
      this.u3 = var1;
   }

   public final int t2() {
      return this.a6;
   }

   public final void a6(int var1) {
      this.a6 = var1;
   }

   public final int s7() {
      return this.u9;
   }

   public final void u9(int var1) {
      this.u9 = var1;
   }

   public final long x8() {
      return this.h0;
   }

   public final void u3(long var1) {
      this.h0 = var1;
   }

   public final long n3() {
      return this.c8;
   }

   public final void a6(long var1) {
      this.c8 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5());
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.n5(this.l6());
      var1.n5(this.k5() & 65535);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3);
      var1.l6(this.a6);
      var1.l6(this.u9);
      var1.n5(this.h0);
      var1.n5(this.c8);
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, Width: {1}, Height: {2}, Compression: {3}, ImageSize: {4}, XPelsPerMeter: {5}, YPelsPerMeter: {6}, ColorUsed: {7}, ColorImportant: {8}",
         super.toString(),
         this.n5,
         this.l6,
         s3.n5(com.aspose.slides.internal.o4.h0.class, this.k5),
         this.u3,
         this.a6,
         this.u9,
         this.h0,
         this.c8
      );
   }

   protected final boolean n5(a6 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.l6() == var1.l6()
         && this.k5() == var1.k5()
         && this.n5() == var1.n5();
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((a6)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ this.a6;
      var1 = var1 * 397 ^ this.u9;
      var1 = var1 * 397 ^ (int)this.h0;
      return var1 * 397 ^ (int)this.c8;
   }
}
