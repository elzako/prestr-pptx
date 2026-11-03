package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class GroupShape extends Shape implements IGroupShape {
   private e4c l6 = new e4c();
   private e4c k5 = new e4c();
   private e4c u3;
   final ShapeCollection n5;

   GroupShape(r0g parentImmediate) {
      super(parentImmediate, new c9u(), new GroupShapeLock());
      this.u3 = e4c.u3.u9();
      this.n5 = new ShapeCollection(this);
      super.n5(new o4f());
      this.n5(new q7l(this));
   }

   final c9u n5() {
      return (c9u)super.h0();
   }

   @Override
   public ILineFormat getLineFormat() {
      return null;
   }

   @Override
   public final IGroupShapeLock getGroupShapeLock() {
      return (IGroupShapeLock)super.getShapeLock();
   }

   final e4c k5() {
      return this.l6;
   }

   final void n5(e4c var1) {
      var1.l6(this.l6);
   }

   final e4c u9() {
      super.R_();
      return this.k5;
   }

   final void l6(e4c var1) {
      o4f var2 = super.R_();
      var1.l6(this.k5);
      this.n5(this.k5.u9(), this.z7().u9());
   }

   final e4c x8() {
      super.R_();
      return this.u3;
   }

   final com.aspose.slides.internal.o9b.y1 y4() {
      if (this.getShapes().size() == 0) {
         return com.aspose.slides.internal.o9b.y1.n5;
      }

      com.aspose.slides.internal.o9b.y1 var1 = ((Shape)this.n5.get_Item(0)).o0().y4();

      for (int var2 = 1; var2 < this.n5.size(); var2++) {
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), ((Shape)this.n5.get_Item(var2)).o0().y4()).a6(var1);
      }

      return var1;
   }

   @Override
   final o4f R_() {
      return super.R_();
   }

   @Override
   void k5(e4c var1) {
      super.k5(var1.u9());
      this.n5(this.k5.u9(), var1.u9());
   }

   final void n5(e4c var1, e4c var2, x4t var3, e4c var4) {
      o4f var5 = super.R_();
      var5.n5(var1.u9());
      this.k5(var2.u9());
      var5.n5(var3.n5());
      var4.l6(this.k5);
      this.n5(this.k5.u9(), var2.u9());
   }

   final e4c n5(d2k var1, d2k var2, boolean var3) {
      e4c var4 = this.e2().u9();
      o4f var5 = super.R_();
      e4c var6 = e4c.n5(this.k5(), e4c.n5(this.u9(), 2)).u9();
      double var7 = ((var2.n5 - var6.n5) * var4.n5 + var1.n5 - var2.n5) * (var5.u3() == 1 ? -1 : 1);
      double var9 = ((var2.l6 - var6.l6) * var4.l6 + var1.l6 - var2.l6) * (var5.a6() == 1 ? -1 : 1);
      float var11 = 0.0F;
      if (!var3) {
         var11 = var5.k5();
      }

      if (com.aspose.slides.ms.System.n1.k5(var11)) {
         var11 = 0.0F;
      }

      double var12 = var11 / 180.0F * Math.PI;
      double var14 = com.aspose.slides.ms.System.q1.c8(var12);
      double var16 = com.aspose.slides.ms.System.q1.h0(var12);
      return e4c.n5(e4c.n5(new e4c(var7 * var14 - var9 * var16, var7 * var16 + var9 * var14), var5.n5()), e4c.n5(this.z7(), 2));
   }

   final e4c e2() {
      boolean var1 = this.b3();
      e4c var2 = this.x8().u9();

      for (GroupShape var3 = this.f0(); var3 != null; var3 = var3.f0()) {
         e4c var4 = var3.x8().u9();
         if (var1) {
            var4.k5();
         }

         var2.n5 = var2.n5 * var4.n5;
         var2.l6 = var2.l6 * var4.l6;
         var1 ^= var3.b3();
      }

      return var2;
   }

   @Override
   void n5(float var1, float var2, float var3) {
      IGenericEnumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            var5.n5(var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   @Override
   void n5(float var1, float var2) {
      IGenericEnumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   public final IShapeCollection getShapes() {
      return this.n5;
   }

   @Override
   void S_() {
      IGenericEnumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            Shape var2 = (Shape)var1.next();
            var2.S_();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      super.S_();
   }

   final void z1() {
      if (this.x9() != null && this.getShapes().size() > 0) {
         synchronized (this) {
            com.aspose.slides.internal.o9b.y1 var2 = this.y4().y4();
            this.l6(new e4c(var2.x8(), var2.n3()), new e4c(var2.s7(), var2.k5()));
         }
      }
   }

   private void n5(e4c var1, e4c var2) {
      this.u3.n5 = !(com.aspose.slides.ms.System.q1.n5(var2.n5 - var1.n5) < 0.001) && var1.n5 != 0.0 && var2.n5 != 0.0 ? var2.n5 / var1.n5 : 1.0;
      this.u3.l6 = !(com.aspose.slides.ms.System.q1.n5(var2.l6 - var1.l6) < 0.001) && var1.l6 != 0.0 && var2.l6 != 0.0 ? var2.l6 / var1.l6 : 1.0;
      if (this.m1()) {
         e4c.u3.l6(this.u3);
      }
   }

   private boolean t4() {
      return com.aspose.slides.internal.v6g.k5.l6(this.p3(), Chart.class);
   }

   private boolean m1() {
      return this.t4() && this.getParentGroup() != null && this.getParentGroup().getParentGroup() != null;
   }

   private void l6(e4c var1, e4c var2) {
      o4f var3 = this.R_();
      if (this.x9() != null && this.getShapes().size() > 0) {
         e4c var4 = e4c.n5(var1, e4c.n5(var2, 2)).u9();
         e4c var5 = e4c.n5(this.k5(), e4c.n5(this.u9(), 2)).u9();
         double var6 = (var4.n5 - var5.n5) * (var3.u3() == 1 ? -1 : 1);
         double var8 = (var4.l6 - var5.l6) * (var3.a6() == 1 ? -1 : 1);
         if (com.aspose.slides.ms.System.q1.n5(var6) + com.aspose.slides.ms.System.q1.n5(var8) > 1.0E-4) {
            ShapeFrame var10 = ((Shape)this.getShapes().get_Item(0)).e5().n5(var4.n5, var4.l6);
            l3f var11 = this.k5(var10).l6();
            e4c var12 = var11.n5.l6().u9();
            e4c var13 = this.x8().u9();
            double var14 = var13.n5 * var2.n5;
            double var16 = var13.l6 * var2.l6;
            var12.n5 -= var14 / 2.0;
            var12.l6 -= var16 / 2.0;
            var3.n5(var12.u9());
            this.n5(var14, var16);
            this.n5(var1.u9());
            this.l6(var2.u9());
         }
      }
   }

   @Override
   com.aspose.slides.internal.o9b.w1[] P_() {
      return null;
   }

   @Override
   float[] Q_() {
      return null;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   c9u h0() {
      return this.n5();
   }

}
