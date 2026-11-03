package com.aspose.slides.internal.e4;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class h0 extends com.aspose.slides.internal.l7.h0 {
   private int k5;
   private int u3;

   private h0(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.h0 var2, int var3, int var4) {
      super(var1, var2);
      this.k5 = var3;
      this.u3 = var4;
   }

   public final int a6() {
      return this.u3;
   }

   public final int n5(int var1) {
      if (var1 >= 0 && var1 < this.u3) {
         return this.k5(var1);
      } else {
         throw new IndexOutOfRangeException("Glyph ID is out of bounds.");
      }
   }

   public final int l6(int var1) {
      if (var1 >= 0 && var1 < this.u3) {
         return this.k5(var1 + 1) - this.k5(var1);
      } else {
         throw new IndexOutOfRangeException("Glyph ID is out of bounds.");
      }
   }

   public final int k5(int var1) {
      if (var1 > this.u3) {
         throw new IndexOutOfRangeException();
      } else {
         return this.k5 == 0 ? 2 * this.n5.a6(var1 * 2) : this.n5.c8(var1 * 4);
      }
   }

   public final com.aspose.slides.internal.q9.l6 u9() {
      return new h0$l6(this);
   }

   // $VF: synthetic method
   static int n5(h0 var0) {
      return var0.u3;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;IILcom/aspose/slides/internal/e4/h0$1;)V -> (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;II)V
   h0(com.aspose.slides.internal.l7.u3 recoveredArg0, com.aspose.slides.internal.m9.h0 recoveredArg1, int recoveredArg2, int recoveredArg3, com.aspose.slides.internal.e4.h0$1 recoveredArg4) {
      this(recoveredArg0, recoveredArg1, recoveredArg2, recoveredArg3);
   }
}
