package com.aspose.slides.internal.l9o;

import com.aspose.slides.exceptions.ArgumentException;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class n5 extends com.aspose.slides.internal.g3x.n5 implements v0 {
   protected n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.j9e.n5 n5(boolean var1) {
      this.c8();
      byte[] var2 = new byte[this.u3 * this.c8];
      if (!var1) {
         if (this.n5() == this.u9()) {
            this.k5(var2);
         } else {
            this.u3(var2);
         }
      }

      return new com.aspose.slides.internal.j9e.n5(this.h0, this.c8, this.u9(), this.u3, 0, var2);
   }

   protected abstract void k5(byte[] var1);

   protected void u3(byte[] var1) {
      BufferedImage var2 = this.l6();
      ColorModel var3 = var2.getColorModel();
      WritableRaster var4 = var2.getRaster();
      Object var5 = this.n5(var4);
      com.aspose.slides.internal.p4t.l6 var6 = this.n5(var1);
      var6.n5(new c4(this, var3, var4, var5));
   }

   protected abstract void n5(int var1, com.aspose.slides.internal.p4t.u3 var2);

   protected abstract int k5(int var1);

   protected void c8() {
      if (this.a6 < 0 || this.u9 < 0 || this.h0 < 1 || this.c8 < 1 || this.a6 + this.h0 > this.n5.e2() || this.u9 + this.c8 > this.n5.h0()) {
         this.t2();
      }

      int var1 = this.u9();
      if (this.n5() != 1052676 && var1 == 1052676 && this.n5(this.a6())) {
         this.t2();
      }

      if (this.a6() == 4) {
         this.t2();
      }

      if (var1 == 131072 || var1 == 2097152 || var1 == 262144 || var1 == 0 || var1 == 1048576 || var1 == 65536 || var1 == 15 || var1 == 524288) {
         this.t2();
      }
   }

   private void t2() {
      throw new ArgumentException("Parameter 'format' is not valid");
   }
}
