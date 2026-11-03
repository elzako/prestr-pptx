package com.aspose.slides;

public final class EffectFormat extends PVIObject implements IEffectFormat {
   private f5n k5;
   final com.aspose.slides.internal.v6g.n5<f5n> n5 = new EffectFormat$1(this);
   static final com.aspose.slides.internal.f3.a6<EffectFormat, d0e, d0e> l6 = new EffectFormat$19();
   private d0e u3;

   EffectFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   Object M_() {
      return new b3z(this.getParent_Immediate());
   }

   final b3z l6() {
      return (b3z)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().y4();
   }

   @Override
   public final boolean isNoEffects() {
      return !this.z3() || this.l6().n5();
   }

   @Override
   public final IBlur getBlurEffect() {
      return this.z3() ? this.l6().l6() : null;
   }

   @Override
   public final void setBlurEffect(IBlur value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         Blur var2 = (Blur)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = (Blur)((ImageTransformOperation)value).k5();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$12(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IFillOverlay getFillOverlayEffect() {
      return this.z3() ? this.l6().k5() : null;
   }

   @Override
   public final void setFillOverlayEffect(IFillOverlay value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         FillOverlay var2 = (FillOverlay)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = (FillOverlay)((ImageTransformOperation)value).k5();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$20(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IGlow getGlowEffect() {
      return this.z3() ? this.l6().u3() : null;
   }

   @Override
   public final void setGlowEffect(IGlow value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         Glow var2 = (Glow)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((Glow)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$21(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IInnerShadow getInnerShadowEffect() {
      return this.z3() ? this.l6().a6() : null;
   }

   @Override
   public final void setInnerShadowEffect(IInnerShadow value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         InnerShadow var2 = (InnerShadow)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((InnerShadow)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$22(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IOuterShadow getOuterShadowEffect() {
      return this.z3() ? this.l6().u9() : null;
   }

   @Override
   public final void setOuterShadowEffect(IOuterShadow value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         OuterShadow var2 = (OuterShadow)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((OuterShadow)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$23(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IPresetShadow getPresetShadowEffect() {
      return this.z3() ? this.l6().h0() : null;
   }

   @Override
   public final void setPresetShadowEffect(IPresetShadow value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         PresetShadow var2 = (PresetShadow)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((PresetShadow)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$24(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final IReflection getReflectionEffect() {
      return this.z3() ? this.l6().c8() : null;
   }

   @Override
   public final void setReflectionEffect(IReflection value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         Reflection var2 = (Reflection)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((Reflection)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$25(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final ISoftEdge getSoftEdgeEffect() {
      return this.z3() ? this.l6().t2() : null;
   }

   @Override
   public final void setSoftEdgeEffect(ISoftEdge value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         SoftEdge var2 = (SoftEdge)value;
         if (value != null) {
            if (((r0g)value).getParent_Immediate() != null) {
               var2 = ((SoftEdge)value).l6();
            }

            var2.n5(this);
            var2.n5.l6(new EffectFormat$26(this));
         }

         this.l6().n5(var2);
         this.c8();
      }
   }

   @Override
   public final void setBlurEffect(double radius, boolean grow) {
      this.k7();
      if (this.l6().l6() == null) {
         Blur var4 = new Blur(radius, grow, this);
         var4.n5.l6(new EffectFormat$2(this));
         this.l6().n5(var4);
      } else {
         this.l6().n5(radius, grow);
      }

      this.c8();
   }

   @Override
   public final void enableFillOverlayEffect() {
      this.k7();
      if (this.l6().k5() == null) {
         FillOverlay var1 = new FillOverlay(this);
         var1.n5.l6(new EffectFormat$3(this));
         this.l6().n5(var1);
         this.c8();
      }
   }

   @Override
   public final void enableGlowEffect() {
      this.k7();
      if (this.l6().u3() == null) {
         Glow var1 = new Glow(this);
         var1.n5.l6(new EffectFormat$4(this));
         this.l6().n5(var1);
         this.c8();
      }
   }

   @Override
   public final void enableInnerShadowEffect() {
      this.k7();
      if (this.l6().a6() == null) {
         InnerShadow var1 = new InnerShadow(this);
         var1.n5.l6(new EffectFormat$5(this));
         this.l6().n5(var1);
      }
   }

   @Override
   public final void enableOuterShadowEffect() {
      this.k7();
      if (this.l6().u9() == null) {
         OuterShadow var1 = new OuterShadow(this);
         var1.n5.l6(new EffectFormat$6(this));
         this.l6().n5(var1);
         this.c8();
      }
   }

   @Override
   public final void enablePresetShadowEffect() {
      this.k7();
      if (this.l6().h0() == null) {
         PresetShadow var1 = new PresetShadow(this);
         var1.n5.l6(new EffectFormat$7(this));
         this.l6().n5(var1);
         this.c8();
      }
   }

   @Override
   public final void enableReflectionEffect() {
      this.k7();
      if (this.l6().c8() == null) {
         Reflection var1 = new Reflection(this);
         var1.n5.l6(new EffectFormat$8(this));
         this.l6().n5(var1);
      }
   }

   @Override
   public final void enableSoftEdgeEffect() {
      this.k7();
      if (this.l6().t2() == null) {
         SoftEdge var1 = new SoftEdge(this);
         var1.n5.l6(new EffectFormat$9(this));
         this.l6().n5(var1);
         this.c8();
      }
   }

   @Override
   public final void disableBlurEffect() {
      this.k7();
      if (this.z3() && this.l6().l6() != null) {
         ((Blur)this.l6().l6()).n5.n5(new EffectFormat$10(this));
         this.l6().n5((IBlur)null);
         this.c8();
      }
   }

   @Override
   public final void disableFillOverlayEffect() {
      this.k7();
      if (this.z3() && this.l6().k5() != null) {
         ((FillOverlay)this.l6().k5()).n5.n5(new EffectFormat$11(this));
         this.l6().n5((IFillOverlay)null);
         this.c8();
      }
   }

   @Override
   public final void disableGlowEffect() {
      this.k7();
      if (this.z3() && this.l6().u3() != null) {
         ((Glow)this.l6().u3()).n5.n5(new EffectFormat$13(this));
         this.l6().n5((IGlow)null);
         this.c8();
      }
   }

   @Override
   public final void disableInnerShadowEffect() {
      this.k7();
      if (this.z3() && this.l6().a6() != null) {
         ((InnerShadow)this.l6().a6()).n5.n5(new EffectFormat$14(this));
         this.l6().n5((IInnerShadow)null);
         this.c8();
      }
   }

   @Override
   public final void disableOuterShadowEffect() {
      this.k7();
      if (this.z3() && this.l6().u9() != null) {
         ((OuterShadow)this.l6().u9()).n5.n5(new EffectFormat$15(this));
         this.l6().n5((IOuterShadow)null);
         this.c8();
      }
   }

   @Override
   public final void disablePresetShadowEffect() {
      this.k7();
      if (this.z3() && this.l6().h0() != null) {
         ((PresetShadow)this.l6().h0()).n5.n5(new EffectFormat$16(this));
         this.l6().n5((IPresetShadow)null);
         this.c8();
      }
   }

   @Override
   public final void disableReflectionEffect() {
      this.k7();
      if (this.z3() && this.l6().c8() != null) {
         ((Reflection)this.l6().c8()).n5.n5(new EffectFormat$17(this));
         this.l6().n5((IReflection)null);
         this.c8();
      }
   }

   @Override
   public final void disableSoftEdgeEffect() {
      this.k7();
      if (this.z3() && this.l6().t2() != null) {
         ((SoftEdge)this.l6().t2()).n5.n5(new EffectFormat$18(this));
         this.l6().n5((ISoftEdge)null);
         this.c8();
      }
   }

   @Override
   public final IEffectFormatEffectiveData getEffective() {
      return this.h0();
   }

   final boolean u3() {
      return this.z3() && this.l6().s7();
   }

   final void n5(IEffectFormat var1) {
      if (this.u3() || var1 == null || ((EffectFormat)var1).u3()) {
         this.k7();
         this.l6().n5((EffectFormat)var1);
         this.c8();
      }
   }

   final void n5(IEffectFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.c8();
   }

   final void a6() {
      this.k7();
      this.l6().n3();
   }

   final void u9() {
      if (this.z3()) {
         if (this.u3()) {
            this.k7();
            this.l6().x8();
            this.c8();
         }
      }
   }

   final d0e h0() {
      d0e[] var1 = new d0e[]{this.u3};
      d0e var2 = d0e.n5(d0e.class, var1, this, l6);
      this.u3 = var1[0];
      if (this.u3 != null) {
         this.u3.n5(d0e.class);
      }

      return var2;
   }

   private void c8() {
      f5n var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   static boolean n5(EffectFormat var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.z3() ? var0.l6().e2() : true;
      }
   }

   // $VF: synthetic method
   static f5n n5(EffectFormat var0, f5n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static void l6(EffectFormat var0) {
      var0.c8();
   }
}
