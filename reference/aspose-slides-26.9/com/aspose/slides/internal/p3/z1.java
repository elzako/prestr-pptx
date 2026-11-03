package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class z1 extends d1 {
   private int n5;
   private int l6;
   private int k5 = -1;
   private List<s4> u3;
   private List<s4> a6;

   public z1(j8 var1, int var2, t1 var3) {
      this(var1, var2, -1, var3);
   }

   public z1(j8 var1, int var2, int var3, t1 var4) {
      this(var1, 0, var2, var3, var4);
   }

   public z1(j8 var1, int var2, int var3, int var4, t1 var5) {
      super(var1);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5.t4();
      this.a6 = var5.t9();
   }

   private static String k5(int var0) {
      return com.aspose.slides.internal.p3.l6.n5(var0);
   }

   @Override
   public boolean a6() {
      return false;
   }

   public final int u9() {
      return this.n5;
   }

   public final int h0() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public boolean c8() {
      return this.l6 == -1000;
   }

   public final int t2() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final List<s4> s7() {
      return this.u3;
   }

   public final List<s4> x8() {
      return this.a6;
   }

   public final void n3() {
      this.u3 = null;
      this.a6 = null;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(64);
      var1.n5("BreakPossibility[p:");
      var1.n5(o0.n5(this.l6));
      if (this.c8()) {
         var1.n5(" (forced break, ").n5(k5(this.k5)).n5(")");
      } else if (this.l6 >= 0 && this.k5 != -1) {
         var1.n5(" (keep constraint, ").n5(k5(this.k5)).n5(")");
      }

      var1.n5("; w:");
      var1.k5(this.n5);
      var1.n5("]");
      return var1.toString();
   }
}
