package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z6n extends g4t {
   private long n5 = Long.MIN_VALUE;
   private long l6 = Long.MIN_VALUE;
   private long k5 = Long.MIN_VALUE;
   private long u3 = Long.MIN_VALUE;
   private String a6;
   private String u9;
   private final List<g4t> h0 = new List<>();
   private final List<String> c8 = new List<>();
   private long t2;
   private long s7;
   private long x8;

   public z6n(int var1) {
      super(var1);
   }

   public final void n5(z6n var1) {
      this.n5(var1.k5());
      this.l6(var1.u3());
      this.k5(var1.a6());
      this.u3(var1.u9());
   }

   public final boolean n5() {
      return !com.aspose.slides.ms.System.d1.n5(this.a6) || !com.aspose.slides.ms.System.d1.n5(this.u9);
   }

   public final boolean l6() {
      return this.n5 == Long.MIN_VALUE && this.l6 == Long.MIN_VALUE && this.k5 == Long.MIN_VALUE && this.u3 == Long.MIN_VALUE;
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
      this.a6(this.n5 / 101600L);
   }

   public final long u3() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
      this.u9(this.l6 / 203200L);
   }

   public final long a6() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final long u9() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final long h0() {
      return this.t2;
   }

   public final void a6(long var1) {
      this.t2 = var1;
   }

   public final long c8() {
      return this.s7;
   }

   public final void u9(long var1) {
      this.s7 = var1;
   }

   public final long t2() {
      return this.x8;
   }

   public final void h0(long var1) {
      this.x8 = var1;
   }

   public final String s7() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final String x8() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final List<g4t> n3() {
      return this.h0;
   }

   public final List<String> y4() {
      return this.c8;
   }

   public final void n5(com.aspose.slides.internal.r7c.u3 var1) {
      String var2 = var1.k5();
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (com.aspose.slides.internal.r7c.u3 var4 = d3t.c8.l6(var2); var4.u3(); var4 = var4.u9()) {
         if (var4.a6().n5(1).u3()) {
            var3.n5(var4.a6().n5(2).k5());
         }

         if (var4.a6().n5(3).u3()) {
            this.c8.addItem(var3.toString());
            if (this.t2() < var3.l6()) {
               this.h0(var3.l6());
            }

            var3 = new com.aspose.slides.internal.l7h.a5();
         }
      }

      this.c8.addItem(var3.toString());
      if (this.t2() < var3.l6()) {
         this.h0(var3.l6());
      }
   }
}
