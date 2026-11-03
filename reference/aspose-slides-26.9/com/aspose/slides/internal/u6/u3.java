package com.aspose.slides.internal.u6;

import com.aspose.slides.ms.System.d1;

public class u3 {
   public n5 n5;
   public n5 l6;
   public n5 k5;
   private com.aspose.slides.internal.j9.k5 u3;

   private u3(n5 var1, n5 var2, n5 var3, com.aspose.slides.internal.j9.k5 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public u3(n5 var1, com.aspose.slides.internal.j9.k5 var2) {
      this.n5 = var1;
      this.l6 = this.n5;
      if (var1.l6().k5().s7()) {
         this.k5 = com.aspose.slides.internal.u6.n5.n5();
      } else {
         this.k5 = this.l6;
      }

      this.u3 = var2;
   }

   public final void n5(u3 var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         n5 var5 = this.u3.n5(this.n5, var1.n5);
         if (var5 != null) {
            this.n5 = var5;
            var1.n5 = var5;
         }
      }

      if (var3) {
         n5 var6 = this.u3.n5(this.l6, var1.l6);
         if (var6 != null) {
            this.l6 = var6;
            var1.l6 = var6;
         }
      }

      if (var4) {
         n5 var7 = this.u3.n5(this.k5, var1.k5);
         if (var7 != null) {
            this.k5 = var7;
            var1.k5 = var7;
         }
      }
   }

   public final void l6(u3 var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         n5 var5 = this.u3.n5(this.n5, var1.n5);
         if (var5 != null) {
            this.n5 = var5;
         }
      }

      if (var3) {
         n5 var6 = this.u3.n5(this.l6, var1.l6);
         if (var6 != null) {
            this.l6 = var6;
         }
      }

      if (var4) {
         n5 var7 = this.u3.n5(this.k5, var1.k5);
         if (var7 != null) {
            this.k5 = var7;
         }
      }
   }

   public final void k5(u3 var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         this.n5 = this.u3.n5(this.n5, var1.n5);
      }

      if (var3) {
         this.l6 = this.u3.n5(this.l6, var1.l6);
      }

      if (var4) {
         this.k5 = this.u3.n5(this.k5, var1.k5);
      }
   }

   public final u3 n5() {
      return new u3(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{"{normal: ", this.n5, ", leading: ", this.l6, ", rest: ", this.k5, "}"});
   }

   public static u3 n5(com.aspose.slides.internal.j9.k5 var0) {
      n5 var1 = com.aspose.slides.internal.u6.n5.n5();
      return new u3(var1, var1, var1, var0);
   }
}
