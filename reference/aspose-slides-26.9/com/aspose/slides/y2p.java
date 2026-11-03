package com.aspose.slides;

final class y2p {
   private int n5;
   private long l6;
   private int k5;
   private byte u3;

   y2p(com.aspose.slides.internal.k0r.m7 var1) {
      this(var1.l6() & 4294967295L, var1.k5());
      this.n5((byte)var1.u3());
      if (this.u3() < 0) {
         this.n5((byte)0);
      }

      this.n5(0);
   }

   y2p(com.aspose.slides.internal.k0r.o9b var1) {
      this(0L, var1.l6());
      this.n5((byte)0);
      this.n5(1);
   }

   y2p(com.aspose.slides.internal.k0r.j9e var1) {
      this(0L, var1.l6());
      this.n5((byte)0);
      this.n5(2);
   }

   private y2p(long var1, int var3) {
      this.n5(var1);
      this.l6(var3);
   }

   final int n5() {
      return this.n5;
   }

   final void n5(int var1) {
      this.n5 = var1;
   }

   final long l6() {
      return this.l6;
   }

   final void n5(long var1) {
      this.l6 = var1;
   }

   final int k5() {
      return this.k5;
   }

   private void l6(int var1) {
      this.k5 = var1;
   }

   final byte u3() {
      return this.u3;
   }

   final void n5(byte var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "placeholder [Source: ",
         com.aspose.slides.ms.System.s3.n5(l5h.class, this.n5()),
         "|Type: ",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k0r.h4.class, this.k5()),
         "]"
      );
   }
}
