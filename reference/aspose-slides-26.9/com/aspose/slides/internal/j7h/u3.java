package com.aspose.slides.internal.j7h;

import com.aspose.slides.internal.b3z.t2;
import com.aspose.slides.internal.b3z.u9;
import com.aspose.slides.internal.d0e.a6;

public abstract class u3 extends a6 {
   private int c8;
   private String t2;

   public final u9 a0() {
      return com.aspose.slides.internal.b3z.u9.n5(this.l6.k5("x"));
   }

   public final void l6(u9 var1) {
      this.l6.l6("x", var1.toString());
   }

   public final u9 d2() {
      return com.aspose.slides.internal.b3z.u9.n5(this.l6.k5("dx"));
   }

   public final u9 d5() {
      return com.aspose.slides.internal.b3z.u9.n5(this.l6.k5("y"));
   }

   public final void k5(u9 var1) {
      this.l6.l6("y", var1.toString());
   }

   public final u9 s3() {
      return com.aspose.slides.internal.b3z.u9.n5(this.l6.k5("dy"));
   }

   public final t2 p8() {
      return com.aspose.slides.internal.b3z.t2.n5(this.l6.k5("rotate"));
   }

   public final void n5(boolean var1) {
      this.l6.l6("xml:space", var1 ? "preserve" : null);
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("textLength", var1.toString());
   }

   public final void s7(String var1) {
      this.l6.l6("font-family", var1);
   }

   public final int f2() {
      return com.aspose.slides.internal.f7k.a6.n5(this.l6.k5("font-weight"));
   }

   public final void h0(int var1) {
      this.l6.l6("font-weight", com.aspose.slides.internal.f7k.a6.n5(var1));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("font-size", var1.toString());
   }

   public final int i1() {
      return com.aspose.slides.internal.f7k.u3.n5(this.l6.k5("font-style"));
   }

   public final void c8(int var1) {
      this.l6.l6("font-style", com.aspose.slides.internal.f7k.u3.n5(var1));
   }

   public final void t2(int var1) {
      this.l6.l6("font-stretch", com.aspose.slides.internal.f7k.k5.n5(var1));
   }

   public final void s7(int var1) {
      this.l6.l6("text-decoration", com.aspose.slides.internal.a3s.u9.n5(var1));
   }

   public final int e5() {
      return this.c8;
   }

   public final void x8(int var1) {
      this.c8 = var1;
   }

   public final String b3() {
      return this.t2;
   }

   public final void x8(String var1) {
      this.t2 = var1;
   }

   public u3() {
      this.x8(0);
      this.x8(null);
   }
}
