package com.aspose.slides.internal.g7;

class s9 implements q6 {
   private o6[] n5;
   private o6[] l6;

   public s9(double[][] var1, double[][] var2) {
      this.n5 = new o6[var1.length];
      this.l6 = new o6[var2.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.n5[var3] = new o6();

         for (int var4 = 0; var4 < var1[var3].length; var4++) {
            this.n5[var3].n5(new m0(var1[var3][var4], var1[var3][++var4]));
         }
      }

      for (int var5 = 0; var5 < var2.length; var5++) {
         this.l6[var5] = new o6();

         for (int var7 = 0; var7 < var2[var5].length; var7++) {
            this.l6[var5].n5(new h6t(var2[var5][var7], var2[var5][++var7]));
         }
      }
   }
}
