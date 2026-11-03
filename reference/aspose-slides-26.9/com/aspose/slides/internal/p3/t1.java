package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

public class t1 {
   private int n5;
   private com.aspose.slides.internal.v8.u9 l6;
   private int k5 = 0;
   private int u3 = 0;
   private int a6;
   private com.aspose.slides.internal.v8.n3 u9 = com.aspose.slides.internal.v8.n3.n5;
   private i9 h0;
   private i9 c8;
   private List<s4> t2;
   private List<s4> s7;
   private com.aspose.slides.internal.x9.q0 x8 = null;
   private int n3 = 135;
   private double y4 = 0.0;
   private double e2 = 0.0;
   private com.aspose.slides.internal.x9.k5 t9 = null;
   private int z1 = 0;
   private int t4 = 0;
   private int q0 = 0;
   private int z3 = 0;
   private int m1;
   private int k7;
   private s3 m3 = s3.n5;
   private s3 z8 = s3.n5;
   private int j5;
   private com.aspose.slides.internal.v8.u9 w1 = com.aspose.slides.internal.v8.u9.n5;

   public t1(t1 var1) {
      this.n5 = var1.n5;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.n5(var1.q0());
      this.c8 = var1.c8;
      this.h0 = var1.h0;
      this.x8 = var1.x8;
      this.n3 = var1.n3;
      this.e2 = var1.e2;
      this.y4 = var1.y4;
      this.t9 = var1.t9;
      this.q0 = var1.q0;
      this.z3 = var1.z3;
      this.n5(var1);
      this.m3 = var1.m3;
      this.z8 = var1.z8;
      this.j5 = var1.j5;
   }

   public t1(int var1) {
      this.n5 = var1;
      this.a6 = 0;
      this.l6 = com.aspose.slides.internal.v8.u9.n5;
      this.c8 = null;
      this.h0 = null;
   }

   public final void n5(t1 var1) {
      if (var1.t2 != null) {
         this.t2 = new List<>(var1.t2);
      }

      if (var1.s7 != null) {
         this.s7 = new List<>(var1.s7);
      }
   }

   public final void n5(int var1) {
      this.n5(var1, true);
   }

   public final void n5(int var1, boolean var2) {
      if (var2) {
         this.n5 |= var1;
      } else {
         this.n5 &= ~var1;
      }
   }

   public final boolean n5() {
      return (this.n5 & 2) != 0 && this.c8 != null;
   }

   public final boolean l6() {
      return (this.n5 & 32) != 0;
   }

   public final boolean k5() {
      return (this.n5 & 128) != 0;
   }

   public final boolean u3() {
      return (this.n5 & 16) != 0;
   }

   public final s3 a6() {
      return this.m3;
   }

   public final s3 u9() {
      return this.z8;
   }

   public final void h0() {
      this.m3 = s3.n5;
   }

   public final void c8() {
      this.z8 = s3.n5;
   }

   public final void t2() {
      this.c8();
      this.h0();
   }

   public final void n5(s3 var1) {
      this.m3 = this.m3.n5(var1);
   }

   public final void l6(s3 var1) {
      this.z8 = this.z8.n5(var1);
   }

   public final boolean s7() {
      return !this.a6().n5();
   }

   public final boolean x8() {
      return !this.u9().n5();
   }

   public final void n5(i9 var1) {
      this.c8 = var1;
   }

   public final i9 n3() {
      return this.c8;
   }

   public final boolean y4() {
      return (this.n5 & 256) != 0;
   }

   public final void l6(i9 var1) {
      this.h0 = var1;
   }

   public final i9 e2() {
      return this.h0;
   }

   public final void n5(s4 var1) {
      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      this.t2.addItem(var1);
   }

   public final List<s4> t9() {
      return this.t2 != null ? this.t2 : null;
   }

   public final void z1() {
      this.s7 = null;
      this.t2 = null;
   }

