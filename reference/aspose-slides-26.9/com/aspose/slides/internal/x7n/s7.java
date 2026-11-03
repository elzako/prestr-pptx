package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.v4;
import com.aspose.slides.ms.System.y8;
import java.util.Arrays;

@j3
public final class s7 implements h2, v4, Cloneable {
   private boolean n5;
   private int l6;
   private String k5;
   private String u3;
   private int[] a6;
   private int u9;
   private int h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private int n3;
   private String y4;
   private String e2;
   private int[] t9;
   private int z1;
   private int t4;
   private String q0;
   private String z3;
   private int[] m1;
   private int k7;
   private int m3;
   private String z8;
   private String j5;
   private String w1;
   private String r4;
   private String[] c4 = null;
   private int y2 = 1;
   private int y1;

   s7(int var1, boolean var2) {
      this.y1 = var1;
      this.n5 = var2;
      if (var1 == 127) {
         this.l6 = 2;
         this.k5 = ".";
         this.u3 = ",";
         this.a6 = new int[]{3};
         this.u9 = 0;
         this.h0 = 0;
         this.c8 = "¤";
         this.t2 = "NaN";
         this.s7 = "-Infinity";
         this.x8 = "-";
         this.n3 = 2;
         this.y4 = ".";
         this.e2 = ",";
         this.t9 = new int[]{3};
         this.z1 = 1;
         this.t4 = 2;
         this.q0 = ".";
         this.z3 = ",";
         this.m1 = new int[]{3};
         this.k7 = 0;
         this.m3 = 0;
         this.z8 = "%";
         this.j5 = "‰";
         this.w1 = "Infinity";
         this.r4 = "+";
         this.c4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
      } else {
         com.aspose.slides.internal.o3n.k5 var3 = com.aspose.slides.internal.o3n.u3.l6(var1);
         if (var3 != null) {
            if (var3.k5) {
               throw new InvalidOperationException(
                  d1.n5(
                     "Culture '{0}' is a neutral culture. It cannot be used in formatting and parsing and therefore cannot be set as the thread's current ",
                     new Object[]{var3.n5}
                  )
               );
            }

            this.l6 = var3.a6.n5;
            this.k5 = var3.a6.l6;
            this.u3 = var3.a6.k5;
            this.a6 = var3.a6.u3;
            this.u9 = var3.a6.a6;
            this.h0 = var3.a6.u9;
            this.c8 = var3.a6.h0;
            this.t2 = var3.a6.c8;
            this.s7 = var3.a6.s7;
            this.x8 = var3.a6.x8;
            this.n3 = var3.a6.n3;
            this.y4 = var3.a6.y4;
            this.e2 = var3.a6.e2;
            this.t9 = var3.a6.t9;
            this.z1 = var3.a6.z1;
            this.t4 = var3.a6.t4;
            this.q0 = var3.a6.q0;
            this.z3 = var3.a6.z3;
            this.m1 = var3.a6.m1;
            this.k7 = var3.a6.k7;
            this.m3 = var3.a6.m3;
            this.z8 = var3.a6.z8;
            this.j5 = var3.a6.j5;
            this.w1 = var3.a6.w1;
            this.r4 = var3.a6.r4;
            this.c4 = var3.a6.t2;
         }
      }
   }

   s7(boolean var1) {
      this(127, var1);
   }

   public s7() {
      this(false);
   }

   public int n5() {
      return this.y1;
   }

   public int l6() {
      return this.l6;
   }

   public String k5() {
      return this.k5;
   }

