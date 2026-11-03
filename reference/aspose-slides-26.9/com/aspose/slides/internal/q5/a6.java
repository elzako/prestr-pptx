package com.aspose.slides.internal.q5;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class a6 extends com.aspose.slides.internal.l7.h0 {
   private int k5;

   private a6(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.h0 var2, int var3) {
      super(var1, var2);
      this.k5 = var3;
   }

   public final int a6() {
      return this.n5.u9(2);
   }

   public final int u9() {
      return this.n5.t2(4);
   }

   public final int n5(int var1) {
      if (var1 >= 0 && var1 < this.a6()) {
         return this.n5.k5(8 + var1 * this.u9() + 0);
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final int l6(int var1) {
      if (var1 >= 0 && var1 < this.a6()) {
         return this.n5.k5(8 + var1 * this.u9() + 1);
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final int n5(int var1, int var2) {
      if (var1 >= 0 && var1 < this.a6() && var2 >= 0 && var2 < this.k5) {
         return this.n5.k5(8 + var1 * this.u9() + 2 + var2);
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   // $VF: synthetic method
   static int n5(a6 var0, int var1) {
      return var0.k5 = var1;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;ILcom/aspose/slides/internal/q5/a6$1;)V -> (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;I)V
   a6(com.aspose.slides.internal.l7.u3 recoveredArg0, com.aspose.slides.internal.m9.h0 recoveredArg1, int recoveredArg2, com.aspose.slides.internal.q5.a6$1 recoveredArg3) {
      this(recoveredArg0, recoveredArg1, recoveredArg2);
   }
}
