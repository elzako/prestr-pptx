package com.aspose.slides.internal.n8e;

class n3 {
   private n3$n5[] t2 = new n3$n5[8];
   private n3$n5[] s7 = new n3$n5[8];
   private String[] x8 = new String[8];
   private int n3 = 0;
   private int y4 = 0;
   private int e2 = 0;
   public boolean n5;
   public v8 l6;
   public boolean k5;
   public int u3 = 0;
   public final String a6;
   public final String u9;
   public int h0;
   public int c8;

   public final int n5() {
      return this.e2;
   }

   public n3(String var1, String var2) {
      this.a6 = var1;
      this.u9 = var2;
   }

   public final void n5(String var1, String var2) {
      if (this.n3 >= this.t2.length) {
         n3$n5[] var3 = new n3$n5[this.t2.length + this.t2.length / 2 + 8];
         System.arraycopy(this.t2, 0, var3, 0, this.t2.length);
         this.t2 = var3;
      }

      this.t2[this.n3++] = new n3$n5(var1, var2);
   }

   public final void l6(String var1, String var2) {
      if (this.y4 >= this.s7.length) {
         n3$n5[] var3 = new n3$n5[this.s7.length + this.s7.length / 2 + 8];
         System.arraycopy(this.s7, 0, var3, 0, this.s7.length);
         this.s7 = var3;
      }

      if ("*".equals(var2)) {
         var2 = null;
      }

      this.s7[this.y4++] = new n3$n5(var1, var2);
   }

   public final void n5(String var1) {
      if (this.e2 >= this.x8.length) {
         String[] var2 = new String[this.x8.length + this.x8.length / 2 + 8];
         System.arraycopy(this.x8, 0, var2, 0, this.t2.length);
         this.x8 = var2;
      }

      this.x8[this.e2++] = var1;
   }

   public final String l6(String var1) {
      for (int var2 = 0; var2 < this.n3; var2++) {
         if (com.aspose.slides.ms.System.d1.a6(this.t2[var2].n5, var1)) {
            return this.t2[var2].l6;
         }
      }

      return null;
   }

   public final boolean n5(String var1, int[] var2) {
      for (int var3 = 0; var3 < this.n3; var3++) {
         if (com.aspose.slides.ms.System.d1.a6(this.t2[var3].n5, var1)) {
            var2[0] = var3;
            return true;
         }
      }

      var2[0] = Integer.MIN_VALUE;
      return false;
   }

   public final String n5(int var1) {
      return this.t2[var1].l6;
   }

   public final boolean k5(String var1) {
      for (int var2 = 0; var2 < this.e2; var2++) {
         if (com.aspose.slides.ms.System.d1.a6(var1, this.x8[var2])) {
            return true;
         }
      }

      return false;
   }

   public final boolean k5(String var1, String var2) {
      for (int var3 = 0; var3 < this.y4; var3++) {
         if (com.aspose.slides.ms.System.d1.a6(var1, this.s7[var3].n5)
            && (this.s7[var3].l6 == null || com.aspose.slides.ms.System.d1.a6(this.s7[var3].l6, var2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(this.a6) ? this.u9 : com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ this.a6, this.u9});
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(n3$n5.class, new n3$1());
   }
}
