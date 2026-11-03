package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public class FormatScheme implements IFormatScheme, r0g {
   private n3z l6;
   final com.aspose.slides.internal.v6g.n5<n3z> n5 = new FormatScheme$1(this);
   private r0g k5;
   private IPresentationComponent u3;
   private long a6 = 1L;
   private long u9 = 0L;
   private String h0;
   private FillFormatCollection c8;
   private LineFormatCollection t2;
   private EffectStyleCollection s7;
   private FillFormatCollection x8;

   FormatScheme(r0g parentImmediate) {
      this.k5 = parentImmediate;
      this.c8 = new FillFormatCollection(this);
      this.t2 = new LineFormatCollection(this);
      this.s7 = new EffectStyleCollection(this);
      this.x8 = new FillFormatCollection(this);
      this.c8.n5.l6(new FormatScheme$2(this));
      this.t2.n5.l6(new FormatScheme$3(this));
      this.s7.n5.l6(new FormatScheme$4(this));
      this.x8.n5.l6(new FormatScheme$5(this));
   }

   @Override
   public final IFillFormatCollection getFillStyles() {
      return this.c8;
   }

   @Override
   public final ILineFormatCollection getLineStyles() {
      return this.t2;
   }

   @Override
   public final IEffectStyleCollection getEffectStyles() {
      return this.s7;
   }

   @Override
   public final IFillFormatCollection getBackgroundFillStyles() {
      return this.x8;
   }

   @Override
   public final IBaseSlide getSlide() {
      return null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.n5().getPresentation();
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }

   final IPresentationComponent n5() {
      if (this.u3 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.u3};
         d0u.n5(IPresentationComponent.class, this.k5, var1);
         this.u3 = var1[0];
      }

      return this.u3;
   }

   final String l6() {
      return this.h0;
   }

   final void n5(String var1) {
      this.h0 = var1;
      this.a6();
   }

   final void k5() {
      c8j.n5(this);
      this.a6();
   }

   final void n5(FormatScheme var1) {
      this.c8.n5(var1.c8);
      this.t2.n5(var1.t2);
      this.s7.n5(var1.s7);
      this.x8.n5(var1.x8);
      this.h0 = var1.h0;
      this.a6();
   }

   final void n5(IFormatSchemeEffectiveData var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, l3m.class)) {
         l3m var2 = (l3m)var1;
         this.h0 = var2.n5();
         this.c8.n5(var2.l6);
         this.t2.n5(var2.k5);
         this.s7.n5(var2.u3);
         this.x8.n5(var2.a6);
         this.a6();
      } else {
         throw new NotImplementedException();
      }
   }

   private void a6() {
      this.a6++;
      this.u9();
   }

   private void u9() {
      this.u9 = 0L;
      n3z var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long u3() {
      if ((this.u9 & 4294967295L) == 0L) {
         this.u9 = (
                  (((this.a6 & 4294967295L) + (this.c8.k5() & 4294967295L) & 4294967295L) + (this.t2.k5() & 4294967295L) & 4294967295L)
                        + (this.s7.k5() & 4294967295L)
                     & 4294967295L
               )
               + (this.x8.k5() & 4294967295L)
            & 4294967295L;
      }

      return this.u9;
   }

   // $VF: synthetic method
   static n3z n5(FormatScheme var0, n3z var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(FormatScheme var0) {
      var0.u9();
   }
}
