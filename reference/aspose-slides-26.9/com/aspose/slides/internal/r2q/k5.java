package com.aspose.slides.internal.r2q;

public class k5 {
   protected final int[] n5;
   protected int[] l6;
   protected int k5;
   protected int u3;
   private final int[] a6;

   public k5(int var1, boolean var2) {
      if (var2) {
         this.n5 = new int[]{com.aspose.slides.internal.r1x.l6.n5(), com.aspose.slides.internal.r1x.l6.l6()};
         this.a6 = new int[]{25500, 0};
      } else {
         this.n5 = new int[]{com.aspose.slides.internal.r1x.l6.l6(), com.aspose.slides.internal.r1x.l6.n5()};
         this.a6 = new int[]{0, 25500};
      }

      this.l6 = new int[var1 + 1];
   }

   public final int n5() {
      return this.a6[this.u3];
   }

   public final int l6() {
      int var1 = this.u3 + 1;
      if (var1 > 1) {
         var1 = 0;
      }

      return var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final int[] u3() {
      return this.l6;
   }

   public final void a6() {
      this.u3 = 0;
   }

   public final void u9() {
      this.k5++;
      this.u3++;
      if (this.u3 == 2) {
         this.u3 = 0;
      }
   }
}
