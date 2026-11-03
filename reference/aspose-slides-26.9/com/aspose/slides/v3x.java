package com.aspose.slides;

class v3x implements r0g {
   private byte n5 = 0;
   private EffectFormat l6;
   private ColorFormat k5;
   private long u3;
   private r0g a6;
   private long u9;

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
      this.a6();
   }

   public final IEffectFormat l6() {
      return this.l6;
   }

   public final IColorFormat k5() {
      return this.k5;
   }

   public final long u3() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
      this.a6();
   }

   v3x(r0g var1) {
      this.a6 = var1;
      this.l6 = new EffectFormat(this);
      this.k5 = new ColorFormat(this);
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   private void a6() {
      this.u9++;
   }
}
