package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.v4;
import com.aspose.slides.ms.System.y8;
import java.util.Arrays;
import java.util.HashMap;

@j3
public final class u3 implements h2, v4, Cloneable {
   private static String u3 = "This instance is read only";
   private static String[] a6 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   private static String[] u9 = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
   private static String[] h0 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""};
   private static String[] c8 = new String[]{
      "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""
   };
   static String[] n5 = new String[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
   private static u3 t2;
   private boolean s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private int w1;
   private t4 r4 = null;
   private int c4;
   private String[] y2;
   private String[] y1;
   private String[] a0;
   private String[] d2;
   private String[] d5;
   private String[] s3;
   private String[] p8;
   private String[] f2;
   private String[] i1;
   private String[] e5;
   private String[] b3;
   private int o0;
   private boolean z7;
   private boolean v4;
   private int u6;
   private boolean t1;
   private String a5;
   private String h2;
   private String[] v0;
   private String[] f0;
   private String[] a3;
   private String[] p3;
   private int[] x9;
   private String[] y0;
   private String[] j9;
   private String[] z6;
   private String[] e9;
   private String o5;
   private static char[] j8 = new char[]{'d', 'D', 'f', 'F', 'g', 'G', 'm', 'M', 'o', 'O', 'r', 'R', 's', 't', 'T', 'u', 'U', 'y', 'Y'};
   String[] l6;
   HashMap<Character, String[]> k5;

   u3(boolean var1) {
      this.s7 = var1;
      this.x8 = "AM";
      this.n3 = "PM";
      this.y4 = "/";
      this.e2 = ":";
      this.t9 = "MM/dd/yyyy";
      this.z1 = "dddd, dd MMMM yyyy";
      this.t4 = "HH:mm";
      this.q0 = "HH:mm:ss z";
      this.z3 = "MMMM dd";
      this.m1 = "MMMM, yyyy";
      this.k7 = "dddd, dd MMMM yyyy HH:mm:ss zzz";
      this.m3 = "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'";
      this.z8 = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
      this.j5 = "yyyy'-'MM'-'dd HH':'mm':'ss'Z'";
      this.w1 = 0;
      this.y2 = a6;
      this.y1 = u9;
      this.d2 = h0;
      this.a0 = c8;
      this.z6 = h0;
      this.j9 = c8;
      this.b3 = n5;
   }

   public u3() {
      this(false);
   }

   public static u3 n5(h2 var0) {
      if (var0 != null) {
         u3 var1 = (u3)var0.n5(com.aspose.slides.internal.v6g.k5.n5(u3.class));
         if (var1 != null) {
            return var1;
         }
      }

      return j5();
   }

   public boolean n5() {
      return this.s7;
   }

   public static u3 n5(u3 var0) {
      u3 var1 = (u3)var0.deepClone();
      var1.s7 = true;
      return var1;
   }

   @Override
   public Object deepClone() {
      u3 var1 = (u3)this.p8();
      var1.n5(this.c4());
      var1.s7 = false;
      return var1;
   }

   @Override
   public Object n5(y8 var1) {
      return !var1.k5(com.aspose.slides.internal.v6g.k5.n5(u3.class)) ? null : this;
   }

   public String n5(int var1) {
      if (var1 >= 1 && var1 <= 13) {
         return this.d2[var1 - 1];
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public String l6(int var1) {
      int[] var2 = this.c4().l6();
      boolean var3 = false;

      int var4;
      for (var4 = 0; var4 < var2.length; var4++) {
         if (var1 == var2[var4]) {
            var3 = true;
            break;
         }
      }

      if (!var3) {
         throw new ArgumentOutOfRangeException("era", Integer.toString(var1));
      } else {
         return this.v0[var4];
      }
   }

   public String k5(int var1) {
      if (var1 >= 1 && var1 <= 13) {
         return this.a0[var1 - 1];
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public String[] l6() {
      return this.t4(this.k5());
   }

   public void n5(String[] var1) {
      this.l6(var1);
   }

   public String[] k5() {
      return this.y2;
   }

   void l6(String[] var1) {
      this.t9(var1);
      this.y2 = this.t4(var1);
   }

   public String[] u3() {
      return this.t4(this.a6());
   }

   public void k5(String[] var1) {
      this.u3(var1);
   }

   public String[] a6() {
      return this.d2;
   }

   void u3(String[] var1) {
      this.z1(var1);
      this.d2 = this.t4(var1);
   }

   public String[] u9() {
      return this.t4(this.h0());
   }

   public void a6(String[] var1) {
      this.u9(var1);
   }

   public String[] h0() {
      return this.y1;
   }

   void u9(String[] var1) {
      this.t9(var1);
      this.y1 = this.t4(var1);
   }

   public String[] c8() {
      return this.t4(this.t2());
   }

   public void h0(String[] var1) {
      this.c8(var1);
   }

   public String[] t2() {
      return this.a0;
   }

   void c8(String[] var1) {
      this.z1(var1);
      this.a0 = this.t4(var1);
   }

   public String[] s7() {
      return this.t4(this.z6);
   }

   public void t2(String[] var1) {
      this.z1(var1);
      this.z6 = var1;
   }

   public String[] x8() {
      return this.t4(this.j9);
   }

   public void s7(String[] var1) {
      this.z1(var1);
      this.j9 = var1;
   }

   public String[] n3() {
      return this.t4(this.b3);
   }

   public void x8(String[] var1) {
      this.t9(var1);
      this.b3 = var1;
   }

   public String y4() {
      return this.x8;
   }

   public void n5(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.x8 = var1;
   }

   public String e2() {
      return this.n3;
   }

   public void l6(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.n3 = var1;
   }

   public String t9() {
      return this.y4;
   }

   public void k5(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.y4 = var1;
   }

   public String z1() {
      return this.e2;
   }

   public void u3(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.e2 = var1;
   }

   public String t4() {
      return this.z1;
   }

   public void a6(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.z1 = var1;
   }

   public String q0() {
      return this.t9;
   }

   public void u9(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.t9 = var1;
   }

   public String z3() {
      return this.t4;
   }

   public void h0(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.t4 = var1;
   }

   public String m1() {
      return this.q0;
   }

   public void c8(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.q0 = var1;
   }

   public String k7() {
      return this.z3;
   }

   public void t2(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.z3 = var1;
   }

   public String m3() {
      return this.m1;
   }

   public void s7(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.m1 = var1;
   }

   public String z8() {
      return this.k7;
   }

   public void x8(String var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.k7 = var1;
   }

   public static u3 j5() {
      return com.aspose.slides.internal.x7n.l6.u3().a6();
   }

   public static u3 w1() {
      if (t2 == null) {
         t2 = n5(new u3());
         t2.i1();
      }

      return t2;
   }

   public int r4() {
      return this.w1;
   }

   public void u3(int var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 >= 0 && var1 <= 6) {
         this.w1 = var1;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public t4 c4() {
      if (this.r4 == null) {
         this.r4 = com.aspose.slides.internal.o3n.u3.k5(this.u6);
      }

      return this.r4;
   }

   public void n5(t4 var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.r4 = var1;
   }

   public int y2() {
      return this.c4;
   }

   public void a6(int var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      this.c4 = var1;
   }

   public void n3(String var1) {
      this.m3 = var1;
   }

   public String y1() {
      return this.m3;
   }

   public String a0() {
      return "yyyy'-'MM'-'dd'T'HH':'mm':'ss.fffffffK";
   }

   public void y4(String var1) {
      this.z8 = var1;
   }

   public String d2() {
      return this.z8;
   }

   public void e2(String var1) {
      this.j5 = var1;
   }

   public String d5() {
      return this.j5;
   }

   public String[] s3() {
      return this.l6 != null ? this.t4(this.l6) : null;
   }

   public void n3(String[] var1) {
      this.l6 = var1;
   }

   public void n5(HashMap<Character, String[]> var1) {
      this.k5 = var1;
   }

   public String u9(int var1) {
      if (var1 >= 0 && var1 <= 6) {
         return this.y1[var1];
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public String h0(int var1) {
      if (var1 >= 0 && var1 <= 6) {
         return this.y2[var1];
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   private void i1() {
      this.d5 = new String[]{"MM/dd/yyyy"};
      this.s3 = new String[]{"dddd, dd MMMM yyyy"};
      this.f2 = new String[]{"HH:mm:ss"};
      this.p8 = new String[]{"HH:mm", "hh:mm tt", "H:mm", "h:mm tt"};
      this.i1 = new String[]{"MMMM dd"};
      this.e5 = new String[]{"yyyy MMMM"};
   }

   private void t9(String[] var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var1.length != 7) {
         throw new ArgumentException("An array with exactly 7 elements is required");
      }

      int var2 = com.aspose.slides.ms.System.u3.n5(var1, null, 0, var1.length);
      if (var2 >= 0) {
         throw new ArgumentNullException(d1.n5("Element at index {0} is null", new Object[]{var2}));
      }
   }

   private void z1(String[] var1) {
      if (this.n5()) {
         throw new InvalidOperationException(u3);
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var1.length != 13) {
         throw new ArgumentException("An array with exactly 13 elements is required");
      }

      int var2 = com.aspose.slides.ms.System.u3.n5(var1, null, 0, var1.length);
      if (var2 >= 0) {
         throw new ArgumentNullException(d1.n5("Element at index {0} is null", new Object[]{var2}));
      }
   }

   protected Object p8() {
      u3 var1 = new u3(false);
      var1.a6(this.y2());
      var1.u3(this.r4());
      if (this.v0 != null) {
         var1.y4(this.v0);
      }

      if (this.f0 != null) {
         var1.e2(this.f0);
      }

      var1.n5(this.l6());
      var1.t2(this.s7());
      var1.k5(this.u3());
      var1.a6(this.u9());
      var1.s7(this.x8());
      var1.h0(this.c8());
      var1.x8(this.n3());
      var1.n5(this.y4());
      var1.l6(this.e2());
      var1.k5(this.t9());
      var1.u3(this.z1());
      var1.x8(this.z8());
      var1.a6(this.t4());
      var1.c8(this.m1());
      var1.u9(this.q0());
      var1.h0(this.z3());
      var1.n3(this.y1());
      var1.e2(this.d5());
      var1.y4(this.d2());
      var1.t2(this.k7());
      var1.s7(this.m3());
      var1.n3(this.s3());
      if (this.k5 != null) {
         var1.n5(new HashMap<>(this.k5));
      }

      var1.c8(this.f2());
      return var1;
   }

   public int f2() {
      return this.u6;
   }

   public void c8(int var1) {
      this.u6 = var1;
   }

   public void y4(String[] var1) {
      if (var1 != null && var1.length > 0) {
         this.v0 = this.t4(var1);
      } else {
         this.v0 = new String[]{"A.D."};
      }
   }

   public void e2(String[] var1) {
      if (var1 != null && var1.length > 0) {
         this.f0 = this.t4(var1);
      } else {
         this.f0 = new String[]{"AD"};
      }
   }

   private String[] t4(String[] var1) {
      if (var1 == null) {
         return null;
      }

      int var2 = var1.length;
      if (var2 == 0) {
         return var1;
      }

      String[] var3 = new String[var2];
      System.arraycopy(var1, 0, var3, 0, var2);
      return var3;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != null && obj instanceof u3) {
         u3 var2 = (u3)obj;
         return this.f2() == var2.f2()
            && this.y2() == var2.y2()
            && this.r4() == var2.r4()
            && Arrays.equals(this.v0, var2.v0)
            && Arrays.equals(this.f0, var2.f0)
            && Arrays.equals(this.l6(), var2.l6())
            && Arrays.equals(this.s7(), var2.s7())
            && Arrays.equals(this.u3(), var2.u3())
            && Arrays.equals(this.u9(), var2.u9())
            && Arrays.equals(this.x8(), var2.x8())
            && Arrays.equals(this.c8(), var2.c8())
            && Arrays.equals(this.n3(), var2.n3())
            && d1.a6(this.y4(), var2.y4())
            && d1.a6(this.e2(), var2.e2())
            && d1.a6(this.t9(), var2.t9())
            && d1.a6(this.z1(), var2.z1())
            && d1.a6(this.z8(), var2.z8())
            && d1.a6(this.t4(), var2.t4())
            && d1.a6(this.m1(), var2.m1())
            && d1.a6(this.q0(), var2.q0())
            && d1.a6(this.z3(), var2.z3())
            && d1.a6(this.y1(), var2.y1())
            && d1.a6(this.d5(), var2.d5())
            && d1.a6(this.d2(), var2.d2())
            && d1.a6(this.k7(), var2.k7())
            && d1.a6(this.m3(), var2.m3())
            && Arrays.equals(this.s3(), var2.s3());
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.s7 ? 1 : 0;
      var1 = 31 * var1 + (this.x8 != null ? this.x8.hashCode() : 0);
      var1 = 31 * var1 + (this.n3 != null ? this.n3.hashCode() : 0);
      var1 = 31 * var1 + (this.y4 != null ? this.y4.hashCode() : 0);
      var1 = 31 * var1 + (this.e2 != null ? this.e2.hashCode() : 0);
      var1 = 31 * var1 + (this.t9 != null ? this.t9.hashCode() : 0);
      var1 = 31 * var1 + (this.z1 != null ? this.z1.hashCode() : 0);
      var1 = 31 * var1 + (this.t4 != null ? this.t4.hashCode() : 0);
      var1 = 31 * var1 + (this.q0 != null ? this.q0.hashCode() : 0);
      var1 = 31 * var1 + (this.z3 != null ? this.z3.hashCode() : 0);
      var1 = 31 * var1 + (this.m1 != null ? this.m1.hashCode() : 0);
      var1 = 31 * var1 + (this.k7 != null ? this.k7.hashCode() : 0);
      var1 = 31 * var1 + (this.m3 != null ? this.m3.hashCode() : 0);
      var1 = 31 * var1 + (this.z8 != null ? this.z8.hashCode() : 0);
      var1 = 31 * var1 + (this.j5 != null ? this.j5.hashCode() : 0);
      var1 = 31 * var1 + this.w1;
      var1 = 31 * var1 + (this.r4 != null ? this.r4.hashCode() : 0);
      var1 = 31 * var1 + this.c4;
      var1 = 31 * var1 + (this.y2 != null ? Arrays.hashCode(this.y2) : 0);
      var1 = 31 * var1 + (this.y1 != null ? Arrays.hashCode(this.y1) : 0);
      var1 = 31 * var1 + (this.a0 != null ? Arrays.hashCode(this.a0) : 0);
      var1 = 31 * var1 + (this.d2 != null ? Arrays.hashCode(this.d2) : 0);
      var1 = 31 * var1 + (this.d5 != null ? Arrays.hashCode(this.d5) : 0);
      var1 = 31 * var1 + (this.s3 != null ? Arrays.hashCode(this.s3) : 0);
      var1 = 31 * var1 + (this.p8 != null ? Arrays.hashCode(this.p8) : 0);
      var1 = 31 * var1 + (this.f2 != null ? Arrays.hashCode(this.f2) : 0);
      var1 = 31 * var1 + (this.i1 != null ? Arrays.hashCode(this.i1) : 0);
      var1 = 31 * var1 + (this.e5 != null ? Arrays.hashCode(this.e5) : 0);
      var1 = 31 * var1 + (this.b3 != null ? Arrays.hashCode(this.b3) : 0);
      var1 = 31 * var1 + this.o0;
      var1 = 31 * var1 + (this.z7 ? 1 : 0);
      var1 = 31 * var1 + (this.v4 ? 1 : 0);
      var1 = 31 * var1 + this.u6;
      var1 = 31 * var1 + (this.t1 ? 1 : 0);
      var1 = 31 * var1 + (this.a5 != null ? this.a5.hashCode() : 0);
      var1 = 31 * var1 + (this.h2 != null ? this.h2.hashCode() : 0);
      var1 = 31 * var1 + (this.v0 != null ? Arrays.hashCode(this.v0) : 0);
      var1 = 31 * var1 + (this.f0 != null ? Arrays.hashCode(this.f0) : 0);
      var1 = 31 * var1 + (this.a3 != null ? Arrays.hashCode(this.a3) : 0);
      var1 = 31 * var1 + (this.p3 != null ? Arrays.hashCode(this.p3) : 0);
      var1 = 31 * var1 + (this.x9 != null ? Arrays.hashCode(this.x9) : 0);
      var1 = 31 * var1 + (this.y0 != null ? Arrays.hashCode(this.y0) : 0);
      var1 = 31 * var1 + (this.j9 != null ? Arrays.hashCode(this.j9) : 0);
      var1 = 31 * var1 + (this.z6 != null ? Arrays.hashCode(this.z6) : 0);
      var1 = 31 * var1 + (this.e9 != null ? Arrays.hashCode(this.e9) : 0);
      var1 = 31 * var1 + (this.o5 != null ? this.o5.hashCode() : 0);
      var1 = 31 * var1 + (this.l6 != null ? Arrays.hashCode(this.l6) : 0);
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }
}
