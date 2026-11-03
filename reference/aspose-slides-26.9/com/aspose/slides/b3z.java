package com.aspose.slides;

final class b3z {
   private Blur n5;
   private FillOverlay l6;
   private Glow k5;
   private InnerShadow u3;
   private OuterShadow a6;
   private PresetShadow u9;
   private Reflection h0;
   private SoftEdge c8;
   private boolean t2;
   private r0g s7;
   private long x8;

   b3z(r0g var1) {
      this.s7 = var1;
      this.t2 = false;
   }

   public final boolean n5() {
      return this.e2();
   }

   public final IBlur l6() {
      return this.n5;
   }

   public final void n5(IBlur var1) {
      if (var1 == null && this.n5 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.n5.getVersion() & 4294967295L) & 4294967295L;
      }

      this.n5 = (Blur)var1;
      this.t9();
   }

   public final IFillOverlay k5() {
      return this.l6;
   }

   public final void n5(IFillOverlay var1) {
      if (var1 == null && this.l6 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L;
      }

      this.l6 = (FillOverlay)var1;
      this.t9();
   }

   public final IGlow u3() {
      return this.k5;
   }

   public final void n5(IGlow var1) {
      if (var1 == null && this.k5 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L;
      }

      this.k5 = (Glow)var1;
      this.t9();
   }

   public final IInnerShadow a6() {
      return this.u3;
   }

   public final void n5(IInnerShadow var1) {
      if (var1 == null && this.u3 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L;
      }

      this.u3 = (InnerShadow)var1;
      this.t9();
   }

   public final IOuterShadow u9() {
      return this.a6;
   }

   public final void n5(IOuterShadow var1) {
      if (var1 == null && this.a6 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.a6.getVersion() & 4294967295L) & 4294967295L;
      }

      this.a6 = (OuterShadow)var1;
      this.t9();
   }

   public final IPresetShadow h0() {
      return this.u9;
   }

   public final void n5(IPresetShadow var1) {
      if (var1 == null && this.u9 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.u9.getVersion() & 4294967295L) & 4294967295L;
      }

      this.u9 = (PresetShadow)var1;
      this.t9();
   }

   public final IReflection c8() {
      return this.h0;
   }

   public final void n5(IReflection var1) {
      if (var1 == null && this.h0 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.h0.getVersion() & 4294967295L) & 4294967295L;
      }

      this.h0 = (Reflection)var1;
      this.t9();
   }

   public final ISoftEdge t2() {
      return this.c8;
   }

   public final void n5(ISoftEdge var1) {
      if (var1 == null && this.c8 != null) {
         this.x8 = (this.x8 & 4294967295L) + (this.c8.getVersion() & 4294967295L) & 4294967295L;
      }

      this.c8 = (SoftEdge)var1;
      this.t9();
   }

   public final boolean s7() {
      return !this.n5() || this.t2;
   }

   public final void n5(double var1, boolean var3) {
      this.n5.setRadius(var1);
      this.n5.setGrow(var3);
   }

   final void x8() {
      this.x8 = this.y4();
      this.t9();
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = false;
   }

   final void n5(EffectFormat var1) {
      this.x8 = this.y4();
      this.t9();
      if (var1.getBlurEffect() != null) {
         if (this.n5 == null) {
            this.n5 = new Blur(this.s7);
         }

         this.n5.setRadius(var1.getBlurEffect().getRadius());
         this.n5.setGrow(var1.getBlurEffect().getGrow());
      } else {
         this.n5 = null;
      }

      if (var1.getFillOverlayEffect() != null) {
         if (this.l6 == null) {
            this.l6 = new FillOverlay(this.s7);
         }

         this.l6.setBlend(var1.getFillOverlayEffect().getBlend());
         ((FillFormat)this.l6.getFillFormat()).n5(var1.getFillOverlayEffect().getFillFormat());
      } else {
         this.l6 = null;
      }

      if (var1.getGlowEffect() != null) {
         if (this.k5 == null) {
            this.k5 = new Glow(this.s7);
         }

         this.k5.setRadius(var1.getGlowEffect().getRadius());
         ((ColorFormat)this.k5.getColor()).n5((ColorFormat)var1.getGlowEffect().getColor());
      } else {
         this.k5 = null;
      }

      if (var1.getInnerShadowEffect() != null) {
         if (this.u3 == null) {
            this.u3 = new InnerShadow(this.s7);
         }

         this.u3.setBlurRadius(var1.getInnerShadowEffect().getBlurRadius());
         this.u3.setDirection(var1.getInnerShadowEffect().getDirection());
         this.u3.setDistance(var1.getInnerShadowEffect().getDistance());
         ((ColorFormat)this.u3.getShadowColor()).n5((ColorFormat)var1.getInnerShadowEffect().getShadowColor());
      } else {
         this.u3 = null;
      }

      if (var1.getOuterShadowEffect() != null) {
         if (this.a6 == null) {
            this.a6 = new OuterShadow(this.s7);
         }

         this.a6.setBlurRadius(var1.getOuterShadowEffect().getBlurRadius());
         this.a6.setDirection(var1.getOuterShadowEffect().getDirection());
         this.a6.setDistance(var1.getOuterShadowEffect().getDistance());
         this.a6.setRectangleAlign(var1.getOuterShadowEffect().getRectangleAlign());
         this.a6.setRotateShadowWithShape(var1.getOuterShadowEffect().getRotateShadowWithShape());
         this.a6.setScaleHorizontal(var1.getOuterShadowEffect().getScaleHorizontal());
         this.a6.setScaleVertical(var1.getOuterShadowEffect().getScaleVertical());
         ((ColorFormat)this.a6.getShadowColor()).n5((ColorFormat)var1.getOuterShadowEffect().getShadowColor());
         this.a6.setSkewHorizontal(var1.getOuterShadowEffect().getSkewHorizontal());
         this.a6.setSkewVertical(var1.getOuterShadowEffect().getSkewVertical());
      } else {
         this.a6 = null;
      }

      if (var1.getPresetShadowEffect() != null) {
         if (this.u9 == null) {
            this.u9 = new PresetShadow(this.s7);
         }

         this.u9.setDirection(var1.getPresetShadowEffect().getDirection());
         this.u9.setDistance(var1.getPresetShadowEffect().getDistance());
         this.u9.setPreset(var1.getPresetShadowEffect().getPreset());
         ((ColorFormat)this.u9.getShadowColor()).n5((ColorFormat)var1.getPresetShadowEffect().getShadowColor());
      } else {
         this.u9 = null;
      }

      if (var1.getReflectionEffect() != null) {
         if (this.h0 == null) {
            this.h0 = new Reflection(this.s7);
         }

         this.h0.setBlurRadius(var1.getReflectionEffect().getBlurRadius());
         this.h0.setDirection(var1.getReflectionEffect().getDirection());
         this.h0.setDistance(var1.getReflectionEffect().getDistance());
         this.h0.setEndPosAlpha(var1.getReflectionEffect().getEndPosAlpha());
         this.h0.setEndReflectionOpacity(var1.getReflectionEffect().getEndReflectionOpacity());
         this.h0.setFadeDirection(var1.getReflectionEffect().getFadeDirection());
         this.h0.setRectangleAlign(var1.getReflectionEffect().getRectangleAlign());
         this.h0.setRotateShadowWithShape(var1.getReflectionEffect().getRotateShadowWithShape());
         this.h0.setScaleHorizontal(var1.getReflectionEffect().getScaleHorizontal());
         this.h0.setScaleVertical(var1.getReflectionEffect().getScaleVertical());
         this.h0.setSkewHorizontal(var1.getReflectionEffect().getSkewHorizontal());
         this.h0.setSkewVertical(var1.getReflectionEffect().getSkewVertical());
         this.h0.setStartPosAlpha(var1.getReflectionEffect().getStartPosAlpha());
         this.h0.setStartReflectionOpacity(var1.getReflectionEffect().getStartReflectionOpacity());
      } else {
         this.h0 = null;
      }

      if (var1.getSoftEdgeEffect() != null) {
         if (this.c8 == null) {
            this.c8 = new SoftEdge(this.s7);
         }

         this.c8.setRadius(var1.getSoftEdgeEffect().getRadius());
      } else {
         this.c8 = null;
      }

      if (!var1.u3()) {
         this.t2 = false;
      } else if (var1.isNoEffects()) {
         this.t2 = true;
      }
   }

   final void n5(IEffectFormatEffectiveData var1) {
      if (var1.getBlurEffect() != null) {
         if (this.n5 == null) {
            this.n5 = new Blur(this.s7);
         }

         this.n5.setRadius(var1.getBlurEffect().getRadius());
         this.n5.setGrow(var1.getBlurEffect().getGrow());
      } else {
         this.n5 = null;
      }

      if (var1.getFillOverlayEffect() != null) {
         if (this.l6 == null) {
            this.l6 = new FillOverlay(this.s7);
         }

         this.l6.setBlend(var1.getFillOverlayEffect().getBlend());
         ((FillFormat)this.l6.getFillFormat()).n5(var1.getFillOverlayEffect().getFillFormat());
      } else {
         this.l6 = null;
      }

      if (var1.getGlowEffect() != null) {
         if (this.k5 == null) {
            this.k5 = new Glow(this.s7);
         }

         this.k5.setRadius(var1.getGlowEffect().getRadius());
         ((ColorFormat)this.k5.getColor()).l6(((b4h)var1.getGlowEffect()).l6().o8());
      } else {
         this.k5 = null;
      }

      if (var1.getInnerShadowEffect() != null) {
         if (this.u3 == null) {
            this.u3 = new InnerShadow(this.s7);
         }

         this.u3.setBlurRadius(var1.getInnerShadowEffect().getBlurRadius());
         this.u3.setDirection(var1.getInnerShadowEffect().getDirection());
         this.u3.setDistance(var1.getInnerShadowEffect().getDistance());
         ((ColorFormat)this.u3.getShadowColor()).l6(((d8f)var1.getInnerShadowEffect()).l6().o8());
      } else {
         this.u3 = null;
      }

      if (var1.getOuterShadowEffect() != null) {
         if (this.a6 == null) {
            this.a6 = new OuterShadow(this.s7);
         }

         this.a6.setBlurRadius(var1.getOuterShadowEffect().getBlurRadius());
         this.a6.setDirection(var1.getOuterShadowEffect().getDirection());
         this.a6.setDistance(var1.getOuterShadowEffect().getDistance());
         this.a6.setRectangleAlign(var1.getOuterShadowEffect().getRectangleAlign());
         this.a6.setRotateShadowWithShape(var1.getOuterShadowEffect().getRotateShadowWithShape());
         this.a6.setScaleHorizontal(var1.getOuterShadowEffect().getScaleHorizontal());
         this.a6.setScaleVertical(var1.getOuterShadowEffect().getScaleVertical());
         ((ColorFormat)this.a6.getShadowColor()).l6(((k0p)var1.getOuterShadowEffect()).l6().o8());
         this.a6.setSkewHorizontal(var1.getOuterShadowEffect().getSkewHorizontal());
         this.a6.setSkewVertical(var1.getOuterShadowEffect().getSkewVertical());
      } else {
         this.a6 = null;
      }

      if (var1.getPresetShadowEffect() != null) {
         if (this.u9 == null) {
            this.u9 = new PresetShadow(this.s7);
         }

         this.u9.setDirection(var1.getPresetShadowEffect().getDirection());
         this.u9.setDistance(var1.getPresetShadowEffect().getDistance());
         this.u9.setPreset(var1.getPresetShadowEffect().getPreset());
         ((ColorFormat)this.u9.getShadowColor()).l6(((u0y)var1.getPresetShadowEffect()).l6().o8());
      } else {
         this.u9 = null;
      }

      if (var1.getReflectionEffect() != null) {
         if (this.h0 == null) {
            this.h0 = new Reflection(this.s7);
         }

         this.h0.setBlurRadius(var1.getReflectionEffect().getBlurRadius());
         this.h0.setDirection(var1.getReflectionEffect().getDirection());
         this.h0.setDistance(var1.getReflectionEffect().getDistance());
         this.h0.setEndPosAlpha(var1.getReflectionEffect().getEndPosAlpha());
         this.h0.setEndReflectionOpacity(var1.getReflectionEffect().getEndReflectionOpacity());
         this.h0.setFadeDirection(var1.getReflectionEffect().getFadeDirection());
         this.h0.setRectangleAlign(var1.getReflectionEffect().getRectangleAlign());
         this.h0.setRotateShadowWithShape(var1.getReflectionEffect().getRotateShadowWithShape());
         this.h0.setScaleHorizontal(var1.getReflectionEffect().getScaleHorizontal());
         this.h0.setScaleVertical(var1.getReflectionEffect().getScaleVertical());
         this.h0.setSkewHorizontal(var1.getReflectionEffect().getSkewHorizontal());
         this.h0.setSkewVertical(var1.getReflectionEffect().getSkewVertical());
         this.h0.setStartPosAlpha(var1.getReflectionEffect().getStartPosAlpha());
         this.h0.setStartReflectionOpacity(var1.getReflectionEffect().getStartReflectionOpacity());
      } else {
         this.h0 = null;
      }

      if (var1.getSoftEdgeEffect() != null) {
         if (this.c8 == null) {
            this.c8 = new SoftEdge(this.s7);
         }

         this.c8.setRadius(var1.getSoftEdgeEffect().getRadius());
      } else {
         this.c8 = null;
      }

      this.t9();
   }

   final void n3() {
      this.n5(true);
   }

   final long y4() {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (this.x8 & 4294967295L) + ((this.n5 != null ? this.n5.getVersion() : 0L) & 4294967295L)
                                                                        & 4294967295L
                                                                  )
                                                                  + ((this.l6 != null ? this.l6.getVersion() : 0L) & 4294967295L)
                                                               & 4294967295L
                                                         )
                                                         + ((this.k5 != null ? this.k5.getVersion() : 0L) & 4294967295L)
                                                      & 4294967295L
                                                )
                                                + ((this.u3 != null ? this.u3.getVersion() : 0L) & 4294967295L)
                                             & 4294967295L
                                       )
                                       + ((this.a6 != null ? this.a6.getVersion() : 0L) & 4294967295L)
                                    & 4294967295L
                              )
                              + ((this.u9 != null ? this.u9.getVersion() : 0L) & 4294967295L)
                           & 4294967295L
                     )
                     + ((this.h0 != null ? this.h0.getVersion() : 0L) & 4294967295L)
                  & 4294967295L
            )
            + ((this.c8 != null ? this.c8.getVersion() : 0L) & 4294967295L)
         & 4294967295L;
   }

   private void t9() {
      this.x8++;
   }

   final boolean e2() {
      return this.n5 == null
         && this.l6 == null
         && this.k5 == null
         && this.u3 == null
         && this.a6 == null
         && this.u9 == null
         && this.h0 == null
         && this.c8 == null;
   }

   @Override
   public boolean equals(Object obj) {
      IEffectFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, IEffectFormat.class);
      return var2 == null
         ? super.equals(obj)
         : (this.n5 == null && var2.getBlurEffect() == null || this.n5 != null && this.n5.equals(var2.getBlurEffect()))
            && (this.l6 == null && var2.getFillOverlayEffect() == null || this.l6 != null && this.l6.equals(var2.getFillOverlayEffect()))
            && (this.k5 == null && var2.getGlowEffect() == null || this.k5 != null && this.k5.equals(var2.getGlowEffect()))
            && (this.u3 == null && var2.getInnerShadowEffect() == null || this.u3 != null && this.u3.equals(var2.getInnerShadowEffect()))
            && (this.a6 == null && var2.getOuterShadowEffect() == null || this.a6 != null && this.a6.equals(var2.getOuterShadowEffect()))
            && (this.u9 == null && var2.getPresetShadowEffect() == null || this.u9 != null && this.u9.equals(var2.getPresetShadowEffect()))
            && (this.h0 == null && var2.getReflectionEffect() == null || this.h0 != null && this.h0.equals(var2.getReflectionEffect()))
            && (this.c8 == null && var2.getSoftEdgeEffect() == null || this.c8 != null && this.c8.equals(var2.getSoftEdgeEffect()));
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   private void n5(boolean var1) {
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = var1;
      this.t9();
   }
}
