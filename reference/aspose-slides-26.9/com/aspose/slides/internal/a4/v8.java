package com.aspose.slides.internal.a4;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.ms.System.c3;

public class v8 extends j4 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private short a6;
   private short u9;
   private int h0;
   private byte c8;
   private byte t2;
   private a7 s7;
   private com.aspose.slides.internal.i0.a3 x8;

   public v8(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(0);
   }

   public final byte u3() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte c8() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final byte t2() {
      return this.k5;
   }

   public final void a6(byte var1) {
      this.k5 = var1;
   }

   public final byte s7() {
      return this.u3;
   }

   public final void u9(byte var1) {
      this.u3 = var1;
   }

   public final short x8() {
      return this.a6;
   }

   public final void k5(short var1) {
      this.a6 = var1;
   }

   public final short n3() {
      return this.u9;
   }

   public final void u3(short var1) {
      this.u9 = var1;
   }

   public final int y4() {
      return this.h0;
   }

   public final void k5(int var1) {
      this.h0 = var1;
   }

   public final byte e2() {
      return this.c8;
   }

   public final void h0(byte var1) {
      this.c8 = var1;
   }

   public final byte t9() {
      return this.t2;
   }

   public final void c8(byte var1) {
      this.t2 = var1;
   }

   public final a7 z8() {
      return this.s7;
   }

   public final void n5(a7 var1) {
      this.s7 = var1;
   }

   public final com.aspose.slides.internal.i0.a3 j5() {
      return this.x8;
   }

   public final void n5(com.aspose.slides.internal.i0.a3 var1) {
      this.x8 = var1;
   }

   protected final boolean n5(v8 var1) {
      return super.n5(var1)
         && this.u3() == var1.u3()
         && this.c8() == var1.c8()
         && this.t2() == var1.t2()
         && this.s7() == var1.s7()
         && this.x8() == var1.x8()
         && this.n3() == var1.n3()
         && this.y4() == var1.y4()
         && this.e2() == var1.e2()
         && this.t9() == var1.t9()
         && com.aspose.slides.ms.System.j8.n5(this.z8(), var1.z8())
         && com.aspose.slides.ms.System.j8.n5(this.j5(), var1.j5());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((v8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.u3() & 255;
      var1 = var1 * 397 ^ this.c8() & 255;
      var1 = var1 * 397 ^ this.t2() & 255;
      var1 = var1 * 397 ^ this.s7() & 255;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.x8());
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.n3());
      var1 = var1 * 397 ^ c3.n5(this.y4());
      var1 = var1 * 397 ^ this.e2() & 255;
      var1 = var1 * 397 ^ this.t9() & 255;
      var1 = var1 * 397 ^ (this.z8() != null ? this.z8().hashCode() : 0);
      return var1 * 397 ^ (this.j5() != null ? this.j5().hashCode() : 0);
   }
}
