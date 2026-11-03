package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

public final class LineFillFormat extends PVIObject implements ILineFillFormat {
   private o3m k5;
   final com.aspose.slides.internal.v6g.n5<o3m> n5 = new LineFillFormat$1(this);
   private l1w u3;
   final com.aspose.slides.internal.v6g.n5<l1w> l6 = new LineFillFormat$2(this);
   private PictureFillFormat a6;
   private ColorFormat u9;
   private GradientFormat h0;
   private PatternFormat c8;

   LineFillFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u9 = new ColorFormat(this, 7);
      this.a6 = new PictureFillFormat(this);
      this.h0 = new GradientFormat(this);
      this.c8 = new PatternFormat(this);
      this.u9.n5.l6(new LineFillFormat$3(this));
      this.a6.n5.l6(new LineFillFormat$4(this));
      this.h0.l6.l6(new LineFillFormat$5(this));
      this.c8.n5.l6(new LineFillFormat$6(this));
   }

   @Override
   Object M_() {
      return new b3t(this.u9, this.a6, this.h0, this.c8);
   }

   final b3t l6() {
      return (b3t)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().u9();
   }

   @Override
   public final byte getFillType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setFillType(byte value) {
      if (value != 4 && value != 5) {
         this.n5((byte)-1, value);
         if (this.z3() && this.l6().n5() != value) {
            this.l6().n5(value);
            this.c8();
            if (this.k5 != null) {
               this.k5.n5();
            }
         }
      } else {
         throw new Exception("LineFillFormat.FillType cannot be FillType.Picture or FillType.Group.");
      }
   }

   final void u3() {
      this.n5((byte)-1, (byte)4);
      if (this.z3() && this.l6().n5() != 4) {
         this.l6().n5((byte)4);
         this.c8();
         if (this.k5 != null) {
            this.k5.n5();
         }
      }
   }

   @Override
   public final byte getRotateWithShape() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setRotateWithShape(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.c8();
      }
   }

   @Override
   public final IColorFormat getSolidFillColor() {
      this.m3();
      return this.u9;
   }

   @Override
   public final IGradientFormat getGradientFormat() {
      this.m3();
      return this.h0;
   }

   @Override
   public final IPatternFormat getPatternFormat() {
      this.m3();
      return this.c8;
   }

   final boolean a6() {
      return this.z3() ? this.l6().u3() : false;
   }

   final boolean u9() {
      return this.z3() ? this.l6().h0() : true;
   }

   final void h0() {
      this.k7();
      this.l6().a6();
   }

   final void n5(ILineFillFormat var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void n5(ILineFillFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.c8();
   }

   final void c8() {
      l1w var1 = this.u3;
      if (var1 != null && !this.l6.n5()) {
         var1.n5();
      }
   }

   final IPictureFillFormat t2() {
      this.m3();
      return this.a6;
   }

   // $VF: synthetic method
   static o3m n5(LineFillFormat var0, o3m var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l1w n5(LineFillFormat var0, l1w var1) {
      return var0.u3 = var1;
   }
}
