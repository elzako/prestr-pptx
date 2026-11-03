package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.TypeLoadException;

@j3
public abstract class y8 extends com.aspose.slides.internal.p4l.e2 {
   public static char n5 = '.';
   public static y8[] l6 = new y8[0];
   public static final Object k5 = com.aspose.slides.internal.v6g.k5.n5(Object.class);
   public static final Object u3 = com.aspose.slides.internal.v6g.k5.n5(Class.class);
   private static final y8 a6 = com.aspose.slides.internal.v6g.k5.n5(k8.class);
   private static final y8 u9 = com.aspose.slides.internal.v6g.k5.n5(d5.class);
   private static com.aspose.slides.internal.p4l.l6 h0;

   protected y8() {
   }

   public abstract Class z1();

   public abstract com.aspose.slides.internal.p4l.n5 t4();

   public abstract String q0();

   public abstract String z3();

   public int k7() {
      return this.n3();
   }

   protected abstract int n3();

   @Override
   public int l6() {
      return 32;
   }

   @Override
   public y8 t2() {
      return this;
   }

   @Override
   public y8 k5() {
      return this;
   }

   public String m3() {
      return d1.n5("{0}, {1}",new Object[]{ this.q0(), this.t4().l6()});
   }

   public abstract y8 n5();

   public boolean z8() {
      return this.t2() != null;
   }

   public boolean j5() {
      return (this.k7() & 7) == 1;
   }

   public boolean w1() {
      return (this.k7() & 7) == 2;
   }

   public boolean r4() {
      return (this.k7() & 7) == 5;
   }

   public boolean c4() {
      return (this.k7() & 32) == 0 && !this.y1();
   }

   public boolean y2() {
      return (this.k7() & 32) == 32;
   }

   public boolean y1() {
      return this.a0();
   }

   protected boolean a0() {
      y8 var1 = this;
      Class var2 = var1.z1();
      return var1 != a6 && var1 != u9 && (this.n5(a6) || this.n5(u9)) || this.e5();
   }

   public boolean d2() {
      return this.n5(u9);
   }

   public boolean d5() {
      if (this.equals(k5)) {
         return true;
      }

      Object[] var1 = this.l6(com.aspose.slides.internal.v6g.k5.n5(j3.class), false);
      return var1.length != 0;
   }

   public boolean s3() {
      return this.u3();
   }

   protected abstract boolean u3();

   public boolean a6() {
      return false;
   }

   public boolean p8() {
      return false;
   }

   public boolean f2() {
      return !this.y1();
   }

   public boolean i1() {
      return false;
   }

   public boolean e5() {
      return this.y4();
   }

   protected abstract boolean y4();

   public boolean b3() {
      return this.e2();
   }

   protected abstract boolean e2();

   public abstract y8 m1();

   public int c8() {
      throw new InvalidOperationException("Derived classes must provide an implementation.");
   }

   public com.aspose.slides.internal.p4l.k5 n5(y8[] var1) {
      return this.n5(20, null, var1, null);
   }

   public com.aspose.slides.internal.p4l.k5 n5(int var1, com.aspose.slides.internal.p4l.l6 var2, y8[] var3, com.aspose.slides.internal.p4l.m1[] var4) {
      if (var3 == null) {
         throw new ArgumentNullException("types");
      }

      for (int var5 = 0; var5 < var3.length; var5++) {
         if (var3[var5] == null) {
            throw new ArgumentNullException("types");
         }
      }

      return this.n5(var1, var2, 3, var3, var4);
   }

   protected abstract com.aspose.slides.internal.p4l.k5 n5(
      int var1, com.aspose.slides.internal.p4l.l6 var2, int var3, y8[] var4, com.aspose.slides.internal.p4l.m1[] var5
   );

