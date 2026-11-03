package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class r3d {
   private int n5;
   private boolean l6;

   public r3d(int var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final int k5() {
      switch (this.n5()) {
         case 0:
            return 330;
         case 1:
            return 220;
         case 2:
            return 150;
         case 3:
            return 96;
         case 4:
            return 72;
         case 5:
            return 0;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public static r3d u3() {
      return new r3d(4, true);
   }
}
