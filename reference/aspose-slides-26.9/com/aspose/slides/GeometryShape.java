package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

public abstract class GeometryShape extends Shape implements IGeometryShape {
   ShapeStyle a6 = null;
   private final j2x n5;
   private AdjustValueCollection l6 = AdjustValueCollection.n5;

   @Override
   public final IGeometryPath[] getGeometryPaths() {
      return this.n5.n5(0.0F, 0.0F, this.getWidth(), this.getHeight());
   }

   @Override
   public final void setGeometryPath(IGeometryPath geometryPath) {
      this.setGeometryPaths(new IGeometryPath[]{geometryPath});
   }

   @Override
   public final void setGeometryPaths(IGeometryPath[] geometryPaths) {
      if (geometryPaths.length == 0) {
         throw new ArgumentException("No paths found");
      }

      this.n5.n5(new q7g[geometryPaths.length]);
      float var2 = 0.0F;
      float var3 = 0.0F;

      for (int var4 = 0; var4 < geometryPaths.length; var4++) {
         q7g var5 = new q7g();
         IGeometryPath var6 = geometryPaths[var4];
         if (com.aspose.slides.internal.v6g.k5.l6(var6, GeometryPath.class)) {
            var5.n5(((GeometryPath)var6).getFillMode());
            var5.n5(((GeometryPath)var6).getStroke());
         }

         if (var6.getPathData().length == 0) {
            throw new ArgumentException("Empty path found");
         }

         for (int var7 = 0; var7 < var6.getPathData().length; var7++) {
            if (var6.getPathData()[var7].getPathCommand() == 3) {
               new List();
               float[] var11 = var6.getPathData()[var7].getSegmentData();
               List var12 = new List();
               var12.addItem(com.aspose.slides.internal.v6g.k5.u9(var11[0] * 12700.0F, 13));
               var12.addItem(com.aspose.slides.internal.v6g.k5.u9(var11[1] * 12700.0F, 13));
               var12.addItem(com.aspose.slides.internal.v6g.k5.u9(var11[2] * 60000.0F, 13));
               var12.addItem(com.aspose.slides.internal.v6g.k5.u9(var11[3] * 60000.0F, 13));
               var5.n5(new byte[]{var6.getPathData()[var7].getPathCommand()}, com.aspose.slides.internal.n8e.v4.u9(var12));
            } else if (var6.getPathData()[var7].getPathCommand() == 0) {
               var5.n5(new byte[]{0}, null);
            } else {
               List var8 = new List();
               float[] var9 = var6.getPathData()[var7].getSegmentData();

               for (int var10 = 0; var10 < var6.getPathData()[var7].getSegmentData().length; var10 += 2) {
                  var8.addItem(new com.aspose.slides.internal.o9b.w1(var9[var10], var9[var10 + 1]));
               }

               this.n5((com.aspose.slides.internal.o9b.w1[])var8.toArray(new com.aspose.slides.internal.o9b.w1[0]), var6.getPathData()[var7].getPathCommand(), var5);
            }
         }

         var5.l6(com.aspose.slides.internal.v6g.k5.u9(this.getHeight() * 12700.0F, 13));
         var5.n5(com.aspose.slides.internal.v6g.k5.u9(this.getWidth() * 12700.0F, 13));
         if ((float)var5.l6() > var2) {
            var2 = (float)var5.l6();
         }

         if ((float)var5.k5() > var3) {
            var3 = (float)var5.l6();
         }

         this.n5.u9()[var4] = var5;
      }

      this.n5.n5(0);
   }

   final j2x e2() {
      return this.n5;
   }

   GeometryShape(r0g parentImmediate, a3g pptxUnsupportedProps, IBaseShapeLock shapeLock) {
      super(parentImmediate, pptxUnsupportedProps, shapeLock);
      this.n5 = new j2x(this);
      this.t2 = new LineFormat(this);
   }

   final y0k t9() {
      return (y0k)super.e5();
   }

   a3g u9() {
      return (a3g)super.h0();
   }

   @Override
   public final IShapeStyle getShapeStyle() {
      return this.a6;
   }

   final void z1() {
      this.a6 = new ShapeStyle(this);
   }

   @Override
   public int getShapeType() {
      return this.n5.x8();
   }

   @Override
   public void setShapeType(int value) {
      this.n5.l6(value);
   }

