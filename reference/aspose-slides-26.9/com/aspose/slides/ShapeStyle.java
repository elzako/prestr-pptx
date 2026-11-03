package com.aspose.slides;

public class ShapeStyle extends DomObject<Shape> implements IShapeStyle {
   private long n5;
   private final ColorFormat l6 = new ColorFormat(this);
   private final ColorFormat k5 = new ColorFormat(this);
   private final ColorFormat u3 = new ColorFormat(this);
   private final ColorFormat a6 = new ColorFormat(this);
   private long h0;
   private long c8;
   private long t2;
   private byte s7;

   @Override
   public final IColorFormat getLineColor() {
      return this.l6;
   }

   @Override
   public final int getLineStyleIndex() {
      return (int)(this.h0 & 65535L);
   }

   @Override
   public final void setLineStyleIndex(int value) {
      this.h0 = value & 65535;
      this.k5();
   }

   @Override
   public final IColorFormat getFillColor() {
      return this.k5;
   }

   @Override
   public final short getFillStyleIndex() {
      short var1 = (short)((this.c8 & 4294967295L) % 1000L);
      return (this.c8 & 4294967295L) < 1000L ? var1 : (short)(-var1);
   }

   @Override
   public final void setFillStyleIndex(short value) {
      if (value < 0) {
         this.c8 = 1000 - value & 4294967295L;
      } else {
         this.c8 = value & 4294967295L;
      }

      this.k5();
   }

   @Override
   public final IColorFormat getEffectColor() {
      return this.u3;
   }

   @Override
   public final long getEffectStyleIndex() {
      return this.t2;
   }

   @Override
   public final void setEffectStyleIndex(long value) {
      this.t2 = value;
      this.k5();
   }

   @Override
   public final IColorFormat getFontColor() {
      return this.a6;
   }

   @Override
   public final byte getFontCollectionIndex() {
      return this.s7;
   }

   @Override
   public final void setFontCollectionIndex(byte value) {
      this.s7 = value;
      this.k5();
   }

   ShapeStyle(Shape parentImmediate) {
      super(parentImmediate);
   }

   final ShapeStyle n5() {
      ShapeStyle var1 = new ShapeStyle(this.u9);
      var1.n5(this);
      return var1;
   }

   final void n5(IShapeStyle var1) {
      this.l6.n5((ColorFormat)var1.getLineColor());
      this.k5.n5((ColorFormat)var1.getFillColor());
      this.u3.n5((ColorFormat)var1.getEffectColor());
      this.a6.n5((ColorFormat)var1.getFontColor());
      ShapeStyle var2 = (ShapeStyle)var1;
      this.h0 = var2.h0;
      this.c8 = var2.c8;
      this.t2 = var2.t2;
      this.s7 = var2.s7;
   }

   final IBaseSlide l6() {
      return this.u9.getSlide();
   }

   private void k5() {
      this.n5++;
   }
}
