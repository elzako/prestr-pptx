package com.aspose.slides.internal.s6;

public final class e2 implements Comparable<e2> {
   private j4[] n5;
   private a5[] l6;
   private boolean k5;
   private double u3;
   private e2 a6;

   public final j4[] n5() {
      return this.n5;
   }

   public final a5[] l6() {
      return this.l6;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      if (this.k5 != var1) {
         if (var1) {
            this.n5()[0].a6().n5(this);
            this.n5()[1].a6().n5(this);
         } else {
            this.n5()[0].a6().l6(this);
            this.n5()[1].a6().l6(this);
         }

         this.k5 = var1;
      }
   }

   public final double u3() {
      return this.u3;
   }

   public e2(j4 var1, j4 var2) {
      this.n5 = new j4[]{var1, var2};
      this.l6 = new a5[]{null, null};
      this.k5 = false;
      this.u3 = this.n5(var1, var2);
   }

   private double n5(j4 var1, j4 var2) {
      double var3 = var2.n5() - var1.n5();
      double var5 = var2.l6() - var1.l6();
      return var3 * var3 + var5 * var5;
   }

   public final a5 n5(a5 var1) {
      if (this.l6()[0] == var1) {
         return this.l6()[1];
      }

      if (this.l6()[1] == var1) {
         return this.l6()[0];
      }

      if ((this.l6()[0] != null || this.l6()[1] != null) && var1 == null) {
      }

      return null;
   }

   public final a5 a6() {
      if (this.l6()[0] == null && this.l6()[1] != null) {
         return this.l6()[1];
      }

      if (this.l6()[0] != null && this.l6()[1] == null) {
         return this.l6()[0];
      }

      if (this.l6()[0] == null && this.l6()[1] == null) {
         return null;
      }

      if (this.l6()[0] != null && this.l6()[1] != null) {
      }

      return null;
   }

   public final int n5(e2 var1) {
      if (t4.n5(this.u3(), var1.u3(), 1.0E-7)) {
         return 0;
      } else {
         return this.u3() > var1.u3() ? 1 : -1;
      }
   }

   final e2 u9() {
      return this.a6;
   }

   final void l6(e2 var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(e2 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
