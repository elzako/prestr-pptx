package com.aspose.slides.internal.k0r;

public class m3 extends e6r {
   private int n5;
   private d2 l6 = new d2();
   private com.aspose.slides.internal.o9b.j5 k5 = new com.aspose.slides.internal.o9b.j5();

   public m3() {
      this.w1().n5(12001);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6.n5(var1);
      int var2 = var1.m3();
      int var3 = var1.m3();
      this.k5 = new com.aspose.slides.internal.o9b.j5(var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6.n5(var1);
      var1.l6(this.k5.n5());
      var1.l6(this.k5.l6());
   }

   @Override
   public int n5() {
      return 28;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.ms.System.j5 l6() {
      return this.l6.n5();
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      this.l6.n5(var1.m3());
   }

   public final com.aspose.slides.internal.o9b.j5 k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.o9b.j5 var1) {
      var1.k5(this.k5);
   }
}
