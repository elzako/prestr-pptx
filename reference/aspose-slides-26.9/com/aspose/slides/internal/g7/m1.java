package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

class m1 {
   private ArrayList n5 = new ArrayList();
   private int l6 = -1;
   private int k5 = -1;

   public m1() {
   }

   public m1(byte[] var1) {
      this.n5(var1);
   }

   public m1(byte[] var1, int var2, int var3) {
      this.n5(var1, var2, var3);
   }

   public final void n5(byte[] var1) {
      this.n5(var1, 0, var1.length);
   }

   public final void n5(byte[] var1, int var2, int var3) {
      if (this.l6 < this.k5) {
         this.l6++;
      } else {
         this.l6++;
         this.k5++;
         this.n5.addItem(new m1$n5(null));
      }

      this.k5().n5 = var1;
      this.k5().l6 = var2;
      this.k5().k5 = var3;
   }

   public final void n5() {
      if (this.l6 > 0) {
         this.l6--;
      }
   }

   private m1$n5 k5() {
      return (m1$n5)this.n5.get_Item(this.l6);
   }

   public final long l6() {
      m1$n5 var1 = (m1$n5)this.n5.get_Item(this.l6);
      return var1.k5;
   }

   public final byte n5(int var1) {
      if (var1 >= this.k5().k5) {
         throw new IndexOutOfRangeException();
      } else {
         return this.k5().n5[this.k5().l6 + var1];
      }
   }
}
