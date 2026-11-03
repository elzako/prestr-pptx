package com.aspose.slides;

public final class BulletFormat extends PVIObject implements IBulletFormat {
   static final com.aspose.slides.internal.f3.a6<BulletFormat, g9, g9> n5 = new BulletFormat$1();
   private boolean l6;
   private Portion k5;
   private Paragraph u3;
   private final ColorFormat a6 = new ColorFormat(this);
   private Picture u9;
   private m5 h0;
   private v5 c8;
   private g9 t2;

   BulletFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.a6.u9();
      this.u9 = new Picture(this);
      this.h0 = new m5(this);
      this.c8 = new v5(this);
   }

   @Override
   Object M_() {
      return new l9(this.getParent_Immediate(), this.a6, this.u9, this.h0, this.c8);
   }

   final l9 l6() {
      return (l9)this.m1();
   }

   @Override
   public final byte getType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final char getChar() {
      return this.z3() ? this.l6().l6() : '\uffff';
   }

   @Override
   public final void setChar(char value) {
      this.n5('\uffff', value);
      if (this.z3()) {
         this.l6().n5(value);
      }

      this.n5(com.aspose.slides.ms.System.d1.n5(new char[]{value}));
   }

   final String u3() {
      return this.z3() ? this.l6().k5() : com.aspose.slides.ms.System.d1.n5;
   }

   final void n5(String var1) {
      this.n5(com.aspose.slides.ms.System.d1.n5, var1);
      if (this.z3()) {
         this.l6().n5(var1);
      }
   }

   @Override
   public final IFontData getFont() {
      return this.z3() ? this.l6().u3() : null;
   }

   @Override
   public final void setFont(IFontData value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final float getHeight() {
      return this.z3() ? this.l6().a6() : Float.NaN;
   }

   @Override
   public final void setHeight(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final IColorFormat getColor() {
      return this.a6;
   }

   @Override
   public final short getNumberedBulletStartWith() {
      return this.z3() ? this.l6().h0() : -1;
   }

   @Override
   public final void setNumberedBulletStartWith(short value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final byte getNumberedBulletStyle() {
      return this.z3() ? this.l6().c8() : -1;
   }

   @Override
   public final void setNumberedBulletStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
      }
   }

   @Override
   public final byte isBulletHardColor() {
      return this.z3() ? this.l6().t2() : -1;
   }

   @Override
   public final void setBulletHardColor(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().k5(value);
      }
   }

   @Override
   public final byte isBulletHardFont() {
      return this.z3() ? this.l6().s7() : -1;
   }

   @Override
   public final void setBulletHardFont(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().u3(value);
      }
   }

   @Override
   public final ISlidesPicture getPicture() {
      this.m3();
      return this.u9;
   }

   @Override
   public final void applyDefaultParagraphIndentsShifts() {
      this.k7();
      this.l6().x8();
   }

   @Override
   public final IBulletFormatEffectiveData getEffective() {
      return this.a6();
   }

   final g9 a6() {
      g9[] var1 = new g9[]{this.t2};
      g9 var2 = g9.n5(g9.class, var1, this, n5);
      this.t2 = var1[0];
      if (this.t2 != null) {
         this.t2.n5(g9.class);
      }

      return var2;
   }

   final m5 u9() {
      this.m3();
      return this.h0;
   }

   final v5 h0() {
      this.m3();
      return this.c8;
   }

   final Picture c8() {
      this.m3();
      return this.u9;
   }

   final boolean t2() {
      return this.z3() ? this.l6().e2() : false;
   }

   final boolean s7() {
      return this.z3() ? this.l6().t9() : false;
   }

   final void n5(BulletFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final void n5(g9 var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void l6(BulletFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().l6(var1);
      }
   }

   final boolean n5(IBulletFormat var1) {
      if (!this.z3() && !((PVIObject)var1).z3()) {
         return true;
      }

      this.k7();
      return this.l6().n5(var1);
   }

   final void l6(IBulletFormat var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().l6(var1);
      }
   }

   final void k5(IBulletFormat var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().k5(var1);
      }
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L + ((this.x8() != null ? this.x8().l6().getVersion() : 0L) & 4294967295L) & 4294967295L : this.l6().q0();
   }

   final Portion x8() {
      if (!this.l6 || this.k5 != null && (this.k5.n3() == null || !this.k5.n3().equals(this.u3))) {
         Paragraph[] var1 = new Paragraph[]{this.u3};
         boolean var2 = d0u.n5(Paragraph.class, this.getParent_Immediate(), var1) && var1[0].getPortions().getCount() > 0;
         this.u3 = var1[0];
         if (var2) {
            this.k5 = (Portion)this.u3.getPortions().get_Item(0);
         }

         this.l6 = true;
      }

      return this.k5;
   }
}
