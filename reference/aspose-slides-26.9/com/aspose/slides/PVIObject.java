package com.aspose.slides;

public abstract class PVIObject implements ISlideComponent, q1v {
   private final r0g n5;
   private Object l6;
   private boolean k5;
   private boolean u3;
   private r0g a6;
   private IPresentationComponent u9;
   private ISlideComponent h0;

   PVIObject(r0g parentImmediate) {
      this.a6 = parentImmediate;
      this.n5 = parentImmediate;
   }

   final boolean z3() {
      return this.l6 != null;
   }

   final Object m1() {
      return this.l6;
   }

   final void n5(Object var1) {
      this.l6 = var1;
      if (var1 == null) {
         this.k5 = false;
      }
   }

   final void k7() {
      if (!this.z3()) {
         this.m3();
         this.l6 = this.M_();
      }

      if (!this.u3) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.n5, PVIObject.class)) {
            ((PVIObject)this.n5).k7();
         }

         this.u3 = true;
      }
   }

   final <P> void n5(P var1, P var2) {
      if ((!this.z3() || !this.u3) && (var1 == null && var2 != null || var1 != null && !var1.equals(var2))) {
         this.k7();
      }
   }

   final void m3() {
      if (!this.k5) {
         this.k5 = true;
         this.N_();
      }
   }

   @Override
   public r0g getParent_Immediate() {
      return this.a6;
   }

   final void l6(r0g var1) {
      this.a6 = var1;
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : ((q1v)this.m1()).getVersion();
   }

   final void z8() {
      this.u9 = null;
      this.h0 = null;
   }

   @Override
   public IPresentationComponent getParent_IPresentationComponent() {
      if (this.u9 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.u9};
         d0u.n5(IPresentationComponent.class, this.a6, var1);
         this.u9 = var1[0];
         if (com.aspose.slides.internal.v6g.k5.l6(this.u9, PVIObject.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartComponent.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, Background.class)) {
            this.u9 = com.aspose.slides.internal.v6g.k5.n5(this.u9, PVIObject.class).getParent_IPresentationComponent();
         }
      }

      return this.u9;
   }

   public ISlideComponent getParent_ISlideComponent() {
      if (this.h0 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.h0};
         d0u.n5(ISlideComponent.class, this.a6, var1);
         this.h0 = var1[0];
         if (com.aspose.slides.internal.v6g.k5.l6(this.h0, PVIObject.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartComponent.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, Background.class)) {
            this.h0 = com.aspose.slides.internal.v6g.k5.n5(this.h0, PVIObject.class).getParent_ISlideComponent();
         }
      }

      return this.h0;
   }

   public BaseSlide getSlide() {
      ISlideComponent var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_ISlideComponent(), ISlideComponent.class);
      return var1 != null ? (BaseSlide)var1.getSlide() : null;
   }

   public Presentation getPresentation() {
      IPresentationComponent var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_IPresentationComponent(), IPresentationComponent.class);
      return var1 != null ? (Presentation)var1.getPresentation() : null;
   }

   @Override
   public boolean equals(Object obj) {
      PVIObject var2 = com.aspose.slides.internal.v6g.k5.n5(obj, PVIObject.class);
      if (var2 == null) {
         return false;
      } else if (this.z3()) {
         return this.m1() != this ? this.m1().equals(var2) : super.equals(obj);
      } else {
         return var2.z3() ? var2.m1().equals(this) : true;
      }
   }

   @Override
   public int hashCode() {
      return this.z3() && this.m1() != this ? this.m1().hashCode() : super.hashCode();
   }

   void N_() {
   }

   abstract Object M_();

   final <T, TRealObject> T n5(q4x<T, TRealObject> var1) {
      return this.z3() ? var1.l6.invoke((TRealObject)this.m1()) : var1.n5;
   }

   final <T, TRealObject> boolean n5(q4x<T, TRealObject> var1, T var2) {
      this.n5(var1.n5, (T)var2);
      if (this.z3()) {
         var1.k5.n5(var2, this.m1());
         return true;
      } else {
         return false;
      }
   }
}
