package com.aspose.slides.internal.g8v;

class i9 {
   private w1 c8;
   public int n5;
   public String l6;
   public y5 k5;
   public com.aspose.slides.ms.System.b5 u3;
   public com.aspose.slides.ms.System.b5 a6;
   public com.aspose.slides.internal.z0k.t4 u9;
   public String[] h0;
   private int t2;

   public i9() {
      this.t2 = 0;
   }

   public i9(w1 var1) {
      this.c8 = var1;
   }

   public w1 n5() {
      return this.c8;
   }

   public void n5(w1 var1) {
      this.c8 = var1;
   }

   public int l6() {
      return this.t2;
   }

   public void n5(int var1) {
      synchronized (this) {
         if (this.t2 == 4 && var1 != 4) {
            throw new a7("Aborted", 6);
         }

         this.t2 = var1;
      }
   }
}
