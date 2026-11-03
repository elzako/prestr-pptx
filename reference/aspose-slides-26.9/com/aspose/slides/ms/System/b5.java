package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class b5 implements v4, Comparable<b5> {
   private int n5 = -1;
   private int l6;
   private int k5;
   private int u3 = -1;

   public b5() {
      this.l6 = 0;
      this.k5 = 0;
   }

   public b5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("major");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("minor");
      }

      this.l6 = var1;
      this.k5 = var2;
   }

   public b5(int var1, int var2, int var3) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("major");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("minor");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("build");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.n5 = var3;
   }

   public b5(int var1, int var2, int var3, int var4) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("major");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("minor");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("build");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("revision");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.n5 = var3;
      this.u3 = var4;
   }

   public int n5(b5 var1) {
      if (var1 == null) {
         return 1;
      } else if (this.l6 != var1.l6) {
         return this.l6 > var1.l6 ? 1 : -1;
      } else if (this.k5 != var1.k5) {
         return this.k5 > var1.k5 ? 1 : -1;
      } else if (this.n5 != var1.n5) {
         return this.n5 > var1.n5 ? 1 : -1;
      } else if (this.u3 == var1.u3) {
         return 0;
      } else {
         return this.u3 > var1.u3 ? 1 : -1;
      }
   }

   @Override
   public Object deepClone() {
      b5 var1 = new b5();
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.n5 = this.n5;
      var1.u3 = this.u3;
      return var1;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         b5 var2 = (b5)o;
         return this.l6 == var2.l6 && this.k5 == var2.k5 && this.n5 == var2.n5 && this.u3 == var2.u3;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = 0;
      var1 |= (this.l6 & 15) << 28;
      var1 |= (this.k5 & 0xFF) << 20;
      var1 |= (this.n5 & 0xFF) << 12;
      return var1 | this.u3 & 4095;
   }

   public int n5() {
      return this.l6;
   }

   public int l6() {
      return this.k5;
   }

   public String n5(int var1) {
      switch (var1) {
         case 0:
            return d1.n5;
         case 1:
            return Integer.toString(this.l6);
         case 2:
            return this.l6 + "." + this.k5;
         default:
            if (this.n5 == -1) {
               throw new ArgumentException();
            } else if (var1 == 3) {
               return d1.n5(this.l6, ".", this.k5, ".", this.n5);
            } else if (this.u3 == -1) {
               throw new ArgumentException();
            } else if (var1 != 4) {
               throw new ArgumentException();
            } else {
               return d1.n5(this.l6, ".", this.k5, ".", this.n5, ".", this.u3);
            }
      }
   }

   @Override
   public String toString() {
      if (this.n5 == -1) {
         return this.n5(2);
      } else {
         return this.u3 == -1 ? this.n5(3) : this.n5(4);
      }
   }

   public static boolean n5(b5 var0, b5 var1) {
      return j8.l6(var0, null) ? j8.l6(var1, null) : var0.equals(var1);
   }

   public static boolean l6(b5 var0, b5 var1) {
      return !n5(var0, var1);
   }

   public static boolean k5(b5 var0, b5 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("v1");
      } else {
         return var0.n5(var1) < 0;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(b5 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
