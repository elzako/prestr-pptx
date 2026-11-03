package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public abstract class j5 implements com.aspose.slides.ms.System.v4, Cloneable {
   private static final u6$k5 n5 = new u6$k5(false);
   public int y4 = 0;
   public k5 e2 = null;
   private boolean l6 = true;
   public q0 t9 = null;
   public t2 z1 = null;

   public static j5 u9() {
      return n5;
   }

   protected j5() {
      this(0);
   }

   protected j5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("codePage");
      }

      this.y4 = var1;
      this.n5();
   }

   protected j5(int var1, q0 var2, t2 var3) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("codePage");
      }

      this.y4 = var1;
      this.t9 = var2 != null ? var2 : new f2(this);
      this.z1 = var3 != null ? var3 : new s3(this);
   }

   public void n5() {
      this.t9 = new f2(this);
      this.z1 = new s3(this);
   }

   public static byte[] n5(j5 var0, j5 var1, byte[] var2) {
      if (var2 == null) {
         throw new ArgumentNullException("bytes");
      } else {
         return n5(var0, var1, var2, 0, var2.length);
      }
   }

   public static byte[] n5(j5 var0, j5 var1, byte[] var2, int var3, int var4) {
      if (var0 == null || var1 == null) {
         throw new ArgumentNullException(var0 == null ? "srcEncoding" : "dstEncoding", "Array cannot be null.");
      } else if (var2 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      } else {
         return var1.l6(var0.k5(var2, var3, var4));
      }
   }

   public static j5 u3(int var0) {
      if (var0 >= 0 && var0 <= 65535) {
         switch (var0) {
            case 0:
               return u9();
            case 1:
            case 2:
            case 3:
            case 42:
               throw new ArgumentException(o0.n5("{0} is not a supported code page.", var0), "codepage");
            case 1200:
               return z1();
            case 1201:
               return t4();
            case 12000:
               return k7();
            case 12001:
               return y2();
            case 20127:
               return e2();
            case 28591:
               return a6();
            case 65000:
               return q0();
            case 65001:
               return z3();
            default:
               j5 var1 = c4.l6(var0);
               if (var1 != null) {
                  return var1;
               } else if (y2.n5(var0) == null) {
                  throw new NotSupportedException(
                     o0.n5(
                        "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
                        var0
                     )
                  );
               } else {
                  return z3();
               }
         }
      } else {
         throw new ArgumentOutOfRangeException("codepage", o0.n5("Valid values are between {0} and {1}, inclusive.", 0, 65535));
      }
   }

   public static j5 n5(int var0, q0 var1, t2 var2) {
      j5 var3 = c4.l6(var0, var1, var2);
      if (var3 != null) {
         return var3;
      }

      var3 = u3(var0);
      j5 var4 = (j5)var3.deepClone();
      var4.n5(var1);
      var4.n5(var2);
      return var4;
   }

   public static j5 k5(String var0) {
      j5 var1 = c4.l6(var0);
      return var1 != null ? var1 : u3(y2.n5(var0));
   }

   public static j5 n5(String var0, q0 var1, t2 var2) {
      j5 var3 = c4.l6(var0, var1, var2);
      return var3 != null ? var3 : n5(y2.n5(var0), var1, var2);
   }

   public byte[] h0() {
      return new byte[0];
   }

   public byte[] c8() {
      return this.h0();
   }

   private void u3() {
      if (this.e2 == null) {
         this.e2 = y2.n5(this.y4);
         if (this.e2 == null) {
            throw new NotSupportedException(
               o0.n5(
                  "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
                  this.y4
               )
            );
         }
      }
   }

   public String t2() {
      return o0.n5(d1.n5(new String[]{"Globalization_cp_", a3.l6(this.y4)}));
   }

   public String s7() {
      if (this.e2 == null) {
         this.u3();
      }

      return this.e2.n5();
   }

   public final q0 x8() {
      return this.t9;
   }

   public final void n5(q0 var1) {
      if (this.y4()) {
         throw new InvalidOperationException("Instance is read-only.");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.t9 = var1;
   }

   public final t2 n3() {
      return this.z1;
   }

   public final void n5(t2 var1) {
      if (this.y4()) {
         throw new InvalidOperationException("Instance is read-only.");
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.z1 = var1;
   }

   @Override
   public Object deepClone() {
      j5 var1 = (j5)this.c4();
      var1.l6 = false;
      return var1;
   }

   public final boolean y4() {
      return this.l6;
   }

   public static j5 e2() {
      return com.aspose.slides.internal.l7h.n5.n5;
   }

   private static j5 a6() {
      return e5.n5;
   }

   public int n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      }

      char[] var2 = d1.c8(var1);
      return this.n5(var2, 0, var2.length);
   }

   public abstract int n5(char[] var1, int var2, int var3);

   public int n5(char[] var1, int var2, int var3, k7 var4) {
      return this.n5(var1, var2, var3);
   }

   public byte[] l6(char[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("chars", "Array cannot be null.");
      } else {
         return this.l6(var1, 0, var1.length);
      }
   }

   public byte[] l6(char[] var1, int var2, int var3) {
      byte[] var4 = new byte[this.n5(var1, var2, var3)];
      this.n5(var1, var2, var3, var4, 0);
      return var4;
   }

   public abstract int n5(char[] var1, int var2, int var3, byte[] var4, int var5);

   public byte[] u3(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s", "String reference not set to an instance of a String.");
      }

      int var2 = this.n5(var1);
      byte[] var3 = new byte[var2];
      int var4 = this.n5(var1, 0, var1.length(), var3, 0);
      return var3;
   }

   public int n5(String var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      } else {
         return this.n5(d1.c8(var1), var2, var3, var4, var5);
      }
   }

   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      return this.n5(var1, var2, var3, var4, var5, var6);
   }

   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var3 >= 0 && var6 >= 0) {
         char[] var7 = new char[var3];

         for (int var8 = 0; var8 < var3; var8++) {
            var7[var8] = var1[var8 + var2];
         }

         byte[] var9 = new byte[var6];
         int var10 = this.n5(var7, 0, var3, var9, 0);
         if (var10 < var6) {
            var6 = var10;
         }

         for (int var11 = 0; var11 < var6; var11++) {
            var4[var11] = var9[var11 + var5];
         }

         return var6;
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
      }
   }

   public abstract int n5(byte[] var1, int var2, int var3);

   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      return this.n5(var1, var2, var3);
   }

   public char[] n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      } else {
         return this.k5(var1, 0, var1.length);
      }
   }

   public char[] k5(byte[] var1, int var2, int var3) {
      char[] var4 = new char[this.n5(var1, var2, var3)];
      this.n5(var1, var2, var3, var4, 0);
      return var4;
   }

   public abstract int n5(byte[] var1, int var2, int var3, char[] var4, int var5);

   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var3 >= 0 && var6 >= 0) {
         byte[] var7 = new byte[var3];

         for (int var8 = 0; var8 < var3; var8++) {
            var7[var8] = var1[var8 + var2];
         }

         char[] var9 = new char[var6];
         int var10 = this.n5(var7, 0, var3, var9, 0);
         if (var10 < var6) {
            var6 = var10;
         }

         for (int var11 = 0; var11 < var6; var11++) {
            var4[var11] = var9[var11];
         }

         return var6;
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
      }
   }

   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      return this.n5(var1, var2, var3, var4, var5, var6);
   }

   public int t9() {
      return this.y4;
   }

   public u9 l6() {
      return new j5$n5(this);
   }

   public t9 k5() {
      return new j5$l6(this);
   }

   public abstract int n5(int var1);

   public abstract int l6(int var1);

   public String l6(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      } else {
         return this.l6(var1, 0, var1.length);
      }
   }

   public String l6(byte[] var1, int var2, int var3) {
      return d1.n5(this.k5(var1, var2, var3));
   }

   public static j5 z1() {
      return t1.l6;
   }

   public static j5 t4() {
      return t1.n5;
   }

   public static j5 q0() {
      return v4.n5;
   }

   public static j5 z3() {
      return u6.n5;
   }

   public static j5 m1() {
      return u6.l6;
   }

   public static j5 k7() {
      return z7.n5;
   }

   public static j5 m3() {
      return y2();
   }

   private static j5 y2() {
      return z7.l6;
   }

   @Override
   public boolean equals(Object value) {
      j5 var2 = com.aspose.slides.internal.v6g.k5.n5(value, j5.class);
      return var2 == null ? false : this.y4 == var2.y4 && this.x8().equals(var2.x8()) && this.n3().equals(var2.n3());
   }

   @Override
   public int hashCode() {
      return this.y4 + this.x8().hashCode() + this.n3().hashCode();
   }

   public char[] z8() {
      return new char[0];
   }

   public char[] j5() {
      return new char[0];
   }

   public final void w1() {
      throw new ArgumentException(
         o0.n5("The output byte buffer is too small to contain the encoded data, encoding '{0}' fallback '{1}'.", this.t2(), j8.n5(this.x8())), "bytes"
      );
   }

   public final void n5(k7 var1, boolean var2) {
      if (var1 == null || var1.u3 || var2) {
         if (var1 != null && var1.k5()) {
            var1.l6().a6();
         }

         this.w1();
      }

      var1.c8();
   }

   public final void r4() {
      throw new ArgumentException(
         o0.n5("The output char buffer is too small to contain the decoded characters, encoding '{0}' fallback '{1}'.", this.t2(), j8.n5(this.n3())), "chars"
      );
   }

   public final void n5(x8 var1, boolean var2) {
      if (var1 == null || var1.u3 || var2) {
         if (var1 != null && var1.a6()) {
            var1.u3().u3();
         }

         this.r4();
      }

      var1.h0();
   }

   public final String u3(byte[] var1, int var2, int var3) {
      int var4 = this.n5(var1, var2, var3);
      if (var4 == 0) {
         return d1.n5;
      }

      char[] var5 = new char[var4];
      this.n5(var1, var2, var3, var5, 0);
      return d1.n5(var5);
   }

   protected Object c4() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
