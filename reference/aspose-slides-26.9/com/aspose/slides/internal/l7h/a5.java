package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.n1;
import java.util.Arrays;

@j3
public final class a5 {
   private int n5;
   private char[] l6;
   private String k5;
   private int u3;

   public a5(String var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, Integer.MAX_VALUE);
   }

   private a5(String var1, int var2, int var3, int var4, int var5) {
      if (null == var1) {
         var1 = "";
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", var2, "StartIndex cannot be less than zero.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("length", var3, "Length cannot be less than zero.");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("capacity", var4, "capacity must be greater than zero.");
      }

      if (var5 < 1) {
         throw new ArgumentOutOfRangeException("maxCapacity", "maxCapacity is less than one.");
      }

      if (var4 > var5) {
         throw new ArgumentOutOfRangeException("capacity", "Capacity exceeds maximum capacity.");
      }

      if (var2 > var1.length() - var3) {
         throw new ArgumentOutOfRangeException("startIndex", var2, "StartIndex and length must refer to a location within the string.");
      }

      if (var4 == 0) {
         if (var5 > 16) {
            var4 = 16;
         } else {
            this.l6 = new char[0];
            this.k5 = d1.n5;
         }
      }

      this.u3 = var5;
      if (this.l6 == null) {
         this.l6 = new char[var3 > var4 ? var3 : var4];
      }

      if (var3 > 0) {
         this.n5(0, var1, var2, var3);
      }

      this.n5 = var3;
   }

   public a5() {
      this(null);
   }

   public a5(int var1) {
      this(d1.n5, 0, 0, var1);
   }

   public a5(String var1) {
      if (var1 == null) {
         var1 = d1.n5;
      }

      this.n5 = var1.length();
      this.l6 = var1.toCharArray();
      this.k5 = var1;
      this.u3 = Integer.MAX_VALUE;
   }

   public a5(String var1, int var2) {
      this(var1 == null ? "" : var1, 0, var1 == null ? 0 : var1.length(), var2);
   }

   public int n5() {
      return this.l6.length == 0 ? Math.min(this.u3, 16) : this.l6.length;
   }

   public int l6() {
      return this.n5;
   }

   public void n5(int var1) {
      if (var1 < 0 || var1 > this.u3) {
         throw new ArgumentOutOfRangeException();
      }

      if (var1 != this.n5) {
         if (var1 < this.n5) {
            this.u3(var1);
            this.n5 = var1;
         } else {
            this.n5('\u0000', var1 - this.n5);
         }
      }
   }

   public char l6(int var1) {
      if (var1 < this.n5 && var1 >= 0) {
         return this.l6[var1];
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public void n5(int var1, char var2) {
      if (var1 < this.n5 && var1 >= 0) {
         if (this.k5 != null) {
            this.u3(this.n5);
         }

         this.k5(var1, var2);
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   @Override
   public String toString() {
      if (this.n5 == 0) {
         return d1.n5;
      }

      if (this.k5 == null) {
         this.k5 = this.l6.length == this.n5 ? new String(this.l6) : new String(this.l6, 0, this.n5);
      }

      return this.k5;
   }

   public String n5(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 <= this.n5 - var2) {
         String var3 = this.toString();
         return var1 == 0 && var2 == this.n5 ? var3 : d1.l6(var3, var1, var2);
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public boolean n5(a5 var1) {
      return var1 == null ? false : this.n5 == var1.l6() && d1.a6(this.toString(), var1.toString());
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         a5 var2 = (a5)o;
         return this.n5(var2);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      return 31 * var1 + (this.l6 != null ? Arrays.hashCode(this.l6) : 0);
   }

   public a5 l6(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 <= this.n5 - var2) {
         if (this.k5 != null) {
            this.u3(this.n5);
         }

         if (this.n5 - (var1 + var2) > 0) {
            this.l6(var1, this.l6, var1 + var2, this.n5 - (var1 + var2));
         }

         this.n5 -= var2;
         return this;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public a5 n5(char var1, char var2) {
      return this.n5(var1, var2, 0, this.n5);
   }

   public a5 n5(char var1, char var2, int var3, int var4) {
      if (var3 <= this.n5 - var4 && var3 >= 0 && var4 >= 0) {
         if (this.k5 != null) {
            this.u3(this.l6.length);
         }

         for (int var5 = var3; var5 < var3 + var4; var5++) {
            if (this.l6[var5] == var1) {
               this.k5(var5, var2);
            }
         }

         return this;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public a5 n5(String var1, String var2) {
      return this.n5(var1, var2, 0, this.n5);
   }

   public a5 n5(String var1, String var2, int var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("The old value cannot be null.");
      }

      if (var3 < 0 || var4 < 0 || var3 > this.n5 - var4) {
         throw new ArgumentOutOfRangeException();
      }

      if (var1.length() == 0) {
         throw new ArgumentException("The old value cannot be zero length.");
      }

      char[] var5 = new char[var4];
      System.arraycopy(this.l6, var3, var5, 0, var4);
      String var6 = new String(var5);
      String var7 = d1.n5(var6, var1, var2);
      if (d1.a6(var7, var6)) {
         return this;
      }

      this.u3(var7.length() + (this.n5 - var4));
      if (var7.length() < var4) {
         this.l6(var3 + var7.length(), this.l6, var3 + var4, this.n5 - var3 - var4);
      } else if (var7.length() > var4) {
         this.k5(var3 + var7.length(), this.l6, var3 + var4, this.n5 - var3 - var4);
      }

      this.n5(var3, var7, 0, var7.length());
      this.n5 = var7.length() + (this.n5 - var4);
      return this;
   }

   public a5 n5(char[] var1) {
      if (var1 == null) {
         return this;
      }

      int var2 = this.n5 + var1.length;
      if (this.k5 != null || this.l6.length < var2) {
         this.u3(var2);
      }

      this.l6(this.n5, var1, 0, var1.length);
      this.n5 = var2;
      return this;
   }

   public a5 n5(String var1) {
      if (var1 == null) {
         return this;
      }

      if (this.n5 == 0 && var1.length() < this.u3 && var1.length() > this.l6.length) {
         this.n5 = var1.length();
         this.l6 = var1.toCharArray();
         this.k5 = var1;
         return this;
      }

      int var2 = this.n5 + var1.length();
      if (this.k5 != null || this.l6.length < var2) {
         this.u3(var2);
      }

      this.n5(this.n5, var1, 0, var1.length());
      this.n5 = var2;
      return this;
   }

   public a5 n5(boolean var1) {
      return this.n5(Boolean.toString(var1));
   }

   public a5 n5(double var1) {
      return this.n5(Double.toString(var1));
   }

   public a5 k5(int var1) {
      return this.n5(Integer.toString(var1));
   }

   public a5 n5(long var1) {
      return this.n5(Long.toString(var1));
   }

   public a5 n5(Object var1) {
      return var1 == null ? this : this.n5(var1.toString());
   }

   public a5 n5(byte var1) {
      return this.n5(Byte.toString(var1));
   }

   public a5 n5(float var1) {
      return this.n5(n1.u9(var1));
   }

   public a5 n5(char var1) {
      int var2 = this.n5 + 1;
      if (this.k5 != null || this.l6.length < var2) {
         this.u3(var2);
      }

      this.k5(this.n5, var1);
      this.n5 = var2;
      return this;
   }

   public a5 n5(char var1, int var2) {
      if (var2 < 0) {
         throw new ArgumentOutOfRangeException();
      }

      this.u3(this.n5 + var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.k5(this.n5++, var1);
      }

      return this;
   }

   public a5 n5(char[] var1, int var2, int var3) {
      if (var1 == null) {
         if (var2 == 0 && var3 == 0) {
            return this;
         } else {
            throw new ArgumentNullException("value");
         }
      } else if (var3 >= 0 && var2 >= 0 && var2 <= var1.length - var3) {
         int var4 = this.n5 + var3;
         this.u3(var4);
         this.l6(this.n5, var1, var2, var3);
         this.n5 = var4;
         return this;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public a5 n5(String var1, int var2, int var3) {
      if (var1 == null) {
         if (var2 != 0 && var3 != 0) {
            throw new ArgumentNullException("value");
         } else {
            return this;
         }
      } else if (var3 >= 0 && var2 >= 0 && var2 <= var1.length() - var3) {
         int var4 = this.n5 + var3;
         if (this.k5 != null || this.l6.length < var4) {
            this.u3(var4);
         }

         this.n5(this.n5, var1, var2, var3);
         this.n5 = var4;
         return this;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public a5 k5() {
      return this.n5(com.aspose.slides.ms.System.p8.n5);
   }

   public a5 l6(String var1) {
      return this.n5(var1).n5(com.aspose.slides.ms.System.p8.n5);
   }

   public a5 n5(String var1, Object... var2) {
      return this.n5((h2)null, var1, var2);
   }

   public static a5 n5(a5 var0, String var1, Object... var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 != null && var2 != null) {
         return var0.n5(var1, var2);
      } else {
         throw new ArgumentNullException(var1 == null ? "format" : "args");
      }
   }

   public a5 n5(h2 var1, String var2, Object... var3) {
      d1.n5(this, var1, var2, var3);
      return this;
   }

   public a5 n5(int var1, String var2) {
      if (var1 > this.n5 || var1 < 0) {
         throw new ArgumentOutOfRangeException();
      } else if (var2 != null && var2.length() != 0) {
         this.u3(this.n5 + var2.length());
         this.k5(var1 + var2.length(), this.l6, var1, this.n5 - var1);
         this.n5(var1, var2, 0, var2.length());
         this.n5 = this.n5 + var2.length();
         return this;
      } else {
         return this;
      }
   }

   public a5 l6(int var1, char var2) {
      if (var1 <= this.n5 && var1 >= 0) {
         this.u3(this.n5 + 1);
         this.k5(var1 + 1, this.l6, var1, this.n5 - var1);
         this.k5(var1, var2);
         this.n5++;
         return this;
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public a5 n5(int var1, String var2, int var3) {
      if (var3 < 0) {
         throw new ArgumentOutOfRangeException();
      }

      if (var2 != null && !d1.a6(var2, d1.n5)) {
         for (int var4 = 0; var4 < var3; var4++) {
            this.n5(var1, var2);
         }
      }

      return this;
   }

   public a5 n5(int var1, char[] var2, int var3, int var4) {
      if (var2 == null) {
         if (var3 == 0 && var4 == 0) {
            return this;
         } else {
            throw new ArgumentNullException("value");
         }
      } else if (var4 >= 0 && var3 >= 0 && var3 <= var2.length - var4) {
         return this.n5(var1, d1.n5(var2, var3, var4));
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   private void u3(int var1) {
      if (var1 > this.l6.length) {
         int var2 = this.l6.length;
         if (var1 > var2) {
            if (var2 < 16) {
               var2 = 16;
            }

            var2 <<= 1;
            if (var1 > var2) {
               var2 = var1;
            }

            if (var2 >= Integer.MAX_VALUE || var2 < 0) {
               var2 = Integer.MAX_VALUE;
            }

            if (var2 > this.u3 && var1 <= this.u3) {
               var2 = this.u3;
            }

            if (var2 > this.u3) {
               throw new ArgumentOutOfRangeException("size", "capacity was less than the current size.");
            }
         }

         char[] var3 = this.l6;
         this.l6 = new char[var2];
         if (this.n5 > 0) {
            this.l6(0, var3, 0, this.n5);
         }
      }

      this.k5 = null;
   }

   private void n5(int var1, String var2, int var3, int var4) {
      this.l6(var1, var2.toCharArray(), var3, var4);
   }

   private void l6(int var1, char[] var2, int var3, int var4) {
      System.arraycopy(var2, var3, this.l6, var1, var4);
   }

   private void k5(int var1, char[] var2, int var3, int var4) {
      System.arraycopy(var2, var3, this.l6, var1, var4);
   }

   private void k5(int var1, char var2) {
      if (var1 > this.l6.length) {
         throw new ArgumentOutOfRangeException("idx");
      }

      this.l6[var1] = var2;
   }
}
