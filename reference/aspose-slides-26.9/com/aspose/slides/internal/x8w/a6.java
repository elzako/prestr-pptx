package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.internal.o8m.z7;

public class a6 extends f2 {
   private f2 n5 = z7.a6();
   private f2 a6 = s4.a6();
   private boolean u9;

   public a6() {
      this.k5 = this.n5.y4() + this.a6.y4();
   }

   @Override
   public void t2() {
      this.n5.t2();
      this.a6.t2();
      this.u9 = false;
   }

   @Override
   protected byte[] c8() {
      if (!this.u9) {
         this.u9 = true;
      }

      this.n5.n5(new byte[0], 0, 0);
      this.a6.n5(new byte[0], 0, 0);
      byte[] var1 = new byte[36];
      com.aspose.slides.ms.System.y4.n5(this.n5.n3(), 0, var1, 0, 16);
      com.aspose.slides.ms.System.y4.n5(this.a6.n3(), 0, var1, 16, 20);
      return var1;
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      if (!this.u9) {
         this.u9 = true;
      }

      this.n5.n5(var1, var2, var3, var1, var2);
      this.a6.n5(var1, var2, var3, var1, var2);
   }

   public byte[] n5(z6 var1) {
      if (var1 == null) {
         throw new CryptographicUnexpectedOperationException("missing key");
      }

      c8 var2 = new c8(var1);
      var2.n5(a6.class.getName());
      return var2.n5(this.n3());
   }

   public boolean n5(z6 var1, byte[] var2) {
      if (var1 == null) {
         throw new CryptographicUnexpectedOperationException("missing key");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rgbSignature");
      }

      h0 var3 = new h0(var1);
      var3.n5(a6.class.getName());
      return var3.n5(this.n3(), var2);
   }
}
