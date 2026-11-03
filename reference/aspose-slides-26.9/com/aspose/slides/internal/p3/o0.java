package com.aspose.slides.internal.p3;

import com.aspose.slides.ms.System.q1;

public class o0 extends i1 {
   public static final o0 n5 = new o0(0, 0, false, null, true);
   private int l6;
   private final boolean k5;
   private int u3 = -1;

   public o0(int var1, int var2, boolean var3, j8 var4, boolean var5) {
      super(var1, var4, var5);
      this.l6 = var2;
      this.k5 = var3;
   }

   public o0(int var1, int var2, boolean var3, int var4, j8 var5, boolean var6) {
      this(var1, var2, var3, var5, var6);
      this.u3 = var4;
   }

   private static String k5(int var0) {
      return com.aspose.slides.internal.p3.l6.n5(var0);
   }

   public static String n5(int var0) {
      String var1 = var0 < 0 ? "-" : com.aspose.slides.ms.System.d1.n5;
      int var2 = q1.n5(var0);
      return com.aspose.slides.ms.System.d1.n5(var1, var2 == 1000 ? "INFINITE" : com.aspose.slides.ms.System.a3.l6(var2));
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public int t4() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final boolean h0() {
      return this.k5;
   }

   @Override
   public boolean c8() {
      return this.l6 == -1000;
   }

   public final int t2() {
      return this.u3;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(64);
      if (this.t9()) {
         var1.n5("aux. ");
      }

      var1.n5("penalty");
      var1.n5(" p=");
      var1.n5(n5(this.l6));
      if (this.k5) {
         var1.n5(" [flagged]");
      }

      var1.n5(" w=");
      var1.k5(this.z1());
      if (this.c8()) {
         var1.n5(" (forced break, ").n5(k5(this.u3)).n5(")");
      } else if (this.l6 >= 0 && this.u3 != -1) {
         var1.n5(" (keep constraint, ").n5(k5(this.u3)).n5(")");
      }

      return var1.toString();
   }
}
