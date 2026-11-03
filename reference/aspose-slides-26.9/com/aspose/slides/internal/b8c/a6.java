package com.aspose.slides.internal.b8c;

public class a6 {
   public w5 n5;
   public int l6;
   public int k5;
   public boolean u3;

   public final w5 n5() {
      return this.n5;
   }

   public a6(w5 var1, int var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var2;
      this.u3 = false;
   }

   public final void n5(int var1) {
      this.k5 = var1;
      this.l6 = var1;
   }

   public final void n5(int var1, t3 var2) {
      if (var1 == this.k5 - 1) {
         if (this.n5.k5() == var2.n5() && var2.u3()) {
            this.n5 = var2.n5();
            byte var3 = -1;
            this.k5 = var3;
            this.l6 = var3;
         } else if (this.n5.k5() != null) {
            this.n5 = (w5)this.n5.k5();
            this.k5--;
         }
      } else {
         if (var1 == this.k5 && this.u3) {
            this.u3 = false;
         }
      }
   }

   public final boolean n5(String var1, String var2, int var3, t3 var4) {
      if (com.aspose.slides.internal.b8c.k5.n5(this.n5)) {
         return false;
      }

      if (this.u3) {
         this.u3 = false;
      }

      if (!u9.n5(this.n5.a6(), this.n5.t2(), var1, var2)) {
         return false;
      }

      if (this.k5 == -1) {
         this.n5(var3);
      } else if (var3 > this.k5) {
         return false;
      }

      if (this.n5 == var4.l6()) {
         this.u3 = true;
         return true;
      } else {
         w5 var5 = (w5)this.n5.n5();
         if (com.aspose.slides.internal.b8c.k5.n5(var5)) {
            this.u3 = true;
            return false;
         } else {
            this.n5 = var5;
            this.k5++;
            return false;
         }
      }
   }
}
