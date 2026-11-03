package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ObjectDisposedException;

public abstract class y2 extends b3 {
   private boolean n5 = false;
   private String u9;
   private f2 h0;
   private com.aspose.slides.internal.x8w.x8 c8;
   private int t2 = 64;

   protected y2() {
   }

   protected int a6() {
      return this.t2;
   }

   protected void n5(int var1) {
      this.t2 = var1;
   }

   public void n5(String var1) {
      this.u9 = var1;
      this.h0 = f2.k5(this.u9);
   }

   @Override
   public byte[] u9() {
      return (byte[])super.u9().clone();
   }

   @Override
   public void n5(byte[] var1) {
      if (var1 != null && var1.length > this.a6()) {
         super.n5(this.h0.l6(var1));
      } else {
         super.n5((byte[])var1.clone());
      }
   }

   com.aspose.slides.internal.x8w.x8 h0() {
      if (this.c8 == null) {
         this.c8 = new com.aspose.slides.internal.x8w.x8(this.h0, this.a6() >> 3);
      }

      return this.c8;
   }

   private byte[] n5(byte[] var1, byte var2) {
      byte[] var3 = new byte[this.a6()];

      for (int var4 = 0; var4 < var1.length; var4++) {
         var3[var4] = (byte)(var1[var4] & 0xFF ^ var2 & 0xFF);
      }

      for (int var5 = var1.length; var5 < this.a6(); var5++) {
         var3[var5] = var2;
      }

      return var3;
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.n5) {
         super.n5(var1);
      }
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      if (this.n5) {
         throw new ObjectDisposedException("HMACSHA1");
      }

      if (this.u3 == 0) {
         this.t2();
         this.u3 = 1;
      }

      this.h0().n5(var1, var2, var3);
   }

   @Override
   protected byte[] c8() {
      if (this.n5) {
         throw new ObjectDisposedException("HMAC");
      }

      this.u3 = 0;
      this.h0().l6();
      byte[] var1 = this.h0.n3();
      byte[] var2 = this.n5(this.u9(), (byte)92);
      this.h0.t2();
      this.h0.n5(var2, 0, var2.length, var2, 0);
      this.h0.n5(var1, 0, var1.length);
      byte[] var3 = this.h0.n3();
      this.h0.t2();
      com.aspose.slides.ms.System.u3.n5(var2, 0, var2.length);
      com.aspose.slides.ms.System.u3.n5(var1, 0, var1.length);
      return var3;
   }

   @Override
   public void t2() {
      if (this.n5) {
         throw new ObjectDisposedException("HMAC");
      }

      this.u3 = 0;
      this.h0().n5();
      byte[] var1 = this.n5(this.u9(), (byte)54);
      this.h0.t2();
      this.h0().n5(var1);
      com.aspose.slides.ms.System.u3.n5(var1, 0, var1.length);
   }

   public static y2 s7() {
      return l6(d2.class.getName());
   }

   public static y2 l6(String var0) {
      return (y2)y4.n5(var0);
   }
}
