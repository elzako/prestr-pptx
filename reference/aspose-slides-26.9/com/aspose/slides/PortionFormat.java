package com.aspose.slides;

public final class PortionFormat extends BasePortionFormat implements IPortionFormat {
   static final com.aspose.slides.internal.f3.a6<PortionFormat, c9g, c9g> n5 = new PortionFormat$1();
   private final b1i l6;
   private c9g k5;

   PortionFormat(r0g parentImmediate) {
      super(parentImmediate);
      this.m3();
      this.l6 = new b1i(this);
   }

   public PortionFormat() {
      this(null);
   }

   @Override
   Object M_() {
      return new c9h(this);
   }

   final c9h t9() {
      return (c9h)this.m1();
   }

   @Override
   public final String getBookmarkId() {
      return this.n5(t2q.m3);
   }

   @Override
   public final void setBookmarkId(String value) {
      this.n5(t2q.m3, value);
   }

   @Override
   public final boolean getSmartTagClean() {
      return this.n5(t2q.z8);
   }

   @Override
   public final void setSmartTagClean(boolean value) {
      this.n5(t2q.z8, value);
   }

   @Override
   public final IHyperlink getHyperlinkClick() {
      return this.z3() ? this.t9().e5() : null;
   }

   @Override
   public final void setHyperlinkClick(IHyperlink value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.t9().n5(value);
         if (value != null) {
            ((Hyperlink)this.t9().e5()).n5(this);
         }
      }
   }

   @Override
   public final IHyperlink getHyperlinkMouseOver() {
      return this.z3() ? this.t9().b3() : null;
   }

   @Override
   public final void setHyperlinkMouseOver(IHyperlink value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.t9().l6(value);
         if (value != null) {
            ((Hyperlink)this.t9().b3()).n5(this);
         }
      }
   }

   @Override
   public final IHyperlinkManager getHyperlinkManager() {
      this.k7();
      return this.t9().o0();
   }

   @Override
   public final IPortionFormatEffectiveData getEffective() {
      return this.r4();
   }

   final boolean z1() {
      return this.z3() ? this.t9().u6() : false;
   }

   final void l6(boolean var1) {
      this.n5(false, var1);
      this.t9().k5(var1);
   }

   final ParagraphFormat t4() {
      return com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), ParagraphFormat.class);
   }

   final b1i q0() {
      this.m3();
      return this.l6;
   }

   final void n5(c9g var1) {
      this.k7();
      this.t9().n5(var1);
   }

   final void l6(c9g var1) {
      this.k7();
      this.t9().l6(var1);
   }

   final void n5(float var1) {
      this.setFontHeight(this.getFontHeight() * var1);
      this.setSpacing(this.getSpacing() * var1);
   }

   final PortionFormat j5() {
      PortionFormat var1 = new PortionFormat();
      var1.n5((com.aspose.slides.BasePortionFormat)this);
      return var1;
   }

   final void w1() {
      if (this.z3()) {
         this.n5((Object)null);
      }
   }

   final c9g r4() {
      c9g[] var1 = new c9g[]{this.k5};
      c9g var2 = c9g.n5(c9g.class, var1, this, n5);
      this.k5 = var1[0];
      if (this.k5 != null) {
         this.k5.n5(c9g.class);
      }

      return var2;
   }

   final void c4() {
      this.k5 = null;
   }

   final void n5(Portion var1) {
      this.l6(var1);
      this.z8();
      this.c4();
   }

   static boolean u3(PortionFormat var0) {
      if (var0 == null) {
         return true;
      } else {
         return !BasePortionFormat.k5(var0) ? false : var0.getBookmarkId() == null && var0.getHyperlinkClick() == null && var0.getHyperlinkMouseOver() == null;
      }
   }

   final boolean y2() {
      return this.z3() ? ((c9h)this.m1()).t1() : true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   c9h l6() {
      return this.t9();
   }

}
