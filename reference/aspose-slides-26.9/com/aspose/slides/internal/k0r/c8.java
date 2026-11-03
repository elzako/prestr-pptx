package com.aspose.slides.internal.k0r;

public class c8 extends r4 {
   private static final int[] n5 = new int[]{2041, Integer.MAX_VALUE};

   public c8() {
      this.w1().n5(2040);
   }

   public final t2[] l6() {
      if (this.e2().size() > 0) {
         int var1 = 0;

         for (int var2 = 0; var2 < this.e2().size(); var2++) {
            if (this.e2().get_Item(var2) instanceof t2) {
               var1++;
            }
         }

         t2[] var5 = new t2[var1];
         var1 = 0;

         for (int var3 = 0; var3 < this.e2().size(); var3++) {
            if (this.e2().get_Item(var3) instanceof t2) {
               var5[var1] = (t2)this.e2().get_Item(var3);
               var1++;
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
