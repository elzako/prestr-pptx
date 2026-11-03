package com.aspose.slides.internal.q5;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class h0 extends com.aspose.slides.internal.l7.h0 {
   private int k5;
   private int u3;

   private h0(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.h0 var2, int var3, int var4) {
      super(var1, var2);
      this.k5 = var3;
      this.u3 = var4;
   }

   public final int n5(int var1) {
      if (var1 > this.k5) {
         throw new IndexOutOfRangeException();
      }

      int var2 = 0 + var1 * 4 + 0;
      return this.n5.a6(var2);
   }

   public final int l6(int var1) {
      return var1 < this.k5 ? this.n5(var1) : this.n5(this.k5 - 1);
   }

   // $VF: synthetic method
   static int n5(h0 var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(h0 var0, int var1) {
      return var0.u3 = var1;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;IILcom/aspose/slides/internal/q5/h0$1;)V -> (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;II)V
   h0(com.aspose.slides.internal.l7.u3 recoveredArg0, com.aspose.slides.internal.m9.h0 recoveredArg1, int recoveredArg2, int recoveredArg3, com.aspose.slides.internal.q5.h0$1 recoveredArg4) {
      this(recoveredArg0, recoveredArg1, recoveredArg2, recoveredArg3);
   }
}
