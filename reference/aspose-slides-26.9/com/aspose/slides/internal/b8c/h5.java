package com.aspose.slides.internal.b8c;

public class h5 {
   private p9[] n5;
   private int l6;
   private int k5 = -1;
   private int u3;
   private int a6;

   public h5(int var1, int var2, int var3) {
      this.l6 = var1;
      this.n5 = new p9[var1];
      this.u3 = var2;
      this.a6 = var3;
   }

   public final int n5() {
      return this.u3;
   }

   public final int l6() {
      return this.a6;
   }

   public final Object n5(int var1) {
      return this.n5[var1];
   }

   public final void n5(int var1, Object var2) {
      this.n5[var1] = (p9)var2;
   }

   public final boolean k5() {
      for (int var1 = 0; var1 < this.n5.length; var1++) {
         if (this.n5[var1] == null || this.n5[var1].a6() == null) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      if (this.k5 != -1) {
         return this.k5;
      }

      this.k5 = 0;

      for (int var1 = 0; var1 < this.n5.length; var1++) {
         this.n5[var1].h0();
         if (this.n5[var1].k5()) {
            for (int var5 = 0; var5 < this.n5[var1].n5(); var5++) {
               this.k5 = this.k5 + this.n5[var1].u3()[var5].hashCode();
            }
         } else {
            com.aspose.slides.ms.System.u3 var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5[var1].a6(), com.aspose.slides.ms.System.u3.class);
            if (var2 != null) {
               x6[] var3 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var2), x6[].class);
               if (var3 != null) {
                  for (int var6 = 0; var6 < var3.length; var6++) {
                     this.k5 = this.k5 + ((x6)com.aspose.slides.ms.System.u3.n5((Object)(var3)).k5(var6)).u3().hashCode();
                  }
               } else {
                  for (int var4 = 0; var4 < com.aspose.slides.internal.v6g.k5.k5(this.n5[var1].a6(), com.aspose.slides.ms.System.u3.class).a6(); var4++) {
                     this.k5 = this.k5 + com.aspose.slides.internal.v6g.k5.k5(this.n5[var1].a6(), com.aspose.slides.ms.System.u3.class).k5(var4).hashCode();
                  }
               }
            } else {
               this.k5 = this.k5 + this.n5[var1].a6().hashCode();
            }
         }
      }

      return this.k5;
   }

   @Override
   public boolean equals(Object other) {
      h5 var2 = (h5)other;

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         if (!this.n5[var3].n5(var2.n5[var3])) {
            return false;
         }
      }

      return true;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(this.n5[0].toString());

      for (int var2 = 1; var2 < this.n5.length; var2++) {
         var1.n5(" ");
         var1.n5(this.n5[var2].toString());
      }

      return var1.toString();
   }
}
