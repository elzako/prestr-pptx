package com.aspose.slides.internal.v7y;

import java.util.Comparator;

public final class r1 implements Comparator<w2> {
   private j9[] n5;
   private Comparator[] l6;
   private int k5;

   public r1(int var1) {
      if (var1 <= 0) {
         var1 = 3;
      }

      this.n5 = new j9[var1];
      this.l6 = new Comparator[var1];
   }

   public r1() {
      this(3);
   }

   public final void n5(j9 var1, Comparator var2) {
      if (this.k5 == this.n5.length) {
         j9[] var3 = new j9[this.k5 * 2];
         Comparator[] var4 = new Comparator[this.k5 * 2];

         for (int var5 = 0; var5 < this.k5; var5++) {
            var3[var5] = this.n5[var5];
            var4[var5] = this.l6[var5];
         }

         this.n5 = var3;
         this.l6 = var4;
      }

      if (var1.u9() == 3 || var1.u9() == 5) {
         var1 = new s0(7, com.aspose.slides.ms.System.u3.n5(new j9[]{var1}));
      }

      this.n5[this.k5] = var1;
      this.l6[this.k5] = var2;
      this.k5++;
   }

   public final j9 n5(int var1) {
      return this.n5[var1];
   }

   public final int n5(w2 var1, w2 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.n5(); var4++) {
         var3 = this.l6[var4].compare(var1.n5(var4), var2.n5(var4));
         if (var3 != 0) {
            return var3;
         }
      }

      return var1.l6() - var2.l6();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(w2 bridgeArg0, w2 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
