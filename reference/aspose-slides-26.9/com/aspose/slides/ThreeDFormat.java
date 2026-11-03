package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class ThreeDFormat extends PVIObject implements IThreeDFormat, IThreeDParamSource {
   private c8c k5;
   final com.aspose.slides.internal.v6g.n5<c8c> n5 = new ThreeDFormat$1(this);
   static final com.aspose.slides.internal.f3.a6<ThreeDFormat, h3g, h3g> l6 = new ThreeDFormat$9();
   private ShapeBevel u3;
   private ShapeBevel a6;
   private ColorFormat u9;
   private ColorFormat h0;
   private Camera c8;
   private LightRig t2;
   private g3o s7;
   private h3g x8;

   ThreeDFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u3 = new ShapeBevel(this, true);
      this.a6 = new ShapeBevel(this, false);
      this.u9 = new ColorFormat(this);
      this.h0 = new ColorFormat(this);
      this.c8 = new Camera(this);
      this.t2 = new LightRig(this);
      this.s7 = new g3o(this);
      this.u3.n5.l6(new ThreeDFormat$2(this));
      this.a6.n5.l6(new ThreeDFormat$3(this));
      this.u9.n5.l6(new ThreeDFormat$4(this));
      this.h0.n5.l6(new ThreeDFormat$5(this));
      this.c8.n5.l6(new ThreeDFormat$6(this));
      this.t2.n5.l6(new ThreeDFormat$7(this));
      this.s7.n5.l6(new ThreeDFormat$8(this));
   }

   @Override
   Object M_() {
      return new f8j(this.u3, this.a6, this.u9, this.h0, this.c8, this.t2, this.s7);
   }

   final f8j l6() {
      return (f8j)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().n3();
   }

   @Override
   public final double getContourWidth() {
      return this.z3() ? this.l6().n5() : 0.0;
   }

   @Override
   public final void setContourWidth(double value) {
      this.n5(0.0, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.n3();
      }
   }

   @Override
   public final double getExtrusionHeight() {
      return this.z3() ? this.l6().l6() : 0.0;
   }

   @Override
   public final void setExtrusionHeight(double value) {
      this.n5(0.0, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.n3();
      }
   }

   @Override
   public final double getDepth() {
      return this.z3() ? this.l6().k5() : 0.0;
   }

   @Override
   public final void setDepth(double value) {
      this.n5(0.0, value);
      if (this.z3()) {
         this.l6().k5(value);
         this.n3();
      }
   }

   @Override
   public final IShapeBevel getBevelTop() {
      this.m3();
      return this.u3;
   }

   @Override
   public final IShapeBevel getBevelBottom() {
      this.m3();
      return this.a6;
   }

   @Override
   public final IColorFormat getContourColor() {
      this.m3();
      return this.u9;
   }

   @Override
   public final IColorFormat getExtrusionColor() {
      this.m3();
      return this.h0;
   }

   @Override
   public final ICamera getCamera() {
      this.m3();
      return this.c8;
   }

   @Override
   public final ILightRig getLightRig() {
      this.m3();
      return this.t2;
   }

   @Override
   public final int getMaterial() {
      return this.z3() ? this.l6().c8() : -1;
   }

   @Override
   public final void setMaterial(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.n3();
      }
   }

   @Override
   public final IThreeDFormatEffectiveData getEffective() {
      return this.x8();
   }

   final g3o u3() {
      this.m3();
      return this.s7;
   }

   final boolean n5(boolean var1) {
      if (!this.z3()) {
         return false;
      }

      this.k7();
      return this.l6().n5(var1);
   }

   final boolean a6() {
      return this.z3() ? this.l6().s7() : false;
   }

   final void n5(IThreeDFormat var1) {
      if (this.z3() || !com.aspose.slides.internal.v6g.k5.l6(var1, PVIObject.class) || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5((ThreeDFormat)var1);
         this.n3();
      }
   }

   final void n5(IThreeDFormatEffectiveData var1) {
      this.k7();
      this.l6().n5((h3g)var1);
      this.n3();
   }

   final int u9() {
      return this.z3() ? this.l6().u9().getCameraType() : -1;
   }

   final int h0() {
      return this.z3() ? this.l6().h0().getLightType() : -1;
   }

   final int c8() {
      return this.z3() ? this.l6().u3().getBevelType() : -1;
   }

   final int t2() {
      return this.z3() ? this.l6().a6().getBevelType() : -1;
   }

   final void s7() {
      if (this.z3()) {
         this.k7();
         this.l6().x8();
         this.n3();
      }
   }

   final h3g x8() {
      h3g[] var1 = new h3g[]{this.x8};
      h3g var2 = h3g.n5(h3g.class, var1, this, l6);
      this.x8 = var1[0];
      if (this.x8 != null) {
         this.x8.n5(h3g.class);
      }

      return var2;
   }

   private void n3() {
      c8c var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.getParent_IPresentationComponent(), GroupShape.class)) {
         if (this.u3.getBevelType() != -1 || this.a6.getBevelType() != -1) {
            IGenericEnumerator var2 = ((GroupShape)this.getParent_IPresentationComponent()).getShapes().iterator();

            try {
               while (var2.hasNext()) {
                  IShape var3 = (IShape)var2.next();
                  if (this.u3.getBevelType() != -1) {
                     var3.getThreeDFormat().getBevelTop().setBevelType(this.u3.getBevelType());
                     var3.getThreeDFormat().getBevelTop().setHeight(this.u3.getHeight());
                     var3.getThreeDFormat().getBevelTop().setWidth(this.u3.getWidth());
                  }

                  if (this.a6.getBevelType() != -1) {
                     var3.getThreeDFormat().getBevelBottom().setBevelType(this.a6.getBevelType());
                     var3.getThreeDFormat().getBevelBottom().setHeight(this.a6.getHeight());
                     var3.getThreeDFormat().getBevelBottom().setWidth(this.a6.getWidth());
                  }

                  if (this.getMaterial() != -1) {
                     var3.getThreeDFormat().setMaterial(this.getMaterial());
                  }

                  if (!com.aspose.slides.ms.System.d2.k5(this.getExtrusionHeight())) {
                     var3.getThreeDFormat().setExtrusionHeight(this.getExtrusionHeight());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static c8c n5(ThreeDFormat var0, c8c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static void n5(ThreeDFormat var0) {
      var0.n3();
   }
}
