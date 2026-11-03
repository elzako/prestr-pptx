package com.aspose.slides.internal.i3;

import com.aspose.slides.exceptions.ArgumentException;

public class i1 extends com.aspose.slides.internal.y6.u3 {
   private long n5;
   private short l6;
   private com.aspose.slides.internal.k1.m1 k5;
   private int u3;
   private int a6;
   private short u9;

   public final void n5(long var1) {
      if ((var1 & 4294967295L) != 2596720087L) {
         throw new ArgumentException("This value MUST be 0x9AC6CDD7");
      }

      this.n5 = var1;
   }

   public final short n5() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.k1.m1 l6() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.k1.m1 var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final void l6(int var1) {
      if (var1 != 0) {
         throw new ArgumentException("MUST be 0x00000000");
      }

      this.a6 = var1;
   }

   public final short u3() {
      return this.u9;
   }

   public final void l6(short var1) {
      this.u9 = var1;
   }

   public final int u9() {
      return 22;
   }
}
