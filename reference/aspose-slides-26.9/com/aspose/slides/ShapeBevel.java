package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public final class ShapeBevel extends PVIObject implements IShapeBevel {
   private p0k u3;
   final com.aspose.slides.internal.v6g.n5<p0k> n5 = new ShapeBevel$1(this);
   static final ShapeBevel l6 = new ShapeBevel(true);
   static final ShapeBevel k5 = new ShapeBevel(false);

   public ShapeBevel(boolean bIsTopBevel) {
      super(null);
      this.m3();
      this.n5(new t8e(bIsTopBevel));
   }

   ShapeBevel(r0g parentImmediate, boolean bIsTopBevel) {
      super(parentImmediate);
      this.m3();
      this.n5(new t8e(bIsTopBevel));
   }

   @Override
   Object M_() {
      throw new NotImplementedException("Can not create ShapeBevel object with lazy initialization, use instant constructor instead.");
   }

   final t8e l6() {
      return (t8e)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().a6();
   }

   @Override
   public boolean equals(Object obj) {
      ShapeBevel var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ShapeBevel.class);
      if (var2 == null) {
         return false;
      } else if (this.z3()) {
         return this.l6().l6(var2);
      } else {
         return var2.z3() ? var2.l6().l6(this) : true;
      }
   }

   @Override
   public final double getWidth() {
      return this.z3() ? this.l6().n5() : Double.NaN;
   }

   @Override
   public final void setWidth(double value) {
      this.n5(Double.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.a6();
      }
   }

   @Override
   public final double getHeight() {
      return this.z3() ? this.l6().l6() : Double.NaN;
   }

   @Override
   public final void setHeight(double value) {
      this.n5(Double.NaN, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.a6();
      }
   }

   @Override
   public final int getBevelType() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setBevelType(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.a6();
      }
   }

   final boolean u3() {
      return this.z3() ? this.l6().u3() : false;
   }

   final void n5(IShapeBevel var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5((ShapeBevel)var1);
      }
   }

   final void n5(IShapeBevelEffectiveData var1) {
      this.k7();
      this.l6().n5((f6g)var1);
   }

   private void a6() {
      p0k var1 = this.u3;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static p0k n5(ShapeBevel var0, p0k var1) {
      return var0.u3 = var1;
   }
}
