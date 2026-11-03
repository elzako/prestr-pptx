package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class j3 implements IDisposable {
   private List<Character> n5;
   private int l6;
   private int k5 = -1;
   private int u3;
   private int a6 = -1;

   public j3(com.aspose.slides.internal.p6.l6 var1) {
      char[] var2 = var1.n5().c8().toCharArray();
      List var3 = new List();

      for (char var7 : var2) {
         var3.add(var7);
      }

      this.n5 = var3;
      this.l6 = this.n5.size();
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         this.k5 = -1;
      } else if (var1 > this.l6) {
         this.k5 = this.l6;
      } else {
         this.k5 = var1;
      }
   }

   public final char l6() {
      return this.n5.get_Item(this.k5);
   }

   public final boolean k5() {
      return this.k5 >= this.l6;
   }

   public final int u3() {
      return this.l6;
   }

   public final void a6() {
      this.a6 = this.n5();
   }

   public final void u9() {
      this.a6 = -1;
   }

   public final void n5(String var1) {
      if (this.a6 != -1) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            this.n5.insertItem(++this.a6, var3);
         }

         this.l6 = this.l6 + var1.length();
      }
   }

   public final char h0() {
      char var1 = this.n5.get_Item(this.k5);
      this.k5++;
      return var1;
   }

   public final void c8() {
      this.k5--;
   }

   public final String n5(char... var1) {
      int var2 = this.k5;

      while (this.k5 < this.l6) {
         boolean var3 = false;

         for (int var4 = 0; var4 < var1.length; var4++) {
            if (this.n5.get_Item(this.k5) == var1[var4]) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            break;
         }

         this.k5++;
      }

      return this.k5 > var2 ? this.n5(var2, this.k5 - var2) : com.aspose.slides.ms.System.d1.n5;
   }

   public final String l6(char... var1) {
      int var2 = this.k5;
      boolean var3 = false;

      while (this.k5 < this.l6) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (this.n5.get_Item(this.k5) == var1[var4]) {
               var3 = true;
               break;
            }
         }

         if (var3) {
            break;
         }

         this.k5++;
      }

      return this.k5 > var2 ? this.n5(var2, this.k5 - var2) : com.aspose.slides.ms.System.d1.n5;
   }

   public final String l6(String var1) {
      return this.n5(var1, true);
   }

   public final String n5(String var1, boolean var2) {
      int var3 = this.k5(var1);
      if (var3 != -1) {
         String var4 = this.n5(this.k5, var3);
         this.k5 += var3;
         return var4;
      } else {
         return var2 ? this.t2() : null;
      }
   }

   public final int k5(String var1) {
      char var2 = var1.charAt(0);

      for (int var3 = this.k5; var3 < this.l6; var3++) {
         if (var2 != this.n5.get_Item(var3)) {
            do {
               var3++;
            } while (var3 < this.l6 && var2 != this.n5.get_Item(var3));
         }

         int var4 = var3 + 1;
         int var5 = var4 + var1.length() - 1;
         if (var3 < this.l6 && var5 <= this.l6) {
            for (int var6 = 1; var4 < var5 && var1.charAt(var6) == this.n5.get_Item(var4); var6++) {
               var4++;
            }

            if (var4 == var5) {
               return var3 - this.k5;
            }
         }
      }

      return -1;
   }

   public final String t2() {
      String var1 = this.n5(this.k5, this.l6 - this.k5);
      this.k5 = this.l6;
      return var1;
   }

   public final void s7() {
      this.k5++;
   }

   public final void x8() {
      this.u3 = this.k5;
   }

   public final void n3() {
      this.k5 = this.u3;
   }

   public final boolean n5(char var1) {
      return !this.k5() && this.n5.get_Item(this.k5) == var1;
   }

   public final boolean l6(String var1, boolean var2) {
      int var3 = var1.length();
      if (var2) {
         if (var3 > this.l6 - this.k5) {
            return false;
         }

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1.charAt(var4) != this.n5.get_Item(this.k5 + var4)) {
               return false;
            }
         }
      } else {
         if (var3 > this.l6 - this.k5 - 1) {
            return false;
         }

         for (int var5 = 0; var5 < var3; var5++) {
            if (var1.charAt(var5) != this.n5.get_Item(this.k5 + var5 + 1)) {
               return false;
            }
         }
      }

      return true;
   }

   public final boolean k5(char... var1) {
      if (this.k5()) {
         return false;
      }

      char var2 = this.n5.get_Item(this.k5);

      for (char var6 : var1) {
         if (var6 == var2) {
            return true;
         }
      }

      return false;
   }

   public final boolean u3(String var1) {
      return this.k5(var1, false);
   }

   public final boolean k5(String var1, boolean var2) {
      if (this.l6(var1, var2)) {
         this.k5 = this.k5 + var1.length();
         return true;
      } else {
         return false;
      }
   }

   public final boolean a6(String var1) {
      int var2 = var1.length();
      if (var2 > this.l6 - this.k5 - 1) {
         return false;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = com.aspose.slides.ms.System.t9.z3(var1.charAt(var3));
         char var5 = com.aspose.slides.ms.System.t9.z3(this.n5.get_Item(this.k5 + var3 + 1));
         if (var4 != var5) {
            return false;
         }
      }

      return true;
   }

   public final boolean u9(String var1) {
      if (this.a6(var1)) {
         this.k5 = this.k5 + var1.length();
         return true;
      } else {
         return false;
      }
   }

   public final String y4() {
      int var1 = this.k5;

      while (this.k5 < this.l6) {
         char var2 = this.n5.get_Item(this.k5);
         if ((var2 < '0' || var2 > '9') && (var2 < 'A' || var2 > 'F') && (var2 < 'a' || var2 > 'f')) {
            break;
         }

         this.k5++;
      }

      return this.n5(var1, this.k5 - var1);
   }

   public final String e2() {
      int var1 = this.k5;

      while (this.k5 < this.l6) {
         char var2 = this.n5.get_Item(this.k5);
         if (var2 < '0' || var2 > '9') {
            break;
         }

         this.k5++;
      }

      return this.n5(var1, this.k5 - var1);
   }

   public final String t9() {
      int var1 = this.k5;

      while (this.k5 < this.l6) {
         char var2 = this.n5.get_Item(this.k5);
         if ((var2 < 'A' || var2 > 'Z') && (var2 < 'a' || var2 > 'z')) {
            break;
         }

         this.k5++;
      }

      while (!this.k5()) {
         char var3 = this.n5.get_Item(this.k5);
         if (var3 < '0' || var3 > '9') {
            break;
         }

         this.k5++;
      }

      return this.n5(var1, this.k5 - var1);
   }

   public final boolean z1() {
      if (this.k5()) {
         return false;
      }

      char var1 = this.n5.get_Item(this.k5);
      return var1 >= 'A' && var1 <= 'Z' || var1 >= 'a' && var1 <= 'z';
   }

   public final boolean t4() {
      if (this.k5()) {
         return false;
      }

      char var1 = this.n5.get_Item(this.k5);
      return var1 >= '0' && var1 <= '9';
   }

   private String n5(int var1, int var2) {
      Character[] var3 = new Character[var2];
      this.n5.copyTo(var1, var3, 0, var2);
      char[] var4 = new char[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = var3[var5];
      }

      return com.aspose.slides.ms.System.d1.n5(var4);
   }

   @Override
   public String toString() {
      return this.n5(this.k5, this.l6 - this.k5);
   }

   @Override
   public final void dispose() {
   }
}
