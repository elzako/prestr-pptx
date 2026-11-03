package com.aspose.slides.internal.l9o;

import com.aspose.slides.exceptions.AccessViolationException;
import com.aspose.slides.exceptions.ArgumentException;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class f2 extends com.aspose.slides.internal.g3x.n5 implements f0 {
   protected com.aspose.slides.internal.j9e.n5 t2;

   protected f2(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2);
      this.t2 = var3;
   }

   @Override
   public void x8() {
      this.n5(this.t2);
      if (this.t2()) {
         if (this.n5() == this.u9()) {
            this.c8();
         } else {
            this.s7();
         }
      }
   }

   protected abstract void c8();

   protected void s7() {
      BufferedImage var1 = this.l6();
      WritableRaster var2 = this.k5();
      ColorModel var3 = var1.getColorModel();
      Object var4 = this.n5(var2);
      com.aspose.slides.internal.p4t.l6 var5 = this.n5(this.n3());
      var5.n5(new i1(this, var2, var3, var4));
   }

   protected int n5(com.aspose.slides.internal.p4t.u3 var1) {
      return var1.n5();
   }

   protected abstract int k5(int var1);

   protected byte[] n3() {
      return (byte[])this.t2.u3().k5().n5();
   }

   private void n5(com.aspose.slides.internal.j9e.n5 var1) {
      if (!this.l6(this.a6()) || (var1.l6() <= this.n5.e2() || this.n5.s7() == 197634) && var1.n5() <= this.n5.h0()) {
         if (this.u9() == 1052676 && this.n5() != this.u9() && this.l6(this.a6())) {
            throw new ArgumentException("Parameter 'format' is not valid");
         }
      } else {
         throw new AccessViolationException();
      }
   }

   private boolean t2() {
      return this.l6(this.a6()) || this.n5() == this.u9();
   }
}
