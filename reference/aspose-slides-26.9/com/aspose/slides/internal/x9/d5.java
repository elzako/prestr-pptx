package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.j8;

public class d5 {
   private List<d5$n5> n5 = new List<>();
   private List<d5$n5> l6 = new List<>();
   private int k5;
   private int u3 = -1;
   private int a6;
   private int u9;
   private int h0;

   public final void n5(int var1, double var2) {
      this.n5.addItem(new d5$n5(var1, var2));
      if (this.n5.size() == 1) {
         this.k5 = 0;
         this.u3 = 0;
         this.a6 = 0;
         this.u9 = 0;
      } else {
         if (var2 < this.n5.get_Item(this.u3).l6()) {
            this.u3 = this.n5.size() - 1;
            this.u9 = this.u3;
         }

         if (var1 < this.n5.get_Item(this.k5).n5()) {
            this.k5 = this.n5.size() - 1;
         }

         if (var1 > this.n5.get_Item(this.a6).n5()) {
            this.a6 = this.n5.size() - 1;
         }
      }
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.h0 = this.k5();
      } else {
         this.h0 = 0;
      }

      this.l6 = this.n5;
      this.n5 = new List<>();
   }

   public final void n5() {
      int var1 = 0;

      while (this.l6.size() > 0) {
         d5$n5 var2 = this.l6.get_Item(0);
         this.l6.removeAt(0);
         if (var2.n5() < this.l6()) {
            this.n5.insertItem(0, var2);
            this.k5 = 0;
            this.u3++;
            this.a6++;
            this.u9++;
         } else if (var2.n5() > this.u3()) {
            this.n5.insertItem(this.n5.size(), var2);
            this.a6 = this.n5.size() - 1;
            var1 = this.a6;
         } else {
            while (var1 < this.a6 && this.n5(var1) < var2.n5()) {
               var1++;
            }

            if (this.n5(var1) != var2.n5()) {
               return;
            }

            this.n5.set_Item(var1, var2);
         }

         if (this.h0 == 0 && this.l6(this.u3) > var2.l6() || this.h0 != 0 && var2.n5() == this.h0) {
            this.u3 = var1;
            this.u9 = this.u3;
         }
      }
   }

   public final void n5(j8 var1, int var2) {
      this.n5.get_Item(var2).n5(var1);
   }

   public final int l6() {
      return this.n5(this.k5);
   }

   public final int k5() {
      return this.n5(this.u3);
   }

   public final int u3() {
      return this.n5(this.a6);
   }

   public final int a6() {
      return this.n5(this.u9);
   }

   public final int n5(int var1) {
      return this.n5.get_Item(var1).n5();
   }

   public final double l6(int var1) {
      return this.n5.get_Item(var1).l6();
   }

   public final j8 k5(int var1) {
      return this.n5.get_Item(this.u9).n5(var1);
   }

   public final int u3(int var1) {
      if (var1 >= this.l6() - this.a6() && var1 <= this.u3() - this.a6() && this.n5(this.u9 + var1) == this.a6() + var1) {
         this.u9 += var1;
         return var1;
      } else {
         return 0;
      }
   }
}