   @Override
   public final IAdjustValueCollection getAdjustments() {
      if (com.aspose.slides.ms.System.j8.l6(this.l6, AdjustValueCollection.n5) || this.l6 == null) {
         this.l6 = new AdjustValueCollection(this);
      }

      return this.l6;
   }

   @Override
   public final IShapeElement[] createShapeElements() {
      ShapeFrame var1 = this.e5().n3();
      float var2 = var1.getX();
      float var3 = var1.getY();
      float var4 = var1.getWidth();
      float var5 = var1.getHeight();
      return !com.aspose.slides.ms.System.n1.k5(var2)
            && !com.aspose.slides.ms.System.n1.k5(var3)
            && !com.aspose.slides.ms.System.n1.k5(var4)
            && !com.aspose.slides.ms.System.n1.k5(var5)
         ? this.t4().n5(this, var2, var3, var4, var5)
         : null;
   }

   final j2x t4() {
      if (this.n5.x8() != -1) {
         return this.n5;
      }

      Shape[] var1 = this.f2();
      j2x var2 = this.n5;

      for (int var3 = 0; var3 < var1.length; var3++) {
         GeometryShape var4 = com.aspose.slides.internal.v6g.k5.n5(var1[var3], GeometryShape.class);
         if (var4 != null && var4.e2().x8() != -1) {
            var2 = var4.e2();
            break;
         }
      }

      return var2;
   }

   static Dictionary<Integer, Integer> n5(int... var0) {
      Dictionary var1 = new Dictionary(var0.length);

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.addItem(var0[var2], var0[var2]);
      }

      return var1;
   }

   @Override
   ILineFormatEffectiveData q0() {
      return this.y2().getEffective();
   }

   @Override
   IFillFormatEffectiveData z3() {
      return this.c8.getEffective();
   }

   static Dictionary<Integer, Integer> n5(boolean var0, int... var1) {
      if (!var0) {
         return n5(var1);
      }

      Dictionary var2 = n5(
         com.aspose.slides.internal.n8e.v4.n5(com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(ShapeType.class)))
      );

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.removeItemByKey(var1[var3]);
      }

      return var2;
   }

   @Override
   com.aspose.slides.internal.o9b.w1[] P_() {
      ShapeFrame var1 = this.e5().n3();
      float var2 = var1.getX();
      float var3 = var1.getY();
      float var4 = var1.getWidth();
      float var5 = var1.getHeight();
      com.aspose.slides.internal.o9b.w1[] var6;
      if (!com.aspose.slides.ms.System.n1.k5(var2)
         && !com.aspose.slides.ms.System.n1.k5(var3)
         && !com.aspose.slides.ms.System.n1.k5(var4)
         && !com.aspose.slides.ms.System.n1.k5(var5)) {
         var6 = this.n5.l6(var2, var3, var4, var5);
      } else {
         var6 = null;
      }

      return var6 != null ? var6 : super.P_();
   }

   @Override
   float[] Q_() {
      ShapeFrame var1 = this.e5().n3();
      float var2 = var1.getWidth();
      float var3 = var1.getHeight();
      float[] var4;
      if (!com.aspose.slides.ms.System.n1.k5(var2) && !com.aspose.slides.ms.System.n1.k5(var3)) {
         var4 = this.n5.n5(var2, var3);
      } else {
         var4 = null;
      }

      return var4 != null ? var4 : super.Q_();
   }

   final void m1() {
      this.a6 = null;
   }

   private void n5(com.aspose.slides.internal.o9b.w1[] var1, byte var2, q7g var3) {
      List var4 = new List();
      List var5 = new List();
      var4.addItem(var2);

      for (int var6 = 0; var6 < var1.length; var6++) {
         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(this.getX() + var1[var6].l6(), this.getY() + var1[var6].k5());
         var5.addItem(var7.u3());
      }

      List var8 = com.aspose.slides.internal.c8e.l6.n5(
         (com.aspose.slides.internal.o9b.w1[])var5.toArray(new com.aspose.slides.internal.o9b.w1[0]), ((ShapeFrame)this.getFrame()).n5().y4(), new com.aspose.slides.internal.x4g.m1()
      );
      q7g var9 = new q7g(var4, var8);
      var3.n5(var9.h0(), var9.n5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   a3g h0() {
      return this.u9();
   }

}
