package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public class c6 extends g2 {
   private byte n5;
   private byte l6;
   private byte[] k5;
   private int u3;
   private long a6;
   private long u9;
   private long h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte n3;
   private l8 y4;

   public c6() {
      super(61447, (byte)2);
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final byte[] l6() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return com.aspose.slides.internal.n8e.v4.n5(this.u3);
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final long u3() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final long a6() {
      return this.h0;
   }

   public final void k5(long var1) {
      this.h0 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      this.l6 = var1.z1();
      this.k5 = var1.c8(16);
      this.u3 = var1.r4();
      this.a6 = var1.c4();
      this.u9 = var1.c4();
      this.h0 = var1.c4();
      this.c8 = var1.z1();
      this.t2 = var1.z1();
      this.s7 = var1.z1();
      this.n3 = var1.z1();
      if ((this.t2 & 255) > 0) {
         throw new Exception("Found a BLIP with a name and this is not yet supported.");
      }

      if (this.w1().a6() > 36) {
         this.y4 = com.aspose.slides.internal.v6g.k5.n5(p5k.n5(var1), l8.class);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.y4 != null) {
         this.a6 = this.y4.n5() + 8 & 4294967295L;
      }

      var1.n5(this.n5);
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.u3));
      var1.n5(this.a6 & 4294967295L);
      var1.n5(this.u9 & 4294967295L);
      var1.n5(this.h0 & 4294967295L);
      var1.n5(this.c8);
      var1.n5(this.t2);
      var1.n5(this.s7);
      var1.n5(this.n3);
      int var2 = 0;
      if (this.y4 != null) {
         var2 = this.y4.l6(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 2 + this.k5.length + 18;
      if (this.y4 != null) {
         var1 += this.y4.n5() + 8;
      }

      return var1;
   }
}
