package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public class ColorScheme implements IColorScheme, r0g {
   private r1x k5;
   final com.aspose.slides.internal.v6g.n5<r1x> n5 = new ColorScheme$1(this);
   private r0g u3;
   private IPresentationComponent a6;
   private long u9 = 1L;
   private long h0 = 0L;
   ColorFormat[] l6 = new ColorFormat[12];
   private String c8 = "";
   private z3b t2 = new z3b();

   ColorScheme(r0g parentImmediate) {
      this.u3 = parentImmediate;

      for (int var2 = 0; var2 < this.l6.length; var2++) {
         this.l6[var2] = new ColorFormat(this);
         this.l6[var2].n5.l6(new ColorScheme$2(this));
      }
   }

   @Override
   public final IColorFormat getByColorSchemeIndex(byte index) {
      int var2 = (index & 255) - 0;
      return var2 >= 0 && var2 < this.l6.length ? this.l6[var2] : null;
   }

   @Override
   public final IColorFormat getDark1() {
      return this.getByColorSchemeIndex((byte)0);
   }

   @Override
   public final IColorFormat getLight1() {
      return this.getByColorSchemeIndex((byte)1);
   }

   @Override
   public final IColorFormat getDark2() {
      return this.getByColorSchemeIndex((byte)2);
   }

   @Override
   public final IColorFormat getLight2() {
      return this.getByColorSchemeIndex((byte)3);
   }

   @Override
   public final IColorFormat getAccent1() {
      return this.getByColorSchemeIndex((byte)4);
   }

   @Override
   public final IColorFormat getAccent2() {
      return this.getByColorSchemeIndex((byte)5);
   }

   @Override
   public final IColorFormat getAccent3() {
      return this.getByColorSchemeIndex((byte)6);
   }

   @Override
   public final IColorFormat getAccent4() {
      return this.getByColorSchemeIndex((byte)7);
   }

   @Override
   public final IColorFormat getAccent5() {
      return this.getByColorSchemeIndex((byte)8);
   }

   @Override
   public final IColorFormat getAccent6() {
      return this.getByColorSchemeIndex((byte)9);
   }

   @Override
   public final IColorFormat getHyperlink() {
      return this.getByColorSchemeIndex((byte)10);
   }

   @Override
   public final IColorFormat getFollowedHyperlink() {
      return this.getByColorSchemeIndex((byte)11);
   }

   @Override
   public final IBaseSlide getSlide() {
      return null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.k5().getPresentation();
   }

   final String n5() {
      return this.c8;
   }

   final void n5(String var1) {
      this.c8 = var1;
      this.a6();
   }

   final z3b l6() {
      return this.t2;
   }

   final void n5(ColorScheme var1) {
      for (int var2 = 0; var2 < var1.l6.length; var2++) {
         this.l6[var2].n5(var1.l6[var2]);
      }

      this.c8 = var1.c8;
      this.l6().n5(var1.l6());
      this.a6();
   }

   final void n5(IColorSchemeEffectiveData var1) {
      for (int var2 = 0; var2 < this.l6.length; var2++) {
         this.l6[var2].l6(((y4u)var1).n5((byte)var2).o8());
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, y4u.class)) {
         y4u var3 = (y4u)var1;
         this.c8 = var3.y4();
         this.l6().n5(var3.k5);
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   final IPresentationComponent k5() {
      if (this.a6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.a6};
         d0u.n5(IPresentationComponent.class, this.u3, var1);
         this.a6 = var1[0];
      }

      return this.a6;
   }

   private void a6() {
      this.u9++;
      this.u9();
   }

   private void u9() {
      this.h0 = 0L;
      r1x var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long u3() {
      if ((this.h0 & 4294967295L) == 0L) {
         this.h0 = this.u9;

         for (ColorFormat var4 : this.l6) {
            this.h0 = (this.h0 & 4294967295L) + (var4.getVersion() & 4294967295L) & 4294967295L;
         }
      }

      return this.h0;
   }

   // $VF: synthetic method
   static r1x n5(ColorScheme var0, r1x var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static void l6(ColorScheme var0) {
      var0.u9();
   }
}
