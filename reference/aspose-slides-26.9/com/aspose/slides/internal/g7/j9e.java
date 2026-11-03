package com.aspose.slides.internal.g7;

public class j9e extends n3c {
   private byte[] n5;
   private j9e$n5[] l6;

   public j9e(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.y4();
      var1.y4();
      this.n5 = new byte[8192];

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2] = var1.x8();
      }

      long var3 = var1.y4();
      this.l6 = new j9e$n5[(int)var3];

      for (int var5 = 0; var5 < (var3 & 4294967295L); var5++) {
         this.l6[var5] = new j9e$n5(null);
         this.l6[var5].n5 = var1.y4();
         this.l6[var5].l6 = var1.y4();
         this.l6[var5].k5 = var1.y4();
      }

      super.n5(var1);
   }

   @Override
   public int n5(int var1) {
      for (int var2 = 0; var2 < this.l6.length; var2++) {
         if (var1 >= (this.l6[var2].n5 & 4294967295L) && var1 <= (this.l6[var2].l6 & 4294967295L)) {
            return (int)(((this.l6[var2].k5 & 4294967295L) + var1 & 4294967295L) - (this.l6[var2].n5 & 4294967295L));
         }

         if (var1 < (this.l6[var2].l6 & 4294967295L) && var1 < (this.l6[var2].n5 & 4294967295L)) {
            break;
         }
      }

      return 0;
   }
}
