package com.aspose.slides.internal.t5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class z3 extends q0 {
   private short n5;
   private short l6;
   private int k5;
   private byte u3;
   private byte a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;
   private byte y4;
   private byte e2;
   private byte t9;
   private byte z1;
   private byte t4;
   private byte q0;
   private byte z3;
   private byte m1;
   private byte k7;
   private byte m3;
   private byte z8;
   private int j5;
   private int w1;
   private int r4;

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void l6(short var1) {
      if (var1 != 1) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final byte u9() {
      return this.a6;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }

   public final byte h0() {
      return this.u9;
   }

   public final void k5(byte var1) {
      this.u9 = var1;
   }

   public final byte c8() {
      return this.h0;
   }

   public final void u3(byte var1) {
      this.h0 = var1;
   }

   public final byte t2() {
      return this.c8;
   }

   public final void a6(byte var1) {
      this.c8 = var1;
   }

   public final byte s7() {
      return this.t2;
   }

   public final void u9(byte var1) {
      this.t2 = var1;
   }

   public final byte x8() {
      return this.s7;
   }

   public final void h0(byte var1) {
      this.s7 = var1;
   }

   public final byte n3() {
      return this.x8;
   }

   public final void c8(byte var1) {
      this.x8 = var1;
   }

   public final byte y4() {
      return this.n3;
   }

   public final void t2(byte var1) {
      this.n3 = var1;
   }

   public final byte e2() {
      return this.y4;
   }

   public final void s7(byte var1) {
      this.y4 = var1;
   }

   public final byte t9() {
      return this.e2;
   }

   public final void x8(byte var1) {
      this.e2 = var1;
   }

   public final byte z1() {
      return this.t9;
   }

   public final void n3(byte var1) {
      this.t9 = var1;
   }

   public final byte t4() {
      return this.z1;
   }

   public final void y4(byte var1) {
      this.z1 = var1;
   }

   public final byte q0() {
      return this.t4;
   }

   public final void e2(byte var1) {
      this.t4 = var1;
   }

   public final byte z3() {
      return this.q0;
   }

   public final void t9(byte var1) {
      this.q0 = var1;
   }

   public final byte m1() {
      return this.z3;
   }

   public final void z1(byte var1) {
      this.z3 = var1;
   }

   public final byte k7() {
      return this.m1;
   }

   public final void t4(byte var1) {
      this.m1 = var1;
   }

   public final byte m3() {
      return this.k7;
   }

   public final void q0(byte var1) {
      this.k7 = var1;
   }

   public final byte z8() {
      return this.m3;
   }

   public final void z3(byte var1) {
      this.m3 = var1;
   }

   public final byte j5() {
      return this.z8;
   }

   public final void m1(byte var1) {
      this.z8 = var1;
   }

   public final int w1() {
      return this.j5;
   }

   public final void l6(int var1) {
      this.j5 = var1;
   }

   public final int r4() {
      return this.w1;
   }

   public final void k5(int var1) {
      this.w1 = var1;
   }

   public final int c4() {
      return this.r4;
   }

   public final void u3(int var1) {
      this.r4 = var1;
   }

   protected final boolean n5(z3 var1) {
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
         && this.n3 == var1.n3
         && this.y4 == var1.y4
         && this.e2 == var1.e2
         && this.t9 == var1.t9
         && this.z1 == var1.z1
         && this.t4 == var1.t4
         && this.q0 == var1.q0
         && this.z3 == var1.z3
         && this.m1 == var1.m1
         && this.k7 == var1.k7
         && this.m3 == var1.m3
         && this.z8 == var1.z8
         && this.j5 == var1.j5
         && this.w1 == var1.w1
         && this.r4 == var1.r4;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((z3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = f0.n5(this.n5);
      var1 = var1 * 397 ^ f0.n5(this.l6);
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u3);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.a6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u9);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.h0);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.c8);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.t2);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.s7);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.x8);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.n3);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.y4);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.e2);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.t9);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.z1);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.t4);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.q0);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.z3);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.m1);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.k7);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.m3);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.z8);
      var1 = var1 * 397 ^ this.j5;
      var1 = var1 * 397 ^ this.w1;
      return var1 * 397 ^ this.r4;
   }
}
