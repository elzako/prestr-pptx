package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class c9t extends m4d {
   private p2i[] n5 = new p2i[]{new p2i()};

   public c9t(r5w var1) {
      super(var1);
      this.w1().n5(4010);
   }

   public final p2i[] l6() {
      return this.n5;
   }

   public final void n5(p2i[] var1) {
      this.n5 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = this.w1().a6();
      List var3 = new List();

      while (var2 > 0) {
         p2i var4 = new p2i();
         var4.n5(var1);
         var2 -= var4.k5();
         var3.addItem(var4);
      }

      if (var3.size() > 0) {
         this.n5 = (p2i[])var3.toArray(new p2i[0]);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2].n5(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         var1 += this.n5[var2].k5();
      }

      return var1;
   }

   public final boolean k5() {
      if (this.n5 == null) {
         return true;
      }

      if (this.n5.length < 1) {
         return true;
      }

      for (int var1 = 0; var1 < this.n5.length; var1++) {
         if (!this.n5[var1].l6().t2()) {
            return false;
         }
      }

      return true;
   }

   public final void u3() {
      if (this.n5 != null && this.n5.length >= 2) {
         List var1 = new List();
         p2i var2 = this.n5[0];
         var1.addItem(var2);

         for (int var3 = 1; var3 < this.n5.length; var3++) {
            if (this.n5[var3].n5(var2)) {
               var2.n5((var2.n5() & 4294967295L) + (this.n5[var3].n5() & 4294967295L) & 4294967295L);
            } else {
               var2 = this.n5[var3];
               var1.addItem(var2);
            }
         }

         this.n5 = (p2i[])var1.toArray(new p2i[0]);
      }
   }
}
