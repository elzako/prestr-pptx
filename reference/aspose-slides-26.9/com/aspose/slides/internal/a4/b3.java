package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

public class b3 extends com.aspose.slides.internal.y6.u3 {
   private com.aspose.slides.internal.p9.n5 n5;
   private short l6;
   private short k5;
   private int u3;
   private int a6;
   private long u9;

   public b3() {
   }

   public b3(com.aspose.slides.internal.p9.n5 var1) {
      this.n5 = var1;
   }

   public b3(b3 var1) {
      this(var1.z1());
      this.l6(var1.t4());
      this.k5 = var1.G_();
      this.u3 = var1.h0();
      this.a6 = var1.H_();
      this.u9 = var1.u9;
   }

   public final com.aspose.slides.internal.p9.n5 z1() {
      return this.n5;
   }

   public final short t4() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public short G_() {
      return this.k5;
   }

   public void n5(short var1) {
      this.k5 = var1;
   }

   public int h0() {
      return this.u3;
   }

   public void l6(int var1) {
      this.u3 = var1;
   }

   public int H_() {
      return this.a6;
   }

   public void n5(int var1) {
      this.a6 = var1;
   }

   public final void k5(long var1) {
      this.u9 = var1;
   }

   public final byte q0() {
      return (byte)(this.k5 & 0xFF);
   }

   public final void k5(byte var1) {
      short var2 = -256;
      this.k5 = (short)(this.k5 & -256);
      this.k5 = (short)(this.k5 | var1 & 0xFF);
   }

   public final byte z3() {
      return (byte)((this.k5 & '\uff00') >> 8);
   }

   public int u9() {
      throw new NotSupportedException("Should be overridden in inheritors");
   }

   public final int m1() {
      int var1 = this.u9();
      if (var1 % 4 != 0) {
         var1 += 4 - var1 % 4;
      }

      return 12 + var1;
   }

   public final void k7() {
      this.l6(this.m1());
      this.n5(this.h0() - 12);
   }

   public final boolean u9(int var1) {
      boolean var2 = false;
      int var3 = 1 << var1;
      if ((this.k5 & var3) == var3) {
         var2 = true;
      }

      return var2;
   }

   public final byte m3() {
      int var1 = this.k5 & 255;
      return (byte)var1;
   }

   public final void n5(int var1, boolean var2) {
      int var3 = 1 << var1;
      int var4 = this.G_();
      if (var2) {
         var4 |= var3;
      } else {
         var4 &= ~var3;
      }

      this.k5 = (short)var4;
   }

   public final void u3(byte var1) {
      short var2 = -256;
      this.k5 = (short)(this.k5 & -256);
      this.k5 = (short)(this.k5 | var1 & 0xFF);
   }

   @Override
   public String toString() {
      return d1.n5(
         "Type: {0}, Flags: {1}, Size: {2}, DataSize: {3}, Offset: {4}",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.f2.class, this.l6),
         this.k5,
         this.u3,
         this.a6,
         this.u9
      );
   }

   protected final boolean n5(b3 var1) {
      return this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3 && this.a6 == var1.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((b3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.k5);
      var1 = var1 * 397 ^ this.u3;
      return var1 * 397 ^ this.a6;
   }
}
