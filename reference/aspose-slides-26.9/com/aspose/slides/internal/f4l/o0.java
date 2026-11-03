package com.aspose.slides.internal.f4l;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class o0 extends p8 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int n5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final void a6(int var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.a6 = var1;
   }
}
