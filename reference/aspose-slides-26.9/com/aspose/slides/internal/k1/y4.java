package com.aspose.slides.internal.k1;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class y4 extends com.aspose.slides.internal.y6.u3 {
   private long n5;
   private long l6;
   private long k5;
   private int u3;
   private int a6;
   private h0 u9;
   private int h0;
   private int c8;
   private int t2;
   private String s7;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      if ((var1 & 4294967295L) != 1347637059L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      if ((var1 & 4294967295L) != 1024L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final h0 u9() {
      return this.u9;
   }

   public final void n5(h0 var1) {
      this.u9 = var1;
   }

   public final int h0() {
      return this.h0;
   }

   public final void k5(int var1) {
      this.h0 = var1;
   }

   public final int c8() {
      return this.c8;
   }

   public final void u3(int var1) {
      this.c8 = var1;
   }

   public final int t2() {
      return this.t2;
   }

   public final void a6(int var1) {
      this.t2 = var1;
   }

   public final String s7() {
      return this.s7;
   }

   public final void n5(String var1) {
      this.s7 = var1;
   }

   protected final boolean n5(y4 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && j8.n5(this.u9, var1.u9)
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && d1.a6(this.s7, var1.s7);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((y4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ this.a6;
      var1 = var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
      var1 = var1 * 397 ^ this.h0;
      var1 = var1 * 397 ^ this.c8;
      var1 = var1 * 397 ^ this.t2;
      return var1 * 397 ^ (this.s7 != null ? this.s7.hashCode() : 0);
   }
}
