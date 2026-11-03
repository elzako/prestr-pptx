package com.aspose.slides;

class v2o {
   private float n5;
   private int l6;
   private int k5;
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();
   private boolean a6;
   private boolean u9;

   public v2o(int var1, int var2, com.aspose.slides.internal.o9b.w1 var3) {
      this.l6 = var1;
      this.k5 = var2;
      var3.n5(this.u3);
      this.a6 = false;
      this.u9 = false;
   }

   public v2o(int var1, int var2, com.aspose.slides.internal.o9b.w1 var3, boolean var4) {
      this.l6 = var1;
      this.k5 = var2;
      var3.n5(this.u3);
      this.a6 = var4;
      this.u9 = true;
   }

   public v2o(int var1, int var2, com.aspose.slides.internal.o9b.w1 var3, float var4) {
      this.l6 = var1;
      this.k5 = var2;
      var3.n5(this.u3);
      this.a6 = false;
      this.u9 = false;
      this.n5 = var4;
   }

   public v2o(int var1, int var2, com.aspose.slides.internal.o9b.w1 var3, boolean var4, float var5) {
      this.l6 = var1;
      this.k5 = var2;
      var3.n5(this.u3);
      this.a6 = var4;
      this.u9 = true;
      this.n5 = var5;
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return this.u3;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final float u9() {
      return this.n5;
   }
}
