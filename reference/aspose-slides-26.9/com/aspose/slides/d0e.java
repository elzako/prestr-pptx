package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class d0e extends x8<EffectFormat, d0e> implements IEffectFormatEffectiveData {
   r3 k5;
   t7d u3;
   b4h a6;
   d8f u9;
   k0p h0;
   u0y c8;
   i2u t2;
   q1m s7;
   private d0e x8;
   private static final d0e n3 = c8();

   d0e(EffectFormat var1) {
      super(var1);
      this.h0();
   }

   d0e(q6z var1) {
      super(var1);
      this.h0();
   }

   private void h0() {
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = null;
      this.s7 = null;
   }

   final void u9() {
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = null;
      this.s7 = null;
   }

   @Override
   public final boolean isNoEffects() {
      return this.k5 == null
         && this.u3 == null
         && this.a6 == null
         && this.u9 == null
         && this.h0 == null
         && this.c8 == null
         && this.t2 == null
         && this.s7 == null;
   }

   @Override
   public final IBlurEffectiveData getBlurEffect() {
      return this.k5;
   }

   @Override
   public final IFillOverlayEffectiveData getFillOverlayEffect() {
      return this.u3;
   }

   @Override
   public final IGlowEffectiveData getGlowEffect() {
      return this.a6;
   }

   @Override
   public final IInnerShadowEffectiveData getInnerShadowEffect() {
      return this.u9;
   }

   @Override
   public final IOuterShadowEffectiveData getOuterShadowEffect() {
      return this.h0;
   }

   @Override
   public final IPresetShadowEffectiveData getPresetShadowEffect() {
      return this.c8;
   }

   @Override
   public final IReflectionEffectiveData getReflectionEffect() {
      return this.t2;
   }

   @Override
   public final ISoftEdgeEffectiveData getSoftEdgeEffect() {
      return this.s7;
   }

   static d0e n5(EffectFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Shape.class)) {
         Shape var10 = (Shape)var1;
         if (com.aspose.slides.internal.v6g.k5.l6(var10, GeometryShape.class) && ((GeometryShape)var10).getShapeStyle() != null) {
            IShapeStyle var12 = ((GeometryShape)var10).getShapeStyle();
            s8u var4 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var4 != null) {
               d0e var5 = var4.n5(var12.getEffectStyleIndex());
               if (var5 == null) {
                  var5 = n3;
               }

               return var5;
            } else {
               return n3;
            }
         } else {
            Shape var11 = (Shape)var10.getBasePlaceholder();
            return var11 != null ? var11.y1().h0() : n3;
         }
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, FormatScheme.class)) {
            return n3;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, Portion.class)) {
            Portion var9 = (Portion)var1;
            return var9.getParent_Immediate() == null ? n3 : (d0e)var9.n3().n5().t9().z3.getEffectFormat();
         }

         if (!com.aspose.slides.internal.v6g.k5.l6(var1, ChartSeries.class)) {
            throw new NotImplementedException();
         }

         ChartSeries var2 = com.aspose.slides.internal.v6g.k5.n5(var1, ChartSeries.class);
         if (var2.getType() != 32
            && (
               ChartTypeCharacterizer.isChartTypeDoughnut(var2.getType())
                  || ChartTypeCharacterizer.isChartTypePie(var2.getType())
                  || ChartTypeCharacterizer.isChartTypeColumn(var2.getType())
                  || ChartTypeCharacterizer.isChartTypeBar(var2.getType())
            )
            && (var2.getChart().getStyle() < 32 || var2.getChart().getStyle() > 39)) {
            s8u var3 = (s8u)n5((q1v)var0).createThemeEffective();
            long var6 = ((var2.getChart().getStyle() + 1 & 4294967295L) / 9L & 4294967295L) % 3L & 4294967295L;
            if (var3 != null) {
               d0e var8 = var3.n5(var6);
               if (var8 == null) {
                  var8 = n3;
               }

               return var8;
            }
         }

         return n3;
      }
   }

   private static d0e c8() {
      d0e var0 = new d0e((EffectFormat)null);
      var0.k5 = null;
      var0.u3 = null;
      var0.a6 = null;
      var0.u9 = null;
      var0.h0 = null;
      var0.c8 = null;
      var0.t2 = null;
      var0.s7 = null;
      return var0;
   }

   final void n5(i7b var1) {
      d0e var2 = (d0e)var1;
      this.k5 = var2.k5;
      this.u3 = var2.u3;
      this.a6 = var2.a6;
      this.u9 = var2.u9;
      this.h0 = var2.h0;
      this.c8 = var2.c8;
      this.t2 = var2.t2;
      this.s7 = var2.s7;
   }

   void n5(i7b var1, EffectFormat var2) {
      this.n5(var1);
      this.l6(var2);
   }

   final void l6(EffectFormat var1) {
      if (var1.u3()) {
         this.k5 = var1.getBlurEffect() == null ? null : (r3)((i4e)var1.getBlurEffect()).getEffective();
         this.u3 = var1.getFillOverlayEffect() == null ? null : (t7d)((i4e)var1.getFillOverlayEffect()).getEffective();
         this.a6 = var1.getGlowEffect() == null ? null : (b4h)((i4e)var1.getGlowEffect()).getEffective();
         this.u9 = var1.getInnerShadowEffect() == null ? null : (d8f)((i4e)var1.getInnerShadowEffect()).getEffective();
         this.h0 = var1.getOuterShadowEffect() == null ? null : (k0p)((i4e)var1.getOuterShadowEffect()).getEffective();
         this.c8 = var1.getPresetShadowEffect() == null ? null : (u0y)((i4e)var1.getPresetShadowEffect()).getEffective();
         this.t2 = var1.getReflectionEffect() == null ? null : (i2u)((i4e)var1.getReflectionEffect()).getEffective();
         this.s7 = var1.getSoftEdgeEffect() == null ? null : (q1m)((i4e)var1.getSoftEdgeEffect()).getEffective();
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      if (this.u3 != null) {
         this.u3.n5(var1, var2);
      }

      if (this.a6 != null) {
         this.a6.n5(var1, var2);
      }

      if (this.u9 != null) {
         this.u9.n5(var1, var2);
      }

      if (this.h0 != null) {
         this.h0.n5(var1, var2);
      }

      if (this.c8 != null) {
         this.c8.n5(var1, var2);
      }
   }

   private d0e t2() {
      Shape var1 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_IPresentationComponent(), Shape.class);
      if (var1 != null && var1.isGrouped() && var1.getEffectFormat().isNoEffects() && var1.f0() != null) {
         d0e var2 = ((EffectFormat)var1.f0().getEffectFormat()).h0();
         return var2.isNoEffects() ? null : var2;
      } else {
         return null;
      }
   }

   @Override
   boolean n5(boolean var1) {
      boolean var2 = false;
      d0e var3 = this.t2();
      if (var3 != null && (var1 || this.x8 == null || (var3.k5() & 4294967295L) != (this.x8.k5() & 4294967295L))) {
         this.n5((i7b)var3);
         var2 = true;
      }

      this.x8 = var3;
      return var2;
   }

   boolean n5(d0e var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5)
               && com.aspose.slides.internal.n8e.v4.n5(this.u3, var1.u3)
               && com.aspose.slides.internal.n8e.v4.n5(this.a6, var1.a6)
               && com.aspose.slides.internal.n8e.v4.n5(this.u9, var1.u9)
               && com.aspose.slides.internal.n8e.v4.n5(this.h0, var1.h0)
               && com.aspose.slides.internal.n8e.v4.n5(this.c8, var1.c8)
               && com.aspose.slides.internal.n8e.v4.n5(this.t2, var1.t2)
               && com.aspose.slides.internal.n8e.v4.n5(this.s7, var1.s7);
      }
   }

   static d0e n5(EffectFormat var0, d0e var1) {
      d0e var2 = new d0e(var0);
      if (var1 != null) {
         var2.n5((i7b)var1);
      }

      return var2;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.d0e)recoveredArg);
   }
}
