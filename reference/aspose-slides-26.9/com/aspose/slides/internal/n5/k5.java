package com.aspose.slides.internal.n5;

import java.util.ArrayList;
import java.util.List;

public class k5 implements u9 {
   protected char[] n5;
   protected int l6;
   protected int k5 = 0;
   protected int u3 = 1;
   protected int a6 = 0;
   protected int u9 = 0;
   protected List h0;
   protected int c8;

   public k5() {
   }

   public k5(String var1) {
      this();
      this.n5 = var1.toCharArray();
      this.l6 = var1.length();
   }

   @Override
   public void n5() {
      if (this.k5 < this.l6) {
         this.a6++;
         if (this.n5[this.k5] == '\n') {
            this.u3++;
            this.a6 = 0;
         }

         this.k5++;
      }
   }

   @Override
   public int n5(int var1) {
      if (var1 == 0) {
         return 0;
      }

      if (var1 < 0) {
         if (this.k5 + ++var1 - 1 < 0) {
            return -1;
         }
      }

      return this.k5 + var1 - 1 >= this.l6 ? -1 : this.n5[this.k5 + var1 - 1];
   }

   @Override
   public int l6() {
      return this.k5;
   }

   @Override
   public int k5() {
      return this.l6;
   }

   @Override
   public int u3() {
      if (this.h0 == null) {
         this.h0 = new ArrayList();
         this.h0.add(null);
      }

      this.u9++;
      h0 var1 = null;
      if (this.u9 >= this.h0.size()) {
         var1 = new h0();
         this.h0.add(var1);
      } else {
         var1 = (h0)this.h0.get(this.u9);
      }

      var1.n5 = this.k5;
      var1.l6 = this.u3;
      var1.k5 = this.a6;
      this.c8 = this.u9;
      return this.u9;
   }

   @Override
   public void l6(int var1) {
      h0 var2 = (h0)this.h0.get(var1);
      this.u3(var2.n5);
      this.u3 = var2.l6;
      this.a6 = var2.k5;
      this.k5(var1);
   }

   @Override
   public void a6() {
      this.l6(this.c8);
   }

   public void k5(int var1) {
      this.u9 = var1;
      this.u9--;
   }

   @Override
   public void u3(int var1) {
      if (var1 <= this.k5) {
         this.k5 = var1;
      } else {
         while (this.k5 < var1) {
            this.n5();
         }
      }
   }

   @Override
   public String n5(int var1, int var2) {
      return new String(this.n5, var1, var2 - var1 + 1);
   }

   @Override
   public int u9() {
      return this.u3;
   }

   @Override
   public int h0() {
      return this.a6;
   }
}
