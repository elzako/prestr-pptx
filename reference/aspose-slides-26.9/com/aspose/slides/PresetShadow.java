package com.aspose.slides;

public final class PresetShadow implements IPresetShadow, i4e, q1v, r0g, Cloneable {
   private b8n k5;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new PresetShadow$1(this);
   final f4l l6 = new PresetShadow$2(this);
   private float u3;
   private double a6;
   private ColorFormat u9;
   private int h0 = 0;
   private r0g c8;
   private long t2;
   private u0y s7;
   private IPresentationComponent x8;

   PresetShadow(r0g parentImmediate) {
      this.c8 = parentImmediate;
      this.u9 = new ColorFormat(this, 7);
      this.u9.n5.l6(this.l6);
   }

   @Override
   public final float getDirection() {
      return this.u3;
   }

   @Override
   public final void setDirection(float value) {
      this.u3 = value;
      this.k5();
   }

   @Override
   public final double getDistance() {
      return this.a6;
   }

   @Override
   public final void setDistance(double value) {
      this.a6 = value;
      this.k5();
   }

   @Override
   public final IColorFormat getShadowColor() {
      return this.u9;
   }

   @Override
   public final int getPreset() {
      return this.h0;
   }

   @Override
   public final void setPreset(int value) {
      this.h0 = value;
      this.k5();
   }

   public final IPresetShadowEffectiveData getEffective() {
      return this.n5();
   }

   final u0y n5() {
      if (this.s7 == null) {
         this.s7 = new u0y(this);
      }

      this.s7.n5(u0y.class);
      return this.s7;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.c8;
   }

   final PresetShadow l6() {
      PresetShadow var1 = (PresetShadow)this.memberwiseClone();
      var1.u9 = new ColorFormat(null);
      var1.u9.n5(this.u9);
      var1.u9.n5.l6(new PresetShadow$3(this, var1));
      return var1;
   }

   final void n5(r0g var1) {
      this.c8 = var1;
      this.u9.n5(this);
      this.k5();
   }

   @Override
   public final long getVersion() {
      return (this.t2 & 4294967295L) + (this.u9.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.x8 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.x8};
         d0u.n5(IPresentationComponent.class, this.c8, var1);
         this.x8 = var1[0];
      }

      return this.x8;
   }

   private void k5() {
      this.t2++;
   }

   private void u3() {
      b8n var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   @Override
   public boolean equals(Object obj) {
      PresetShadow var2 = com.aspose.slides.internal.v6g.k5.n5(obj, PresetShadow.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3)
               && com.aspose.slides.internal.n8e.v4.n5(this.a6, var2.a6)
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.h0), (float)(var2.h0))
               && com.aspose.slides.internal.n8e.v4.n5(this.u9, var2.u9);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         PresetShadow var1 = (PresetShadow)super.clone();
         if (this.u9 != null) {
            var1.u9.n5(this.u9);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(PresetShadow var0, b8n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static void n5(PresetShadow var0) {
      var0.u3();
   }
}
