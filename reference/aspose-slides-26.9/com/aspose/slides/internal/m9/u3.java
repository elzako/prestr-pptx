package com.aspose.slides.internal.m9;

import com.aspose.slides.internal.z0k.j5;

public class u3 {
   private j5 n5;

   public final j5 n5() {
      return this.n5;
   }

   public u3(j5 var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.n5.n5().writeByte((byte)var1);
   }

   public final void l6(int var1) {
      this.n5((byte)(var1 >> 8 & 0xFF) & 255);
      this.n5((byte)(var1 & 0xFF) & 255);
   }

   public final void n5(long var1) {
      this.n5((byte)(var1 >> 24 & 255L) & 255);
      this.n5((byte)(var1 >> 16 & 255L) & 255);
      this.n5((byte)(var1 >> 8 & 255L) & 255);
      this.n5((byte)(var1 & 255L) & 255);
   }

   public final void k5(int var1) {
      this.n5((long)var1);
   }
}
