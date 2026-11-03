package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class h0 implements com.aspose.slides.internal.j3b.u3 {
   private int[] n5;
   private c8 l6;
   private boolean k5;

   public h0(int[] var1, boolean var2) {
      this.n5(var1, var2);
   }

   public h0(int[] var1) {
      this(var1, false);
   }

   private void n5(int[] var1, boolean var2) {
      this.l6 = null;
      this.n5 = var1;
      this.k5 = var2;
   }

   @Override
   public int n5() {
      return this.n5.length;
   }

   @Override
   public int[] l6() {
      int[] var1 = com.aspose.slides.internal.q9u.n5.n5(this.n5.length);
      System.arraycopy(this.n5, 0, var1, 0, this.n5.length);
      return var1;
   }

   @Override
   public int n5(int var1) {
      this.k5();
      return this.l6.n5(var1);
   }

   @Override
   public int l6(int var1) {
      if (var1 < this.n5.length && var1 >= 0) {
         return this.n5[var1];
      } else {
         throw new ArgumentOutOfRangeException("index", "The specified index lies out of the entries length.");
      }
   }

   private void k5() {
      if (this.l6 == null) {
         boolean var1 = true;

         for (int var5 : this.n5) {
            int var6 = var5 >> 24 & 0xFF;
            if (var6 != 255) {
               var1 = false;
               break;
            }
         }

         this.l6 = var1 ? new c8(this.n5) : new com.aspose.slides.internal.v7o.n5(this.n5);
      }
   }
}
