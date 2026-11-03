package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.o8m.s4;

public class i1 extends com.aspose.slides.internal.o8m.f2 {
   private com.aspose.slides.internal.o8m.f2 n5 = com.aspose.slides.internal.o8m.z7.a6();
   private com.aspose.slides.internal.o8m.f2 a6 = s4.a6();
   private boolean u9;
   private byte[] h0;
   private byte[] c8;
   private byte[] t2;
   private byte[] s7;
   private byte[] x8;

   public i1(byte[] var1) {
      this.k5 = this.n5.y4() + this.a6.y4();
      this.h0 = var1;
      this.t2();
   }

   @Override
   public void t2() {
      this.n5.t2();
      this.a6.t2();
      this.a6();
      this.u9 = false;
   }

   @Override
   protected byte[] c8() {
      if (!this.u9) {
         this.u9 = true;
      }

      this.n5.n5(this.h0, 0, this.h0.length, this.h0, 0);
      this.n5.n5(this.c8, 0, this.c8.length);
      byte[] var1 = this.n5.n3();
      this.n5.t2();
      this.n5.n5(this.h0, 0, this.h0.length, this.h0, 0);
      this.n5.n5(this.t2, 0, this.t2.length, this.t2, 0);
      this.n5.n5(var1, 0, var1.length);
      this.a6.n5(this.h0, 0, this.h0.length, this.h0, 0);
      this.a6.n5(this.s7, 0, this.s7.length);
      byte[] var2 = this.a6.n3();
      this.a6.t2();
      this.a6.n5(this.h0, 0, this.h0.length, this.h0, 0);
      this.a6.n5(this.x8, 0, this.x8.length, this.x8, 0);
      this.a6.n5(var2, 0, var2.length);
      this.t2();
      byte[] var3 = new byte[36];
      com.aspose.slides.ms.System.y4.n5(this.n5.n3(), 0, var3, 0, 16);
      com.aspose.slides.ms.System.y4.n5(this.a6.n3(), 0, var3, 16, 20);
      return var3;
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      if (!this.u9) {
         this.u9 = true;
      }

      this.n5.n5(var1, var2, var3, var1, var2);
      this.a6.n5(var1, var2, var3, var1, var2);
   }

   public byte[] n5(com.aspose.slides.internal.o8m.z6 var1) {
      if (var1 == null) {
         throw new CryptographicUnexpectedOperationException("missing key");
      }

      com.aspose.slides.internal.x8w.c8 var2 = new com.aspose.slides.internal.x8w.c8(var1);
      var2.n5(com.aspose.slides.internal.x8w.a6.class.getName());
      return var2.n5(this.n3());
   }

   private void a6() {
      this.c8 = new byte[48];
      this.t2 = new byte[48];

      for (int var1 = 0; var1 < 48; var1++) {
         this.c8[var1] = 54;
         this.t2[var1] = 92;
      }

      this.s7 = new byte[40];
      this.x8 = new byte[40];

      for (int var2 = 0; var2 < 40; var2++) {
         this.s7[var2] = 54;
         this.x8[var2] = 92;
      }
   }
}
