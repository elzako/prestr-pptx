package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class l6 extends q0 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private short t2;
   private short s7;
   private short x8;
   private short n3;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void a6(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void u9(int var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void h0(int var1) {
      this.h0 = var1;
   }

   public final int t2() {
      return this.c8;
   }

   public final void c8(int var1) {
      this.c8 = var1;
   }

   public final short s7() {
      return this.t2;
   }

   public final void n5(short var1) {
      this.t2 = var1;
   }

   public final short x8() {
      return this.s7;
   }

   public final void l6(short var1) {
      this.s7 = var1;
   }

   public final short n3() {
      return this.x8;
   }

   public final void k5(short var1) {
      this.x8 = var1;
   }

   public final short y4() {
      return this.n3;
   }

   public final void u3(short var1) {
      this.n3 = var1;
   }

   protected final boolean n5(l6 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && this.n3 == var1.n3;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((l6)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = c3.n5(this.n5);
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ c3.n5(this.u3);
      var1 = var1 * 397 ^ c3.n5(this.a6);
      var1 = var1 * 397 ^ c3.n5(this.u9);
      var1 = var1 * 397 ^ c3.n5(this.h0);
      var1 = var1 * 397 ^ c3.n5(this.c8);
      var1 = var1 * 397 ^ f0.n5(this.t2);
      var1 = var1 * 397 ^ f0.n5(this.s7);
      var1 = var1 * 397 ^ f0.n5(this.x8);
      return var1 * 397 ^ f0.n5(this.n3);
   }
}
