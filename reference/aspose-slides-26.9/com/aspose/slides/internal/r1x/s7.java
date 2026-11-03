package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class s7 implements com.aspose.slides.internal.b8u.a6 {
   private final int[] n5;
   private x8 l6;
   private final boolean k5;

   public s7(int[] var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("argb32Entries");
      }

      this.n5 = var1;
      this.l6 = null;
      this.k5 = var2;
   }

   public s7(int[] var1) {
      this(var1, false);
   }

   public s7(com.aspose.slides.internal.o9b.c8[] var1, boolean var2) {
      this(com.aspose.slides.internal.r1x.l6.n5(var1), var2);
   }

   @Override
   public final int n5() {
      return this.n5.length;
   }

   @Override
   public final int[] l6() {
      int[] var1 = new int[this.n5.length];
      System.arraycopy(this.n5, 0, var1, 0, this.n5.length);
      return var1;
   }

   @Override
   public final com.aspose.slides.internal.o9b.c8[] k5() {
      com.aspose.slides.internal.o9b.c8[] var1 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), this.n5.length)
      );

      for (int var2 = 0; var2 < var1.length; var2++) {
         com.aspose.slides.internal.o9b.c8.n5(this.n5[var2]).n5(var1[var2]);
      }

      return var1;
   }

   @Override
   public final boolean u3() {
      return this.k5;
   }

   @Override
   public final int n5(int var1) {
      this.a6();
      return this.l6.n5(var1);
   }

   @Override
   public final int l6(int var1) {
      if (var1 < this.n5.length && var1 >= 0) {
         return this.n5[var1];
      } else {
         throw new ArgumentOutOfRangeException("index", "The specified index lies out of the entries length.");
      }
   }

   private void a6() {
      if (this.l6 == null) {
         this.l6 = new x8(this.n5);
      }
   }
}