   public final void l6(s4 var1) {
      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      this.s7.addItem(var1);
   }

   public final List<s4> t4() {
      return this.s7 != null ? this.s7 : null;
   }

   public final void n5(com.aspose.slides.internal.v8.u9 var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.v8.u9 q0() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final int z3() {
      return this.a6;
   }

   public final boolean m1() {
      return (this.n5 & 64) != 0;
   }

   public final void k5(int var1) {
      this.n3 = var1;
   }

   public final int k7() {
      return this.n3;
   }

   public final void n5(double var1) {
      this.e2 = var1;
   }

   public final double m3() {
      return this.e2;
   }

   public final void l6(double var1) {
      this.y4 = var1;
   }

   public final double z8() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.x9.k5 var1) {
      this.t9 = var1;
   }

   public final com.aspose.slides.internal.x9.k5 j5() {
      return this.t9;
   }

   public final int w1() {
      return this.q0;
   }

   public final void u3(int var1) {
      this.q0 = var1;
   }

   public final int r4() {
      return this.z3;
   }

   public final void a6(int var1) {
      this.z3 = var1;
   }

   public final int c4() {
      return this.u3;
   }

   public final int y2() {
      return this.k5 == 0 ? 95 : this.k5;
   }

   public final void u9(int var1) {
      switch (var1) {
         case 0:
         case 5:
         case 95:
            this.k5 = this.u3;
            this.u3 = var1;
            return;
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Illegal value on signalSpanChange() for span: ", com.aspose.slides.ms.System.a3.l6(var1)})
            );
      }
   }

   public final com.aspose.slides.internal.v8.n3 y1() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.v8.n3 var1) {
      this.u9 = var1;
   }

   public final int a0() {
      return this.z1;
   }

   public final void h0(int var1) {
      this.z1 = var1;
   }

   public final int d2() {
      return this.t4;
   }

   public final void c8(int var1) {
      this.t4 = var1;
   }

   public final int d5() {
      return this.m1;
   }

   public final void t2(int var1) {
      this.m1 = var1;
   }

   public final int s3() {
      return this.k7;
   }

   public final void s7(int var1) {
      this.k7 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         "Layout Context:",
         "\nStack Limit BPD: \t",
         this.q0() == null ? "null" : this.q0().toString(),
         "\nTrailing Space: \t",
         this.e2() == null ? "null" : this.e2().toString(),
         "\nLeading Space: \t",
         this.n3() == null ? "null" : this.n3().toString(),
         "\nReference IPD: \t",
         com.aspose.slides.ms.System.a3.l6(this.z3()),
         "\nSpace Adjust: \t",
         com.aspose.slides.ms.System.d2.u9(this.m3()),
         "\nIPD Adjust: \t",
         com.aspose.slides.ms.System.d2.u9(this.z8()),
         "\nResolve Leading Space: \t",
         this.y4(),
         "\nSuppress Break Before: \t",
         this.u3(),
         "\nIs First Area: \t",
         this.l6(),
         "\nStarts New Area: \t",
         this.n5(),
         "\nIs Last Area: \t",
         this.k5(),
         "\nTry Hyphenate: \t",
         this.m1(),
         "\nKeeps: \t[keep-with-next=",
         this.a6(),
         "][keep-with-previous=",
         this.u9(),
         "] pending",
         "\nBreaks: \tforced [",
         this.m1 != 9 ? "break-before" : com.aspose.slides.ms.System.d1.n5,
         "][",
         this.k7 != 9 ? "break-after" : com.aspose.slides.ms.System.d1.n5,
         "]"
      });
   }

   public final int p8() {
      return this.j5;
   }

   public final void x8(int var1) {
      this.j5 = var1;
   }

   public final com.aspose.slides.internal.v8.u9 f2() {
      return this.w1;
   }

   public final void l6(com.aspose.slides.internal.v8.u9 var1) {
      this.w1 = var1;
   }
}
