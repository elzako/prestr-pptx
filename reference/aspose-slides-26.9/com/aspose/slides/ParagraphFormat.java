package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class ParagraphFormat extends PVIObject implements IChartParagraphFormat, IParagraphFormat {
   private ParagraphFormat$n5 k5;
   final com.aspose.slides.internal.v6g.n5<ParagraphFormat$n5> n5 = new ParagraphFormat$1(this);
   static final com.aspose.slides.internal.f3.a6<ParagraphFormat, t3x, t3x> l6 = new ParagraphFormat$2();
   private boolean u3;
   private Cell a6;
   private BulletFormat u9;
   private PortionFormat h0;
   private TabCollection c8;
   private n7w t2;
   private c6m s7;
   private t3x x8;

   ParagraphFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   public ParagraphFormat() {
      super(null);
   }

   ParagraphFormat(ParagraphFormat paraprop, r0g parentImmediate) {
      super(parentImmediate);
      this.m3();
      this.n5(new s6x(paraprop, parentImmediate, this.u9, this.h0, this.c8, this.t2, this.s7));
   }

   @Override
   void N_() {
      this.u9 = new BulletFormat(this);
      this.h0 = new PortionFormat(this);
      this.c8 = new TabCollection(this);
      this.t2 = new n7w(this);
      this.s7 = new c6m(this);
   }

   @Override
   Object M_() {
      return new s6x(this.getParent_Immediate(), this.u9, this.h0, this.c8, this.t2, this.s7);
   }

   private s6x t4() {
      return (s6x)this.m1();
   }

   @Override
   public final IBulletFormat getBullet() {
      return this.l6();
   }

   @Override
   public final short getDepth() {
      return this.n5(f9r.e2);
   }

   @Override
   public final void setDepth(short value) {
      this.n5(f9r.e2, value);
   }

   @Override
   public final int getAlignment() {
      return this.n5(f9r.n5);
   }

   @Override
   public final void setAlignment(int value) {
      this.n5(f9r.n5, value);
   }

   @Override
   public final float getSpaceWithin() {
      return this.n5(f9r.l6);
   }

   @Override
   public final void setSpaceWithin(float value) {
      this.n5(f9r.l6, value);
   }

   @Override
   public final float getSpaceBefore() {
      return this.n5(f9r.k5);
   }

   @Override
   public final void setSpaceBefore(float value) {
      this.n5(f9r.k5, value);
   }

   @Override
   public final float getSpaceAfter() {
      return this.n5(f9r.u3);
   }

   @Override
   public final void setSpaceAfter(float value) {
      this.n5(f9r.u3, value);
   }

   @Override
   public final byte getEastAsianLineBreak() {
      return this.n5(f9r.a6);
   }

   @Override
   public final void setEastAsianLineBreak(byte value) {
      this.n5(f9r.a6, value);
   }

   @Override
   public final byte getRightToLeft() {
      return this.n5(f9r.u9);
   }

   @Override
   public final void setRightToLeft(byte value) {
      this.n5(f9r.u9, value);
   }

   @Override
   public final byte getLatinLineBreak() {
      return this.n5(f9r.h0);
   }

   @Override
   public final void setLatinLineBreak(byte value) {
      this.n5(f9r.h0, value);
   }

   @Override
   public final byte getHangingPunctuation() {
      return this.n5(f9r.c8);
   }

   @Override
   public final void setHangingPunctuation(byte value) {
      this.n5(f9r.c8, value);
   }

   @Override
   public final float getMarginLeft() {
      return this.n5(f9r.t2);
   }

   @Override
   public final void setMarginLeft(float value) {
      this.n5(f9r.t2, value);
   }

   @Override
   public final float getMarginRight() {
      return this.n5(f9r.s7);
   }

   @Override
   public final void setMarginRight(float value) {
      this.n5(f9r.s7, value);
   }

   @Override
   public final float getIndent() {
      return this.n5(f9r.x8);
   }

   @Override
   public final void setIndent(float value) {
      this.n5(f9r.x8, value);
   }

   @Override
   public final float getDefaultTabSize() {
      return this.n5(f9r.n3);
   }

   @Override
   public final void setDefaultTabSize(float value) {
      this.n5(f9r.n3, value);
   }

   @Override
   public final ITabCollection getTabs() {
      this.m3();
      return this.c8;
   }

   @Override
   public final int getFontAlignment() {
      return this.n5(f9r.y4);
   }

   @Override
   public final void setFontAlignment(int value) {
      this.n5(f9r.y4, value);
   }

   @Override
   public final IPortionFormat getDefaultPortionFormat() {
      this.m3();
      return this.h0;
   }

   @Override
   public final IParagraphFormatEffectiveData getEffective() {
      return this.t9();
   }

   final BulletFormat l6() {
      this.m3();
      return this.u9;
   }

   final PortionFormat u3() {
      this.m3();
      return this.h0;
   }

   final TabCollection a6() {
      this.k7();
      return this.t4().q0();
   }

   final short u9() {
      return this.z3() ? this.t4().m1() : -1;
   }

   final void n5(short var1) {
      this.n5(-1, var1);
      if (this.z3()) {
         this.t4().l6(var1);
      }
   }

   final boolean h0() {
      return this.z3() ? this.t4().m3() : false;
   }

   final n7w c8() {
      this.m3();
      return this.t2;
   }

   final c6m t2() {
      this.m3();
      return this.s7;
   }

   final void n5(ParagraphFormat var1) {
      if (this.z3() || var1 == null || var1.z3()) {
         this.k7();
         this.t4().n5(var1);
      }
   }

   final void n5(IParagraphFormat var1) {
      if (this.z3() || !com.aspose.slides.internal.v6g.k5.l6(var1, PVIObject.class) || ((PVIObject)var1).z3()) {
         this.k7();
         this.t4().n5(var1);
      }
   }

   final void n5(t3x var1) {
      this.k7();
      this.t4().n5(var1);
   }

   final boolean l6(IParagraphFormat var1) {
      if (!this.z3() && !((PVIObject)var1).z3()) {
         return true;
      }

      this.k7();
      return this.t4().l6(var1);
   }

   final boolean s7() {
      if (!this.z3()) {
         return true;
      }

      this.k7();
      return this.t4().z8();
   }

   final void l6(ParagraphFormat var1) {
      this.k7();
      this.t4().l6(var1);
   }

   final void k5(ParagraphFormat var1) {
      this.k7();
      this.t4().k5(var1);
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L + ((this.n3() != null ? this.n3().k5().x8().getVersion() : 0L) & 4294967295L) & 4294967295L : this.t4().j5();
   }

   final int x8() {
      return this.z3() ? this.t4().t9().size() : 0;
   }

   final ParagraphFormat u3(ParagraphFormat var1) {
      ParagraphFormat var2 = new ParagraphFormat(var1, this);
      this.l6(var2);
      return var2;
   }

   final Cell n3() {
      if (!this.u3) {
         Cell[] var1 = new Cell[]{this.a6};
         d0u.n5(Cell.class, this.getParent_Immediate(), var1);
         this.a6 = var1[0];
         this.u3 = true;
      }

      return this.a6;
   }

   final void n5(float var1) {
      this.u3().n5(var1);
      this.setMarginLeft(this.getMarginLeft() * var1);
      this.setMarginRight(this.getMarginRight() * var1);
      this.setIndent(this.getIndent() * var1);
      if (this.getSpaceBefore() < 0.0F) {
         this.setSpaceBefore(this.getSpaceBefore() * var1);
      }

      if (this.getSpaceAfter() < 0.0F) {
         this.setSpaceAfter(this.getSpaceAfter() * var1);
      }

      this.setDefaultTabSize(this.getDefaultTabSize() * var1);
      IGenericEnumerator var2 = this.getTabs().iterator();

      try {
         while (var2.hasNext()) {
            ITab var3 = (ITab)var2.next();
            var3.setPosition(var3.getPosition() * var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final ParagraphFormat y4() {
      ParagraphFormat var1 = new ParagraphFormat();
      var1.n5(this);
      return var1;
   }

   final void e2() {
      if (this.z3()) {
         short var1 = this.u9();
         this.n5((Object)null);
         this.n5(var1);
      }
   }

   final t3x t9() {
      t3x[] var1 = new t3x[]{this.x8};
      t3x var2 = t3x.n5(t3x.class, var1, this, l6);
      this.x8 = var1[0];
      if (this.x8 != null) {
         this.x8.n5(t3x.class);
      }

      return var2;
   }

   final void z1() {
      this.x8 = null;
   }

   // $VF: synthetic method
   static ParagraphFormat$n5 n5(ParagraphFormat var0, ParagraphFormat$n5 var1) {
      return var0.k5 = var1;
   }
}
