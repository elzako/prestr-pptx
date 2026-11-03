package com.aspose.slides.internal.h0;

class a6$n5 {
   private String n5;
   private int l6;
   private a6$n5 k5;
   private int u3;
   private int a6;
   private a6 u9;
   private a6 h0;

   public a6$n5(String var1, int var2, a6 var3) {
      this.n5 = var1;
      this.a6 = var2;
      this.u3 = var2;
      this.l6 = var2;
      this.u9 = var3;
      this.h0 = var3;
   }

   public final a6 n5() {
      return this.h0;
   }

   public final String l6() {
      return this.n5;
   }

   public final int k5() {
      return this.k5 != null ? this.k5.k5() : this.l6;
   }

   public final int u3() {
      return this.u3;
   }

   public final int a6() {
      return this.a6;
   }

   private int n5(int var1, int var2) {
      long var3 = (long)var1 + var2;
      if (var3 < -2147483648L) {
         return Integer.MIN_VALUE;
      } else {
         return var3 > 2147483647L ? Integer.MAX_VALUE : (int)var3;
      }
   }

   public final void n5(int var1, String var2) {
      if (this.k5 != null) {
         this.k5.l6 = this.n5(var1, this.k5.l6);
      }

      this.l6 = this.n5(var1, this.l6);
      if (var2 == null || "before".equals(var2)) {
         this.u3 = this.n5(var1, this.u3);
         this.a6 = this.n5(var1, this.a6);
      } else if ("after".equals(var2)) {
         this.a6 = this.n5(var1, this.a6);
      }
   }

   public final void l6(int var1, String var2) {
      this.k5 = null;
      this.h0 = this.u9;
      if (var2 == null || "before".equals(var2)) {
         this.l6 = var1;
         this.u3 = var1;
         this.a6 = var1;
      } else if ("after".equals(var2)) {
         this.a6 = var1;
      }
   }

   public final a6$n5 n5(a6 var1) {
      a6$n5 var2 = new a6$n5(this.n5, this.l6, var1);
      var2.k5 = this;
      var2.h0 = this.h0;
      return var2;
   }
}
