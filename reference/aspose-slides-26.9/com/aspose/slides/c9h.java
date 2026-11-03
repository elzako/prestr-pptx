package com.aspose.slides;

final class c9h extends b1 {
   private String t2;
   private Hyperlink s7;
   private Hyperlink x8;
   private boolean n3;
   private final HyperlinkManager y4;
   private final b1i e2;

   c9h(PortionFormat var1) {
      super(var1.getParent_Immediate(), var1.u3(), var1.a6(), var1.c8(), var1.t2(), var1.u9(), var1.h0(), var1.y4());
      this.e2 = var1.q0();
      this.t2 = t2q.m3.n5;
      this.n3 = false;
      this.y4 = new HyperlinkManager(var1);
   }

   public final String i1() {
      return this.t2;
   }

   public final void k5(String var1) {
      this.t2 = var1;
      this.s3();
   }

   public final IHyperlink e5() {
      return this.s7;
   }

   public final void n5(IHyperlink var1) {
      this.s7 = (Hyperlink)var1;
      if (var1 != null) {
         this.s7.n5(this.y4.n5());
      }

      this.s3();
   }

   public final IHyperlink b3() {
      return this.x8;
   }

   public final void l6(IHyperlink var1) {
      this.x8 = (Hyperlink)var1;
      if (var1 != null) {
         this.x8.n5(this.y4.n5());
      }

      this.s3();
   }

   public final IHyperlinkManager o0() {
      return this.y4;
   }

   public final boolean z7() {
      return this.k5(19);
   }

   public final void l6(boolean var1) {
      if (this.k5(19) != var1) {
         this.n5(19, var1);
         this.s3();
      }
   }

   final b1i v4() {
      return this.e2;
   }

   @Override
   void n5(c9g var1) {
      super.n5(var1);
      this.k5(var1.getBookmarkId());
      this.n5(var1.getHyperlinkClick());
      this.l6(var1.getHyperlinkMouseOver());
   }

   @Override
   void d2() {
      super.d2();
      this.n5((IHyperlink)null);
      this.l6((IHyperlink)null);
      this.k5((java.lang.String)null);
   }

   @Override
   void n5(BasePortionFormat var1) {
      super.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, PortionFormat.class)) {
         PortionFormat var2 = com.aspose.slides.internal.v6g.k5.n5(var1, PortionFormat.class);
         this.n5(var2.getHyperlinkClick());
         this.l6(var2.getHyperlinkMouseOver());
         this.k5(var2.getBookmarkId());
      }
   }

   @Override
   void l6(BasePortionFormat var1) {
      super.l6(var1);
      IPortionFormat var2 = (IPortionFormat)var1;
      if (var2.getBookmarkId() != null) {
         this.t2 = var2.getBookmarkId();
      }

      if (var2.getHyperlinkClick() != null) {
         this.s7 = (Hyperlink)var2.getHyperlinkClick();
      }

      if (var2.getHyperlinkMouseOver() != null) {
         this.x8 = (Hyperlink)var2.getHyperlinkMouseOver();
      }

      this.l6(var2.getSmartTagClean());
   }

   @Override
   void n5(PortionFormat var1) {
      super.n5(var1);
      if (this.e5() != null) {
         var1.setHyperlinkClick(this.e5());
      }

      if (this.b3() != null) {
         var1.setHyperlinkMouseOver(this.b3());
      }

      if (this.i1() != null) {
         var1.setBookmarkId(this.i1());
      }

      var1.setSmartTagClean(this.z7());
   }

   @Override
   void l6(PortionFormat var1) {
      super.l6(var1);
      this.l6(var1.getSmartTagClean());
      if (this.e5() == null) {
         this.n5(var1.getHyperlinkClick());
      }

      if (this.b3() == null) {
         this.l6(var1.getHyperlinkMouseOver());
      }

      if (this.i1() == null) {
         this.k5(var1.getBookmarkId());
      }

      if (this.q0() == null) {
         this.n5(var1.getLatinFont());
      }

      if (this.z3() == null) {
         this.l6(var1.getEastAsianFont());
      }

      if (this.m1() == null) {
         this.k5(var1.getComplexScriptFont());
      }
   }

   final boolean u6() {
      return this.n3;
   }

   final void k5(boolean var1) {
      this.n3 = var1;
      this.s3();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.internal.v6g.k5.l6(obj, IBasePortionFormat.class) && !n5(this, (IBasePortionFormat)obj)) {
         return false;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(obj, IPortionFormat.class)) {
         IPortionFormat var2 = (IPortionFormat)obj;
         if (var2 == null) {
            return false;
         }

         if (!com.aspose.slides.ms.System.d1.a6(this.i1(), var2.getBookmarkId())
            || !com.aspose.slides.internal.n8e.v4.n5(this.e5(), var2.getHyperlinkClick())
            || !com.aspose.slides.internal.n8e.v4.n5(this.b3(), var2.getHyperlinkMouseOver())) {
            return false;
         }
      }

      return true;
   }

   final boolean t1() {
      if (this.c4() != 524288 || (this.c8.n5() & 4294967295L) != 4294967295L) {
         return false;
      } else {
         return !this.n5().isFormatNotDefined()
               || !((FillFormat)this.l6()).t2()
               || !EffectFormat.n5((EffectFormat)this.k5())
               || !((ColorFormat)this.u3()).n3()
               || !this.a6().isFormatNotDefined()
               || !((FillFormat)this.u9()).t2()
               || !com.aspose.slides.internal.n8e.v4.n5(this.t4(), Float.NaN)
               || !com.aspose.slides.internal.n8e.v4.n5(this.q0(), null)
               || !com.aspose.slides.internal.n8e.v4.n5(this.z3(), null)
               || !com.aspose.slides.internal.n8e.v4.n5(this.m1(), null)
               || !com.aspose.slides.internal.n8e.v4.n5(this.k7(), null)
               || !com.aspose.slides.internal.n8e.v4.n5(this.m3(), Float.NaN)
               || !com.aspose.slides.internal.n8e.v4.n5(this.z8(), Float.NaN)
               || this.j5() != null
               || this.w1() != null
               || !com.aspose.slides.internal.n8e.v4.n5(this.r4(), Float.NaN)
            ? false
            : this.i1() == null && com.aspose.slides.internal.n8e.v4.n5(this.e5(), null) && com.aspose.slides.internal.n8e.v4.n5(this.b3(), null);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
