package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import java.awt.Color;

final class h3g extends x8<ThreeDFormat, h3g> implements IThreeDFormatEffectiveData {
   private double u9 = Double.NaN;
   private double h0 = Double.NaN;
   private double c8 = Double.NaN;
   private final f6g t2 = new f6g(true);
   private final f6g s7 = new f6g(false);
   private final j3z x8 = new j3z();
   private final j3z n3 = new j3z();
   private final j2 y4 = new j2();
   private final d7n e2 = new d7n();
   int k5 = -1;
   private byte t9 = -1;
   private float z1 = Float.NaN;
   c5 u3 = new c5();
   int a6 = -1;
   private static final h3g t4 = x8();

   h3g(ThreeDFormat var1) {
      super(var1);
   }

   final void u9() {
      this.u9 = Double.NaN;
      this.h0 = Double.NaN;
      this.c8 = Double.NaN;
      this.t2.n5();
      this.s7.n5();
      this.x8.u3();
      this.n3.u3();
      this.y4.n5();
      this.e2.n5();
      this.k5 = -1;
      this.t9 = -1;
      this.z1 = Float.NaN;
      this.u3.n5();
      this.a6 = -1;
   }

   @Override
   public final double getContourWidth() {
      return this.u9;
   }

   @Override
   public final double getExtrusionHeight() {
      return this.h0;
   }

   @Override
   public final double getDepth() {
      return this.c8;
   }

   @Override
   public final IShapeBevelEffectiveData getBevelTop() {
      return this.t2;
   }

   @Override
   public final IShapeBevelEffectiveData getBevelBottom() {
      return this.s7;
   }

   @Override
   public final Color getContourColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.h0());
   }

   com.aspose.slides.internal.o9b.c8 h0() {
      return this.x8.n5();
   }

   @Override
   public final Color getExtrusionColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.c8());
   }

   com.aspose.slides.internal.o9b.c8 c8() {
      return this.n3.n5();
   }

   @Override
   public final ICameraEffectiveData getCamera() {
      return this.y4;
   }

   @Override
   public final ILightRigEffectiveData getLightRig() {
      return this.e2;
   }

   @Override
   public final int getMaterial() {
      return this.k5;
   }

   final boolean t2() {
      return this.t9 == 1;
   }

   final float s7() {
      return this.z1;
   }

   static h3g n5(ThreeDFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Shape.class)) {
         Shape var10 = (Shape)var1;
         if (com.aspose.slides.internal.v6g.k5.l6(var10, GeometryShape.class) && ((GeometryShape)var10).getShapeStyle() != null) {
            IShapeStyle var11 = ((GeometryShape)var10).getShapeStyle();
            s8u var4 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var4 != null) {
               h3g var13 = var4.l6(var11.getEffectStyleIndex());
               return var13 != null ? var13 : t4;
            } else {
               return t4;
            }
         } else {
            Shape var3 = (Shape)var10.getBasePlaceholder();
            return var3 != null ? var3.r4().x8() : t4;
         }
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, FormatScheme.class)) {
            return t4;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)) {
            return t4;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, ChartSeries.class)) {
            int var9 = ((ChartSeries)var1).getChart().getStyle();
            long var14 = n5(var9);
            s8u var12 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var12 != null) {
               h3g var15 = var12.l6(var14);
               if (var15 == null) {
                  var15 = t4;
               }

               return var15;
            } else {
               return t4;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, ChartSeriesGroup.class)) {
            int var2 = ((ChartSeriesGroup)var1).getChart().getStyle();
            long var6 = n5(var2);
            s8u var5 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var5 != null) {
               h3g var8 = var5.l6(var6);
               if (var8 == null) {
                  var8 = t4;
               }

               return var8;
            } else {
               return t4;
            }
         } else {
            throw new NotImplementedException();
         }
      }
   }

   private static long n5(int var0) {
      long var1;
      if (var0 < 16) {
         var1 = 1L;
      } else if (var0 < 24) {
         var1 = 2L;
      } else if (var0 < 32) {
         var1 = 3L;
      } else if (var0 < 40) {
         var1 = 1L;
      } else {
         var1 = 3L;
      }

      return var1;
   }

   private static h3g x8() {
      h3g var0 = new h3g(null);
      var0.u9 = 0.0;
      var0.h0 = 0.0;
      var0.c8 = 0.0;
      var0.x8.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.n3.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.k5 = 14;
      var0.t9 = 0;
      var0.z1 = 0.0F;
      var0.a6 = 0;
      return var0;
   }

   final void n5(i7b var1) {
      h3g var2 = (h3g)var1;
      this.u9 = var2.u9;
      this.h0 = var2.h0;
      this.c8 = var2.c8;
      this.t2.n5((i7b)var2.t2);
      this.s7.n5((i7b)var2.s7);
      this.x8.n5(var2.x8);
      this.n3.n5(var2.n3);
      this.y4.n5((i7b)var2.y4);
      this.e2.n5((i7b)var2.e2);
      this.k5 = var2.k5;
      this.t9 = var2.t9;
      this.z1 = var2.z1;
      this.u3.n5((i7b)var2.u3);
      this.a6 = var2.a6;
   }

   void n5(i7b var1, ThreeDFormat var2) {
      this.n5(var1);
      this.l6(var2);
   }

   final void l6(ThreeDFormat var1) {
      if (!com.aspose.slides.ms.System.j8.n5(var1.getContourWidth(), Double.NaN)) {
         this.u9 = var1.getContourWidth();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getExtrusionHeight(), Double.NaN)) {
         this.h0 = var1.getExtrusionHeight();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getDepth(), Double.NaN)) {
         this.c8 = var1.getDepth();
      }

      this.t2.n5((ShapeBevel)var1.getBevelTop());
      this.s7.n5((ShapeBevel)var1.getBevelBottom());
      this.x8.n5((ColorFormat)var1.getContourColor());
      this.n3.n5((ColorFormat)var1.getExtrusionColor());
      this.y4.n5((Camera)var1.getCamera());
      this.e2.n5((LightRig)var1.getLightRig());
      if (var1.getMaterial() != -1) {
         this.k5 = var1.getMaterial();
      }

      this.t9 = (byte)(var1.u3().n5() ? 1 : 0);
      if (!com.aspose.slides.ms.System.j8.n5(var1.u3().l6(), Float.NaN)) {
         this.z1 = var1.u3().l6();
      }

      this.u3.n5((Backdrop3DScene)var1.u3().k5());
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.t2.n5(var1, var2);
      this.s7.n5(var1, var2);
      this.x8.n5(var1, var2);
      this.n3.n5(var1, var2);
      this.y4.n5(var1, var2);
      this.e2.n5(var1, var2);
      this.u3.n5(var1, var2);
   }

   boolean n5(h3g var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.u9 == var1.u9
               && this.h0 == var1.h0
               && this.c8 == var1.c8
               && this.t2.n5(var1.t2)
               && this.s7.n5(var1.s7)
               && this.x8.l6(var1.x8)
               && this.n3.l6(var1.n3)
               && this.y4.n5(var1.y4)
               && this.e2.n5(var1.e2)
               && this.k5 == var1.k5
               && this.t9 == var1.t9
               && this.z1 == var1.z1
               && this.u3.n5(var1.u3)
               && this.a6 == var1.a6;
      }
   }

   static h3g n5(ThreeDFormat var0, h3g var1) {
      h3g var2 = new h3g(var0);
      if (var1 != null) {
         var2.n5((i7b)var1);
      }

      return var2;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.h3g)recoveredArg);
   }
}
