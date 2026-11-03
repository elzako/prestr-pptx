package com.aspose.slides;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

public final class TextStyle extends PVIObject implements ITextStyle, q7p {
   private ParagraphFormat$n5 k5;
   final com.aspose.slides.internal.v6g.n5<ParagraphFormat$n5> n5 = new TextStyle$1(this);
   static final com.aspose.slides.internal.f3.a6<TextStyle, n1x, n1x> l6 = new TextStyle$2();
   private ParagraphFormat u3;
   private ParagraphFormat[] a6;
   private n1x u9;

   TextStyle(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u3 = new ParagraphFormat(this);
      this.a6 = new ParagraphFormat[10];
      this.a6[0] = this.u3;
   }

   @Override
   Object M_() {
      return new f7b(this.u3, this);
   }

   final f7b l6() {
      return (f7b)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().a6();
   }

   @Override
   public final IParagraphFormat getLevel(int index) {
      if (index < 0 || index > 8) {
         throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
      } else {
         return this.z3() ? this.l6().n5(index) : null;
      }
   }

   @Override
   public final IParagraphFormat getDefaultParagraphFormat() {
      if (this.z3()) {
         return this.l6().n5();
      }

      this.m3();
      return this.u3;
   }

   @Override
   public final ITextStyleEffectiveData getEffective() {
      return this.c8();
   }

   final ParagraphFormat[] u3() {
      if (this.z3()) {
         return this.l6().l6();
      }

      this.m3();
      return this.a6;
   }

   final com.aspose.slides.ms.System.o5<Integer> a6() {
      return this.z3() ? this.l6().k5() : new com.aspose.slides.ms.System.o5<>();
   }

   final void n5(com.aspose.slides.ms.System.o5<Integer> var1) {
      this.k7();
      this.l6().n5(var1.k5());
   }

   final void n5(int var1) {
      this.k7();
      this.l6().l6(var1);
   }

   final void n5(int var1, ParagraphFormat var2) {
      this.k7();
      this.l6().n5(var1, var2);
   }

   final void n5(TextStyle var1) {
      if (this.z3() || var1.z3()) {
         if (!this.z3() && this.a6(var1)) {
            this.m3();
            this.u3.n5(var1.u3()[0]);
            this.a6[0] = this.u3;
         } else {
            this.k7();
            this.l6().n5(var1);
         }
      }
   }

   final void n5(n1x var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void l6(TextStyle var1) {
      if (this.z3() || var1.z3()) {
         if (!this.z3() && this.a6(var1)) {
            this.m3();
            this.u3.n5((IParagraphFormat)var1.u3()[0]);
            this.a6[0] = this.u3;
         } else {
            this.k7();
            this.l6().l6(var1);
         }
      }
   }

   final void k5(TextStyle var1) {
      if (this.z3() || var1.z3()) {
         if (!this.z3() && this.a6(var1)) {
            this.m3();
            this.u3 = new ParagraphFormat(var1.u3()[0], this);
            this.a6[0] = this.u3;
         } else {
            this.k7();
            this.l6().k5(var1);
         }
      }
   }

   final boolean u9() {
      boolean var1 = false;
      var1 |= ((ParagraphFormat)this.getDefaultParagraphFormat()).h0();

      for (int var2 = 0; var2 <= 8; var2++) {
         ParagraphFormat var3 = (ParagraphFormat)this.getLevel(var2);
         if (var3 != null) {
            var1 |= var3.h0();
         }
      }

      return var1;
   }

   final IParagraphFormat l6(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         this.k7();
         return this.l6().k5(var1);
      } else {
         throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
      }
   }

   final ParagraphFormat n5(ParagraphFormat var1) {
      this.k7();
      return this.l6().n5(var1);
   }

   final ParagraphFormat l6(int var1, ParagraphFormat var2) {
      if (var1 >= 0 && var1 <= 8) {
         if (var2 != null && this.u3()[var1 + 1] == null) {
            return var2;
         }

         this.k7();
         return this.l6().l6(var1, var2);
      } else {
         throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
      }
   }

   final void h0() {
      if (this.z3()) {
         this.l6().u3();
      }
   }

   final boolean u3(TextStyle var1) {
      if (!this.z3() && !var1.z3()) {
         return true;
      }

      this.k7();
      return this.l6().u3(var1);
   }

   private boolean a6(TextStyle var1) {
      for (int var2 = 1; var2 < var1.u3().length; var2++) {
         if (var1.u3()[var2] != null) {
            return false;
         }
      }

      return true;
   }

   final void n5(float var1) {
      ((ParagraphFormat)this.getDefaultParagraphFormat()).n5(var1);

      for (int var2 = 0; var2 <= 8; var2++) {
         ParagraphFormat var3 = (ParagraphFormat)this.getLevel(var2);
         if (var3 != null) {
            var3.n5(var1);
         }
      }
   }

   final n1x c8() {
      n1x[] var1 = new n1x[]{this.u9};
      n1x var2 = n1x.n5(n1x.class, var1, this, l6);
      this.u9 = var1[0];
      if (this.u9 != null) {
         this.u9.n5(n1x.class);
      }

      return var2;
   }

   final void t2() {
      this.u9 = null;
   }

   // $VF: synthetic method
   static ParagraphFormat$n5 n5(TextStyle var0, ParagraphFormat$n5 var1) {
      return var0.k5 = var1;
   }
}
