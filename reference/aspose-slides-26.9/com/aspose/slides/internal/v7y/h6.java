package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.ArrayList;

public class h6 extends e9 {
   protected e9[] n5;
   protected int l6;
   protected int u3;

   public h6(ArrayList var1) {
      this.n5 = new e9[var1.size()];

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2] = new f5((ArrayList)var1.get_Item(var2));
      }

      this.u9();
   }

   private void u9() {
      for (int var1 = 0; var1 < this.n5.length; var1++) {
         this.n5(var1);
      }

      int var2 = this.n5.length - 2;

      while (this.l6 <= var2) {
         if (this.l6(var2)) {
            var2--;
         }
      }
   }

   private boolean n5(int var1) {
      if (!this.n5[var1].l6()) {
         if (this.l6 != var1) {
            e9 var2 = this.n5[var1];
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6 + 1, var1 - this.l6
            );
            this.n5[this.l6] = var2;
         }

         this.l6++;
         return false;
      } else {
         return true;
      }
   }

   private boolean l6(int var1) {
      e9 var2 = this.n5[var1];

      while (var1 + 1 < this.n5.length) {
         int var3 = j9.n5(var2.k5(), this.n5[var1 + 1].k5());
         if (var3 == 0) {
            break;
         }

         if (var3 == 1) {
            this.n5[var1] = this.n5[var1 + 1];
            var1++;
         } else {
            this.n5[var1] = var2;
            if (!this.n5(var1)) {
               return false;
            }

            var2 = this.n5[var1];
         }
      }

      this.n5[var1] = var2;
      return true;
   }

   @Override
   public void t2() {
      this.l6 = 0;
      this.u3 = 0;

      for (int var1 = 0; var1 < this.n5.length; var1++) {
         this.n5[var1].t2();
      }

      this.u9();
   }

   public h6(h6 var1) {
      this.n5 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var1.n5)).deepClone(), e9[].class);
      this.l6 = var1.l6;
      this.u3 = var1.u3;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new h6(this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5[this.l6].k5();
   }

   @Override
   public int u3() {
      return this.u3;
   }

   @Override
   public boolean l6() {
      if (this.l6 >= this.n5.length) {
         return false;
      }

      if (this.u3 != 0) {
         if (this.n5(this.l6)) {
            this.l6(this.l6);
         }

         if (this.l6 >= this.n5.length) {
            return false;
         }
      }

      this.u3++;
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
