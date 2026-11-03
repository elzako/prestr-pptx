package com.aspose.slides.internal.p3;

public class e5 extends i1 {
   private int n5;
   private int l6;
   private u9 k5;

   public e5(com.aspose.slides.internal.v8.u9 var1, j8 var2, boolean var3) {
      super(var1.l6(), var2, var3);
      this.n5 = var1.a6();
      this.l6 = var1.u3();
      this.k5 = u9.n5;
   }

   public e5(int var1, int var2, int var3, j8 var4, boolean var5) {
      super(var1, var4, var5);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = u9.n5;
   }

   public e5(int var1, int var2, int var3, u9 var4, j8 var5, boolean var6) {
      super(var1, var5, var6);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public int q0() {
      return this.n5;
   }

   @Override
   public int z3() {
      return this.l6;
   }

   public final u9 u9() {
      return this.k5;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(64);
      if (this.t9()) {
         var1.n5("aux. ");
      }

      var1.n5("glue");
      var1.n5(" w=").k5(this.z1());
      var1.n5(" stretch=").k5(this.q0());
      var1.n5(" shrink=").k5(this.z3());
      if (!this.u9().equals(u9.n5)) {
         var1.n5(" adj-class=").n5(this.u9());
      }

      return var1.toString();
   }
}
