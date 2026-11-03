package com.aspose.slides.internal.k0r;

public class c4 extends r4 implements m4 {
   private c0 n5;
   private long l6;

   public final c0 l6() {
      return this.n5;
   }

   @Override
   public final long c8() {
      return this.l6;
   }

   @Override
   public final void n5(long var1) {
      this.l6 = var1;
   }

   c4() {
      this.w1().n5(12052);
   }

   public c4(String var1) {
      this.w1().n5(12052);
      this.w1().n5((short)0);
      this.w1().n5((byte)15);
      this.n5 = new c0(var1);
   }

   public static c4 n5(com.aspose.slides.internal.z0k.t4 var0) {
      return (c4)p5k.n5(new com.aspose.slides.internal.z0k.n5(var0), null);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = c0.n5(var1.x8());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
   }

   @Override
   public int n5() {
      return this.n5.l6();
   }
}
