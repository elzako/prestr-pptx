package com.aspose.slides.internal.p4t;

public class l6 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private u3 a6;

   public l6(int var1, int var2, int var3, int var4, u3 var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public void n5(l6$n5 var1) {
      for (int var2 = 0; var2 < this.u3; var2++) {
         for (int var3 = 0; var3 < this.k5; var3++) {
            var1.n5(var3, var2, var3 + this.n5, var2 + this.l6, this.a6);
         }

         this.a6.l6();
      }
   }
}