   public void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.k5 = var1;
   }

   public String u3() {
      return this.u3;
   }

   public int[] a6() {
      return (int[])this.u9().clone();
   }

   int[] u9() {
      return this.a6;
   }

   public int h0() {
      return this.u9;
   }

   public int c8() {
      return this.h0;
   }

   public String t2() {
      return this.c8;
   }

   public static s7 s7() {
      s7 var0 = com.aspose.slides.internal.x7n.l6.u3().e2();
      var0.n5 = true;
      return var0;
   }

   public static s7 x8() {
      return new s7(false);
   }

   public String n3() {
      return this.t2;
   }

   public void l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.t2 = var1;
   }

   public String[] y4() {
      return (String[])this.c4.clone();
   }

   public int e2() {
      return this.y2;
   }

   public void n5(int var1) {
      this.y2 = var1;
   }

   public String t9() {
      return this.s7;
   }

   public void k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.s7 = var1;
   }

   public String z1() {
      return this.x8;
   }

   public void u3(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.x8 = var1;
   }

   public int t4() {
      return this.n3;
   }

   public void l6(int var1) {
      if (var1 < 0 || var1 > 99) {
         throw new ArgumentOutOfRangeException("The value specified for the property is less than 0 or greater than 99");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.n3 = var1;
   }

   public String q0() {
      return this.y4;
   }

   public void a6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.y4 = var1;
   }

   public String z3() {
      return this.e2;
   }

   public void u9(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.e2 = var1;
   }

   public int[] m1() {
      return (int[])this.k7().clone();
   }

   public void n5(int[] var1) {
      this.l6(var1);
   }

   int[] k7() {
      return this.t9;
   }

   void l6(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      if (var1.length == 0) {
         this.t9 = new int[0];
      } else {
         int var2 = var1.length - 1;

         for (int var3 = 0; var3 < var2; var3++) {
            if (var1[var3] < 1 || var1[var3] > 9) {
               throw new ArgumentOutOfRangeException("One of the elements in the array specified is not between 1 and 9");
            }
         }

         if (var1[var2] >= 0 && var1[var2] <= 9) {
            this.t9 = (int[])var1.clone();
         } else {
            throw new ArgumentOutOfRangeException("Last element in the array specified is not between 0 and 9");
         }
      }
   }

   public int m3() {
      return this.z1;
   }

   public int z8() {
      return this.t4;
   }

   public String j5() {
      return this.q0;
   }

   public String w1() {
      return this.z3;
   }

   public int[] r4() {
      return (int[])this.c4().clone();
   }

   int[] c4() {
      return this.m1;
   }

   public int y2() {
      return this.k7;
   }

   public int y1() {
      return this.m3;
   }

   public String a0() {
      return this.z8;
   }

   public void h0(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.z8 = var1;
   }

   public String d2() {
      return this.j5;
   }

   public void c8(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.j5 = var1;
   }

   public String d5() {
      return this.w1;
   }

   public void t2(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("The value specified for the property is a null reference");
      }

      if (this.n5) {
         throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
      }

      this.w1 = var1;
   }

   public String s3() {
      return this.r4;
   }

   @Override
   public Object n5(y8 var1) {
      return var1.z1().equals(s7.class) ? this : null;
   }

   @Override
   public Object deepClone() {
      s7 var1 = (s7)this.p8();
      var1.n5 = false;
      return var1;
   }

   public static s7 n5(h2 var0) {
      if (var0 != null) {
         if (var0 instanceof l6) {
            return ((l6)var0).e2();
         }

         if (var0 instanceof s7) {
            return (s7)var0;
         }
      }

      return s7();
   }

   protected Object p8() {
      s7 var1 = new s7(this.n5(), false);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = (int[])this.a6.clone();
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
      var1.e2 = this.e2;
      var1.t9 = (int[])this.t9.clone();
      var1.z1 = this.z1;
      var1.t4 = this.t4;
      var1.q0 = this.q0;
      var1.z3 = this.z3;
      var1.m1 = (int[])this.m1.clone();
      var1.k7 = this.k7;
      var1.m3 = this.m3;
      var1.z8 = this.z8;
      var1.j5 = this.j5;
      var1.w1 = this.w1;
      var1.r4 = this.r4;
      var1.c4 = (String[])this.c4.clone();
      return var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != null && obj instanceof s7) {
         s7 var2 = (s7)obj;
         return var2.n5() == this.n5()
            && var2.l6() == this.l6()
            && d1.a6(var2.k5(), this.k5())
            && d1.a6(var2.u3(), this.u3())
            && Arrays.equals(var2.a6(), this.a6())
            && var2.h0() == this.h0()
            && var2.c8() == this.c8()
            && d1.a6(var2.t2(), this.t2())
            && d1.a6(var2.n3(), this.n3())
            && d1.a6(var2.t9(), this.t9())
            && d1.a6(var2.z1(), this.z1())
            && var2.t4() == this.t4()
            && d1.a6(var2.q0(), this.q0())
            && d1.a6(var2.z3(), this.z3())
            && Arrays.equals(var2.m1(), this.m1())
            && var2.m3() == this.m3()
            && var2.z8() == this.z8()
            && d1.a6(var2.j5(), this.j5())
            && d1.a6(var2.w1(), this.w1())
            && Arrays.equals(var2.r4(), this.r4())
            && var2.y2() == this.y2()
            && var2.y1() == this.y1()
            && d1.a6(var2.a0(), this.a0())
            && d1.a6(var2.d2(), this.d2())
            && d1.a6(var2.d5(), this.d5())
            && d1.a6(var2.s3(), this.s3())
            && Arrays.deepEquals(var2.y4(), this.y4())
            && var2.e2() == this.e2();
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 ? 1 : 0;
      var1 = 31 * var1 + this.l6;
      var1 = 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = 31 * var1 + (this.u3 != null ? this.u3.hashCode() : 0);
      var1 = 31 * var1 + (this.a6 != null ? Arrays.hashCode(this.a6) : 0);
      var1 = 31 * var1 + this.u9;
      var1 = 31 * var1 + this.h0;
      var1 = 31 * var1 + (this.c8 != null ? this.c8.hashCode() : 0);
      var1 = 31 * var1 + (this.t2 != null ? this.t2.hashCode() : 0);
      var1 = 31 * var1 + (this.s7 != null ? this.s7.hashCode() : 0);
      var1 = 31 * var1 + (this.x8 != null ? this.x8.hashCode() : 0);
      var1 = 31 * var1 + this.n3;
      var1 = 31 * var1 + (this.y4 != null ? this.y4.hashCode() : 0);
      var1 = 31 * var1 + (this.e2 != null ? this.e2.hashCode() : 0);
      var1 = 31 * var1 + (this.t9 != null ? Arrays.hashCode(this.t9) : 0);
      var1 = 31 * var1 + this.z1;
      var1 = 31 * var1 + this.t4;
      var1 = 31 * var1 + (this.q0 != null ? this.q0.hashCode() : 0);
      var1 = 31 * var1 + (this.z3 != null ? this.z3.hashCode() : 0);
      var1 = 31 * var1 + (this.m1 != null ? Arrays.hashCode(this.m1) : 0);
      var1 = 31 * var1 + this.k7;
      var1 = 31 * var1 + this.m3;
      var1 = 31 * var1 + (this.z8 != null ? this.z8.hashCode() : 0);
      var1 = 31 * var1 + (this.j5 != null ? this.j5.hashCode() : 0);
      var1 = 31 * var1 + (this.w1 != null ? this.w1.hashCode() : 0);
      var1 = 31 * var1 + (this.r4 != null ? this.r4.hashCode() : 0);
      var1 = 31 * var1 + (this.c4 != null ? Arrays.hashCode(this.c4) : 0);
      var1 = 31 * var1 + this.y2;
      return 31 * var1 + this.y1;
   }
}