   public com.aspose.slides.internal.p4l.q0 n5(String var1, y8[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("name");
      }

      if (var2 == null) {
         throw new ArgumentNullException("types");
      }

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3] == null) {
            throw new ArgumentNullException("types");
         }
      }

      return this.n5(var1, 28, null, 3, var2, null);
   }

   protected abstract com.aspose.slides.internal.p4l.q0 n5(
      String var1, int var2, com.aspose.slides.internal.p4l.l6 var3, int var4, y8[] var5, com.aspose.slides.internal.p4l.m1[] var6
   );

   public abstract com.aspose.slides.internal.p4l.q0[] n5(int var1);

   public abstract com.aspose.slides.internal.p4l.y4 n5(String var1, int var2);

   public abstract com.aspose.slides.internal.p4l.y4[] l6(int var1);

   public y8 n5(String var1) {
      return this.n5(var1, false);
   }

   public abstract y8 n5(String var1, boolean var2);

   public abstract y8[] t9();

   public com.aspose.slides.internal.p4l.e2[] l6(String var1) {
      return this.l6(var1, 28);
   }

   public com.aspose.slides.internal.p4l.e2[] l6(String var1, int var2) {
      return this.n5(var1, 191, var2);
   }

   public com.aspose.slides.internal.p4l.e2[] n5(String var1, int var2, int var3) {
      throw new NotSupportedException("Derived classes must provide an implementation.");
   }

   public Object n5(String var1, int var2, com.aspose.slides.internal.p4l.l6 var3, Object var4, Object[] var5) {
      return this.n5(var1, var2, var3, var4, var5, null, null, null);
   }

   public abstract Object n5(
      String var1,
      int var2,
      com.aspose.slides.internal.p4l.l6 var3,
      Object var4,
      Object[] var5,
      com.aspose.slides.internal.p4l.m1[] var6,
      com.aspose.slides.internal.x7n.l6 var7,
      String[] var8
   );

   public abstract y8 h0();

   public y8[] u9() {
      throw new NotSupportedException("Derived classes must provide an implementation.");
   }

   public y8 o0() {
      throw new NotSupportedException("Derived classes must provide an implementation.");
   }

   public boolean n5(y8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("type");
      }

      for (y8 var2 = this.n5(); var2 != null; var2 = var2.n5()) {
         if (var2.k5(var1)) {
            return true;
         }
      }

      return var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class)) && !var1.k5(this);
   }

   public boolean n5(Object var1) {
      y8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getClass());
      if (this.c4()) {
         for (y8 var3 = var2; var3 != null; var3 = var3.n5()) {
            if (var3.k5(this)) {
               return true;
            }
         }
      } else if (this.y2()) {
         return var2.n5(this.s7()) != null;
      }

      return false;
   }

   public boolean l6(y8 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.k5(this)) {
         return true;
      } else if (var1.n5(this)) {
         return true;
      } else {
         return this.y2() && var1.n5(this.s7()) != null ? true : var1.s3() && this.s3() && var1.h0().k5(this.h0()) && var1.c8() == this.c8();
      }
   }

   @Override
   public String toString() {
      return this.q0();
   }

   @Override
   public boolean equals(Object o) {
      return o instanceof y8 && this.k5((y8)o);
   }

   public boolean k5(y8 var1) {
      return this.z1().equals(var1.z1());
   }

   @Override
   public int hashCode() {
      y8 var1 = this.m1();
      return var1 != this ? var1.hashCode() : super.hashCode();
   }

   public static y8 l6(String var0, boolean var1) {
      try {
         return com.aspose.slides.internal.v6g.k5.n5(Class.forName(var0));
      } catch (ClassNotFoundException var8) {
         try {
            String var3 = d1.n5(var0, ',')[0];
            String var4 = a6(var3);
            Class var5 = null;
            com.aspose.slides.internal.v6g.a6 var6 = new com.aspose.slides.internal.v6g.a6<>(var5);
            if (d1.t2(var4, "[]")) {
               if (!n5(var4, var6)) {
                  var5 = Class.forName(var4);
               } else {
                  var5 = (Class)var6.n5;
               }
            } else {
               var5 = Class.forName(var4);
            }

            return com.aspose.slides.internal.v6g.k5.n5(var5);
         } catch (ClassNotFoundException var7) {
            if (var1) {
               throw new TypeLoadException(d1.n5("Type '{0}' is not found", new Object[]{var0}));
            } else {
               return null;
            }
         }
      }
   }

   private static boolean n5(String var0, com.aspose.slides.internal.v6g.a6<Class> var1) {
      boolean var2 = true;
      if (d1.a6(var0, "byte[]")) {
         var1.n5 = byte[].class;
      } else if (d1.a6(var0, "Byte[]")) {
         var1.n5 = Byte[].class;
      } else if (d1.a6(var0, "boolean[]")) {
         var1.n5 = boolean[].class;
      } else if (d1.a6(var0, "Boolean[]")) {
         var1.n5 = Boolean[].class;
      } else if (d1.a6(var0, "char[]")) {
         var1.n5 = char[].class;
      } else if (d1.a6(var0, "Character[]")) {
         var1.n5 = Character[].class;
      } else if (d1.a6(var0, "short[]")) {
         var1.n5 = short[].class;
      } else if (d1.a6(var0, "Short[]")) {
         var1.n5 = Short[].class;
      } else if (d1.a6(var0, "int[]")) {
         var1.n5 = int[].class;
      } else if (d1.a6(var0, "Integer[]")) {
         var1.n5 = Integer[].class;
      } else if (d1.a6(var0, "long[]")) {
         var1.n5 = long[].class;
      } else if (d1.a6(var0, "Long[]")) {
         var1.n5 = Long[].class;
      } else if (d1.a6(var0, "float[]")) {
         var1.n5 = float[].class;
      } else if (d1.a6(var0, "Float[]")) {
         var1.n5 = Float[].class;
      } else if (d1.a6(var0, "double[]")) {
         var1.n5 = double[].class;
      } else if (d1.a6(var0, "Double[]")) {
         var1.n5 = Double[].class;
      } else if (d1.a6(var0, "Object[]")) {
         var1.n5 = Object[].class;
      } else {
         var2 = false;
      }

      return var2;
   }

   private static String a6(String var0) {
      if (var0.equals("System.String")) {
         return "java.lang.String";
      } else if (var0.equals("System.Boolean")) {
         return "java.lang.Boolean";
      } else if (var0.equals("System.Byte") || var0.equals("System.SByte")) {
         return "java.lang.Byte";
      } else if (var0.equals("System.Char")) {
         return "java.lang.Character";
      } else if (var0.equals("System.Double")) {
         return "java.lang.Double";
      } else if (var0.equals("System.Single")) {
         return "java.lang.Float";
      } else if (var0.equals("System.Int32")) {
         return "java.lang.Integer";
      } else if (var0.equals("System.Int64")) {
         return "java.lang.Long";
      } else if (var0.equals("System.Int16")) {
         return "java.lang.Short";
      } else if (var0.equals("System.Object")) {
         return "java.lang.Object";
      } else {
         return var0.startsWith("System.") ? "com.aspose.slides.ms." + var0 : var0;
      }
   }

   public static y8 k5(String var0) {
      return l6(var0, false);
   }

   public static y8 u3(String var0) {
      throw new NotImplementedException();
   }

   public static int u3(y8 var0) {
      return var0 == null ? 0 : var0.z7();
   }

   int z7() {
      y8 var1 = this;
      Class var2 = var1.z1();
      if (var2.equals(Boolean.class) || var2.equals(boolean.class)) {
         return 3;
      } else if (var2.equals(Character.class) || var2.equals(char.class)) {
         return 4;
      } else if (var2.equals(Byte.class) || var2.equals(byte.class)) {
         return 6;
      } else if (var2.equals(Short.class) || var2.equals(short.class)) {
         return 7;
      } else if (var2.equals(Integer.class) || var2.equals(int.class)) {
         return 9;
      } else if (var2.equals(i6.class)) {
         return 12;
      } else if (var2.equals(Long.class) || var2.equals(long.class)) {
         return 11;
      } else if (var2.equals(c4.class)) {
         return 15;
      } else if (var2.equals(Double.class) || var2.equals(double.class)) {
         return 14;
      } else if (var2.equals(Float.class) || var2.equals(float.class)) {
         return 13;
      } else if (var2.equals(j5.class)) {
         return 16;
      } else {
         return var2.equals(String.class) ? 18 : 1;
      }
   }

   public static com.aspose.slides.internal.p4l.l6 v4() {
      if (h0 == null) {
         h0 = new com.aspose.slides.internal.p4l.x8();
      }

      return h0;
   }
}
