package com.aspose.slides.internal.s6;

public final class a5 {
   private j4[] n5 = new j4[3];
   private e2[] l6;
   private s7 k5;
   private int u3;

   public final j4[] n5() {
      return this.n5;
   }

   public final e2[] l6() {
      return this.l6;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public a5(j4 var1, j4 var2, j4 var3, e2 var4, e2 var5, e2 var6) {
      if ((var1.n5() - var3.n5()) * (var2.l6() - var3.l6()) - (var2.n5() - var3.n5()) * (var1.l6() - var3.l6()) < 0.0) {
         this.n5()[0] = var1;
         this.n5()[1] = var2;
         this.n5()[2] = var3;
      } else {
         this.n5()[0] = var1;
         this.n5()[1] = var3;
         this.n5()[2] = var2;
      }

      for (int var7 = 0; var7 < 3; var7++) {
         this.n5()[var7].u3().n5(this);
      }

      this.l6 = new e2[3];
      this.l6()[0] = var4;
      this.l6()[1] = var5;
      this.l6()[2] = var6;

      for (int var9 = 0; var9 < 3; var9++) {
         if (this.l6()[var9].l6()[0] == null) {
            this.l6()[var9].l6()[0] = this;
         } else if (this.l6()[var9].l6()[1] == null) {
            this.l6()[var9].l6()[1] = this;
         }
      }

      for (int var8 = 1;
         var8 < 3
            && (this.n5()[0] != this.l6()[0].n5()[0] || this.n5()[1] != this.l6()[0].n5()[1])
            && (this.n5()[0] != this.l6()[0].n5()[1] || this.n5()[1] != this.l6()[0].n5()[0]);
         var8++
      ) {
         e2 var10 = this.l6()[0];
         this.l6()[0] = this.l6()[var8];
         this.l6()[var8] = var10;
      }

      if ((this.n5()[1] != this.l6()[1].n5()[0] || this.n5()[2] != this.l6()[1].n5()[1])
         && (this.n5()[1] != this.l6()[1].n5()[1] || this.n5()[2] != this.l6()[1].n5()[0])) {
         e2 var11 = this.l6()[1];
         this.l6()[1] = this.l6()[2];
         this.l6()[2] = var11;
      }

      this.k5 = null;
      this.n5(-1);
   }

   public final e2 n5(j4 var1, j4 var2) {
      if (this.n5()[0] != var1 && this.n5()[0] != var2) {
         if (this.n5()[1] == var1 && this.n5()[2] == var2 || this.n5()[2] == var1 && this.n5()[1] == var2) {
            return this.l6()[1];
         }
      } else if (this.n5()[1] != var1 && this.n5()[1] != var2) {
         if (this.n5()[0] == var1 && this.n5()[2] == var2 || this.n5()[2] == var1 && this.n5()[0] == var2) {
            return this.l6()[2];
         }
      } else if (this.n5()[2] != var1 && this.n5()[2] != var2 && (this.n5()[1] == var1 && this.n5()[0] == var2 || this.n5()[0] == var1 && this.n5()[1] == var2)
         )
       {
         return this.l6()[0];
      }

      return null;
   }

   public final e2 n5(j4 var1) {
      int var2 = 0;

      while (var2 < 3 && this.n5()[var2] != var1) {
         var2++;
      }

      return this.l6()[(var2 + 1) % 3];
   }

   public final j4 l6(int var1) {
      return this.n5()[(var1 + 2) % 3];
   }

   public final j4 n5(e2 var1) {
      int var2 = 0;

      while (var2 < 3 && this.l6()[var2] != var1) {
         var2++;
      }

      return this.n5()[(var2 + 2) % 3];
   }

   public final int l6(e2 var1) {
      int var2 = 0;

      while (var2 < 3 && this.l6()[var2] != var1) {
         var2++;
      }

      return (var2 + 2) % 3;
   }

   public final e2 k5(e2 var1) {
      int var2 = 0;

      while (var2 < 3 && this.l6()[var2] != var1) {
         var2++;
      }

      return this.l6()[(var2 + 1) % 3];
   }
}
