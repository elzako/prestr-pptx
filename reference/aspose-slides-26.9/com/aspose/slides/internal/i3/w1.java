package com.aspose.slides.internal.i3;

import com.aspose.slides.exceptions.ArgumentException;

public class w1 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private int l6;
   private int k5;
   private long u3;
   private int a6;
   private long u9;
   private int h0;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void u3(int var1) {
      this.a6 = var1;
   }

   public final long h0() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void a6(int var1) {
      if ((var1 & 65535) != 0) {
         throw new ArgumentException("SHOULD be 0x0000");
      }

      this.h0 = var1;
   }
}
