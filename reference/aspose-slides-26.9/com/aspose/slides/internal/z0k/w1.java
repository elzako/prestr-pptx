package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class w1 extends y1 {
   private String l6;
   private int k5;
   private int u3;
   static char[] n5;

   public w1(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      }

      this.l6 = var1;
      this.k5 = 0;
      this.u3 = var1.length();
   }

   @Override
   public void u3() {
      this.n5(true);
   }

   @Override
   protected void n5(boolean var1) {
      this.l6 = null;
      super.n5(var1);
   }

   @Override
   public int a6() {
      if (this.l6 == null) {
         n5();
      }

      return this.k5 >= this.u3 ? -1 : this.l6.charAt(this.k5);
   }

   @Override
   public int u9() {
      if (this.l6 == null) {
         n5();
      }

      return this.k5 >= this.u3 ? -1 : this.l6.charAt(this.k5++);
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (this.l6 == null) {
         n5();
      }

      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var1.length - var2 < var3) {
         throw new ArgumentException();
      }

      if (var2 >= 0 && var3 >= 0) {
         int var4;
         if (this.k5 > this.u3 - var3) {
            var4 = this.u3 - this.k5;
         } else {
            var4 = var3;
         }

         d1.n5(this.l6, this.k5, var1, var2, var4);
         this.k5 += var4;
         return var4;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public String h0() {
      if (this.l6 == null) {
         n5();
      }

      if (this.k5 >= this.l6.length()) {
         return null;
      }

      if (n5 == null) {
         n5 = new char[]{'\n', '\r'};
      }

      int var1 = d1.n5(this.l6, n5, this.k5);
      if (var1 == -1) {
         return this.c8();
      }

      boolean var2 = this.l6.charAt(var1) == '\r' && var1 + 1 < this.l6.length() && this.l6.charAt(var1 + 1) == '\n';
      String var3 = d1.l6(this.l6, this.k5, var1 - this.k5);
      this.k5 = var1 + (var2 ? 2 : 1);
      return var3;
   }

   @Override
   public String c8() {
      if (this.l6 == null) {
         n5();
      }

      String var1 = d1.l6(this.l6, this.k5, this.u3 - this.k5);
      this.k5 = this.u3;
      return var1;
   }

   static void n5() {
      throw new ObjectDisposedException("StringReader", "Cannot read from a closed StringReader");
   }
}
