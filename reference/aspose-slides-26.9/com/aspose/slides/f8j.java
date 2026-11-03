package com.aspose.slides;

final class f8j {
   private double n5;
   private double l6;
   private double k5;
   private int u3;
   private final ShapeBevel a6;
   private final ShapeBevel u9;
   private final ColorFormat h0;
   private final ColorFormat c8;
   private final Camera t2;
   private final LightRig s7;
   private final g3o x8;
   private long n3;
   private com.aspose.slides.ms.System.o5<Boolean> y4 = new com.aspose.slides.ms.System.o5<>();

   f8j(ShapeBevel var1, ShapeBevel var2, ColorFormat var3, ColorFormat var4, Camera var5, LightRig var6, g3o var7) {
      this.a6 = var1;
      this.u9 = var2;
      this.h0 = var3;
      this.c8 = var4;
      this.t2 = var5;
      this.s7 = var6;
      this.x8 = var7;
      this.n5 = 0.0;
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = -1;
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
      this.y4();
   }

   public final double l6() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
      this.y4();
   }

   public final double k5() {
      return this.k5;
   }

   public final void k5(double var1) {
      this.k5 = var1;
      this.y4();
   }

   public final IShapeBevel u3() {
      return this.a6;
   }

   public final IShapeBevel a6() {
      return this.u9;
   }

   public final ICamera u9() {
      return this.t2;
   }

   public final ILightRig h0() {
      return this.s7;
   }

   public final int c8() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
      this.y4();
   }

   final g3o t2() {
      return this.x8;
   }

   final boolean s7() {
      if (!this.y4.l6()) {
         this.y4 = new com.aspose.slides.ms.System.o5<>(false);
         (!this.y4.l6()
               ? new com.aspose.slides.ms.System.o5<Boolean>()
               : new com.aspose.slides.ms.System.o5<>(
                  this.y4.n5(boolean.class)
                     || this.u3().getBevelType() != -1
                     || this.a6().getBevelType() != -1
                     || this.c8() > -1 && this.c8() < 3
                     || this.c8() > 6
               ))
            .n5(this.y4);
      }

      return this.y4.n5();
   }

   final boolean n5(boolean var1) {
      return var1 && this.u3 != -1 && this.u3 != 14 || this.t2.getCameraType() != -1 || this.s7.getLightType() != -1;
   }

   final void x8() {
      this.t2().n5(g3o.l6);
      this.t2.u9();
      this.h0.u9();
      this.n5 = 0.0;
      this.k5 = 0.0;
      this.c8.u9();
      this.l6 = 0.0;
      this.s7.u9();
      this.u3 = -1;
      this.u9.n5(ShapeBevel.k5);
      this.a6.n5(ShapeBevel.l6);
      this.y4();
   }

   final void n5(ThreeDFormat var1) {
      this.t2().n5(var1.u3());
      this.t2.n5(var1.getCamera());
      this.h0.n5((ColorFormat)var1.getContourColor());
      this.n5 = var1.getContourWidth();
      this.k5 = var1.getDepth();
      this.c8.n5((ColorFormat)var1.getExtrusionColor());
      this.l6 = var1.getExtrusionHeight();
      this.s7.n5((LightRig)var1.getLightRig());
      this.u3 = var1.getMaterial();
      this.u9.n5(var1.getBevelBottom());
      this.a6.n5(var1.getBevelTop());
      this.y4();
   }

   final void n5(h3g var1) {
      this.t2.n5(var1.getCamera());
      this.h0.l6(var1.h0().o8());
      this.n5 = var1.getContourWidth();
      this.k5 = var1.getDepth();
      this.c8.l6(var1.c8().o8());
      this.l6 = var1.getExtrusionHeight();
      this.s7.n5(var1.getLightRig());
      this.u3 = var1.getMaterial();
      this.u9.n5(var1.getBevelBottom());
      this.a6.n5(var1.getBevelTop());
      this.t2().n5(var1.t2());
      this.t2().n5(var1.s7());
      this.t2().k5().setAnchorPoint(var1.u3.k5());
      this.t2().k5().setNormalVector(var1.u3.l6());
      this.t2().k5().setUpVector(var1.u3.u3());
      this.y4();
   }

   final long n3() {
      return (
               (
                        (
                                 (
                                          (
                                                   ((this.n3 & 4294967295L) + (this.x8.u3() & 4294967295L) & 4294967295L)
                                                         + (this.a6.getVersion() & 4294967295L)
                                                      & 4294967295L
                                                )
                                                + (this.u9.getVersion() & 4294967295L)
                                             & 4294967295L
                                       )
                                       + (this.h0.getVersion() & 4294967295L)
                                    & 4294967295L
                              )
                              + (this.c8.getVersion() & 4294967295L)
                           & 4294967295L
                     )
                     + (this.t2.getVersion() & 4294967295L)
                  & 4294967295L
            )
            + (this.s7.getVersion() & 4294967295L)
         & 4294967295L;
   }

   private void y4() {
      this.n3++;
   }

   @Override
   public boolean equals(Object obj) {
      IThreeDFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, IThreeDFormat.class);
      return var2 == null
         ? false
         : this.n5 == var2.getContourWidth()
            && this.l6 == var2.getExtrusionHeight()
            && this.k5 == var2.getDepth()
            && this.u3 == var2.getMaterial()
            && this.a6.equals(var2.getBevelTop())
            && this.u9.equals(var2.getBevelBottom())
            && this.h0.equals(var2.getContourColor())
            && this.c8.equals(var2.getExtrusionColor())
            && this.t2.equals(var2.getCamera())
            && this.s7.equals(var2.getLightRig());
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
