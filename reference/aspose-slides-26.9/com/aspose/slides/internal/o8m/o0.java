package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ObjectDisposedException;

public class o0 extends b3 {
   private q1 n5;
   private com.aspose.slides.internal.x8w.m1 u9;
   private boolean h0;

   public o0() {
      this.n5(u5.class.getName(), null);
   }

   private void n5(String var1, byte[] var2) {
      this.n5 = q1.n5(var1);
      this.n5.u3(3);
      if (var2 != null) {
         this.n5.k5(var2);
      }

      this.k5 = this.n5.c8();
      this.n5(this.n5.u3());
      this.u9 = new com.aspose.slides.internal.x8w.m1(this.n5);
      this.h0 = false;
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.h0) {
         if (this.a6 != null) {
            com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
         }

         if (this.n5 != null) {
            this.n5.h0();
         }

         if (var1) {
            this.a6 = null;
            this.n5 = null;
         }

         super.n5(var1);
         this.h0 = true;
      }
   }

   @Override
   public void t2() {
      if (this.h0) {
         throw new ObjectDisposedException("MACTripleDES");
      }

      this.u3 = 0;
      this.u9.n5(this.a6);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      if (this.h0) {
         throw new ObjectDisposedException("MACTripleDES");
      }

      if (this.u3 == 0) {
         this.t2();
         this.u3 = 1;
      }

      this.u9.n5(var1, var2, var3);
   }

   @Override
   protected byte[] c8() {
      if (this.h0) {
         throw new ObjectDisposedException("MACTripleDES");
      }

      this.u3 = 0;
      return this.u9.n5();
   }
}
