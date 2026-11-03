package com.aspose.slides.internal.n5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class s7 implements a0 {
   protected y1 n5;
   protected List l6;
   protected Map k5;
   protected Set u3;
   protected int a6 = 0;
   protected boolean u9 = false;
   protected int h0;
   protected int c8 = -1;

   public s7() {
      this.l6 = new ArrayList(500);
   }

   public s7(y1 var1) {
      this();
      this.n5 = var1;
   }

   protected void u9() {
      int var1 = 0;

      for (y2 var2 = this.n5.h0(); var2 != null && var2.n5() != -1; var2 = this.n5.h0()) {
         boolean var3 = false;
         if (this.k5 != null) {
            Integer var4 = (Integer)this.k5.get(new Integer(var2.n5()));
            if (var4 != null) {
               var2.k5(var4);
            }
         }

         if (this.u3 != null && this.u3.contains(new Integer(var2.n5()))) {
            var3 = true;
         } else if (this.u9 && var2.a6() != this.a6) {
            var3 = true;
         }

         if (!var3) {
            var2.a6(var1);
            this.l6.add(var2);
            var1++;
         }
      }

      this.c8 = 0;
      this.c8 = this.k5(this.c8);
   }

   @Override
   public void n5() {
      if (this.c8 < this.l6.size()) {
         this.c8++;
         this.c8 = this.k5(this.c8);
      }
   }

   protected int k5(int var1) {
      int var2 = this.l6.size();

      while (var1 < var2 && ((y2)this.l6.get(var1)).a6() != this.a6) {
         var1++;
      }

      return var1;
   }

   protected int a6(int var1) {
      while (var1 >= 0 && ((y2)this.l6.get(var1)).a6() != this.a6) {
         var1--;
      }

      return var1;
   }

   @Override
   public y2 u9(int var1) {
      if (this.c8 == -1) {
         this.u9();
      }

      if (var1 == 0) {
         return null;
      }

      if (var1 < 0) {
         return this.h0(-var1);
      }

      if (this.c8 + var1 - 1 >= this.l6.size()) {
         return y2.s7;
      }

      int var2 = this.c8;

      for (int var3 = 1; var3 < var1; var3++) {
         var2 = this.k5(var2 + 1);
      }

      return var2 >= this.l6.size() ? y2.s7 : (y2)this.l6.get(var2);
   }

   protected y2 h0(int var1) {
      if (this.c8 == -1) {
         this.u9();
      }

      if (var1 == 0) {
         return null;
      }

      if (this.c8 - var1 < 0) {
         return null;
      }

      int var2 = this.c8;

      for (int var3 = 1; var3 <= var1; var3++) {
         var2 = this.a6(var2 - 1);
      }

      return var2 < 0 ? null : (y2)this.l6.get(var2);
   }

   @Override
   public y2 c8(int var1) {
      return (y2)this.l6.get(var1);
   }

   @Override
   public int n5(int var1) {
      return this.u9(var1).n5();
   }

   @Override
   public int u3() {
      if (this.c8 == -1) {
         this.u9();
      }

      this.h0 = this.l6();
      return this.h0;
   }

   @Override
   public int k5() {
      return this.l6.size();
   }

   @Override
   public int l6() {
      return this.c8;
   }

   @Override
   public void l6(int var1) {
      this.u3(var1);
   }

   @Override
   public void a6() {
      this.u3(this.h0);
   }

   @Override
   public void u3(int var1) {
      this.c8 = var1;
   }

   @Override
   public String toString() {
      if (this.c8 == -1) {
         this.u9();
      }

      return this.n5(0, this.l6.size() - 1);
   }

   @Override
   public String n5(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0) {
         if (this.c8 == -1) {
            this.u9();
         }

         if (var2 >= this.l6.size()) {
            var2 = this.l6.size() - 1;
         }

         StringBuffer var3 = new StringBuffer();

         for (int var4 = var1; var4 <= var2; var4++) {
            y2 var5 = (y2)this.l6.get(var4);
            var3.append(var5.l6());
         }

         return var3.toString();
      } else {
         return null;
      }
   }

   @Override
   public String n5(y2 var1, y2 var2) {
      return var1 != null && var2 != null ? this.n5(var1.u9(), var2.u9()) : null;
   }
}
