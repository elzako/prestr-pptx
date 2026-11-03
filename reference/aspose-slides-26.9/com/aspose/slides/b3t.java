package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class b3t {
   private byte n5;
   private byte l6;
   private com.aspose.slides.ms.System.o5<Boolean> k5 = new com.aspose.slides.ms.System.o5<>();
   private final ColorFormat u3;
   private final GradientFormat a6;
   private final PictureFillFormat u9;
   private final PatternFormat h0;
   private long c8;

   b3t(ColorFormat var1, PictureFillFormat var2, GradientFormat var3, PatternFormat var4) {
      this.n5 = -1;
      this.l6 = -1;
      this.u3 = var1;
      this.u9 = var2;
      this.a6 = var3;
      this.h0 = var4;
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
      this.c8();
      this.k5 = new com.aspose.slides.ms.System.o5<>();
   }

   public final IColorFormat l6() {
      return this.u3;
   }

   public final byte k5() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
      this.c8();
   }

   final boolean u3() {
      if (!this.k5.l6()) {
         this.k5 = new com.aspose.slides.ms.System.o5<>(false);
         (!this.k5.l6()
               ? new com.aspose.slides.ms.System.o5<Boolean>()
               : new com.aspose.slides.ms.System.o5<>(
                  this.k5.n5(boolean.class) || this.n5() > 1 || this.n5() == 1 && (((ColorFormat)this.l6()).u3().s7() & 255) != 255
               ))
            .n5(this.k5);
      }

      return this.k5.n5();
   }

   final void a6() {
      this.n5 = -1;
      this.u3.h0();
      this.u9.c8();
      this.a6.n5(false);
      this.h0.n5(false);
      this.l6 = -1;
      this.c8();
   }

   final void n5(ILineFillFormat var1) {
      this.l6(var1);
      this.c8();
   }

   final void l6(ILineFillFormat var1) {
      this.n5 = var1.getFillType();
      this.u3.l6((ColorFormat)var1.getSolidFillColor());
      this.u9.l6((PictureFillFormat)((LineFillFormat)var1).t2());
      this.a6.l6((GradientFormat)var1.getGradientFormat());
      this.h0.l6((PatternFormat)var1.getPatternFormat());
      this.l6 = var1.getRotateWithShape();
   }

   final void n5(ILineFillFormatEffectiveData var1) {
      this.n5 = var1.getFillType();
      switch (var1.getFillType()) {
         case -1:
         case 5:
            throw new ArgumentException();
         case 0:
            break;
         case 1:
            this.u3.l6(((z1a)var1).u3().o8());
            break;
         case 2:
            this.a6.n5(var1.getGradientFormat());
            break;
         case 3:
            this.h0.n5(var1.getPatternFormat());
            break;
         case 4:
            this.u9.n5(((z1a)var1).l6());
            break;
         default:
            throw new ArgumentException();
      }

      this.l6 = (byte)(var1.getRotateWithShape() ? 1 : 0);
      this.c8();
   }

   final long u9() {
      return (
               (((this.c8 & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L) + (this.a6.getVersion() & 4294967295L) & 4294967295L)
                     + (this.u9.getVersion() & 4294967295L)
                  & 4294967295L
            )
            + (this.h0.getVersion() & 4294967295L)
         & 4294967295L;
   }

   private void c8() {
      this.c8++;
   }

   final boolean h0() {
      return this.n5 == -1;
   }

   @Override
   public boolean equals(Object obj) {
      ILineFillFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ILineFillFormat.class);
      if (var2 == null) {
         return false;
      }

      if (this.n5 != var2.getFillType()) {
         return false;
      }

      switch (this.n5) {
         case -1:
         case 0:
         default:
            return true;
         case 1:
            return this.u3.equals(var2.getSolidFillColor());
         case 2:
            return this.a6.equals(var2.getGradientFormat()) && this.l6 == var2.getRotateWithShape();
         case 3:
            return this.h0.equals(var2.getPatternFormat()) && this.l6 == var2.getRotateWithShape();
         case 4:
            return this.u9.equals(((LineFillFormat)var2).t2()) && this.l6 == var2.getRotateWithShape();
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      switch (this.n5) {
         case -1:
            return "FillFormat: NotDefined";
         case 0:
            return "FillFormat: NoFill";
         case 1:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"FillFormat: ", this.u3.toString()});
         case 2:
            return "FillFormat: Gradient";
         case 3:
            return "FillFormat: Pattern";
         case 4:
            return "FillFormat: Picture";
         case 5:
            return "FillFormat: Group";
         default:
            throw new ArgumentOutOfRangeException();
      }
   }
}
