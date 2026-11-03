package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public class u9 {
   private ArrayList n5;
   private t3 l6;
   private n5 k5;

   public final t3 n5() {
      return this.l6;
   }

   public final int l6() {
      return this.n5.size();
   }

   public u9(t3 var1, n5 var2) {
      this.l6 = var1;
      this.n5 = new ArrayList();
      this.k5 = var2;
      if (!var1.u3()) {
         this.n5(1);
      }
   }

   public final void n5(int var1) {
      a6 var2 = new a6(this.l6.n5(), var1);
      this.n5.addItem(var2);
   }

   public final void k5() {
      this.n5.removeAt(this.l6() - 1);
   }

   public static boolean n5(String var0, String var1, String var2, String var3) {
      if (var1 == null) {
         if (var3 != null && var3.length() != 0) {
            return false;
         }
      } else if (var1.length() != 0 && !com.aspose.slides.ms.System.d1.a6(var1, var3)) {
         return false;
      }

      return var0.length() == 0 || com.aspose.slides.ms.System.d1.a6(var0, var2);
   }

   public final void n5(String var1, String var2, int var3) {
      if (!this.l6.a6()) {
         for (int var4 = 0; var4 < this.n5.size(); var4++) {
            ((a6)this.n5.get_Item(var4)).n5(var3, this.l6);
         }

         if (this.l6.u3() && n5(this.l6.n5().a6(), this.l6.n5().t2(), var1, var2)) {
            this.k5();
         }
      }
   }

   public final boolean l6(String var1, String var2, int var3) {
      boolean var4 = false;
      if (this.l6.u3() && n5(this.l6.n5().a6(), this.l6.n5().t2(), var1, var2)) {
         this.n5(-1);
      }

      for (int var5 = 0; var5 < this.n5.size(); var5++) {
         if (((a6)this.n5.get_Item(var5)).n5(var1, var2, var3, this.l6)) {
            var4 = true;
         }
      }

      return var4;
   }

   public final boolean k5(String var1, String var2, int var3) {
      if (!this.l6.k5()) {
         return false;
      }

      if (!n5(this.l6.l6().a6(), this.l6.l6().t2(), var1, var2)) {
         return false;
      }

      boolean var4 = false;
      if (this.l6.l6().k5() != null) {
         for (int var5 = 0; var5 < this.n5.size(); var5++) {
            a6 var6 = (a6)this.n5.get_Item(var5);
            if (var6.u3 && var6.n5() == this.l6.l6().k5()) {
               var4 = true;
            }
         }

         return var4;
      } else {
         return this.l6.u3() || var3 == 1;
      }
   }
}
