package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.o8m.b3;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.j9;
import com.aspose.slides.internal.o8m.z7;

public class t2 extends b3 {
   private f2 n5;
   private boolean u9;
   private byte[] h0;
   private byte[] c8;

   @Override
   public byte[] u9() {
      return com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).deepClone(), byte[].class);
   }

   @Override
   public void n5(byte[] var1) {
      if (this.u9) {
         throw new Exception("Cannot change key during hash operation.");
      }

      if (var1.length > 64) {
         this.a6 = this.n5.l6(var1);
      } else {
         this.a6 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var1)).deepClone(), byte[].class);
      }

      this.a6();
   }

   public t2() {
      this.n5 = z7.a6();
      this.k5 = this.n5.y4();
      byte[] var1 = new byte[64];
      j9 var2 = new j9();
      var2.l6(var1);
      this.a6 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5(var1).deepClone(), byte[].class);
      this.t2();
   }

   public t2(f2 var1, byte[] var2) {
      this.n5 = var1;
      this.k5 = this.n5.y4();
      if (var2.length > 64) {
         this.a6 = this.n5.l6(var2);
      } else {
         this.a6 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5(var2).deepClone(), byte[].class);
      }

      this.t2();
   }

   @Override
   public void t2() {
      this.n5.t2();
      this.a6();
      this.u9 = false;
   }

   @Override
   protected byte[] c8() {
      if (!this.u9) {
         this.n5.n5(this.h0, 0, this.h0.length, this.h0, 0);
         this.u9 = true;
      }

      this.n5.n5(new byte[0], 0, 0);
      byte[] var1 = this.n5.n3();
      this.n5.t2();
      this.n5.n5(this.c8, 0, this.c8.length, this.c8, 0);
      this.n5.n5(var1, 0, var1.length);
      this.t2();
      return this.n5.n3();
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      if (!this.u9) {
         this.n5.n5(this.h0, 0, this.h0.length, this.h0, 0);
         this.u9 = true;
      }

      this.n5.n5(var1, var2, var3, var1, var2);
   }

   private void a6() {
      this.h0 = new byte[64];
      this.c8 = new byte[64];

      for (int var1 = 0; var1 < this.a6.length; var1++) {
         this.h0[var1] = com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(this.a6[var1], 6) ^ 54), 9);
         this.c8[var1] = com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(this.a6[var1], 6) ^ 92), 9);
      }

      for (int var2 = this.a6.length; var2 < 64; var2++) {
         this.h0[var2] = 54;
         this.c8[var2] = 92;
      }
   }
}
