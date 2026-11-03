package com.aspose.slides.internal.l6;

import java.util.ArrayList;
import java.util.List;

public abstract class n5 implements n3 {
   protected List n5;

   public n5() {
   }

   public n5(n3 var1) {
   }

   @Override
   public n3 n5(int var1) {
      return this.n5 != null && var1 < this.n5.size() ? (n3)this.n5.get(var1) : null;
   }

   @Override
   public int n5() {
      return this.n5 == null ? 0 : this.n5.size();
   }

   @Override
   public void n5(n3 var1) {
      if (var1 != null) {
         n5 var2 = (n5)var1;
         if (var2.k5()) {
            if (this.n5 != null && this.n5 == var2.n5) {
               throw new RuntimeException("attempt to add child list to itself");
            }

            if (var2.n5 != null) {
               if (this.n5 != null) {
                  int var3 = var2.n5.size();

                  for (int var4 = 0; var4 < var3; var4++) {
                     n3 var5 = (n3)var2.n5.get(var4);
                     this.n5.add(var5);
                     var5.l6(this);
                     var5.u3(this.n5.size() - 1);
                  }
               } else {
                  this.n5 = var2.n5;
                  this.u3();
               }
            }
         } else {
            if (this.n5 == null) {
               this.n5 = this.l6();
            }

            this.n5.add(var1);
            var2.l6(this);
            var2.u3(this.n5.size() - 1);
         }
      }
   }

   @Override
   public Object l6(int var1) {
      if (this.n5 == null) {
         return null;
      }

      n3 var2 = (n3)this.n5.remove(var1);
      this.k5(var1);
      return var2;
   }

   protected List l6() {
      return new ArrayList();
   }

   @Override
   public boolean k5() {
      return false;
   }

   public void u3() {
      this.k5(0);
   }

   public void k5(int var1) {
      int var2 = this.n5();

      for (int var3 = var1; var3 < var2; var3++) {
         n3 var4 = this.n5(var3);
         var4.u3(var3);
         var4.l6(this);
      }
   }

   @Override
   public int a6() {
      return 0;
   }

   @Override
   public void u3(int var1) {
   }

   @Override
   public n3 u9() {
      return null;
   }

   @Override
   public void l6(n3 var1) {
   }

   @Override
   public String h0() {
      if (this.n5 != null && this.n5.size() != 0) {
         StringBuffer var1 = new StringBuffer();
         if (!this.k5()) {
            var1.append("(");
            var1.append(this.toString());
            var1.append(' ');
         }

         for (int var2 = 0; this.n5 != null && var2 < this.n5.size(); var2++) {
            n3 var3 = (n3)this.n5.get(var2);
            if (var2 > 0) {
               var1.append(' ');
            }

            var1.append(var3.h0());
         }

         if (!this.k5()) {
            var1.append(")");
         }

         return var1.toString();
      } else {
         return this.toString();
      }
   }

   @Override
   public int c8() {
      return 0;
   }

   @Override
   public int t2() {
      return 0;
   }

   @Override
   public abstract String toString();
}
